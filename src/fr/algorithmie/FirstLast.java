package fr.algorithmie;

public class FirstLast {

	public static void main(String[] args) {
		// Soit le tableau d'entiers suivant:
		
		int[] table = {1,5,4,8,65,8};
		
		/* On calcule une valeur bool�enne qui contr�le le tableau de la sorte :
		 * - Elle vaut true si le tableau est de longueur sup�rieure ou �gale
		 *  � 1 et que le premier et le dernier �l�ment du tableau ont la m�me
		 *   valeur
		 *   
		 *   - Elle vaut false dans les autres cas
		 */
		boolean result = (table.length >= 1 && table[0] == table[table.length -1]) ? true : false;
		
		System.out.println("La valeur du bool�en est : " + result);

	}

}
