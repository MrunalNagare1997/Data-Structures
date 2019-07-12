package PracticeHeap;

import java.util.Scanner;
public class Implementation_Max_Heap {
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        int maxNodes=0;
        System.out.println("Enter the maximum number of nodes in the heap...");
        maxNodes=sc.nextInt();

        MaxHeap heap1= new MaxHeap(maxNodes);

        heap1.insert(55);
        heap1.insert(10);
        heap1.insert(20);
        heap1.insert(30);
        heap1.insert(56);
        heap1.insert(12);
        heap1.insert(70);

        heap1.display();

        //heap1.adjust(4);
        //heap1.display();

    }



}
