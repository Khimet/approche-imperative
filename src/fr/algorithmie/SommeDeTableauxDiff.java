package fr.algorithmie;

public class SommeDeTableauxDiff {

	public static void main(String[] args) {
		// Soit deux tableaux:
		int[] array1 = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};
		int[] array2 = {-1, 12, 17, 14, 5, -9, 0, 18 };
		
		int[] sommeArray = array1; // On recupere le tableau le plus long
		
		for(int i = 0; i < array2.length; i++) {
			sommeArray[i] = sommeArray[i] + array2[i];
		}
		
		System.out.println("La somme des deux tableaux est : ");
		for(int i = 0; i < sommeArray.length; i++) {
			System.out.print(sommeArray[i] + " ");
		}
				

	}

}
