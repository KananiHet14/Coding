import java.util.*;

public class Greeting {

    static String Greet() {
        Scanner input = new Scanner(System.in);
        String greeting = input.nextLine();
        return greeting;
    }

    public static void main(String[] args) {
        System.out.println("your greeting message is : " + Greet());
    }
}
