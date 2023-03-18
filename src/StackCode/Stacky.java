package StackCode;

import java.util.EmptyStackException;
import java.util.Iterator;
import java.util.LinkedList;

public class Stacky {

    LinkedList<Integer>list = new LinkedList<>();

    public Stacky(){

    }

    public Stacky(int data){
        push(data);
    }

    public int size(){
        return list.size();
    }
    public boolean isEmpty(){
        return size() ==0;
    }

    public void push(int data){
    list.addLast(data);
    }

    public int pop(){
        if(isEmpty()) throw new EmptyStackException();
        return list.removeLast();
    }
    public int peek(){
      if(isEmpty()) throw new EmptyStackException();
      return list.peekLast();
    }

}
