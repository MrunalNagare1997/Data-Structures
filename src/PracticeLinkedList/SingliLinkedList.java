package PracticeLinkedList;

import PracticeLinkedList.SingliLinkedListImplementation;

import java.util.Scanner;

class SingleLinkedList
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);

        SingliLinkedListImplementation list= new SingliLinkedListImplementation();

        list.attachEnd(0,list);
        list.attachEnd(1,list);
        list.attachEnd(2,list);
        list.attachEnd(3,list);

        System.out.println("Existing list...");
        list.traverse(list);

        char conti;
        short choice;
        do {
            System.out.println("\n-----------Menu---------\n1. Insert Begin\n2. Insert End\n3. Insert After\n4. Find Data\n5. Display List" +
                    "\n6. Delete Begin\n7. Delete End\n8. Delete Middle\n9. Exit");
            choice= sc.nextShort();
            switch (choice)
            {
                case 1: {
                    System.out.println("Enter data to insert...");
                    int data = sc.nextInt();
                    list.insertBigin(data, list);
                    list.traverse(list);
                    break;
                }
                case 2: {
                    System.out.println("Enter data to insert...");
                    int data = sc.nextInt();
                    list.attachEnd(data,list);
                    list.traverse(list);
                    break;
                }
                case 3: {
                    System.out.println("Enter data to insert...");
                    int data= sc.nextInt();
                    System.out.println("Enter the place after which data should be placed...3");
                    int placeAfter=sc.nextInt();
                    list.attachAfter(data,list,placeAfter);
                    list.traverse(list);
                    break;
                }
                case 4:{
                    System.out.println("Enter data to Search...");
                    int data= sc.nextInt();
                    list.findData(data,list);
                    break;
                }
                case 5:{
                    list.traverse(list);
                    break;
                }
                case 6:{
                    list.deleteBegin(list);
                    list.traverse(list);
                    break;
                }
                case 7:{
                    list.deleteEnd(list);
                    list.traverse(list);
                    break;

                }
                case 8:{
                    System.out.println("Enterthe index of data to delete....");
                    list.deleteMiddle(list,sc.nextInt());
                    list.traverse(list);
                    break;
                }
                case 9:{
                    System.exit(0);

                }
                default: {
                    System.out.println("Enter valid choice...");
                }


            }
            System.out.println("Want to continue...?");
            conti= sc.next().charAt(0);
        }while (conti=='y');



    }


}
