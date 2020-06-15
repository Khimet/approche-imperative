package fr.algorithmie;

import java.util.Scanner;

public class InteractifTableMult {

	public static void main(String[] args) {
		
		int nb = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		while (nb < 1 || nb >= 10) {
			System.out.println("Veuillez entrer un nombre entre 1 et 10 :");
			nb = scanner.nextInt();
		}
		
		System.out.println("Table de " + nb + " : ");
		
		for (int i = 1; i <= 10; i++) {
			System.out.println(nb + " * " + i + " = " + nb*i);
		}

	}

}
