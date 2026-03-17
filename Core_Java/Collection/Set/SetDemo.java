package com.Collection.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> emails=new HashSet<String>();
		emails.add("a@gmail.com");
		emails.add("b@gmail.com");
		emails.add("a@gmail.com"); //avoid duplicates
		emails.add(null);
		emails.add(null);  //only 1 null allowed 
//        //System.out.println(emails);
//        for(String s:emails) {
//        	//System.out.println(s);
//        }
        
        //using iterator
        Iterator<String> it=emails.iterator();
        while(it.hasNext()) {
        	System.out.println(it.next());
        }
       System.out.println(emails);
     

	}

}
