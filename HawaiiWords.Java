import java.util.Scanner;

public class HawaiianWords {
	public static void main(String[] args) {
	    System.out.println("Enter a hawaiian word to pronounce");
	    Scanner userInput = new Scanner(System.in);
	    String input = userInput.nextLine();
	    input = input.toLowerCase();
	    char[] HawaiianChars = { 'a', 'e', 'i', 'o', 'u', 'p', 'k', 'h', 'l', 'm', 'n', 'w', ' ', '\'' };
	    if (isHawaiian(HawaiianChars, input) == true) {
	      System.out.println(makeWord(input));
	    }
	  }

	  public static boolean isHawaiian(char[] HawaiianWords, String input) {
	    for (int i = 0; i < input.length(); i++) {
	      int position = 0;
	      boolean found = false;
	      while (found == false && position < HawaiianWords.length) {
	        if (input.charAt(i) == HawaiianWords[position]) {
	          found = true;
	        }
	        position++;
	      }
	      if (found != true) {
	        System.out.println(input.charAt(i) + " is not an hawaiian charecter");
	        return false;
	      }
	    }
	    return true;
	  }

	  public static String makeWord(String s) {
	    // s= ALOHA
	    String phonetic = "";
	    int i = 0; 
	    while(i < s.length()-1){
	      int prelength = phonetic.length(); 
	      String temp = s.substring(i,i+2);
	      phonetic = vowelGroups(temp, phonetic);
	        if(phonetic.length() > prelength){
	          i =i+2;
	        }
	        else{
	        
	          for(int x=0; x < 2; x++){
	            prelength = phonetic.length();
	             String store = temp.substring(x, x+1);
	            phonetic = vowels(store, phonetic);
	              if(phonetic.length() == prelength){
	              phonetic = consonants(store, phonetic);
	            }
	          }
	        }
	    }
	    return phonetic;
	  }

	  public static String vowelGroups(String segment, String phonetic) {
	    String[] vowelGroups = { "ai", "ae", "ao", "au", "ei", "eu", "iu", "oi", "ou", "ui" };

	    String[] vowelGroupPro = { "eye", "eye", "ow", "ow", "ay", "eh-oo", "ew", "oy", "ow", "ooey" };
	    for (int i = 0; i < vowelGroups.length; i++) {
	      if (segment.equals(vowelGroups[i])) {
	        return phonetic += vowelGroupPro[i] + "-";
	      }
	    }
	    return phonetic;
	  }

	  public static String vowels(String letter, String phonetic) {
	    String[] vowels = { "a", "e", "i", "o", "u" };
	    String[] vowelsPro = { "ah", "eh", "ee", "oh", "oo" };
	    for (int x = 0; x < vowels.length; x++) {
	      if (letter.equals(vowels[x])) {
	        return phonetic += vowelsPro[x] + "-";
	      }
	    }
	    return phonetic;
	  }

	  public static String consonants(String letter, String phonetic) {
	    String[] consonants = { "p", "k", "h", "l", "m", "n", "w" };
	    for (int y = 0; y < consonants.length; y++) {
	      if (letter.equals(consonants[y])) {
	        return phonetic += consonants[y];
	      }
	    }
	    return phonetic;
	  }	
}
