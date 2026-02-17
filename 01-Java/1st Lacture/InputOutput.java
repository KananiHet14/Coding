import java.util.Scanner;

public class InputOutput {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for their name
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        // Prompt the user for their age
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        // Output the user's name and age
        System.out.println("Hello, " + name + "! You are " + age + " years old.");

        // Close the scanner
        scanner.close();
    }
}