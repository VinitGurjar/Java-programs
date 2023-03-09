
//Write a program to print whether a number is even or odd, also take input from the user.
import java.util.Scanner;

public class even_or_odd {
    public static void main(String[] args) {
        System.out.println("Write a number:<>$ ");
        try (Scanner sc = new Scanner(System.in)) {
            int i = sc.nextInt();
            if (i % 2 == 0) {
                System.out.println("Number is even");
            } else {
                System.out.println("Number is odd");
            }
        }

    }
}
