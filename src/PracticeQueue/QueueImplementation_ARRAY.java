package PracticeQueue;

public class QueueImplementation_ARRAY {


    private int size, capacity;
    private int front, rare;
    private int queue[];

    public QueueImplementation_ARRAY(int capacity)
    {
        size=0;
        this.capacity=capacity;
        front=0;
        rare=-1;
        queue=new int[capacity];
    }

    public boolean isFull()
    {
        if(size==capacity)
        {
            //System.out.println("Queue is full...");
            return true;
        }
        else
            return false;

    }

    public void enqueue(int data)
    {
        if(isFull())
        {
            System.out.println("Queue is full...\tunable to enqueue...");
            return;
        }
        rare=(rare+1)%capacity;
        queue[rare]=data;
        size++;
        //System.out.println("Data inserted...");
        //System.out.println("Updated queue :\n");
       // display();
    }


    public int dequeue()
    {
        if(size==0)
        {
            System.out.println("Queue is empty...");
        }
        //System.out.println(queue[front]+" Is dequeued Successfully...");
        int temp=queue[front];
        queue[front]=0;
        front=(front+1)%capacity;
        size--;
        //System.out.println("Updated queue :\n");
        //display();
        return temp;

    }



    public void display()
    {
        int temp=front;
        int count=0;
        if(size ==0)
        {
            System.out.println("Queue is empty....");
            return;
        }
        while (count<size)
        {
            System.out.print(queue[temp]+"-");
            temp=(temp+1)%capacity;
            count++;
        }
        System.out.println();
    }


    public int getFront()
    {
        return front;
    }

    public int getRera()
    {
        return rare;
    }

    public boolean isEmpty()
    {
        if(size==0)
            return true;
        else
            return false;
    }
}
