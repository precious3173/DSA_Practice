package LinkedListCode;

public class DoubleListNode {

    DoubleListNode next;
    DoubleListNode previous;

    int data;

    DoubleListNode(int data){

        this.next = null;
        this.previous = null;
        this. data = data;
    }

    @Override public String toString(){

        String a = Integer.toString(data);
        return a;
    }
}
