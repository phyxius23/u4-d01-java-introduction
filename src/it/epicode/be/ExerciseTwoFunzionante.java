package it.epicode.be;

import java.util.Arrays;
import java.util.Scanner;

public class ExerciseTwoFunzionante {

	public static void main(String[] args) {
		
		/* MOLTIPLICA: accetta due interi e ritorna il loro prodotto */
		Scanner in = new Scanner(System.in);
//		
//		System.out.println("Inserisci un numero intero: ");
//		int num1 = in.nextInt();
//		
//		System.out.println("Inserisci un altro numero intero: ");
//		int num2 = in.nextInt();
//		
//		int result = num1 * num2;
//		System.out.println(result);
		
		/* CONCATENA: accetta una stringa e un intero e restituisci una stringa che concatena gli elementi */
//		System.out.println("Inserisci una stringa: ");
//		String text = in.nextLine();
//		
//		System.out.println("Inserisci un numero intero: ");
//		int num3 = in.nextInt();
//		
//		String textResult = text + num3;
//		System.out.println(textResult);
		
		/* INSERISCI IN ARRAY:*/
		String [] arrayOfString = {"uno", "due", "tre", "quattro", "cinque"};
		String newElement = "sei";
		
		System.out.println(Arrays.toString(arrayOfString));
		System.out.println(newElement);
		
		// arrayOfString.Splice(2,0,newElement);
		
		String [] newArrayString = new String[arrayOfString.length + 1];
		
		for (int i = 0; i <= arrayOfString.length ; i++) {
			if(i < 2) {
				newArrayString[i] = arrayOfString[i];
			} else if(i == 2) {
				newArrayString[i] = newElement;
			} else {
				newArrayString[i] = arrayOfString[i - 1];
			}
		}
		
		System.out.println(Arrays.toString(newArrayString));

		in.close(); // chiusura di SCANNER, VA FATTA SEMPRE!
	}

}
