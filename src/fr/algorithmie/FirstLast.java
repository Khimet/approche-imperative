package fr.algorithmie;

public class FirstLast {

	public static void main(String[] args) {
		// Soit le tableau d'entiers suivant:
		
		int[] table = {1,5,4,8,65,8};
		
		/* On calcule une valeur booléenne qui contrôle le tableau de la sorte :
		 * - Elle vaut true si le tableau est de longueur supérieure ou égale
		 *  à 1 et que le premier et le dernier élément du tableau ont la même
		 *   valeur
		 *   
		 *   - Elle vaut false dans les autres cas
		 */
		boolean result = (table.length >= 1 && table[0] == table[table.length -1]) ? true : false;
		
		System.out.println("La valeur du booléen est : " + result);

	}

}
