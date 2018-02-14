package text_shuffle;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
	public static void main(String[] args) {
		String fName = "alice1.txt";
		String outName = "alice1.txt";
		String del = "\\.";
		File file = new File(fName);
		FileReader f = new FileReader(file);
		f.setDelimiter(del);
		ArrayList<String> words = f.getWords();
		Collections.shuffle(words);
		
		BufferedWriter bw = null;
		FileWriter fw = null;

		try {
			fw = new FileWriter(outName);
			bw = new BufferedWriter(fw);
			for (String s : words) {
				//System.out.print(s + del);
				bw.write(s + ".");
			}	
			System.out.println("Done");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
