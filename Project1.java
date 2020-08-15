package Project_1;

import java.io.File;
import java.io.FileNotFoundException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//John Quimbo
public class Project1 {
	public static void main(String[] args) throws FileNotFoundException {
		
		List<String> fileLines = new ArrayList<String>();
		File newFile = new File("alice-in-wonderland.txt");
		Scanner scan = new Scanner(newFile);
		
		while(scan.hasNext()) {
			fileLines.add(scan.nextLine());
		}
		
		List<String> fileStopList = new ArrayList<String>();
		File fileStop = new File("stop-list.txt");
		Scanner scan2 = new Scanner(fileStop);
		
		while(scan2.hasNext()) {
			fileStopList.add(scan2.nextLine());
		}
		
		
		FrequencyCounter counter = new FrequencyCounter();
		
		
		for(String line : fileLines) {
			for(int i = 0; i < line.length(); i++) {
				counter.addLetter(line.charAt(i));
			}
		}
		
		counter.printLetter();
		
		for(String line : fileLines) {
		    scan = new Scanner(line);
		  
		while(scan.hasNext()) {
		    //this will read the line and separate out each word
		    scan.useDelimiter("[^a-zA-Z']");
		    String word = scan.next();
		    word=word.toLowerCase();
		    //replace all leading apostrophes
		    word = word.replaceAll("^'+", "");
		    //replace all trailing apostrophes
		    word = word.replaceAll("'+$", "");
		    /* now you have a word to put in your map*/
		    //Note: Make sure to check for empty String
		    //don't put an empty string in the map
		    	counter.addWord(word);
		}
		
		}
		
			counter.printWord();
		
	
		for(String line : fileLines) {
		    scan = new Scanner(line);
		  
		while(scan.hasNext()) {
		    //this will read the line and separate out each word
		    scan.useDelimiter("[^a-zA-Z']");
		    String word = scan.next();
		    word=word.toLowerCase();
		    //replace all leading apostrophes
		    word = word.replaceAll("^'+", "");
		    //replace all trailing apostrophes
		    word = word.replaceAll("'+$", "");
		    /* now you have a word to put in your map*/
		    //Note: Make sure to check for empty String
		    //don't put an empty string in the map
		    	if(!fileStopList.contains(word)) {
		    		counter.addStopWord(word);
		    	}
		}
		
		}
			counter.printStopWord();
		
			counter.printLeastWords();
	
	}
}
