package fr.dauphine.javavance.td8;

public class Maximums {
	/*
	public static int myMax(int... is)   {
		if (is.length<1) { throw new IllegalArgumentException("parametre obligatoire"); }
		int max = Integer.MIN_VALUE;
	    for (int i = 0; i < is.length; i++) {
	      if (is[i] > max) { max = is[i]; }
	    }
	    return max; 
	} */
	
	
	public static <T extends Comparable<T>> T myMax(T... a) {
			T maxi = a[0];
			for (int i = 0; i<a.length; i++) {
				if (a[i].compareTo(maxi)>0) { maxi = a[i]; }
			}
			return maxi;	
	}  
	
	
	public static void main(String[] args) {
		
		try {
			System.out.println(myMax(42,1664));
			System.out.println(myMax(2014,86,13));
			//System.out.println(myMax()); 
			
			System.out.println(myMax(8.6,16.64)); //16.64 
			System.out.println(myMax("Denis", "Cornaz")); //Denis 
			//System.out.println(myMax(8.6, "Denis")); //ne doit pas compiler !
			
		} catch (Exception e) {
			e.printStackTrace();
		} 
		
	}


	
	
}
