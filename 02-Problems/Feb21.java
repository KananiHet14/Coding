import java.util.*;

public class Feb21 {
    public static void main(String[] args) {
        // Write a Java program to find the sum of the first 10 natural numbers.
        // Scanner input = new Scanner(System.in);
        // int in = input.nextInt();
        // int sum = 0;
        // for(int i=1; i<=in; i++) {
        //     sum = sum+i;
        // }
        // System.out.println("Sum of first " + in + " natural numbers is: " + sum);


        
        /*
        Question = Write a program that takes a number as input and classifies it based on multiple criteria:
        Requirements:
        Check if the number is positive, negative, or zero
        If positive:
        Check if it's even or odd
        Check if it's a single digit (1-9), double digit (10-99), or triple digit (100-999)
        If negative:
        Convert to positive and check if it's divisible by 5
        If zero: Print "Zero has no sign"
        */ 
        // Scanner input = new Scanner(System.in);
        // int number = input.nextInt();

        // // positive 
        // if(number > 0) {
        //     System.out.println("youe entered positive number");
        //     if(number % 2 == 0) {
        //         System.out.println("youe entered even number");
        //     } else {
        //         System.out.println("youe entered odd number");
        //     }

        //     if(number < 10) {
        //         System.out.println("youe entered single digit number");
        //     } else if(number < 100) {
        //         System.out.println("youe entered two digit number");
        //     } else if(number < 1000) {
        //         System.out.println("youe entered three digit number");
        //     } else {
        //         System.out.println("youe entered more digit number");
        //     }
        // } 
        // // negative
        // else if(number < 0) {
        //     System.out.println("youe entered negative number");
        //     number = Math.abs(number); // Convert to positive
        //     System.out.println("after converting to positive: " + number);
        //         if(number % 5 == 0) {
        //             System.out.println("youe entered number is divisible by 5");
        //         } else {
        //             System.out.println("youe entered number is not divisible by 5");
        //         }
        // } 
        //  // zero
        // else {
        //     System.out.println("youe entered zero");
        //     System.out.println("zero has no sign");
        // }




        /*question = Create an ATM program with the following features:
        Main Menu (using switch case):
        Check Balance
        Withdraw Money
        Deposit Money
        Change PIN
        Exit
        
        Rules: Starting balance: ₹10,000
        Starting PIN: 1234
        Withdrawal limit: ₹20,000 per transaction
        Denominations available: ₹500, ₹200, ₹100 only
        User gets 3 attempts to enter correct PIN (use while loop)
        After each transaction, ask if user wants another transaction (use do-while loop)

        Withdrawal Logic (nested switch):
        When user withdraws money, ask for denomination preference:

        Press 1: Maximum ₹500 notes
        Press 2: Maximum ₹200 notes
        Press 3: Maximum ₹100 notes
*/


        // Scanner object for user input
        // Scanner sc = new Scanner(System.in);
        
        // // State variables - maintain throughout program
        // int balance = 10000;           // Starting balance: ₹10,000
        // int pin = 1234;                // Starting PIN: 1234
        // int userPin = 0;               // Variable to store user-entered PIN
        // int attempts = 0;              // Track PIN attempts
        // int maxAttempts = 3;           // Maximum allowed attempts
        
        // // PIN Verification using while loop
        // System.out.println("==WELCOME TO ATM==");
        
        // // While loop runs until correct PIN or max attempts reached
        // while(attempts < maxAttempts) {
        //     System.out.print("Enter your PIN: ");
        //     userPin = sc.nextInt();
            
        //     // Check if entered PIN matches
        //     if(userPin == pin) {
        //         System.out.println(" PIN Correct! Access Granted.\n");
        //         break; // Exit PIN verification loop
        //     } else {
        //         attempts++; // Increment failed attempt counter
                
        //         // Calculate remaining attempts
        //         int remaining = maxAttempts - attempts;
                
        //         // Check if attempts exhausted
        //         if(remaining > 0) {
        //             System.out.println(" Wrong PIN! " + remaining + " attempt(s) remaining.\n");
        //         } else {
        //             System.out.println(" Maximum attempts reached. Card blocked!");
        //             System.out.println("Please contact your bank.");
        //             return; // Exit program completely
        //         }
        //     }
        // }
        
        // // Variable to control do-while loop for transactions
        // int continueTransaction = 1;
        
        // // Main transaction loop using do-while
        // // Executes at least once, then asks if user wants to continue
        // do {
        //     // Display main menu
        //     System.out.println("\n========== ATM MAIN MENU ==========");
        //     System.out.println("1. Check Balance");
        //     System.out.println("2. Withdraw Money");
        //     System.out.println("3. Deposit Money");
        //     System.out.println("4. Change PIN");
        //     System.out.println("5. Exit");
        //     System.out.println("===================================");
        //     System.out.print("Enter your choice (1-5): ");
            
        //     int choice = sc.nextInt();
            
        //     // Main switch case for menu options
        //     switch(choice) {
                
        //         // CASE 1: Check Balance
        //         case 1:
        //             System.out.println("\n Your current balance: ₹" + balance);
        //             break;
                
        //         // CASE 2: Withdraw Money (with nested switch)
        //         case 2:
        //             System.out.print("\nEnter amount to withdraw: ₹");
        //             int withdrawAmount = sc.nextInt();
                    
        //             // Validation: Check if amount is positive
        //             if(withdrawAmount <= 0) {
        //                 System.out.println("Invalid amount! Must be greater than zero.");
        //                 break;
        //             }
                    
        //             // Validation: Check withdrawal limit
        //             if(withdrawAmount > 20000) {
        //                 System.out.println("Withdrawal limit exceeded!");
        //                 System.out.println("Maximum withdrawal per transaction: ₹20,000");
        //                 break;
        //             }
                    
        //             // Validation: Check if sufficient balance
        //             if(withdrawAmount > balance) {
        //                 System.out.println("Insufficient balance!");
        //                 System.out.println("Your balance: ₹" + balance);
        //                 break;
        //             }
                    
        //             // Validation: Check if amount is in valid denominations
        //             if(withdrawAmount % 100 != 0) {
        //                 System.out.println(" Invalid amount!");
        //                 System.out.println("Amount must be in multiples of ₹100");
        //                 break;
        //             }
                    
        //             // All validations passed - proceed to denomination selection
        //             System.out.println("\n Choose Denomination Preference");
        //             System.out.println("1. Prefer ₹500 notes");
        //             System.out.println("2. Prefer ₹200 notes");
        //             System.out.println("3. Prefer ₹100 notes");
        //             System.out.print("Enter your choice (1-3): ");
                    
        //             int denomChoice = sc.nextInt();
                    
        //             // Variables to count each denomination
        //             int notes500 = 0;
        //             int notes200 = 0;
        //             int notes100 = 0;
        //             int remainingAmount = withdrawAmount;
                    
        //             // Nested switch for denomination preference
        //             switch(denomChoice) {
                        
        //                 // Prefer ₹500 notes
        //                 case 1:
        //                     // Calculate maximum ₹500 notes
        //                     notes500 = remainingAmount / 500;
        //                     remainingAmount = remainingAmount % 500;
                            
        //                     // Calculate ₹200 notes for remaining amount
        //                     notes200 = remainingAmount / 200;
        //                     remainingAmount = remainingAmount % 200;
                            
        //                     // Calculate ₹100 notes for remaining amount
        //                     notes100 = remainingAmount / 100;
        //                     remainingAmount = remainingAmount % 100;
        //                     break;
                        
        //                 // Prefer ₹200 notes
        //                 case 2:
        //                     // Calculate maximum ₹200 notes
        //                     notes200 = remainingAmount / 200;
        //                     remainingAmount = remainingAmount % 200;
                            
        //                     // Calculate ₹500 notes for remaining amount if needed
        //                     notes500 = remainingAmount / 500;
        //                     remainingAmount = remainingAmount % 500;
                            
        //                     // Calculate ₹100 notes for remaining amount
        //                     notes100 = remainingAmount / 100;
        //                     remainingAmount = remainingAmount % 100;
        //                     break;
                        
        //                 // Prefer ₹100 notes
        //                 case 3:
        //                     // Give all in ₹100 notes
        //                     notes100 = remainingAmount / 100;
        //                     remainingAmount = remainingAmount % 100;
        //                     break;
                        
        //                 // Invalid denomination choice
        //                 default:
        //                     System.out.println(" Invalid choice! Transaction cancelled.");
        //                     break;
        //             }
                    
        //             // Check if denomination choice was valid
        //             if(denomChoice >= 1 && denomChoice <= 3) {
        //                 // Display dispensed notes
        //                 System.out.println("\n Transaction Successful!");
        //                 System.out.println("--- Dispensing Notes ---");
                        
        //                 // Show only non-zero denominations
        //                 if(notes500 > 0) {
        //                     System.out.println("₹500 x " + notes500 + " = ₹" + (notes500 * 500));
        //                 }
        //                 if(notes200 > 0) {
        //                     System.out.println("₹200 x " + notes200 + " = ₹" + (notes200 * 200));
        //                 }
        //                 if(notes100 > 0) {
        //                     System.out.println("₹100 x " + notes100 + " = ₹" + (notes100 * 100));
        //                 }
                        
        //                 // Deduct amount from balance
        //                 balance = balance - withdrawAmount;
                        
        //                 System.out.println("------------------------");
        //                 System.out.println("Amount withdrawn: ₹" + withdrawAmount);
        //                 System.out.println("New balance: ₹" + balance);
        //             }
        //             break;
                
        //         // CASE 3: Deposit Money
        //         case 3:
        //             System.out.print("\nEnter amount to deposit:");
        //             int depositAmount = sc.nextInt();
                    
        //             // Validation: Check if amount is positive
        //             if(depositAmount <= 0) {
        //                 System.out.println(" Invalid amount! Must be greater than zero.");
        //                 break;
        //             }
                    
        //             // Validation: Check if amount is in valid denominations
        //             if(depositAmount % 100 != 0) {
        //                 System.out.println(" Invalid amount!");
        //                 System.out.println("Amount must be in multiples of ₹100");
        //                 break;
        //             }
                    
        //             // Add amount to balance
        //             balance = balance + depositAmount;
                    
        //             System.out.println("\n Deposit Successful!");
        //             System.out.println("Amount deposited:" + depositAmount);
        //             System.out.println("New balance:" + balance);
        //             break;
                
        //         // CASE 4: Change PIN
        //         case 4:
        //             System.out.print("\nEnter current PIN: ");
        //             int currentPin = sc.nextInt();
                    
        //             // Verify current PIN
        //             if(currentPin != pin) {
        //                 System.out.println(" Incorrect current PIN!");
        //                 break;
        //             }
                    
        //             System.out.print("Enter new PIN (4 digits): ");
        //             int newPin = sc.nextInt();
                    
        //             // Validation: Check if PIN is 4 digits
        //             if(newPin < 1000 || newPin > 9999) {
        //                 System.out.println(" Invalid PIN! Must be 4 digits.");
        //                 break;
        //             }
                    
        //             System.out.print("Confirm new PIN: ");
        //             int confirmPin = sc.nextInt();
                    
        //             // Check if both PINs match
        //             if(newPin != confirmPin) {
        //                 System.out.println(" PINs do not match! Try again.");
        //                 break;
        //             }
                    
        //             // Update PIN
        //             pin = newPin;
        //             System.out.println(" PIN changed successfully!");
        //             break;
                
        //         // CASE 5: Exit
        //         case 5:
        //             System.out.println("\n Thank you for using our ATM!");
        //             System.out.println("Have a great day! ");
        //             continueTransaction = 0; // Set flag to exit do-while loop
        //             break;
                
        //         // Default: Invalid menu choice
        //         default:
        //             System.out.println(" Invalid choice! Please select 1-5.");
        //             break;
        //     }
            
        //     // If user chose exit (case 5), don't ask for continuation
        //     if(choice == 5) {
        //         break; // Exit do-while loop
        //     }
            
        //     // Ask if user wants another transaction
        //     System.out.print("\n Do you want another transaction? (1=Yes, 0=No): ");
        //     continueTransaction = sc.nextInt();
            
        //     // Validation: Only accept 0 or 1
        //     while(continueTransaction != 0 && continueTransaction != 1) {
        //         System.out.print("Invalid input! Enter 1 for Yes or 0 for No: ");
        //         continueTransaction = sc.nextInt();
        //     }
            
        // } while(continueTransaction == 1); // Continue if user enters 1
        
        // // Final exit message (if not already shown)
        // if(continueTransaction == 0) {
        //     System.out.println("\n Thank you for using our ATM!");
        //     System.out.println("Have a great day! ");
        // }
        
        // // Close scanner
        // sc.close();
    }
}
