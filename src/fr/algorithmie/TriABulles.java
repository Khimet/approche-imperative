package fr.algorithmie;

public class TriABulles {

	public static void main(String[] args) {
		// Soit le tableau suivant
		int[] array2 = {3, -8, 17, 5, -1, 4, 0, 6, 2, 11, -5, -4, 8};
		
		int max = 0;
		
		for(int i = 0; i < array2.length; i++) {
			
			for (int j = 1; j < (array2.length - i); j++) {
				
				if(array2[j-1] > array2[j]) {
					
					// échange des positions
					max = array2[j-1];
					array2[j-1] = array2[j];
					array2[j] = max;
				}
				
			}
			
		}
		
		for(int i = 0; i < array2.length; i++) {
			System.out.print(array2[i] +  " ");
		}

	}

}
