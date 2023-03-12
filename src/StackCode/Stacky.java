package StackCode;

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

    }
}
