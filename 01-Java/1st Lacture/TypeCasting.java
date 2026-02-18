import java.util.*;

public class TypeCasting {

    public static void main(String[] args) {

        // Scanner input = new Scanner(System.in);
        // float number = input.nextFloat();
        // System.out.println(number);


        byte B = 42;
        char C = 'a';
        short S = 1024;
        int I = 50000;
        float F = 5.67f;
        double D = 0.1234;
        double result = (F * B) + (I / C) - (D * S);
        System.out.println((F * B) + " " + (I / C) + " " + -(D * S));
        System.out.println(result);


    }
}