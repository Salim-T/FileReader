import java.io.BufferedReader;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception {
			
		// Ici le programme demande à l'utilisateur le chemin du fichier
		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Veuillez saisir le chemin du fichier :");
//		String str = sc.nextLine();
// 		Ici, le chemin du fichier est déjà spécifié et à changer en fonction de l'emplacement du fichier.
		
			String str2 = "file.txt";		
		    LecteurReader lecteur = new LecteurReader();
			lecteur.readFile(str2);
			System.out.println("");
			LecteurReaderPalindrome lecteur2 = new LecteurReaderPalindrome();
			lecteur2.readFile(str2);
			System.out.println("");
			LecteurReaderReverse lecteur3 = new LecteurReaderReverse();
			lecteur3.readFile(str2);
	}

}
