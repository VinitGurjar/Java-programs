import java.util.Scanner;

public class primitive {

    public static void main(String[] args) {

        try (Scanner inputt = new Scanner(System.in)) {
            System.out.println("enter a: ");
            int a = inputt.nextInt();
            System.out.println("enter s: ");
            int s = inputt.nextInt();
            int sum = a + s;
            System.out.println("sum is ; " + sum);
        }
    }
}
