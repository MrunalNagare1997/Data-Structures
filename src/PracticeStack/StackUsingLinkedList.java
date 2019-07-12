package PracticeStack;

public class StackUsingLinkedList {


    public   Node top;

    public static class Node
    {
        int data;
        Node next;
        Node(int data)
        {
            next=null;
            this.data= data;

        }
    }

    public void push(int data) {

        Node newNode = new Node(data);
        //attach node to the top
        if(top==null)
        top = newNode;
        else
        {
            Node tempNode = top;
            top=newNode;
            newNode.next=tempNode;
        }


    }

    public void pop()
    {

        if(top==null)
        {
            System.out.println("List is empty...");
            return ;
        }
        top=top.next;


    }

    public int getTop()
    {
        int count=0;
        Node temp=top;
        while(temp!=null)
        {
            count++;
            temp=temp.next;
        }
        //System.out.println("top= "+count);
        return count;
    }


    public int peek()
    {

        if(top==null)
        {
            System.out.println("Stack is empty...");
            return -1 ;
        }
        else
        {
            return top.data;
        }

    }


    public void printStack()
    {
        if(top==null)
        {
            System.out.println("List is empty...");
            return;
        }
        else {
            System.out.println("Linked List:");
            Node tempNode = top;
            int count=0;
            while (tempNode != null) {
                count++;
                System.out.print("-"+tempNode.data);
                tempNode=tempNode.next;

            }
            //System.out.println("count:"+count);
            System.out.println();
        }
    }

}




