package fr.dauphine.javavance.td8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Exercice3b {

		public static List listLength(List<?> list) { 
			ArrayList<?> length = new ArrayList<?>();
			
			for(int i = 0; i<list.size(); i++) {
				CharSequence seq=(CharSequence)list.get(i);
				System.out.println(seq.toString());
				length.add(seq.length()); 
			}
			return length; 
		}
		
		public static void main(String[] args) { 
			List l = Arrays.asList("colonel", "reyel"); 
			System.out.println(listLength(l));
		}
}


