package fr.boucles;

public class ExerciceTableauEntier {

	public static void main(String[] args) {
		
		// Déclarez un tableau d’entiers contenant tous les entiers de 1 à 10
		int tableauNombreEntier[] = new int[10];
		
		for(int i = 1; i <= 10; i++) {
			tableauNombreEntier[i-1] = i;
		}
		
//		for(int i = 0; i < 10; i++) {
//			
//			System.out.println(tableauNombreEntier[i]);
//			
//		}
		
		// Affichez le premier élément du tableau
		System.out.println(tableauNombreEntier[0]);
		
		// Affichez la longueur du tableau en utilisant la propriété length
		System.out.println(tableauNombreEntier.length);
		
		// Affichez le dernier élément du tableau en utilisant la propriété length
		int longueurTableau = tableauNombreEntier.length;
		System.out.println(tableauNombreEntier[longueurTableau - 1]);
		
		// Modifiez la valeur de l’élément d’index 4 et donnez lui la valeur 8.
		System.out.println("Valeur de l'élement d'index 4 avant modification: " + tableauNombreEntier[4]);
		
		tableauNombreEntier[4] = 8;
		
		System.out.println("Valeur de l'élement d'index 4 après modification: " + tableauNombreEntier[4]);
		

		
		

	}

}
