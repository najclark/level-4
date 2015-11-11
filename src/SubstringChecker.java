
public class SubstringChecker implements Checker {

	String phrase;

	public SubstringChecker(String phrase) {
		this.phrase = phrase;
	}

	@Override
	public boolean accept(String text) {
		if (text.contains(phrase)) {
			return true;
		}
		return false;
	}

	@Override
	public String getPhrase() {
		return phrase;
	}

}
