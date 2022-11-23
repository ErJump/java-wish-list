package org.generation.italy.christmas;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Esercizio2 {
	public static void main(String[] args) {
		// ES - 2 ===============================================
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Inserire una parola: ");
		String word = sc.nextLine();	
		sc.close();
		String[] wArr = word.split("");
		
		Set<String> wordSet = new HashSet<>();
		
		for (int i = 0; i < wArr.length; i++ ) {
			String letter = wArr[i];
			wordSet.add(letter);
		}
		
		System.out.println("Set: " + wordSet);
	}
}
