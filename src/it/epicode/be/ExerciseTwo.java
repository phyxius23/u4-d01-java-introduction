package it.epicode.be;

import java.util.Arrays;
import java.util.Scanner;

public class ExerciseTwo {

	public static void main(String[] args) {
		
		/* 
     * MOLTIPLICA: accetta due interi e ritorna il loro prodotto 
     * --------------------------------------------------------------------
     */
		Scanner in = new Scanner(System.in);
		
		System.out.println("Inserisci un numero intero: ");
		int num1 = in.nextInt();
		
		System.out.println("Inserisci un altro numero intero: ");
		int num2 = in.nextInt();
		
    int resultMultiplication = moltiplica(num1, num2);
		System.out.println("Il prodotto dei numeri inseriti è: " + resultMultiplication);
		
    /* 
     * CONCATENA: accetta una stringa e un intero e restituisci una stringa che concatena gli elementi
     * --------------------------------------------------------------------
     */
		System.out.println("Inserisci una stringa: ");
		String text = in.nextLine();
		
		System.out.println("Inserisci un numero intero: ");
		int num3 = in.nextInt();

    String resultConcatenation = concatena(text, num3);
		System.out.println(resultConcatenation);
		
    /* 
     * INSERISCI IN ARRAY:
     * --------------------------------------------------------------------
     */
		String [] arrayOfString = {"uno", "due", "tre", "quattro", "cinque"};
		String newElement = "sei";
		
    String[] newArrayString = inserisciInArray(arrayOfString, newElement);
		
		System.out.println(Arrays.toString(newArrayString));

		in.close(); // chiusura di SCANNER, VA FATTA SEMPRE!
	}

  // METODI
  public static int moltiplica(int a, int b){
    return a * b;
  }

  public static String concatena(String text, int num){
    return text + num;
  }

  public static String[] inserisciInArray(String[] arrayOfString, String newElement){
    String [] newArrayString = new String[arrayOfString.length + 1];
		
		for (int i = 0; i <= arrayOfString.length; i++) {
			if(i < 2) {
				newArrayString[i] = arrayOfString[i];
			} else if(i == 2) {
				newArrayString[i] = newElement;
			} else {
				newArrayString[i] = arrayOfString[i - 1];
			}
		}
    return newArrayString;
  }

}
