
import java.util.Scanner;

public class add {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a;
        int b;
        System.out.print("Enter first integer: ");
        a = scanner.nextInt();
        System.out.print("Enter second integer: ");
        b = scanner.nextInt();
        
        int sum = a + b;
        System.out.println("The sum of " + a + " and " + b + " is: " + sum);
    }
}
