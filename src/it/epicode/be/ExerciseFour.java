package it.epicode.be;

import java.util.Scanner;

public class ExerciseFour {

	public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    System.out.println("Inserisci il valore della base del rettangolo in decimale: ");
    double width = in.nextDouble();
    
    System.out.println("Inserisci il valore dell'altezza del rettangolo in decimale: ");
    double height = in.nextDouble();

    double resultRectanglePerimeter = rectanglePerimeter(width, height);
    System.out.println("Il perimetro del rettangolo è pari a: " + resultRectanglePerimeter);

    System.out.println("Inserisci un numero intero: ");
		int numberOddEven = in.nextInt();		

    int resultOddEven = oddEven(numberOddEven);
    System.out.println("Il numero inserito è " + (resultOddEven == 0 ? "pari" : "dispari"));

    System.out.println("Inserisci la dimensione del lato 'a' del triangolo: ");
		double sideOne = in.nextDouble();
		
		System.out.println("Inserisci la dimensione del lato 'b' del triangolo: ");
		double sideTwo = in.nextDouble();
		
		System.out.println("Inserisci la dimensione del lato 'c' del triangolo: ");
		double sideThree = in.nextDouble();

    double resultAreaTriangle = areaTriangle(sideOne, sideTwo, sideThree);
    System.out.println("L'area del triangolo è pari a " + resultAreaTriangle);

    in.close();
	}
	
	/* Metodo PerimetroRettangolo: accetta la lunghezza decimale dei due lati di un rettangolo 
	 * e ne calcola il perimetro
	 */
	public static double rectanglePerimeter(double width, double height) {
		return (width + height) * 2.0;
	}
	
	/* Metodo PariDispari: accetta un numero intero e restituisce 0 se il numero è pari e 
	 * 1 se è dispari
	 */
	public static int oddEven(int num) {
    return num % 2 == 0 ? 0 : 1;
	}
	
	/* Metodo PerimetroTriangolo: accetta le lunghezze decimali dei lati di un triangolo e ne 
	 * restituisca l'area (è possibile usare la formula di Erone)
	 */
	public static double areaTriangle(double sideOne, double sideTwo, double sideThree) {
		double semiPerimeter = (sideOne + sideTwo + sideThree) / 2;
		double rootArea = semiPerimeter * (semiPerimeter - sideOne) * (semiPerimeter - sideTwo) * (semiPerimeter - sideThree);
		double area = Math.sqrt(rootArea);

    return area;
	}
}
