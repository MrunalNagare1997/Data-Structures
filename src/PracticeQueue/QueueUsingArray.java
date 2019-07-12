package PracticeQueue;
import java.util.Scanner;
public class QueueUsingArray {

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        char conti='y';
        //System.out.println("Enter the capacity of the list...");
        QueueImplementation_ARRAY queue1=new QueueImplementation_ARRAY(50);

        queue1.enqueue(1);
        queue1.enqueue(2);
        queue1.enqueue(3);
        queue1.enqueue(4);
        queue1.enqueue(5);
        queue1.enqueue(6);

        System.out.println("Existing queue-");
        queue1.display();

        do
        {
            short choice =0;
            System.out.println("\n***********MENU***********\n1. ENQUEUE\n2. DEQUEUE\n3. DISPLAY\n4. GET REAR\n5. GET FRONT\n6. EXIT\n");
            choice=sc.nextShort();

            switch (choice)
            {
                case 1:
                {
                    System.out.println("Enter data to enqueue...");
                    queue1.enqueue(sc.nextInt());
                    break;
                }
                case 2:
                {
                    queue1.dequeue();
                    break;
                }
                case 3:
                {
                    queue1.display();
                    break;
                }
                case 4:
                {
                    System.out.println("Rear :"+queue1.getRera());
                    break;
                }
                case 5:
                {
                    System.out.println("Front : "+queue1.getFront());
                    break;
                }
                case 6:
                {
                    System.exit(0);
                }
                default:
                {
                    System.out.println("Please enter a valid choice...");
                    break;
                }

            }
            System.out.println("Continue\ny/n");
            conti=sc.next().charAt(0);

        }while(conti=='y');


    }

}
