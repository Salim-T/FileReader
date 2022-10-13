import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;

public abstract class LecteurTextFileAbstract implements Lecteurs{
	
	public void readFile(String fileString){
		try {
			File file = new File (fileString);	
			if(file.exists()) {
			BufferedReader br = new BufferedReader(new FileReader(file));
			String line = br.readLine();
			System.out.println("Voici le contenu du fichier à l'endroit");
			while(line != null) {
				System.out.println(line);
				line = br.readLine();
			}
			br.close();
			}
		}
		catch(Exception e) {
			System.out.println("Erreur de lecture du fichier");
		}
	}
	
	public void readPalindromeFile(String fileString) {
		try {
			File file = new File (fileString);	
			if(file.exists()) {
			BufferedReader br = new BufferedReader(new FileReader(file));
			StringBuilder line = new StringBuilder(br.readLine()).reverse();
			System.out.println("Voici le contenu du fichier à l'envers");
			while(line != null) {
				System.out.println(line);
				line = new StringBuilder(br.readLine()).reverse();
			}
			br.close();
			}
		}
		catch(Exception e) {
			System.out.println("");
		}
	}
	
	public void readReverseFile(String fileString){
		try {
			File file = new File (fileString);	
			if(file.exists()) {
			BufferedReader br = new BufferedReader(new FileReader(file));
			ArrayList<String> A = new ArrayList<>();
			String line;
			while ((line = br.readLine()) != null) {
				A.add(line);
			}
			br.close();
			Collections.reverse(A);			
			for(String Lines : A) {
				System.out.print(Lines + "\n");
			}
		}
		}
		catch(Exception e) {
			System.out.println("Erreur de lecture du fichier");
		}
	}
	
}


