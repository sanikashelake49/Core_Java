package com.Collection.map;

import java.util.HashMap;
import java.util.Map;

public class StudentMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer, String> students=new HashMap<Integer, String>();
		students.put(101, "sanika");
		students.put(102, "gauri");
		students.put(103, "pratik");
		
		int id=102;
		if(students.containsKey(id)) {
			System.out.println("Students name "+students.get(id));
		}
		else
		{
			System.out.println("Student not found");
		}

	}

}
