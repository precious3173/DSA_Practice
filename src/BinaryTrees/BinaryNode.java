package BinaryTrees;

public class BinaryNode {

    int key;
    String name;

    BinaryNode leftChild;
    BinaryNode rightChild;

    public BinaryNode(int key, String name) {
        this.key = key;
        this.name = name;
    }

    public String toString (){

        return name + "has a ${key}" + key ;
    }
}
