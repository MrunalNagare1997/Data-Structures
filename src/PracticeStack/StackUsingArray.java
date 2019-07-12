package PracticeStack;

public class StackUsingArray {

    private final int max;
    private int top;
    private int stack[];

    public StackUsingArray(int max)
    {
        this.max=max;
        top= -1;
        stack=new int[max];
    }


    public boolean isEmpty()
    {
        if(top==-1)
            return true;
        else
            return false;
    }
    public void push(int data)
    {
        if(top>=max-1)
        {
            System.out.println("Stack overflow...");
            return;
        }
        stack[++top]=data;
        //System.out.println(data+" is pushed in to the stack succesfully...");

    }

    public void pop()
    {
        if(top<0)
        {
            System.out.println("Stack is empty...");
            return;
        }
        stack[top--]=0;
        //System.out.println("POP Successful...");
    }

    public int peek()
    {
        if(top<0)
        {
            System.out.println("Stack empty...");
            return -1 ;
        }
        return stack[top];
    }


    public int getTop()
    {
        return top;
    }
    public void display()
    {
        int temp=top;
        while(temp>=0)
        {
            System.out.println(stack[temp]);
            temp--;
        }
    }

}
