package fr.algorithmie;

public class SommeDeTableaux {

	public static void main(String[] args) {
		// Soit deux tableaux:
		int[] array1 = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};
		int[] array2 = {-1, 12, 17, 14, 5, -9, 0, 18, -6, 0, 4, -13, 5, 7, -2, 8, -1};
		int[] sommeArray = array2;
		
		// Somme des deux tableaux
		for(int i = 0; i < array1.length; i++) {
			sommeArray[i] = sommeArray[i] + array1[i];
		}
		
		System.out.print("Somme des deux tableaux = ");
		
		for(int i = 0; i < sommeArray.length; i++) {
			System.out.print(sommeArray[i] + " ");
		}
		
		
	}

}
