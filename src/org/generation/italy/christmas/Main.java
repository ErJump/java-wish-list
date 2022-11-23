package org.generation.italy.christmas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		List<String> wishList = new ArrayList<>();
		boolean goNext = true;
		
		while(goNext) {
			System.out.println("Inserisci il nuovo desiderio: ");
			String wish = sc.next();
			wishList.add(wish);
			
			System.out.println("La lista è lunga " + wishList.size() );
			System.out.println("Vuoi inserire un nuovo desiderio? ");
			goNext = sc.nextBoolean();	
		}
		
		sc.close();
		
		wishList.sort(null);
		System.out.println("---------------------");
		System.out.println("Lista desideri ordine alfabetico: " + wishList);
		System.out.println("---------------------");
		
		wishList.sort(new StringComparator());
		System.out.println("Lista desideri ordine per vocali: " + wishList);
		System.out.println("=====================");

		
	}
	
	public static class StringComparator implements Comparator<String> {

		@Override
		public int compare(String o1, String o2) {
			int v1 = 0;
			int v2 = 0;
			
			List<Character> vowels = Arrays.asList(new Character[] {'a', 'e', 'i', 'o', 'u'});
			for (int i = 0; i < o1.length(); i++) {
				if (vowels.contains(o1.charAt(i))) {
					v1++;
				}
			}

			for (int i = 0; i < o2.length(); i++) {
				if (vowels.contains(o2.charAt(i))) {
					v2++;
				}
			}

			return v2 - v1;
		}

	}
}
