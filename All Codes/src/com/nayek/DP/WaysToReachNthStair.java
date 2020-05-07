package com.nayek.DP;

//ways(n) = ways(n-1)+ways(n-2)
//similar to fibonacci except ways(n) = fib(n+1);
//Time complexity : O(n)
public class WaysToReachNthStair {

	public int fibonacci(int n) {
		int n1 = 0;
		int n2 = 1;
		int sum = 0;
		for (int i = 2; i <= n; i++) {
			sum = n1 + n2;
			n1 = n2;
			n2 = sum;
		}
		return sum;
	}

	public int countWays(int n) {
		return fibonacci(n + 1);
	}

	public static void main(String[] args) {
		WaysToReachNthStair ws = new WaysToReachNthStair();
		int n = 10;
		int n1 = 4;
		int n2 = 24;
		System.out.println(ws.countWays(n));
		System.out.println(ws.countWays(n1));
		System.out.println(ws.countWays(n2));

	}

}
