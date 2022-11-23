package org.generation.italy.christmas;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Esercizio3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Inserire una parola: ");
		String w = sc.next();
		sc.close();
		String[] wArr = w.split("");
		
		Map<String, Integer> wMap = new HashMap<>();
		
		for (String letter : wArr) {
			int counter = 0;
			if (!wMap.containsKey(letter)) {
				counter = 1;
				wMap.put(letter, counter);
			} else {
				counter = wMap.get(letter) + 1;
				wMap.put(letter, counter);
			}
		}
		
		System.out.println(wMap);
	}
}
