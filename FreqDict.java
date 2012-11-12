import java.util.*;

class FreqDict {
    public static void main(String[] args) {
	String document = args[0];
	Map<String, Integer> wordcount = new TreeMap<String, Integer>();
	
	//split up my words
	String[] words = document.split(" ");
		
	//loop through and put them in
	for(String word : words) {
	    if(word.length()==0) continue;

	    //is the word in the map?
	    //if so:
	         //increment the value at that key by one
	    //otherwise:
	         //insert the key into the map with value one.

	}
	

	//print out the whole thing
	//for all the keys in the map
	     //print the key and the value
	


	//sample code:
	//wordcount.put("O", 5);
	//System.out.println(wordcount.get("O"));

	//BONUSES:
	//clean up commas
	//print the top five
    }
}
