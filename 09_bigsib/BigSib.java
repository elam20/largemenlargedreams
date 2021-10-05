public class Greet{
	public static void main( String[] args ){
		BigSib.greet("Emperor Palpatine");
		BigSib.greet("Count Dooku");
		BigSib.greet("Jar Jar Binks");
	}
}


public class BigSib{

public static void main(String[] args){
	greet("Ethan");
}

public static void greet(String name){
	System.out.println("Why hello there, " + name + ", how do you do?"); 
}
}
