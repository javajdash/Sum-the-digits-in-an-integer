/* 6.2 (Sum the digits in an integer) Write a method that computes the sum of the digits in an integer. Use a loop to repeatedly extract and remove the digit until all the digits are extracted. Write a test program.
*/
import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    // Prompt the user to enter a number
    System.out.print("Enter an integer: ");
    int digits = input.nextInt();
    // Display the sum of the digits
    System.out.println("The sum of digits in " + digits + " is " + sumDigits(digits));
  }

  // Calculate sum of digits
  public static int sumDigits(long n) {
    int sum = 0;
    while (n > 0) {
      sum += n % 10;
      n /= 10;
    }
    return sum;
  }
}