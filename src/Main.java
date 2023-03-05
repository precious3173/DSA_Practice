import BinaryTrees.BinaryNode;
import BinaryTrees.BinaryTree2P;
import BinaryTrees.InorderTraversal;

public class Main {

    BinaryNode root;

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

        BinaryTree2P binaryTree2P = new BinaryTree2P();

        binaryTree2P.addNode(50, "Baby");
        binaryTree2P.addNode(25, "Baby 2");
        binaryTree2P.addNode(15, "Baby 3");
        binaryTree2P.addNode(30, "Baby 4");
        binaryTree2P.addNode(75, "Baby 5");
        binaryTree2P.addNode(55, "Baby 6");

        binaryTree2P.inOrderTraverseTree(binaryTree2P.root);

    }
}