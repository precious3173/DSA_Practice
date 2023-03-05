package BinaryTrees;

public class BinaryNode2 {

    //first step: create a left and a right node
    BinaryNode2 left, right;

    //second step: add the data type
    int data;

    //third step: add a constructor

    public BinaryNode2 (int data){
        this.data = data;

    }

    //add an insert function

    public void insert (int value){

         /**we have to check if the value is less than data. In binary tree, when value is less than parent, it is placed
        at the left of parent, while when value is greater than parent, it is placed at right side */

         if (value <= data){

             if( left == null){
                 //if left is null assign a new value to left
                 left = new BinaryNode2(value);

             } else{
                 left.insert(value);
             }
         }
         else{
             // if right is null assign a new value to right
             if (right == null){

                 right = new BinaryNode2(value);
             }
             else {
                 right.insert(value);
             }
         }

    }

    // To check if the tree contains the node

    public boolean contains (int value){
       if (value == data){
           return true;
       } else if (value < data) {
           if( left == null){
               return false;
           }
           else return left.contains(value);

       }

       return false;
    }
}
