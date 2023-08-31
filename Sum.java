package Aniket;
import java.util.Scanner;


public class Sum {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter a number: ");
	        int number = scanner.nextInt();

	        int sum = calculateSumOfDigits(number);
	        System.out.println("Sum of digits of " + number + " is: " + sum);
	    }

	    public static int calculateSumOfDigits(int number) {
	        int sum = 0;

	        while (number > 0) {
	            int digit = number % 10;
	            sum += digit;
	            number /= 10;
	        }

	        return sum;
	    }
	}



