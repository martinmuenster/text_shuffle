package text_shuffle;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class FileReader {
	private File file;
	private String delimiter;
	
	public FileReader(File file) {
		this.file = file;
		delimiter = " ";
	}
	
	public void setDelimiter(String d) {
		delimiter = d;
	}
	
	public ArrayList<String> getWords() {
		Scanner s = null;
		try {
			s = new Scanner(file);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		s.useDelimiter(delimiter);
		ArrayList<String> words = new ArrayList<String>();
		while (s.hasNext()) {
			words.add(s.next());
		}
		return words;
	}
}
