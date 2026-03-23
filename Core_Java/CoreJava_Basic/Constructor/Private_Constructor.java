package com.Constructor;

import com.Class.StdMain;

public class Private_Constructor {
	int id;
	String name;
	private Private_Constructor() {
		super();
		// TODO Auto-generated constructor stub
	}
	private Private_Constructor(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	public static void main(String[]args){
		Private_Constructor pc=new Private_Constructor();
		pc.id=1;
	}

}

