package fr.boucles;

public class ExerciceBoucleBase {

	public static void main(String[] args) {
		
		//Affichez tous les nombres de 1 � 10
		for(int i = 1; i <= 10; i++){	
			System.out.println(i);
		}
		
		//Affichez 20 fois votre nom et votre pr�nom
		for(int i = 1; i <= 20; i++) {
			System.out.println("HIMET Khalil");
		}
		
		//Affichez les �lements pairs de 2 � 100
		for(int i = 2; i <= 100; i++) {
			if(i % 2 == 0) {
				System.out.println(i);
			} else {
				continue;
			}
		}
		
		//Affichez les �l�ments impairs de 1 � 99
		for(int i = 1; i <= 99; i++) {
			if (i % 2 != 0) {
				System.out.println(i);
			} else {
				continue;
			}
		}

	}

}
