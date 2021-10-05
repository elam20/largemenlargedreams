public class Greet{
	public static void main( String[] args ){
		System.out.println( BigSib.greet("Sheev") );
		System.out.println( BigSib.greet("Darth Sidious") );
		System.out.println( BigSib.greet("The Senate") );
	}
}


public class BigSib{

public static void main(String[] args){
	greet("Ethan");
}

public static void greet(String name){
	System.out.println(name); 
	}
}

