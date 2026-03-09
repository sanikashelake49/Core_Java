package com.Collection.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class ReverseList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> l1=new ArrayList<String>();
		l1.add("A");
		l1.add("b");
		l1.add("C");
		
		//1st method
		
		//Collections.reverse(l1);
		//System.out.println(l1);
		
		//2nd method
		
		//using listiterator
		ListIterator<String> lit=l1.listIterator(l1.size());
//		while(lit.hasPrevious()) {
//			//System.out.println(lit.previous());
//		}

	
	
	//3rd method
	//simple for loop
	for(int i=l1.size()-1;i>=0;i--) {
		System.out.println(l1.get(i));
	}

}
}