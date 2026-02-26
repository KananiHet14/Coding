import java.util.*;

public class Basics26feb {
    public static void main(String[] args) {
        // level 3 
        // Question 1 = Grade calculator
        // Scanner input = new Scanner(System.in);
        // System.out.print("Enter your marks :");
        // int marks = input.nextInt();

        // if(marks >=90 && marks <= 100) {
        //     System.out.println("A+ GRADE");
        // } else if(marks >= 75 && marks < 90) {
        //     System.out.println("A GRADE");

        // } else if(marks >= 60 && marks < 75) {
        //     System.out.println("B GRADE");

        // } else if(marks >= 50 && marks < 60) {
        //     System.out.println("C GRADE");

        // } else if(marks >= 40 && marks < 50) {
        //     System.out.println("D GRADE");

        // } else {
        //     System.out.println("FAIL");

        // }

        int n = 5;
        int m = 5;

        for(int i=n; i>=1; i--) {
            for(int j=0; j<=m; j++) {
                if(i==0 || j==0 || i==n || j==m) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }

            }
            System.out.println();
        }

        for(int i=0; i<=n; i++) {
            for(int j=0; j<=i; j++) {
                System.out.print(j);

            }
            System.out.println();
        }

    }
}