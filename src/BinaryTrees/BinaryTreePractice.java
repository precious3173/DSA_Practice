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

        //check if this binary tree is empty
        public boolean isEmpty(){
            return  size() == 0;

        }

        //get the number of nodes in this binary tree
        public int size(){

          return nodeCount;
        }

        //insert element into binary tree
        public boolean add (T elem){
            if (contains(elem)){
                return false;
            }
            else {
                root = add(root, elem);
                nodeCount++;
                return true;
            }

        }
        //to recursively add a value in the binary tree
        private Node add(Node node, T elem){
            if (node == null){
                node = new Node (null, null, elem);
            }
            else {
                if (elem.compareTo(node.data) <0){
                    node.left = add(node.left, elem);

                }
                else {
                    node.right = add(node.right, elem);
                }

            }
            return node;
        }

        //remove elements if it exists
        private boolean remove(T elem){
            if(contains(elem)){
                root = remove(root, elem);
                nodeCount --;
                return true;
            }
            return false;
        }

     private Node remove(Node node, T elem){

            if(node == null) return null;

            int cmp = elem.compareTo(node.data);

            //check into the left subtree, the value we're looking
         // for is smaller than the current value
            if (cmp<0){
                node.left = remove(node.left, elem);

                //check into the right subtree, the value we're looking
                //for is greater than the current value
            } else if (cmp> 0) {

                node.right = remove(node.right, elem);
            }
            else {
               if(node.left == null){
                   Node rightChild = node.right;
                   node.data = null;
                   return rightChild;
               } else if (node.right == null) {
                   Node leftChild = node.left.left;
                   node.data = null;
                   node = null;

                   return leftChild;

               }
               else {

               }
            }
     }
    }

}
