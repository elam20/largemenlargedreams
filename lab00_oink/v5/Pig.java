/***
 * Clyde "Thluffy" Sinclair
 * APCS
 * HW31 -- deploying linear search on Strings, using helper methods
 * 2021-11-04r
 * time spent: .5hrs
 *
 * class Pig
 * a Pig Latin translator

 * DISCO - I discovered that the syntax is substring not subString even after all these weeks of working with substrings.

 * QCC:

 * ~~~~~~~~~~~~~~~~~~~ SKELETON ~~~~~~~~~~~~~~~~~~~
 *           9
 *     ,--.-'-,--.
 *     \  /-~-\  /
 *    / )' a a `( \
 *   ( (  ,---.  ) )
 *    \ `(_o_o_)' /
 *     \   `-'   /
 *      | |---| |
 *      [_]   [_]
 *      PROTIP: Make this class compilable first,
 *      then develop and test one method at a time.
 *      NEVER STRAY TOO FAR FROM COMPILABILITY/RUNNABILITY!
 ***/


public class Pig {

    private static final String VOWELS = "aeiouyAEIOUY";
    private static final String CAPS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String PUNCS = ".,:;!?";



  /**
    boolean hasA(String,String) -- checks for a letter in a String
    pre:  w != null, letter.length() == 1
    post: hasA("cat", "a") -> true
    hasA("cat", "p") -> false
  **/
  public static boolean hasA( String w, String letter ) {

    return w.indexOf(letter) != -1;
  }//end hasA()


  /**
    boolean isAVowel(String) -- tells whether a letter is a vowel
    precondition: letter.length() == 1
    **/
  public static boolean isAVowel( String letter ) {
    return VOWELS.indexOf( letter ) != -1;
  }


  /**
    int countVowels(String) -- counts vowels in a String
    pre:  w != null
    post: countVowels("meatball") -> 3
    **/
  public static int countVowels( String w ) {
    int counter = 0;
    String letter;
    for(int i=0;i<w.length();i++){
      letter=w.substring(i,i+1);
      if(isAVowel(letter)==true){
        counter+=1;
      }
    }
    return counter;
  }


  /**
    boolean hasAVowel(String) -- tells whether a String has a vowel
    pre:  w != null
    post: hasAVowel("cat") -> true
    hasAVowel("zzz") -> false
    **/
  public static boolean hasAVowel( String w ) {
    return countVowels(w) > 0;
  }





  /**
    String allVowels(String) -- returns vowels in a String
    pre:  w != null
    post: allVowels("meatball") -> "eaa"
    **/
  public static String allVowels( String w ) {

    String ans = " "; //init return String

    for( int i = 0; i < w.length(); i++ ) {

      if ( isAVowel( w.substring(i,i+1) ) )
        ans += w.substring( i, i+1 ); //grow the return String
    }
    return ans;
  }


  /**
    String firstVowel(String) -- returns first vowel in a String
    pre:  w != null
    post: firstVowel("") --> ""
    firstVowel("zzz") --> ""
    firstVowel("meatball") --> "e"
    **/
  public static String firstVowel( String w ) {

    String ans = "";

    if ( hasAVowel(w) ){ //Q: Why this necess?
      ans = allVowels(w).substring(1,2);
    }
    return ans;
  }


  /**
    boolean beginsWithVowel(String) -- tells whether a String begins with a vowel
    pre:  w != null and w.length() > 0
    post: beginsWithVowel("apple")  --> true
    beginsWithVowel("strong") --> false
    **/
  public static boolean beginsWithVowel( String w ) {
    return isAVowel( w.substring(0,1) );
  }


  /**
    String engToPig(String) -- converts an English word to Pig Latin
    pre:  w.length() > 0
    post: engToPig("apple")  --> "appleway"
    engToPig("strong") --> "ongstray"
    engToPig("java")   --> "avajay"
    **/
  public static String engToPig( String w ) {
    String ans = "";
    if(countVowels(w)==0){
      ans = w + "ay";
    }
    else if ( beginsWithVowel(w) ){
      ans = w + "way";
    }
    else {
      int vPos = w.indexOf( firstVowel(w) );
      ans = w.substring(vPos) + w.substring(0,vPos) + "ay";
    }

    return ans;
  }

  public static String pigToCapitals(String w){


    String upper = w.substring(0,1);
    String lower = w.substring(1,w.length());
    w =  upper.toUpperCase()+lower;


    return w;
  }

  // code to be added to your growing Pig Latin translator
	//capital letters (precond: letter is 1 character long)
  public static boolean isACapital( String letter ) {
    return CAPS.indexOf( letter ) != -1;
  }


  public static void main( String[] args ) {



    for( String word : args ) {
      System.out.println( "allVowels \t" + allVowels(word).substring(1) );
      System.out.println( "firstVowels \t" + firstVowel(word) );
      System.out.println( "countVowels \t" + countVowels(word) );
      if(isACapital(word.substring(0,1))==true){
        System.out.println( "engToPig \t" + pigToCapitals(engToPig(word)) );
      }
      else{
        System.out.println( "engToPig \t" + engToPig(word) );
      }

      System.out.println( "---------------------" );
    }
  }//end main()

}//end class Pig
