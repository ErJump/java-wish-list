package org.generation.italy.christmas;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Esercizio2 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Inserire una parola: ");
		String word = sc.nextLine();	
		sc.close();
		String[] wArr = word.split("");
		
		//TreeSet mette in ordine alfabetico i valori
		Set<String> wordSet = new TreeSet<>();
		
		for (int i = 0; i < wArr.length; i++ ) {
			String letter = wArr[i];
			wordSet.add(letter);
		}
		
		System.out.println("Set: " + wordSet);
	}
}
