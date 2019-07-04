package com.testpkg;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<String, String> map = new HashMap<String, String>();
		
		
		map.put("My Name", "Baji");
		map.put("Study", "B.tech");
		map.put("Married", "Single");
		
		Set<String> keys =map.keySet();
		
		for (String key : keys) {
			
			System.out.println(key +"     "+map.get(key));
			
		}
		
		

	}

}
