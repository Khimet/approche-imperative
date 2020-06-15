package fr.algorithmie;

public class FirstLast6 {

	public static void main(String[] args) {
		// Soit le tableau d'entiers suivant:
		
		int[] table = {6,4,5,6,8,9};
		
		/* On calcul une valeur booleene de la sorte que:
		 * - Elle vaut true si le tableau a au moins 1 �l�ment 
		 * et si le premier �l�ment ou le dernier �l�ment vaut 6.
		 * 
		 * - Elle vaut false dans les autres cas

		 */
		boolean result = (table.length > 0 && 
				(table[0] == 6 || table[table.length -1] == 6)) ? true : false;
		
		System.out.println("La valeur du bool�en est : " + result);

	}

}
