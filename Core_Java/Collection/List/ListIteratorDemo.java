package com.Collection.list;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> l1=new ArrayList<String>();
		l1.add("sanika");
		l1.add("a");
		l1.add("gauri");;
		
		ListIterator<String> list=l1.listIterator();
		while(list.hasNext()) {
			String s=list.next();
			list.set(s.toUpperCase());
			
		}
		//System.out.println(l1);
		System.out.println(list);

	}

	@Override
	public String toString() {
		return "ListIteratorDemo [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
}
