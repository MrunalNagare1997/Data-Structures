package PracticeGraph;

import PracticeLinkedList.SingliLinkedListImplementation;


public class GraphUsingAdjavencyList {

    private int number_of_vertices;
    private SingliLinkedListImplementation adjacencyList[];

    GraphUsingAdjavencyList(int vertices)
    {
        number_of_vertices=vertices;
        adjacencyList= new SingliLinkedListImplementation[vertices];

        for(int i=0;i<vertices;i++)
        {
            adjacencyList[i] = new SingliLinkedListImplementation();
        }
    }

    public void addEdge(int src, int desti)
    {
        adjacencyList[src].attachEnd(desti,adjacencyList[src]);
        //adjacencyList[src].traverse(adjacencyList[src]);
    }

    public void printGraph()
    {
        for(int i=0;i<number_of_vertices;i++)
        {
            System.out.println("Adjacent VErtices of "+i+" : ");
            adjacencyList[i].traverse(adjacencyList[i]);
        }
    }

}
