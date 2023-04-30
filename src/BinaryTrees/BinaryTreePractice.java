package BinaryTrees;

public class BinaryTreePractice <T extends Comparable<T> >{

    private int nodeCount = 0;
    private  Node root = null;

    private class Node {

        T data;
        Node left, right;
        public  Node (Node left, Node right, T elem){

            this.data = elem;
            this.left = left;
            this.right = right;
        }
    }

}
