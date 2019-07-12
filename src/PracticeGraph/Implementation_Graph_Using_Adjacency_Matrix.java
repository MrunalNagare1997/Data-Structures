package PracticeGraph;
import java.util.Scanner;

public class Implementation_Graph_Using_Adjacency_Matrix {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int number_Of_Vertices = 0;

        //System.out.println("enter the number of vertices in the graph...");
       // number_Of_Vertices=sc.nextInt();

        GraphUsingAdjacencyMatrix graph1= new GraphUsingAdjacencyMatrix(6);



        graph1.addEdge(0,1);
        graph1.addEdge(0,2);
        graph1.addEdge(0,3);
        graph1.addEdge(1,4);
        graph1.addEdge(2,4);
        graph1.addEdge(3,4);

        graph1.printAdjacencyMatrix();
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n");
        graph1.DepthFirstTraversal(0);
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n");
        graph1.breathfirstTraversal(0);

    }

}
