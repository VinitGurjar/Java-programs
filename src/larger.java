
//Take 2 numbers as input and print the largest number.
import java.util.Scanner;

public class larger {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("write value of a");
            int a = sc.nextInt();
            System.out.println("write value of b");
            int b = sc.nextInt();

            // condition
            if (a > b) {
                System.out.println("a is greater than b");
            } else {
                System.out.println("b is greater than a");
            }
        }
    }
}
