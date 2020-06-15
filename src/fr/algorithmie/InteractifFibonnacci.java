package fr.algorithmie;

import java.util.Arrays;
import java.util.Scanner;


/**
 * @author khim
 * 
 * La suite de Fibonacci est une suite qui commence par 0
 *  et 1 et dans laquelle le nombre de rang N est égal à la
 *   somme des nombres de rangs N-1 et N-2 

 *
 */
public class InteractifFibonnacci {

	public static void main(String[] args) {
		
		System.out.println("Fibonnacci interactif :");
		
		Scanner scanner = new Scanner(System.in);
		
		// Demander à l'utilisateur de choisir un rang N
		System.out.println("Choisissez un rang N (0, 1, ..., N) :");
		int rang = scanner.nextInt();
		
		int suiteFibonnaci[] = {0, 1};
		
		for (int i = 1; i < rang; i++) {
			
			suiteFibonnaci = Arrays.copyOf(suiteFibonnaci, suiteFibonnaci.length + 1);
			suiteFibonnaci[suiteFibonnaci.length -1] = suiteFibonnaci[i] + suiteFibonnaci[i-1];
			
		}
		
		System.out.println("Le nombre de rang " + rang + " est : " + suiteFibonnaci[rang]);
		
		
		

	}

}
