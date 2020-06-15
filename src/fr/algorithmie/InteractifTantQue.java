package fr.algorithmie;

import java.util.Scanner;

public class InteractifTantQue {

	public static void main(String[] args) {
		
		/* Ecrire un programme qui demande un nombre � l�utilisateur 
		 * qui doit �tre obligatoirement compris entre 1 et 10 :
		 * 
		 * - Tant que ce nombre n�est pas compris entre 1 et 10, 
		 * le programme redemande un nombre � l�utilisateur. 
		 * 
		 * - Si le nombre est compris entre 1 et 10, le programme affiche 
		 * ce nombre et se termine.
		 */
		
		Scanner scanner = new Scanner(System.in);
		
		int nb = 0;
		
		while (nb <= 1 || nb >= 10) {
			System.out.println("Veuillez entrer un nombre :");
			nb = scanner.nextInt();
		}
		
		System.out.println("Le nombre entr� est :" + nb);
		
		



	}

}
