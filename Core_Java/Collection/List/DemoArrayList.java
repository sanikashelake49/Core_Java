package com.Collection.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class DemoArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		List<String> list=new ArrayList<String>();
//		list.add(null);
//		list.add("sanika");
//		list.add("sanika");
//		list.add(null);
//		list.add(null);
//		list.add(null);
//		list.add(null);
//		list.add("0");
//		List<Integer> list1=new ArrayList<Integer>();
//		list1.add(01);
//		list1.add(null);
//		list1.add(0);
//		list1.add(190);
//		System.out.println(list.get(0));
//		list.set(0, "patil");
//		list.remove(1);
//		//System.out.println(list1);
//		List<String> l1=new ArrayList<String>();
//		//l1.add("a");
//		//l1.isEmpty();
//		System.out.println(l1.isEmpty());
//		list.clear();
//
//		System.out.println(list);
		
		//LOOPS
		
		List<String> l2=new ArrayList<String>();
		l2.add("a");
		l2.add("b");
		l2.add("0");
		for(int i=0;i<l2.size();i++) {
			//System.out.println(l2.get(i));
		}
		
		List<Integer> l3=new ArrayList<Integer>();
		l3.add(5);
		l3.add(10);
		l3.add(15);
		l3.add(20);
//		for(int i=0;i<l3.size();i++) {
//		      System.out.println(l3.get(i));
//		}
 
		//for(Integer a:l3) {
			//System.out.println(a);
		//}
//		for (Iterator iterator = l3.iterator(); iterator.hasNext();) {
//			Integer integer = (Integer) iterator.next();
			
		//}
//		for(int i=0;i>10;i++) {
//			System.out.println(l3.get(i));
			
	          //to check how time system take to execute this program

			 long start2=System.nanoTime();
		       // l3.get(0);
			// l3.addFirst(null);
			// int n=10_000_000;
			 System.out.println(l3.size());
			 System.out.println(l2.size());

		        //l3.add(45);
		        long start1=System.nanoTime();
		        System.out.println(start1-start2);
		}


}



