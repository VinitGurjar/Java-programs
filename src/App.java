import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println(input.nextInt());
        }
        System.out.println("enter the output: ");
    }
}
