package PracticeGraph;
import PracticeStack.StackUsingArray;
import java.util.Arrays;
import PracticeQueue.QueueImplementation_ARRAY;
public class GraphUsingAdjacencyMatrix {

    int numberOfVertices;
    int adjacencyMatrix[][];



    GraphUsingAdjacencyMatrix(int vertices)
    {
        numberOfVertices =vertices;
        adjacencyMatrix = new int[vertices][vertices];

    }

    public void addEdge(int src,int dest)
    {

        if(adjacencyMatrix[src][dest]!= 1)
        {
            adjacencyMatrix[src][dest]=1;
            adjacencyMatrix[dest][src]=1;
            System.out.println("edge from "+src+" to "+dest+" added successfully...");

        }
        else {
            System.out.println("Edge already exists...");
        }

        printAdjacencyMatrix();

    }
    public void printAdjacencyMatrix()
    {
        System.out.println("The graph is:");
        for(int i=0;i<numberOfVertices;i++)
        {
            System.out.print(i+"->");
            for(int j=0;j< numberOfVertices;j++)
            {
                if(adjacencyMatrix[i][j]==1)
                    System.out.print(j+"->");
            }
            System.out.println();
        }
    }


    //depth first search....

    public void DepthFirstTraversal(int startVertex) {

        boolean [] visitedArray = new boolean[numberOfVertices];
        //initialize the array to False...
        Arrays.fill(visitedArray,false);

        StackUsingArray suspendedStack=new StackUsingArray(numberOfVertices);
        int currentVertex=startVertex;
        //int visited=0;

        boolean hasnabours =false;
        do
        {
            if(visitedArray[currentVertex]==false){

                //visiting the vertex....
                visitedArray[currentVertex] = true;
                //visited++;
                System.out.println(currentVertex);
                suspendedStack.push(currentVertex);
            }

            //exploring the vertex...
            for(int i=0;i<numberOfVertices;i++)
            {
                hasnabours=false;

                if(adjacencyMatrix[currentVertex][i]==1)
                {
                    if(visitedArray[i]!=true){
                        hasnabours=true;
                        currentVertex=i;
                        break;
                    }
                }
                else if(adjacencyMatrix[currentVertex][i]==0) {
                    //System.out.println("no link");
                    hasnabours = false;
                }

            }

            if(hasnabours==false)
            {
                //System.out.println("Has no neighbors...");
                suspendedStack.pop();
                currentVertex=suspendedStack.peek();
                //System.out.println(suspendedStack.getTop());
            }
        }while(!suspendedStack.isEmpty());

    }

    public void breathfirstTraversal(int startVertex)
    {
        int currentVertex= startVertex;
        boolean [] visitedVertices= new boolean[numberOfVertices];
        Arrays.fill(visitedVertices,false);

        QueueImplementation_ARRAY suspendedQueue= new QueueImplementation_ARRAY(numberOfVertices);

        visitedVertices[currentVertex]=true;
        suspendedQueue.enqueue(currentVertex);

        while (!suspendedQueue.isEmpty())
        {
            currentVertex = suspendedQueue.dequeue();
            System.out.println(currentVertex);
            for(int i=0;i<numberOfVertices;i++) {
                if(adjacencyMatrix[currentVertex][i]==1)
                {
                    if(visitedVertices[i]!=true)
                    {
                        visitedVertices[i]=true;
                        suspendedQueue.enqueue(i);
                    }
                }
            }
        }


    }

}
