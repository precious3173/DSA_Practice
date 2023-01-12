public class SingleLinked2 {

    ListNode head;
    ListNode current;
    int countNode = 0;





    public void display(int data){

        //head = new ListNode(data);

        ListNode n = head;
        n.data = data;

        while (n != null){

            System.out.println(n.data+ "\n");
            n = n.next;
        }
    }
    public void insert(int data){



            head = new ListNode(data);

        current = head;

       while (current.next != null){
             current = current.next;

        }

       current.next = new ListNode(data);

        System.out.print(current.data+ "");
    }

    public int returnLength (){


        if( head == null){
            return 0;
        }

         current = head;
        while (current.next != null){

            countNode++;

            current = current.next;

        }

        return countNode;
    }

    public void AtBeginning(int data){

        ListNode newHead = new ListNode(data);
        newHead.next = head;
        head = newHead;
        head.next = current;
        current = current.next;


        System.out.print(newHead.data);
    }

}
