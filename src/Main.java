public class Main {
    public static void main(String[] args) {

     SingleLinked2 singleLinked2= new SingleLinked2();
     singleLinked2.insert(6);
     singleLinked2.insert(8);
     singleLinked2.insert(18);
     singleLinked2.insert(9);
     singleLinked2.insert(9);

     singleLinked2.AtBeginning(3);

        System.out.print(singleLinked2.returnLength());


        String [] names = {"Precious", "mary", "sandy", "mariam"};

        for(String a:names) {

            if (a == "man"){
                System.out.println(a);
            } else if (a == "mary") {
                System.out.println(a);
            }
            else {
                System.out.println("");
            }
        }

        BinaryTree tree = new BinaryTree();
        tree.root = new InorderTraversal(4);
        tree.root.left = new InorderTraversal(3);
        tree.root.right = new InorderTraversal(5);
        tree.root.left.left = new InorderTraversal(1);
        tree.root.left.right = new InorderTraversal(2);

        System.out.println(
                "\nInorder traversal of binary tree is ");
        tree.printInorder();
    }
}