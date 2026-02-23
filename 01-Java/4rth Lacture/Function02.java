import java.util.*;

public class Function02 {
    
    static int sum() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = input.nextInt();
        System.out.print("Enter second number: ");
        int b = input.nextInt();
        return a + b;
    }
    public static void main(String[] args) {
        int result = sum();
        System.out.println("Sum is: " + result);
    }
}