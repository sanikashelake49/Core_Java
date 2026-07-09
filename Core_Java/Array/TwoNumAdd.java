package com.array;

public class TwoNumAdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,3,4,5};
		
		int sum;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<i;j++)
			{
			if(arr[i]+arr[j]==9)
			{
				System.out.println(arr[i]);
			}
			i++;
			}
			
		}
		
      //System.out.println(sum);
	}

}
