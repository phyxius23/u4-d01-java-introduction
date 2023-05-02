package it.epicode.be;

import java.util.Scanner;

public class ExerciseFour {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		/* Metodo PerimetroRettangolo: accetta la lunghezza decimale dei due lati di un rettangolo 
		 * e ne calcola il perimetro
		 */		
//		System.out.println("Inserisci il valore della base del rettangolo in decimale: ");
//		float width = in.nextFloat();
//		
//		System.out.println("Inserisci il valore dell'altezza del rettangolo in decimale: ");
//		float height = in.nextFloat();
//		
//		float perimeter = (width + height) * 2;
//		System.out.println("Il perimetro del rettangolo è pari a: " + perimeter);

		/* Metodo PariDispari: accetta un numero intero e restituisce 0 se il numero è pari e 
		 * 1 se è dispari
		 */
//		System.out.println("Inserisci un numero intero: ");
//		int num = in.nextInt();
//		
//		if(num % 2 == 0) {
//			System.out.println("Il numero inserito è pari!");
//		} else {
//			System.out.println("Il numero inserito è dispari!");
//		}

		/* Metodo PerimetroTriangolo: accetta le lunghezze decimali dei lati di un triangolo e ne 
		 * restituisca l'area (è possibile usare la formula di Erone)
		 */
		System.out.println("Inserisci la dimensione del lato 'a' del triangolo: ");
		double sideOne = in.nextFloat();
		
		System.out.println("Inserisci la dimensione del lato 'b' del triangolo: ");
		double sideTwo = in.nextFloat();
		
		System.out.println("Inserisci la dimensione del lato 'c' del triangolo: ");
		double sideThree = in.nextFloat();
		
		double semiPerimeter = (sideOne + sideTwo + sideThree) / 2;
		
		double rootArea = semiPerimeter * (semiPerimeter - sideOne) * (semiPerimeter - sideTwo) * (semiPerimeter - sideThree);
		
		double area = 0;
		
		if(rootArea >= 0) {
			area = Math.pow(rootArea, 0.5);
			
			System.out.println("L'area del triangolo è pari a: ");
			System.out.println("Il perimetro del triangolo è pari a: " + (semiPerimeter * 2));
		} else {
			System.out.println("Area e perimetro del triangolo non possono essere calcolati dato che uno o più lati hanno un valore negativo");			
		}
		
		
		in.close();
	}

}
