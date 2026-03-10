package com.Collection.set;

import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> set=new HashSet<String>();
		set.add("A");
		set.add("a");
		set.add("0");
		set.add(null);
		set.add(null);
		set.add(null);
		int a="0".hashCode();
		System.out.println(set);
		System.out.println(a);

	}

}
