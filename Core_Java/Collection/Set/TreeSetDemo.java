package com.Collection.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set<String> set=new TreeSet<String>();
		set.add("a");
		set.add("A");
		set.add("s");
		set.add("0");
		//set.add(null);
		//System.out.println(set);
		Iterator<String> it=set.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println(set);
	}


}
