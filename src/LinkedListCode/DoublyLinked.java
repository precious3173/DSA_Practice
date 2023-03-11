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


}
