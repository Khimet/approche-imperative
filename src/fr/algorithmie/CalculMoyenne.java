package fr.algorithmie;

public class CalculMoyenne {

	public static void main(String[] args) {
		// Soit le tableau suivant:
		 int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};
		 
		 float somme = 0;
		 
		 for(int i = 0; i < array.length; i++) {
			 
			 somme = array[i] + somme;
		 }
		 
		 System.out.println(array.length);

		 float moyenne = somme/array.length;
		 
		 System.out.println("La moyenne des éléments du tableau est de : " + moyenne);
	}

}
