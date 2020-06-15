package fr.algorithmie;

import java.util.Scanner;

public class InteractifPlusGrand {

	public static void main(String[] args) {
		/* Ecrire un programme qui demande 10 nombres à un utilisateur
		 *  et qui affiche le plus grand de ces nombres. */
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Veuillez entrer 10 nombre successifs :");
		
		
		int max = 0;
		
		for (int i = 1; i <= 10; i++) {
			
			System.out.println("Saisie nombre " + i + ": ");
			int nb = scanner.nextInt();
			
			if (nb > max) {
				max = nb;
			}
		}
		
		System.out.println("Le plus grand nombre est : " + max);
		

	}

}
