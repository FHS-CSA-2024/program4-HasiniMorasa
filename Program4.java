
import java.util.Scanner;


public class Program4 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Declare variables
        int num1, num2, num3, num4;
        int sum;
        double average;

        // Read input data
        System.out.print("Enter the first three-digit number: ");
        num1 = scanner.nextInt();

        System.out.print("Enter the second three-digit number: ");
        num2 = scanner.nextInt();

        System.out.print("Enter the third three-digit number: ");
        num3 = scanner.nextInt();

        System.out.print("Enter the fourth three-digit number: ");
        num4 = scanner.nextInt();

        //Calculate: Compute the sum of the four numbers
        sum = num1 + num2 + num3 + num4;

        //Calculate" Compute the average of the four numbers
        average = (double)sum / 4.0; // Use 4.0 to ensure floating-point division

        // Print the results
        System.out.println("The sum of the four numbers is " + sum);
        System.out.println(); // Print a blank line
        System.out.printf("The average of the four numbers is " + average);
    }
}


