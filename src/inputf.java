import java.util.Scanner;

public class inputf {
    public static void main(String[] args) throws Exception {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("enter inpu ");
            int roll = input.nextInt();
            System.out.println(" output is : " + roll);
        }
    }
}
