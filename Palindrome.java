package Aniket;

public class Palindrome {
	 public static void main(String[] args) {
	        int number = 1702; 

	        if (isPalindrome(number)) {
	            System.out.println(number + " is a palindrome.");
	        } else {
	            System.out.println(number + " is not a palindrome.");
	        }
	    }

	    public static boolean isPalindrome(int number) {
	        int originalNumber = number;
	        int reversedNumber = 0;

	        while (number > 0) {
	            int lastDigit = number % 10;
	            reversedNumber = reversedNumber * 10 + lastDigit;
	            number /= 10;
	        }

	        return originalNumber == reversedNumber;
	    }
	}


