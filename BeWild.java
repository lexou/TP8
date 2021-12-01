package fr.dauphine.javavance.td8;

import java.util.Arrays;
import java.util.List;

public class BeWild {

	
	private static void print(List<Object> list) { 
		for(Object o :list)
		System.out.println(o);
	}
	
	public static <T extends CharSequence> void lengthObject(List<Object> liste) {
		for (Object elem : liste) {
			System.out.println("la longueur de l'element "+elem+" est "+elem.toString().length());
		}
	}
	
	
	public static void main(String[] args) { 
		List/*<String>*/ list = Arrays.asList("foo", "toto"); 
		print(list);
		lengthObject(list);
	}
}
