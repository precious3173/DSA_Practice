package LinkedListCode;

public class DoublyLinked {

  private int size = 0;
  private DoubleListNode head = null;
  private DoubleListNode tail;



   public void clear(){
       DoubleListNode trav = head;

       while( trav != null){

           DoubleListNode next = trav.next;
           trav.previous = trav.next = null;
           trav.data = Integer.parseInt(null);
           trav = next;
       }
       head = tail =trav = null;
       size = 0;
   }
    //check size of linkedlist
    public int getSize (){
       return size;
    }

    public boolean isLinkedListEmpty(){
       return size == 0;
    }

    public void addToFirstElement(int data){
       if(isLinkedListEmpty()){
           head =tail = new DoubleListNode(data);
       }
       else{
           head.previous = new DoubleListNode(data);
           head = head.previous;
       }
       size++;
    }

    public void addToLastElement(int data){
       if(isLinkedListEmpty()){
           head = tail = new DoubleListNode(data);
       }
       else {
           tail.next = new DoubleListNode(data);
           tail = tail.next;
       }
       size++;
    }
    public int checkFirstNode(){
       if (isLinkedListEmpty()) throw new RuntimeException("Node is empty");
       return head.data;
    }

    public int checkLastNode(){
       if (isLinkedListEmpty()) throw new RuntimeException("Node is empty");
       return tail.data;
    }

    public  int removeFirstNode(){
       if (isLinkedListEmpty()) throw new RuntimeException("Node is empty");

       int data = head.data;
       head = head.next;
       --size;

       if (isLinkedListEmpty()) tail = null;

       else head.previous = null;

       return data;
    }
}
