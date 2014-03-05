package dhbw.java.examples.language;

public class MainClassLanguage {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		ILanguage german = new German();
		german.sayHello();

		ILanguage english = new English();
		english.sayHello();

		ILanguage[] languageArray = new ILanguage[2];

		languageArray[0] = new German();
		languageArray[0].sayHello();

		languageArray[1] = new English();
		languageArray[1].sayHello();

	}

}
