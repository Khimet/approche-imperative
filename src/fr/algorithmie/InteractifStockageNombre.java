package fr.algorithmie;

import java.util.Arrays;
import java.util.Scanner;

public class InteractifStockageNombre {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
//		System.out.println("1. Ajouter un nombre");
//		System.out.println("2. Afficher les nombres existants");
//		System.out.println("3. Quitter");
		
		int choix = 0;
		
		int[] table = new int[0];
		
		while(choix != 3) {
			
			System.out.println("1. Ajouter un nombre");
			System.out.println("2. Afficher les nombres existants");
			System.out.println("3. Quitter");
			
			choix = scanner.nextInt();
			
			if (choix == 1) {
				
				System.out.println("Ajoutez un nombre : ");
				int nb = scanner.nextInt();
				table = Arrays.copyOf(table, table.length + 1);
				table[table.length -1] = nb;
				continue;
			}
			
			if (choix == 2) {
				
				System.out.println("Voici les nombres existants :");
				for (int i = 0; i < table.length; i++) {
					System.out.print(table[i] + " ");
					continue;
				}
				
				System.out.println();
				
			}
			
		}

	}

}
