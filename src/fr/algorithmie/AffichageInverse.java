package fr.algorithmie;

import java.util.Arrays;

public class AffichageInverse {

	public static void main(String[] args) {
		// Soit le tableau suivant:
		 int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};
		 
		 // Afficher l�ensemble des �l�ments du tableau gr�ce � une boucle
		 for(int i = 0; i < array.length; i++) {
			 System.out.println(array[i]);
		 }
		 
		 // Afficher l�ensemble des �l�ments dans l�ordre inverse du tableau 
		 for(int i = (array.length - 1); i >= 0; i--) {
			 System.out.println(array[i]);
		 }
		 
		 // Cr�er un tableau arrayCopy et copier tous les �l�ments de array dans arrayCopy
		 int[] arrayCopy = Arrays.copyOf(array, array.length);
		 for(int i = 0; i < arrayCopy.length; i++) {
			 System.out.print(arrayCopy[i] + " ");
		 }
	}

}
