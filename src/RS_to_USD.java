
//Input currency in rupees and output in USD.
import java.util.Scanner;

public class RS_to_USD {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter money in Rupess");
            float money = sc.nextFloat();
            // converting RS to USD
            System.out.println("$" + money * 82.89 + "USD");
        }
    }
}
