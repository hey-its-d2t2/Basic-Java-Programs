/* Write a program to print first 'n' terms of a Fibonacci series, take 
the value of 'n' from user */

import java.util.Scanner;

class NFibo{

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the number of terms in the Fibonacci series: ");
        int n = sc.nextInt();

        System.out.println("The Fibonacci series:");

        // Print the first 'n' terms of the Fibonacci series
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci(i) + " ");
        }
	}

    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }

        int prev = 0;
        int curr = 1;

        for (int i = 2; i <= n; i++) {
            int next = prev + curr;
            prev = curr;
            curr = next;
        }

        return curr;
    }
}