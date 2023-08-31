package Aniket;

public class Fibonacci {
	public static void main(String[] args) {
	
		int n = 7;
	System.out.println("Fibonacci series:");
	int first = 0, second = 1;

	for (int i = 0; i < n; i++) {
		System.out.print(first + " ");
		int next = first + second;
		first = second;
		second = next;
		}
	}
}



