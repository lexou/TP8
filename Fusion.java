package fr.dauphine.javavance.td8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Fusion {
	
	public static <T> List<T> fusion(List<T> l1, List<T> l2){
		if (l1.size() != l2.size()) { 
			throw new IllegalArgumentException("Les deux listes doivent avoir la meme taille"); 
		}
		if (l2 == null || l1 == null) {
			throw new IllegalArgumentException("Attention l'une de vos listes est nulle");
		}
		if (l1.isEmpty()) { return l2; }
		if (l2.isEmpty()) { return l1; }
		List<T> l3 = new ArrayList<>();
		for (int i = 0; i < l1.size(); i++) {
			l3.add(l1.get(i));
			if (i < l1.size()) {
				l3.add(l2.get(i));
			}	
		}
		return l3;
	}
	
	public static void main(String[] args) {
		List<String> l1= Arrays.asList("C", "rc");
		List<String> l6= Arrays.asList("A", "aa");
		
		List<StringBuilder> l2= Arrays.asList(new StringBuilder("a ma"), new StringBuilder("he!")); 
		List<? extends CharSequence> r1 = fusion(l1,l2);
		List<?> r2 = fusion(l1,l2);
		List<Integer> l3 = Arrays.asList(1,2);
		List<Integer> l4 = Arrays.asList(10,20);
		List<Integer> r3 = fusion(l3,l4);
		List<?> r4 = fusion(l1,l3);
		System.out.println("r1:"+r1);
		System.out.println("r3:"+r3);
		System.out.println("r4:"+r4);
	}
	

}
