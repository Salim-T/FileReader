import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public abstract class LecteurTextFileAbstract implements lecteurs{
	
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
	
	public void readReverseFile(String fileString) {
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
			System.out.println("Erreur de lecture du fichier");
		}
	}
	
	public void readPalindromeFile(String fileString){
		try {
			File file = new File (fileString);	
			if(file.exists()) {
			BufferedReader br = new BufferedReader(new FileReader(file));
			String st = br.readLine();
			int longueur = st.length();
			String palindrome2 ="";
			String palindrome1 ="";
			for(int i = 0;i<= longueur/2;i++) {
				palindrome1+= st.charAt(i);
				}
			for(int i = longueur/2;i>=0 ;i--) {
				palindrome2+= st.charAt(i);
				}
			System.out.println("Voici le contenu du fichier en palindrome"); 
			System.out.println(palindrome2+palindrome1);
			}
		}
		catch(Exception e) {
			System.out.println("Erreur de lecture du fichier");
		}
	}
}

