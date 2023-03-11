package LinkedListCode;

import LinkedListCode.ListNode;

class SingleLinked{

    ListNode head;
    ListNode newLink;
    int data;


// the head is pointed to the data and next to null
// to add a new link, the next is stored into the firstlink, the first link stores the value back into the link next

    public SingleLinked(int data){

        this.data = data;
        head = null;
    }

    public void display(){

        System.out.println(data);
    }

    public boolean isEmpty(){
        if (head == null){
            return false;
        }
        return true;
    }
    public void insertFirstLink(int data){

      newLink = new ListNode(data);
      newLink.next = head;
      head = newLink;
    }
}
