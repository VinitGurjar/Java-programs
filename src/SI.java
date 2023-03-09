
//Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.
import java.util.Scanner;

public class SI {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter principle");
            int p = sc.nextInt();
            System.out.println("Enter rate");
            int r = sc.nextInt();
            System.out.println("Enter time");
            int t = sc.nextInt();

            // final formula
            int SI = (p * r * t) / 1000;
            System.out.println("simple interest for the given values is > " + SI);
        }

    }
}
