package it.epicode.be;

import java.util.Scanner;

public class ExerciseThree {

	public static void main(String[] args) {
		
		/* Implementare un metodo main che chiede all'utente di inserire tre stringhe da tastiera 
		 * e scrive in console la concatenzazione delle stringhe in ordine di inserimento e in 
		 * ordine di inserimento inverso 
		 */
		Scanner in = new Scanner(System.in);
		
		System.out.println("Inserisci una stringa: ");
		String textOne = in.nextLine();
		
		System.out.println("Inserisci una seconda stringa: ");
		String textTwo = in.nextLine();
		
		System.out.println("Inserisci una terza stringa: ");
		String textThree = in.nextLine();
		
		System.out.println("Il testo inserito: " + textOne + ", " + textTwo + ", " + textThree);
		
		in.close();

	}

}
