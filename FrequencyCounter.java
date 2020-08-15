package Project_1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class FrequencyCounter {
	private Map<Character , Integer> letterMap;
	private Map<String , Integer> wordMap;
    private Map<String , Integer> stopMap;

	public FrequencyCounter() {
		 this.letterMap = new HashMap<Character , Integer>();
		 this.wordMap = new HashMap<String , Integer>();
		 this.stopMap = new HashMap<String , Integer>();
		 
	}
	
	public void addLetter(char letter){
		int number = 1;
        
		if(!this.letterMap.containsKey(letter)){
			this.letterMap.put(letter, number);
        }
        else{
            this.letterMap.put(letter, letterMap.get(letter) + 1);
        }
    }
	
	public void addWord(String word) {
		int number = 1;
		
		if(!this.wordMap.containsKey(word)) {
			this.wordMap.put(word , number);
		}
		else {
			this.wordMap.put(word , wordMap.get(word) + 1);
		}
	}
	
	public void addStopWord(String word) {
		int number = 1;
		
		if(!this.stopMap.containsKey(word)) {
			this.stopMap.put(word , number);
		}
		else {
			this.stopMap.put(word , stopMap.get(word) + 1);
		}
	}
	
	public void printLetter() {
		List<Map.Entry<Character, Integer> > letterTopTen = new ArrayList<Map.Entry<Character , Integer>>(letterMap.entrySet());
	
		Collections.sort(letterTopTen, new Comparator<Map.Entry<Character, Integer> >() { 
	        public int compare(Map.Entry<Character, Integer> o1,  
	                           Map.Entry<Character, Integer> o2) 
	        { 
	            return (o1.getValue()).compareTo(o2.getValue()); 
	        }  
	    }); 
		
	    System.out.println(letterTopTen.subList(letterTopTen.size() - 11, letterTopTen.size() - 1));
	}
	
	public void printWord() {
		List<Map.Entry<String, Integer> > wordTopTen = new ArrayList<Map.Entry<String , Integer>>(wordMap.entrySet());
	
		Collections.sort(wordTopTen, new Comparator<Map.Entry<String, Integer> >() { 
	        public int compare(Map.Entry<String, Integer> o1,  
	                           Map.Entry<String, Integer> o2) 
	        { 
	            return (o1.getValue()).compareTo(o2.getValue()); 
	        }  
	    }); 
		
	    System.out.println(wordTopTen.subList(wordTopTen.size() - 11, wordTopTen.size() - 1));
	}
	
	public void printStopWord() {
		List<Map.Entry<String, Integer> > stopTopTen = new ArrayList<Map.Entry<String , Integer>>(stopMap.entrySet());
	
		Collections.sort(stopTopTen, new Comparator<Map.Entry<String, Integer> >() { 
	        public int compare(Map.Entry<String, Integer> o1,  
	                           Map.Entry<String, Integer> o2) 
	        { 
	            return (o1.getValue()).compareTo(o2.getValue()); 
	        }  
	    }); 
		
	    System.out.println(stopTopTen.subList(stopTopTen.size() - 11, stopTopTen.size() - 1));
	}
	
	public void printLeastWords() {
		List<Map.Entry<String, Integer> > wordTopTen = new ArrayList<Map.Entry<String , Integer>>(wordMap.entrySet());
	
		Collections.sort(wordTopTen, new Comparator<Map.Entry<String, Integer> >() { 
	        public int compare(Map.Entry<String, Integer> o1,  
	                           Map.Entry<String, Integer> o2) 
	        { 
	            return (o1.getValue()).compareTo(o2.getValue()); 
	        }  
	    }); 
		
	    System.out.println(wordTopTen.subList(0, 10));
	}
	
	
	
}
