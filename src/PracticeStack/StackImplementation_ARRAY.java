package PracticeStack;
import java.util.Scanner;
public class StackImplementation_ARRAY {

    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        StackUsingArray stack = new StackUsingArray(100);


        char conti='n';
        int data;
        System.out.println("Enterthe data to push...");

        stack.push(5);
        stack.push(4);
        stack.push(3);
        stack.push(2);
        stack.push(1);
        stack.push(0);

        System.out.println("Existing stack:");
        stack.display();


        do{
            System.out.println("\n------MENU-----\n1. PUSH\n2. POP\n3. DISPLAY\n4. PEEK\n5. EXIT");
            short choice = sc.nextShort();
            switch (choice)
            {
                case 1:
                {
                    System.out.println("Enter data to push...");
                    stack.push(sc.nextInt());
                    stack.display();
                    break;
                }
                case 2: {
                    stack.pop();
                    stack.display();
                    break;
                }
                case 3: {
                    stack.display();
                    break;
                }
                case 4:
                {
                    data=stack.peek();
                    break;
                }
                case 5:
                {
                    System.exit(0);
                }
                default:
                {
                    System.out.println("Please enter a valid choice...");
                    break;
                }
            }

            System.out.println("Do you want to continue? \ny/n");
            conti=sc.next().charAt(0);

        }
        while(conti=='y');
    }

}
