public class MyLinkedList <E>{

    private ListNode head;
    private ListNode tail;

    private ListNode listNode;


    public MyLinkedList(int data){

        head = new ListNode(data);
        listNode = new ListNode(data);

        // the node will get what ever data that is passed
           head.data  = data ;
           head.next = null;

           if(head == null){

               head = listNode;
           }
           else{
               ListNode n = head;

               while(n.next != null){
                  n = n.next;
               }
               n.next = listNode;
           }

    }

    public MyLinkedList(){
        ListNode node = head;

        while (node.next != null){
            System.out.println(node.data);
            node= node.next;
        }
    }
}
