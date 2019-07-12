package PracticeTree;

class Tree_Node
{
    int data;
    Tree_Node leftNode,rightNode;

    public Tree_Node(int data)
    {
        this.data=data;
        leftNode=null;
        rightNode=null;
    }
}


public class BinarySearchTree {

    public Tree_Node root;

    public BinarySearchTree()
    {
        root=null;
    }

    public boolean isEmpty()
    {
        if(root==null)
        {
            return true;
        }
        else
            return false;
    }

    public void insertNode(int data)
    {
        Tree_Node currentNode=root;

        if(isEmpty())
        {
            root= new Tree_Node(data);
        }
        else {
            boolean attached=false;
            while(attached==false)
            {
                if (currentNode.data < data)
                {
                    if (currentNode.rightNode == null) {
                        currentNode.rightNode = new Tree_Node(data);
                        attached=true;

                    }
                    else
                        currentNode=currentNode.rightNode;

                }
                else if (currentNode.data > data)
                {
                    if (currentNode.leftNode == null) {
                        currentNode.leftNode=new Tree_Node(data);
                        attached =true;
                    } else
                        currentNode=currentNode.leftNode;
                }
                else {
                    System.out.println("Data already exists...");
                    return;
                }
            }
            System.out.println("inserted");

        }
    }

    public void searchData(int data)
    {
        Tree_Node currentNode = root;

        while(currentNode.data != data)
        {
            if(currentNode==null)
            {
                return;
            }
            if(data < currentNode.data)
            {
                currentNode=currentNode.leftNode;
            }
            else {
                currentNode=currentNode.rightNode;
            }
        }

        System.out.println("\nData found..."+currentNode.data);

    }

    public void findMinimum()
    {
        Tree_Node currentNode=root;
        if(root==null)
        {
            System.out.println("Tree is empty...");
            return;
        }
        while(currentNode.leftNode!=null)
        {
            currentNode=currentNode.leftNode;
        }
        System.out.println("Minimum data in the tree is: "+currentNode.data);
    }

    public void findMaximum()
    {
        Tree_Node currentNode=root;
        if(root==null)
        {
            System.out.println("Tree is empty...");
            return;
        }
        while(currentNode.rightNode!=null)
        {
            currentNode=currentNode.rightNode;
        }
        System.out.println("Maximum data in the tree is: "+currentNode.data);
    }


    //depth first traversal
    //inorder.....
    public void traverseInorder(Tree_Node node)
    {
        if(node!=null)
        {
            traverseInorder(node.leftNode);
            System.out.print(node.data+"-");
            traverseInorder(node.rightNode);
        }


    }

    //preorder...
    public void traversePreOrder(Tree_Node node)
    {
        if(node!=null)
        {
            System.out.print(node.data+"-");
            traversePreOrder(node.leftNode);
            traversePreOrder(node.rightNode);
        }


    }

    //postorder...
    public void traversePostOrder(Tree_Node node)
    {
        if(node!=null)
        {
            traversePostOrder(node.leftNode);
            traversePostOrder(node.rightNode);
            System.out.print(node.data+"-");
        }

    }





}
