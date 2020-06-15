package fr.algorithmie;

import java.util.Scanner;

public class InteractifPlusMoins {

	public static void main(String[] args) {
		
		/*Ecrire un jeu qui :
- choisit un nombre al�atoire entre 1 et 100
- puis demande � l�utilisateur de trouver ce nombre en lui indiquant s�il 
est au-dessus ou en dessous du nombre,
- Lorsque l�utilisateur a trouv� le nombre, le programme affiche � Bravo,
 vous avez trouv� en N coups � o� N repr�sente le nombre d�essais effect� 
 par l�utilisateur
- le programme se termine.*/

		
		/* Pour g�n�rer un entier al�atoirement entre 1 et 100 on va utiliser
		 *  la m�thode random() de la classe Math
		 */
		
		double x = (int)(Math.random() * ((100-1)+1))+1;
		
		int nbEssais = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Le but du jeu est de deviner un nombre choisi al�atoirement entre 1 et 100: ");
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
