// import java.util.*;

// public class Questions2ndLacture {

//     public static void main(String[] args) {
//         // question = find the largest of 3 numbers
//         // Scanner input = new Scanner(System.in);
//         // int a = input.nextInt();
//         // int b = input.nextInt();
//         // int c = input.nextInt();

//         // int max = a;

//         // if(b>max) {
//         //     max = b;
//         // }

//         // if(c>max) {
//         //     max = c;
//         // }

//         // System.out.println("largest of 3 number is : " + max);


//         // question = case cheking of character upper case of lower case
//         // Scanner input = new Scanner(System.in);
//         // char ch = input.next().trim().charAt(0);

//         // if(ch>='a' && ch<='z') {
//         //     System.out.println("Lower case");
//         // } else {
//         //     System.out.println("Upper case");
//         // }

    
//         // question =  find the nth fibonaci numbers
//         // Scanner input = new Scanner(System.in);
//         // int n = input.nextInt();
//         // int p = 0;
//         // int c = 1;
//         // int count = 2;
//         // while(count<=n) {
//         //     int temp = c;
//         //     c = p+c;
//         //     p = temp;
//         //     count++;

//         // }
//         // System.out.println(c);

//         // question = count specif number how many time its repeated in input number
//         // Scanner input = new Scanner(System.in);
//         // int n = input.nextInt();
//         // int m = input.nextInt();
//         // int count = 0;
//         // while(n>0) {
//         //     int rem = n%10;
//         //     if(rem == m) {
//         //         count++;
//         //     }
//         //     n /= 10;
//         // }
//         // System.out.println("Number of times " + m + " appears: " + count);

//         // question reverse a number
//         // Scanner input = new Scanner(System.in);
//         // int number = input.nextInt();
//         // int reversed = 0;
//         // while(number != 0) {
//         //     int rem = number % 10;
//         //     number /= 10;
//         //     reversed = reversed * 10 + rem;


//         // }
//         // System.out.println("Reversed number is: " + reversed);


//         // question make calculator by using loops , if else , nested if else , switch case using only not other thing.
//         Scanner input = new Scanner(System.in);
//         int ans = 0;
//         while(true) {
//             // take the operator input
//             System.out.print("Enter the operator: ");
//             char operator = input.next().trim().charAt(0);

//             if(operator == '=') {
//                 System.out.println("Final result is: " + ans);
//                 break;
//             }

//             System.out.print("Enter the number: ");
//             int number = input.nextInt();

//             switch(operator) {
//                 case '+':
//                     ans += number;
//                     break;
//                 case '-':
//                     ans -= number;
//                     break;
//                 case '*':
//                     ans *= number;
//                     break;
//                 case '/':
//                     if(number != 0) {
//                         ans /= number;
//                     } else {
//                         System.out.println("Error: Division by zero is not allowed.");
//                         continue; // skip the rest of the loop and start next iteration
//                     }
//                     break;
//                 default:
//                     System.out.println("Invalid operator");
//                     continue; // skip the rest of the loop and start next iteration
//             }
//         }
//     }
// }