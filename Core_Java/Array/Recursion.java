package com.Infosys;

import java.util.Scanner;

public class Recursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		int n = 4;
		int[] dp = new int[n + 1];

		for (int i = 0; i <= n; i++)
		    dp[i] = -1;

		System.out.println(Fibonacci.fib(n, dp));

		
		
	}

}

class Fibonacci{
	static int fib(int n ,int[]dp) {
		
		if(dp[n]!=-1)
			return dp[n];
		
		
		if(n==0)
			return dp[n]=0;
		//fib(n)=fib(n-1)+fib(n-2);
		if(n==1)
			return dp[n]=1;
		//fib(n)=fib(n-1)+fib(n-2);
		
//		System.out.println(n);
//		fun(n-1);
		dp[n] = fib(n - 1, dp) + fib(n - 2, dp);
		return dp[n];

	}
}
