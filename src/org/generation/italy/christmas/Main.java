package org.generation.italy.christmas;

import java.util.ArrayList;
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
		System.out.println("Lista desideri: " + wishList);
	}
}
