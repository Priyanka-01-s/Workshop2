public class LinkedList<T>{
    Node<T> head;

    public LinkedList(){
        this.head = null; //empty linkedlist

    }

    //adding elements to the last

    public void addData(T data){
        Node<T> newNode = new Node<>(data);
        //check if list is empty
        if(head == null){
            head = newNode;

        }else{
            Node<T> curr = head;
            //loop to the last value
            while(curr.next != null){
                curr = curr.next;
            }
            //at the end
            curr.next = newNode;
        }
    }

    public void reverseList(){
        Node<T> prev = null;
        Node<T> curr = head;//first ele
        Node<T> nextnode;//next node

        //reversing
        while(curr != null){
            //swapping
            nextnode = curr.next;//next node 
            curr.next = prev;//reverse
            prev = curr;//move
            curr = nextnode;//move curr to next

        }
        head = prev;

    }

    //removing greater elements in their right

    public void deleteData(){
        head = removeGreater(head);
    }

    private Node<T> removeGreater(Node<T> temp){
        //checking only one element
        if(temp==null || temp.next == null){
            return temp;
        }

        //pointing to next node
        Node<T> newNode = temp.next;
        Node<T> curr = removeGreater(newNode);

        //compare the greater elements 
        int compareResult = ((Comparable<T>)temp.data).compareTo(newNode.data);

        if(compareResult <0){//returns smaller value
            return curr;
        }

        temp.next = curr;
        return temp;



    }

    //displaying
    public void displayList(){
        Node<T> temp = head;

        while(temp!=null){
            System.out.print(temp.data + " ->");
            temp = temp.next;
        }
    }

}
