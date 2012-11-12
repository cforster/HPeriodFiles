import java.util.*;

class FreqDict {
    public static void main(String[] args) {
	String document = args[0];
	Map<String, Integer> wordcount = new TreeMap<String, Integer>();
	
	//split up my words
	String[] words = document.split(" ");

	//working on bonus commas(unfinished)
	/**for(int i = 0; i<args.length; i++)
	    {
		if(args[i]== ","|| "."||"!"||"?"||";")
		  {
		      args[i]== " ";
		  }

		
		  }//closes for**/
		
	//loop through and put them in
	for(String word : words) {
	    if(word.length()==0) continue;

	    //is the word in the map?

	    if(wordcount.containsKey(word))
		{
		    int count = wordcount.get(word);
		    wordcount.put(word, count+1);
		    
		}
	    else
	    {
		wordcount.put(word, 1);
	    }

	}//closes for loop
	
	//print out the whole thing
	//System.out.println(wordcount);


	//for all the keys in the map
	for(String key : wordcount.keySet())
	    {
	     //print the key and the value
		System.out.println(key +":"+ wordcount.get(key));
	    }

	//sample code:
	//wordcount.put("O", 5);
	//System.out.println(wordcount.get("O"));

	//BONUSES:
	//clean up commas
	//print the top five
    }
}
