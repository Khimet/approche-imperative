package fr.algorithmie;

public class Rotation {

	public static void main(String[] args) {
		
		// Soit le tableau d'entiers suivant:
		int[] table = {0, 1, 2, 3};
		
		// On enregistre le derniere �l�ment pour pouvoir le d�caler � la premi�re position
		int dernierElement = table[table.length-1];
		
		// On parcours le tableau de la fin vers le d�but en commen�ant depuis l'avant dernier �l�ment
		for (int i = table.length - 2; i >= 0; i--) {
			
			table[i+1] = table[i];
		}
		// On d�place le dernier �l�ment � la premi�re position
		table[0] = dernierElement;
		
		for (int i = 0; i < table.length; i++) {
			System.out.print(table[i] + " ");
		}

	}

}
