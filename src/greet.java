
//Take name as input and print a greeting message for that particular name
import java.util.Scanner;

public class greet {
    public static void main(String[] args) {
        try (// Initializing input
                Scanner sc = new Scanner(System.in)) {
            System.out.print("Input any character: ");

            // Input
            String name = sc.nextLine();

            // final output
            System.out.println("Ram ram " + name + " bhai!");
        }
    }
}
