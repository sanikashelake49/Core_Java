package com.Collection.list;

import java.util.ArrayList;
import java.util.List;
import java.util.*;

public class IteratorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> l1=new ArrayList<String>();
		l1.add("sanika");
		//l1.add(null);
		l1.add("shelake");
		l1.add("a");
		l1.add("b");
		l1.add("c");
		
		Iterator<String> list=l1.iterator();
		while(list.hasNext()) {
			String s=list.next();
			//System.out.println(s);
			if(s==null) {//it also written like this (s.equals("sanika")) & ("sanika".equals(s))
				//System.out.println(s);
				list.remove();
			}
		}
		System.out.println(l1);

	}

}
