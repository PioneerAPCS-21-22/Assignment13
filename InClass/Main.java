
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        boolean boo = true;

        // if(boo = true)  // WRONG
        if(boo == true) {  // CORRECT
            System.out.println("BOO!");
        }
        if(boo == false) {
            System.out.println("Hi.");
        }


        System.out.println("Enter a, b, and c: ");
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();;

        int disc = b*b - 4*a*c;

        if(disc > 0) {
            System.out.println("Two real solutions.");
        }
        if(disc == 0) {
            System.out.println("One real solution.");
        }
        if(disc < 0) {
            System.out.println("Two complex solutions.");
        }

        System.out.print("How old are you? ");
        int age = in.nextInt();
        if(age < 0) {
            System.out.println("Error. Invalid age.");
        }
        if(age >= 0) {
            System.out.println("Wow you're " + age + " years old? You look young for your age!");
        }
    }
}
