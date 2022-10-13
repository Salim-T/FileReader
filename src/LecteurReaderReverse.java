import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;

public class LecteurReaderReverse extends LecteurTextFileAbstract{
	public void readFile(String fileString){
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
