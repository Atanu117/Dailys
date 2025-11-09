
import java.util.Scanner;

public class Inheritance_Useless {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b;
        System.out.println("Enter the numbers");
        a=sc.nextInt();
        b=sc.nextInt();
        System.out.println("Sum = "+(a+b));

        sc.close();
    }
    private int a;
    private int b;
    public int  substract(int a, int b){
        a=this.a;
        b=this.b;
        System.out.println("Substraction = "+(a-b));
        return 0;
    }

    
}
