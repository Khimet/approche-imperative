package fr.algorithmie;

import java.util.Scanner;

public class InteractifPlusMoins {

	public static void main(String[] args) {
		
		/*Ecrire un jeu qui :
- choisit un nombre aléatoire entre 1 et 100
- puis demande à l’utilisateur de trouver ce nombre en lui indiquant s’il 
est au-dessus ou en dessous du nombre,
- Lorsque l’utilisateur a trouvé le nombre, le programme affiche « Bravo,
 vous avez trouvé en N coups » où N représente le nombre d’essais effecté 
 par l’utilisateur
- le programme se termine.*/

		
		/* Pour générer un entier aléatoirement entre 1 et 100 on va utiliser
		 *  la méthode random() de la classe Math
		 */
		
		double x = (int)(Math.random() * ((100-1)+1))+1;
		
		int nbEssais = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Le but du jeu est de deviner un nombre choisi aléatoirement entre 1 et 100: ");
		System.out.println("Proposez un nombre : ");
		int nb = scanner.nextInt();
		
		while(nb != x) {
			
			if (nb < x) {
				
				System.out.println("Au-dessus");
			}
			
			if (nb > x) {
				
				System.out.println("Au-dessous");

			}
			
			nb = scanner.nextInt();
			nbEssais++;
			
		}
		
		System.out.println("Bravo ! vous avez trouvez en " + nbEssais + " coups.");
		
		
	

	}

}
