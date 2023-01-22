public class InorderTraversal {

    int key;
    InorderTraversal left, right;

    public InorderTraversal(int item){
        this.key = item;
      //  left = right = null;

    }
}

class BinaryTree{

    InorderTraversal root;
    BinaryTree(){
        root = null;
    }

    // Given a binarytree, print its nodes using inorder method of traversing

    void printInorder(InorderTraversal inorderTraversal){

        if(inorderTraversal == null){
            return;
        }
        printInorder(inorderTraversal.left);

        System.out.print(inorderTraversal.key + " ");
    }

    void printInorder() {

        printInorder(root); }
}
