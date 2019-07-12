package PracticeStack;
import java.util.Scanner;
public class StackImplementation_LinkedList {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        StackUsingLinkedList stack = new StackUsingLinkedList();

        stack.push(2);
        stack.push(3);
        stack.push(4);

        stack.printStack();

        System.out.println("\n"+stack.peek());

        stack.pop();
        stack.printStack();
        stack.getTop();
    }


}
