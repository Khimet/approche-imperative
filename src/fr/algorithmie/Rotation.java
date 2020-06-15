package fr.algorithmie;

public class Rotation {

	public static void main(String[] args) {
		
		// Soit le tableau d'entiers suivant:
		int[] table = {0, 1, 2, 3};
		
		// On enregistre le derniere élément pour pouvoir le décaler à la première position
		int dernierElement = table[table.length-1];
		
		// On parcours le tableau de la fin vers le début en commençant depuis l'avant dernier élément
		for (int i = table.length - 2; i >= 0; i--) {
			
			table[i+1] = table[i];
		}
		// On déplace le dernier élément à la première position
		table[0] = dernierElement;
		
		for (int i = 0; i < table.length; i++) {
			System.out.print(table[i] + " ");
		}

	}

}
