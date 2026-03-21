package com.array;

public class CommonSort_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,3,4,5};
		int arr1[]= {1,7,8,9,5};
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr1.length;j++) {
				if(arr[i]==arr[j]) {
					System.out.println(arr[i]);
				}else {
					System.out.println(arr1[i]);
				}i++;
			}
		}

	}

}
