package PracticeHeap;



public class MaxHeap {

    int maximumNodes;
    int heapArray[];
    int size;

    public MaxHeap(int nodes)
    {
        maximumNodes=nodes;
        heapArray=new int[nodes];
        size=0;
    }

    public boolean isEmpty()
    {
        //heap is empty.
        if(size==0)
        {
            return true;
        }
        //heap is not empty...
        else
            return false;

    }

    public void swap(int first, int second)
    {
        int temp= heapArray[first];
        heapArray[first]=heapArray[second];
        heapArray[second]=temp;
    }

    public void adjust(int position){
        int current=position;
        while(heapArray[current]>heapArray[getParent(current)])
        {
            swap(current,getParent(current));
            current= getParent(current);
        }
    }

    public int getParent(int position)
    {
        return ((position-1)/2);
    }

    public void insert(int data)
    {
        if(size+1==maximumNodes)
        {
            return;
        }
        int current=size;
        heapArray[size++]=data;

        adjust(current);
        System.out.println("Data inserted...");
    }

    public void display()
    {
        for(int i=0;i<size;i++)
        {
            System.out.print(heapArray[i]+", ");
        }
    }

}
