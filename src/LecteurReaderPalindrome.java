import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class LecteurReaderPalindrome extends LecteurTextFileAbstract{
	public void readFile(String fileString) {
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
}
