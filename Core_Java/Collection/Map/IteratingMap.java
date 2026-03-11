package com.Collection.map;

import java.util.HashMap;
import java.util.Map;

public class IteratingMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer, String> map=new HashMap<Integer, String>();
		map.put(0, null);
		map.put(1, "a");
		for(Map.Entry<Integer, String> entry :map.entrySet()) {
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
	}

}
