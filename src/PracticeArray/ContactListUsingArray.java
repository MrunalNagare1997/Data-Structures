package PracticeArray;//Arrray reallife application contact list.
//All the contacts will be placed in the array and whenever a new contact will be added
// the array will be sorted to keep the contacts in a particular order

import java.util.Scanner;
class Contact {



    String [] contactNames = new String [100];
    String [] contactNumber = new String[100];
    int count=0;

    Contact()
    {

    }


    public void addContact(String name, String number) {

        if(count>=100)
        {
            System.out.println("PracticeArray.Contact list full...");
            return;
        }
        count++;

        contactNames[count-1]= name;
        contactNumber[count-1]= number;
    }

    public void display ()
    {
        for (int i=0;i<100;i++)
        {
            System.out.println(contactNames[i]+"  "+contactNumber[i]);
        }
    }

    public void delete(String name) {
        boolean match = false;
        int count = 0;
        while (match == false && count < 100) {
            if (name.equals(contactNames[count])) {
                match = true;
            } else
                //System.out.println(count);
                count++;
        }
        if (match == false) {
            System.out.println("Match not found...");
        } else
        {
            System.out.println("Name:"+contactNames[count]+"\nNumber:"+contactNumber[count]+"\n Is succesfully deleted...");
            contactNames[count]=null;
            contactNumber[count]=null;
        }
    }


}


public class ContactListUsingArray {




    public static void main(String args [])
    {
        Scanner sc = new Scanner(System.in);
        Contact contactObject = new Contact();


        char conti='y';
        int choice= 0;

        while(conti == 'y') {
            System.out.println("1. Add contact\n2. Delete contact\n3. Display contacts\n4. Exit");
            choice= sc.nextInt();


            switch (choice) {
                case 1: {
                    String name;
                    String number;
                    System.out.println("Enter name");
                    name = sc.next();


                    System.out.println("Enter Number");
                    number = sc.next();

                    while(number.length() != 10)
                    {

                        System.out.println("\nNumber too small...\nEnter valid number...");
                        number = sc.next();

                    }

                    contactObject.addContact(name, number);
                    break;
                }
                case 2: {
                    System.out.println("Entername to delete...");
                    String name=sc.next();

                    contactObject.delete(name);
                    break;
                }
                case 3: {
                    contactObject.display();
                    break;
                }
                case 4: {
                    System.exit(0);
                }
                default: {
                    System.out.println("Enter valid choice...");

                }

            }
            System.out.println("Continue...?\n Y/N");
            conti = sc.next().charAt(0);

        }
    }



}
