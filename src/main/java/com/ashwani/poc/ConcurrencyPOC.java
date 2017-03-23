package com.ashwani.poc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConcurrencyPOC {
	
	public static void main(String[] args) {
		
		List<Integer> intList = new ArrayList<Integer>(){{
			add(1);
			add(10);
			add(5);
			add(15);
		}};
		Integer [] intArray = new Integer [intList.size()];
		intArray = intList.toArray(intArray);
		System.out.println("Before sort ");
		printValues(intArray);
		Arrays.parallelSort( intArray , ( x, y ) -> ((Integer) x).compareTo( (Integer) y ) );
		System.out.println("After sort ");
		printValues(intArray);
	}
	
	static void printValues(Integer [] intArray)
	{
		Arrays.stream(intArray).forEach(value -> System.out.println(value));
	}

}
