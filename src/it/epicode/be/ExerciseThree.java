package it.epicode.be;

import java.util.Arrays;
import java.util.Scanner;

public class ExerciseThree {

	public static void main(String[] args) {
		
		/* Implementare un metodo main che chiede all'utente di inserire tre stringhe da tastiera 
		 * e scrive in console la concatenzazione delle stringhe in ordine di inserimento e in 
		 * ordine di inserimento inverso 
		 */
		Scanner in = new Scanner(System.in);

    String[] text = new String[3];

    for(int i = 0; i < text.length; i++){
      System.out.println("Inserisci una stringa: ");
      text[i] = in.nextLine();
    }
			
		System.out.println("Il testo inserito: " + Arrays.toString(text));
		
		in.close();
	}

}
