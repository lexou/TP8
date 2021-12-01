package fr.dauphine.javavance.td8;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Melange {

	public static <T> void echange(List<T> l, int e1, int e2){
		T elem1 = l.get(e1);
		T elem2 = l.get(e2);
		for (int i = 0; i<l.size(); i++) {
			if (i == e1) {
				l.set(i, elem2);
			}
			if (i == e2) {
				l.set(i, elem1);
			} 
		}
	}
	
	public static <T> void mezclar(List<T> l) {
		Random random = new Random();
		int len = l.size();
		for (int i = 0; i < len; i++) {
			int change = i + random.nextInt(len - i);
			echange(l, i, change);
		}
	}
	
	public static void main(String[] args) {
		List<String> l1= Arrays.asList("C", "rc", "java", "haskell", "python");
		echange(l1, 2, 3);
		System.out.println("methode echange "+l1);
		mezclar(l1);
		System.out.println("methode mezclar "+l1);
	}
	
	
}
