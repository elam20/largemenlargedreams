/*
 Marcus Wu Oscar Breen Lauren Lee
 APCS
 HW27 -- FOR the Love of Strings -- String code and methods
 2021-10-29
 time spent: 18minute
*/

public class Rof {

	public static String fenceF( int posts ) {
		String s = "|";
		for ( int x = 1; x < posts; x++ ) {
			s += "--|";
		}
		return s;
	}

	public static String reverseF( String s ) {
		String result = "";
		for ( int x = s.length(); x > 0; x-- ) {
			result += s.substring( x-1, x ); //substring(x-1,x) returns char at length-1 (substring starts at 0)
		}
		return result;
	}

  public static String reverseR(String s) {
  String results = "";
	int x = (s.length());
   if (x == 0){
  return s;
   }
	 else {
	return reverseR(s.substring(1)) + s.substring(0 , 1);
	 }
  }



	public static void main(String[] args){
		System.out.println( fenceF(1) ); //expect "|"
		System.out.println( fenceF(2) ); //expect "|--|"
		System.out.println( fenceF(3) ); //expect "|--|--|"

		System.out.println( reverseF("stressed") ); //expect "desserts"
		System.out.println( reverseR("stressed") );//expect "desserts"
	}
}
