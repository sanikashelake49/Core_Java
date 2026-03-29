package com.array;

public class SecondLargest_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,3,4,5};
		int max=0;
		int second=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max)
			{
			   second=max;
				max=arr[i];
			}
			
			else if(arr[i]!=max && arr[i]>second ) {
				second=arr[i];
			}
			
		}
		System.out.println(max);
		System.out.println(second);

	}

}
