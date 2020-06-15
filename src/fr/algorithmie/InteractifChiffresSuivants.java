package fr.algorithmie;

import java.util.Scanner;

public class InteractifChiffresSuivants {

	public static void main(String[] args) {
		/* Ecrire un programme qui demande un nombre à l’utilisateur 
		 * puis qui affiche les 10 nombres suivants. Par exemple si 
		 * l’utilisateur saisit 5, le programme affiche : 6, 7, 8, 9, 10, 11, 
		 * 12, 13, 14, 15. */
		
		// Instanciation de la classe qui va permettre détecter la saisie clavier
		Scanner scanner = new Scanner(System.in);

		System.out.println("Veuillez saisir un nombre :");
		int nb = scanner.nextInt();
		
		for (int i = 1; i <= 10; i++) {
			
			System.out.print(nb + i + " ");
		}

	}

}
