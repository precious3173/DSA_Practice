package QueueCode;

import java.util.LinkedList;

public class Queuey {

    LinkedList<Integer> list = new LinkedList<Integer>();

    public Queuey(){}

    public Queuey(int firstElement){
        addToLast(firstElement);
    }

    public int size(){
        return list.size();
    }

    public boolean isEmpty(){
        return size() == 0;
    }

    public int peekFront (){
        if(isEmpty()) throw new RuntimeException("Queue Empty");
        return list.peekFirst();
    }

    public int pollFrontElement(){
        if(isEmpty()) throw new RuntimeException("Queue is Empty");
        return  list.removeFirst();
    }
    private void addToLast(int firstElement) {
        list.addLast(firstElement);
    }

}
