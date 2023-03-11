package BinaryTrees;

public class Trees <E>{

    private E value;
    private Trees<E> parent;
    private Trees<E> left;
    private Trees <E> right;

    public Trees(E val, Trees<E> par){
        this.value = val;
        this.left = null;
        this.right = null;


    }
    public Trees<E> addLeftChild(E val){

        this.left = new Trees<E>(val, this);

    return this.left;
    }
}
