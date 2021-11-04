/***
 * Team Inari: Russell Goychayev, Ethan Lam, Oscar Breen
 * APCS
 * HW31 -- Otnay Ybay ethay Airhay Onway Ymay Inneechay Inchay Inchay
 * 2021-11-04
 * time spent: 0.5hrs
 *
 * class Pig
 * a Pig Latin translator
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

DISCO
-.equals() method saves the day again
QCC
-none
 ***/

public class Pig
{
  //Q: How does this initialization make your life easier?
  private static final String VOWELS = "aeiou";
  /** A: this initialization makes my life easier by providing an object that represents the vowels. **/

  /*=====================================
    boolean hasA(String,String) -- checks for a letter in a String
    pre:  w != null, letter.length() == 1
    post: hasA("cat", "a") -> true
    hasA("cat", "p")       -> false
    =====================================*/
  public static boolean hasA( String w, String letter )
  {
boolean truth = false;
if (w != null && letter.length() == 1) {
for (int i=0; i<w.length(); i++) {
if (w.substring(i,i+1).equals(letter)) {
truth = true;
}
}
}
return truth;
 }//end hasA()


  /*=====================================
    boolean isAVowel(String) -- tells whether a letter is a vowel
    precondition: letter.length() == 1
    =====================================*/
  public static boolean isAVowel( String letter )
  {
boolean truth = false;
if (letter.length() == 1) {
truth = hasA(VOWELS, letter);
}
return truth;
  }


  /*=====================================
    int countVowels(String) -- counts vowels in a String
    pre:  w != null
    post: countVowels("meatball") -> 3
    =====================================*/
  public static int countVowels( String w )
  {
int vowels = 0;
if (w != null) {
for (int i=0; i<w.length(); i++) {
if (isAVowel(w.substring(i,i+1)) == true) {
vowels++;
}
}
}
return vowels;
  }


  /*=====================================
    boolean hasAVowel(String) -- tells whether a String has a vowel
    pre:  w != null
    post: hasAVowel("cat") -> true
    hasAVowel("zzz")       -> false
    =====================================*/
  public static boolean hasAVowel( String w )
  {
boolean truth = false;
if (w!=null) {
for (int i=0; i<w.length(); i++) {
if (isAVowel(w.substring(i,i+1)) == true) {
truth = true;
}
}
}
return truth;
  }


  /*=====================================
    String allVowels(String) -- returns vowels in a String
    pre:  w != null
    post: allVowels("meatball") -> "eaa"
    =====================================*/
  public static String allVowels( String w )
  {
String allVowels = "";
if (w!=null) {
for (int i=0; i<w.length(); i++) {
if (isAVowel(w.substring(i,i+1))==true) {
allVowels += w.substring(i,i+1);
}
}
}
return allVowels;
  }


  public static void main( String[] args )
  {
System.out.println( hasA("cat", "p") + " should be false");
System.out.println( hasA("cat", "a") + " should be true");
System.out.println( isAVowel("a") + " should be true");
System.out.println( countVowels("meatball") + " should be 3");
System.out.println( hasAVowel("cat") + " should be true");
System.out.println( hasAVowel("zzz") + " should be false");
System.out.println( allVowels("meatball") + " should be eaa");

  }//end main()

}//end class Pig
