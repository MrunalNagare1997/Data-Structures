package PracticeLinkedList;

public class SingliLinkedListImplementation {


    public   Node head;

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

    public void insertBigin(int data, SingliLinkedListImplementation list)
    {
        Node newNode= new Node(data);
        //if list is empty
        //attach node to the head
        if(head==null)
            head=newNode;
        else
        {
            Node tempnode= head;
            head=newNode;
            newNode.next=tempnode;
            System.out.println("Node added successfully....");
        }
        return ;

    }
    public void attachEnd(int data , SingliLinkedListImplementation list)
    {
        Node newNode = new Node(data);
        if(list.head==null)
        {
            head=newNode;
        }
        else
        {
            Node tempNode= list.head;

            while(tempNode.next!=null)
            {
                tempNode=tempNode.next;
            }

            tempNode.next=newNode;
            System.out.println("Node added successfully...");
        }




        return ;

    }

    public int findData(int key, SingliLinkedListImplementation list)
    {
        Node tempNode = list.head;
        int count = 1,data=0;
        boolean flag= true;

        if(tempNode==null)
        {
            System.out.println("List is empty...");
            return -1;
        }
        else
        {

            while(tempNode.data != key)
            {
                if(tempNode.next==null) {

                    System.out.println("Data not found...");
                    return -1;

                }
                count++;
                tempNode=tempNode.next;
                data=tempNode.data;

            }
            System.out.println("Data:"+data);

        }

        return data;
    }


    public void attachAfter(int data, SingliLinkedListImplementation list, int placeAfter)
    {
        Node newNode = new Node(data);
        Node tempNode = list.head;

        if(tempNode==null)
        {
            System.out.println("List is empty...");
            return ;
        }
        else
        {
            boolean listended =true;
            int count=0;
            while(tempNode !=null)
            {
                if(count < placeAfter)
                {
                    count++;
                    tempNode=tempNode.next;


                }
                else {
                    listended=false;
                    break;

                }
                System.out.println(listended);

            }
            if(listended== true)
            {
                System.out.println("List is too small....");
                return ;
            }
            newNode.next=tempNode.next;
            tempNode.next=newNode;

            System.out.println("count:"+count+"\nData:"+tempNode.data);
        }
        return ;
    }


    public void traverse(SingliLinkedListImplementation list)
    {
        if(list.head==null)
        {
            System.out.println("List is empty...");
            return;
        }
        else {
            System.out.println("Linked List:");
            Node tempNode = list.head;
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


    public void deleteBegin(SingliLinkedListImplementation list)
    {

        if(list.head==null)
        {
            System.out.println("List is empty...");
            return ;
        }
        list.head=list.head.next;


    }

    public void deleteEnd(SingliLinkedListImplementation list)
    {
        if(list.head==null)
        {
            System.out.println("List is empty...");
            return ;
        }
        else
        {
            Node previousNode=null,currentNode=list.head;
            while(currentNode.next !=null)
            {
                previousNode=currentNode;
                currentNode=currentNode.next;
            }
            previousNode.next=null;
        }


        return ;
    }

    public void deleteMiddle(SingliLinkedListImplementation list, int index)
    {
        if(list.head==null)
        {
            System.out.println("Liste is empty...");
            return ;
        }
        else if (index==1)
        {
            list.deleteBegin(list);
            return ;
        }
        else {
            Node previousNode=null,currentNode=list.head;
            int count=1;
            while(currentNode.next!=null)
            {
                previousNode=currentNode;
                currentNode=currentNode.next;
                count++;
                if(count== index)
                {
                    break;
                }

            }
            previousNode.next=currentNode.next;

        }
        return ;
    }




}




