package BinaryTrees;

public class BinaryTree2P {

    public BinaryNode root;

    public void addNode(int key, String name){

        BinaryNode binaryNode = new BinaryNode(key, name);

        if (root == null){

            root = binaryNode;
        }
        else{

            BinaryNode newBinaryNode = root;
            BinaryNode parent;

            while (true){

                parent = newBinaryNode;

                if (key < newBinaryNode.key){

                    newBinaryNode = newBinaryNode.leftChild;

                    if(newBinaryNode == null){

                        parent.leftChild = newBinaryNode;
                        return;
                    } else{

                        newBinaryNode = newBinaryNode.rightChild;

                        if( newBinaryNode == null){
                            parent.rightChild =  newBinaryNode;
                            return;
                        }
                    }
                }
            }
        }
    }

    public void inOrderTraverseTree(BinaryNode binaryNode){

        if (binaryNode !=null){

            inOrderTraverseTree(binaryNode.leftChild);

            System.out.println(binaryNode);

            inOrderTraverseTree(binaryNode.rightChild);
        }
    }

    public void preOrderTraverseTree(BinaryNode binaryNode){

        if (binaryNode !=null){

            System.out.println(binaryNode);
            inOrderTraverseTree(binaryNode.leftChild);
            inOrderTraverseTree(binaryNode.rightChild);
        }
    }
}
