/**
 * Starts the Celebrity Game application
 * @author cody.henrichsen
 *
 */
public class CelebrityRunner
{
	/**
	 * The entry point of the Java application.
	 * @param args Unused parameter as it is a GUI based program.
	 */
	public static void main(String [] args)
	{
		Celebrity TopherMykolyk = new Celebrity("Topher Mykolyk", "He is our APCS teacher, and also a really cool guy");
		System.out.println(TopherMykolyk);
		System.out.println(TopherMykolyk.getAnswer());
		System.out.println(TopherMykolyk.getClue());

		Celebrity ElonMusk = new Celebrity();
		ElonMusk.setClue("He owns twitter");
		ElonMusk.setAnswer("Elon Musk");
		System.out.println(ElonMusk);


	}
}
