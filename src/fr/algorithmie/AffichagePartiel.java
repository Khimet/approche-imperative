package fr.algorithmie;

public class AffichagePartiel {

	public static void main(String[] args) {
		// Soit le tableau suivant:
		 int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};
		 
		 // Afficher l’ensemble des éléments du tableau grâce à une boucle
		 System.out.println("Entiers supérieurs à 3: ");
		 for(int i = 0; i < array.length; i++) {
			 
			 if(array[i] > 3) {
				 System.out.print(array[i] + " "); 
			 }
			 
		 }
		 
		 // Combiner une boucle et un test de manière à n’afficher que les entiers pairs 
		 System.out.println('\n'+ "Entiers pairs: ");
for(int i = 0; i < array.length; i++) {
			 
			 if(array[i] % 2 == 0) {
				 System.out.print(array[i] + " "); 
			 } 
		 }

/* Combiner une boucle et un test de manière à 
 * n’afficher que les valeurs correspondant 
aux index pairs */
System.out.println('\n' + "Valeurs des index pairs: ");
for(int i = 0; i < array.length; i++) {
	 
	 if(i % 2 == 0) {
		 System.out.print(array[i] + " "); 
	 } 
}

// Combiner une boucle et un test de manière à n’afficher que les entiers impairs
System.out.println('\n' + "Entiers impairs");
for(int i = 0; i < array.length; i++) {
	 
	 if(array[i] % 2 == 1) {
		 System.out.print(array[i] + " "); 
	 } 
}

	}

}
