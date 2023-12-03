// Given a singly linked list, remove all the nodes in the list which have any node on their right whose value is greater. 
// (Not just immediate Right , but entire List on the Right)
//12->15->10->11->5->6->2->3
//15 11 6 3
// 10->20->30->40->50->60


public class LinkedListMain {
    public static void main(String[] args) throws Exception {
        System.out.println("---------LINKEDLIST OPERATION----------");
        LinkedList<Integer> list = new LinkedList<>();

        list.addData(12);
        list.addData(15);
        list.addData(10);
        list.addData(11);
        list.addData(13);
        list.addData(6);
        list.addData(9);
        list.addData(3);

        System.out.println("THE ORIGINAL LIST :\n");
        list.displayList();
        
        System.out.println();

        System.out.println("\nTHE REVERSED LINKED LIST \n");
        list.reverseList();
        list.displayList();

        System.out.println("\nTHE UPDATED LIST :\n");
        list.deleteData();
        list.displayList();

        // list.addData(10);
        // list.addData(20);
        // list.addData(30);
        // list.addData(40);
        // list.addData(50);
        // list.addData(60);
        
        // System.out.println("\nTHE ORIGINAL LIST :\n");
        // list.displayList();
    
        // System.out.println();

        // System.out.println("\nTHE UPDATED LIST :\n");
        // list.deleteData();
        // list.displayList();

    }
}
