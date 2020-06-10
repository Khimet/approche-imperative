package fr.algorithmie;

public class TriABulles {

	public static void main(String[] args) {
		// Soit le tableau suivant
		int[] array2 = {3, -8, 17, 5, -1, 4, 0, 6, 2, 11, -5, -4, 8};
		
		for(int i = 0; i < array2.length; i++) {
			
			int min = array2[i];
			
			if(i+1 < array2.length) {
				
				if(array2[i] < array2[i+1]) {
					continue;
				} else {
					min = array2[i+1];
					array2[i+1] = array2[i];
					array2[i] = min;
					
				}
		
				
			}
		}
		
		for(int i = 0; i < array2.length; i++) {
			System.out.print(array2[i] +  " ");
		}

	}

}
