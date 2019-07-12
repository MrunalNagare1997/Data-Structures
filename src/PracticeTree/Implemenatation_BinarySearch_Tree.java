package PracticeTree;

public class Implemenatation_BinarySearch_Tree {

    public static void main(String args[])
    {
        BinarySearchTree tree1 = new BinarySearchTree();

        tree1.insertNode(10);
        tree1.insertNode(2);
        tree1.insertNode(11);
        tree1.insertNode(3);
        tree1.insertNode(1);
        tree1.insertNode(12);
        tree1.insertNode(50);
        tree1.insertNode(100);
        tree1.insertNode(9);
        tree1.insertNode(20);


        System.out.println("\nInorder traversal...");
        tree1.traverseInorder(tree1.root);

        System.out.println("\nPrerder traversal...");
        tree1.traversePreOrder(tree1.root);

        System.out.println("\nPostrder traversal...");
        tree1.traversePostOrder(tree1.root);

        tree1.searchData(100);

        tree1.findMinimum();

        tree1.findMaximum();


    }

}
