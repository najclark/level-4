
public class AddChecker implements Checker{
	
	String[] phrases = new String[2];
	
	public AddChecker(Checker a, Checker b) {
		phrases[0] = a.getPhrase();
		phrases[1] = b.getPhrase();
	}
	
	@Override
	public boolean accept(String text) {
		boolean good = false;
		for(int i = 0; i < phrases.length; i++){
			if(text.contains(phrases[i])) good = true;
			else good = true;
		}
		if(good) return true;
		return false;
	}

	@Override
	public String getPhrase() {
		return phrase;
	}

}
