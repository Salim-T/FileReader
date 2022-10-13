import java.io.*;

public class LecteurReader extends LecteurTextFileAbstract{
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
}
