package no.hvl.dat100.lab5.tabeller;

import java.util.Arrays;
public class Tabeller {

	public static void main(String[] args) {
		Tabeller.skrivUt(new int[]{3, 5, 10, 13, -7, 1, 0, 10});
		System.out.println(Tabeller.tilStreng(new int[] {42, 67, 89}));
		System.out.println(Tabeller.summer(new int[] {42, 67, 89}));
		System.out.println(Tabeller.finnesTall(new int[] {42,67,89},90));
	    System.out.println(Tabeller.posisjonTall(new int[] {42,67,89},42));
	    System.out.println(Tabeller.erSortert(new int[] {5,25,55}));
	    System.out.println(
	    		Tabeller.tilStreng(
	    				Tabeller.reverser(new int[] {5, 25, 55})
	    				)
	    		);
	    System.out.println(Tabeller.tilStreng(Tabeller.settSammen(new int[] {42,67,89},new int[] {5, 25, 55})));
	    
	}
	// a)
	public static void skrivUt(int[] tabell) {
		// TODO
		System.out.println("--------------------------------");
		for (int number : tabell) {
			if (number >= 0) System.out.println(number);
		}
		System.out.println("--------------------------------");
	}

	// b)
	public static String tilStreng(int[] tabell) {
		
		// [ + numbers joined with <, > + ]
		
		return Arrays.toString(tabell);
	}

	// c)
	public static int summer(int[] tabell) {

		int sum = 0;
		
		for(int i=0; i<tabell.length;i++) {
			sum += tabell[i];
		}
		
//		for(int i:tabell) {
//			sum += i;
//		}
		
//		int i= 0;
//		while(i!=tabell.length) {
//			sum += tabell[i];
//			i++;
//		}
	
		return sum;
		
	}

	// d)
	public static boolean finnesTall(int[] tabell, int tall) {

		for (int number : tabell) {
			if (tall == number) return true;
			
		}
		
		return false; 
	}

	// e)
	public static int posisjonTall(int[] tabell, int tall) {

		// TODO
		for (int i=0; i<tabell.length; i++) {
			if(tabell[i] == tall  ) return i; 
		}
		return -1; 
	}
 
	// f)
	public static int[] reverser(int[] tabell) {

		int[] temp = new int[tabell.length];
		int j = tabell.length;
		
		for (int i = 0; i < tabell.length; i++) {
			temp[j - 1] = tabell[i];
			j = j - 1;
		}    
		return temp;
		
	}

	// g)
	public static boolean erSortert(int[] tabell) {
		for (int i = 0; i < tabell.length - 1; i++) {
			if (tabell[i + 1] < tabell[i]) return false;
		}
		return true;
	}

	// h)
	public static int[] settSammen(int[] tabell1, int[] tabell2) {
		int[] combinedArr = new int[tabell1.length+tabell2.length];
		
		for (int i = 0; i < tabell1.length; i++) {
			combinedArr[i] = tabell1[i];
		}
		
		for (int i = 0; i < tabell2.length; i++) {
			combinedArr[tabell1.length + i] = tabell2[i];
		}
		
		return combinedArr;
	}
}
