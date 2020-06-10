package fr.algorithmie;

public class TriparSelection {
	
	public static void main(String[] args) {
		// Soit le tableau suivant:
		int[] array2 = {3, -8, 17, 5, -1, 4, 0, 6, 2, 11, -5, -4, 8};
		
		
		
		for(int i = 0; i < array2.length; i++) {
			
			int min = array2[i];
			int min_index = i;
			
			for(int j = i; j < array2.length; j++) {
				
				if(array2[j] < min) {
					min = array2[j];
					min_index = j;
				}
			}
			
			array2[min_index] = array2[i];
			array2[i] = min;
			
			
		}
		
		for(int i = 0; i < array2.length; i++) {
			System.out.print(array2[i] +  " ");
		}
	}

}
