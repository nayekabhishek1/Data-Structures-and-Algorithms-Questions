package com.nayek.DP;

//Time complexity : O(n)
public class FirstNFibonacci {

	public void print(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public void DPFibonacci(int n) {

		int[] fib = new int[n + 1];
		fib[0] = 0;
		fib[1] = 1;
		for (int i = 2; i < fib.length; i++) {
			fib[i] = fib[i - 1] + fib[i - 2];
		}
		print(fib);
	}

	public void spaceOptimizedDPFibonacci(int n) {
		int n1 = 0;
		int n2 = 1;
		int sum = 0;
		System.out.print(n1 + " " + n2 + " ");
		for (int i = 2; i <= n; i++) {
			sum = n1 + n2;
			System.out.print(sum + " ");
			n1 = n2;
			n2 = sum;
		}

	}

	public static void main(String[] args) {
		FirstNFibonacci ff = new FirstNFibonacci();
		int n = 10;
		ff.DPFibonacci(n);
		System.out.println("");
		ff.spaceOptimizedDPFibonacci(n);

	}
}
