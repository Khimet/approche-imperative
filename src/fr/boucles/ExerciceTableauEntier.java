package fr.boucles;

public class ExerciceTableauEntier {

	public static void main(String[] args) {
		
		// D�clarez un tableau d�entiers contenant tous les entiers de 1 � 10
		int tableauNombreEntier[] = new int[10];
		
		for(int i = 1; i <= 10; i++) {
			tableauNombreEntier[i-1] = i;
		}
		
//		for(int i = 0; i < 10; i++) {
//			
//			System.out.println(tableauNombreEntier[i]);
//			
//		}
		
		// Affichez le premier �l�ment du tableau
		System.out.println(tableauNombreEntier[0]);
		
		// Affichez la longueur du tableau en utilisant la propri�t� length
		System.out.println(tableauNombreEntier.length);
		
		// Affichez le dernier �l�ment du tableau en utilisant la propri�t� length
		int longueurTableau = tableauNombreEntier.length;
		System.out.println(tableauNombreEntier[longueurTableau - 1]);
		
		// Modifiez la valeur de l��l�ment d�index 4 et donnez lui la valeur 8.
		System.out.println("Valeur de l'�lement d'index 4 avant modification: " + tableauNombreEntier[4]);
		
		tableauNombreEntier[4] = 8;
		
		System.out.println("Valeur de l'�lement d'index 4 apr�s modification: " + tableauNombreEntier[4]);
		

		
		

	}

}
