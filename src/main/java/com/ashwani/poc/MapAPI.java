package com.ashwani.poc;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.IntConsumer;
import java.util.stream.IntStream;

public class MapAPI {
	
	public static  Map<String, String> map = new ConcurrentHashMap<String,String>();
	
	public static void main(String[] args) {
		
		IntStream.range(1, 11).forEach(new IntConsumer() {
			@Override
			public void accept(int value) {
				map.put(String.valueOf(value), String.valueOf(value));
			}
		});
		System.out.println(map);
	}

}
