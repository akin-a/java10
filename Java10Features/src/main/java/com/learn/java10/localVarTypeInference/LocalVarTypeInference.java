package com.learn.java10.localVarTypeInference;

import java.util.HashMap;
import java.util.List;

public class LocalVarTypeInference {

	public static void main(String[] args) {
		methodOne();
		methodTwo();
	}

	private static void methodOne() {
		var what = "Paris Olympics";
		var when = 2020;
		System.out.println(what.toUpperCase());
		System.out.println(when + 4);
		
		
		var map = new HashMap<Integer,String>();
		map.put(2000, "Sydney");
		map.put(2004, "Athens");
		
		var host = map.get(2000);
		System.out.println(host.length());  
		
		var emojiSmilingHeart = 0x1F60D;
		System.out.println(Character.toString(emojiSmilingHeart));
	}
	
	private static void methodTwo() {
		var hostList = List.of("Beijing","London","Rio");
		var count = 1;
		for(var host : hostList) {
			System.out.println(String.valueOf(count).concat(".") + host);
			count++;
		}
	}
}
