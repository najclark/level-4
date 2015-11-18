import java.util.ArrayList;

public class DJShadow {

	public static void main(String[] args) {
		new DJShadow().setup();
	}
	
	public ArrayList<String> setup() {
		Beatmaker b = new Beatmaker();
		ArrayList<String> al = new ArrayList<String>();
		al.add(this.getClass().getName() + " knows how to");
		al.add(b.getClass().getDeclaredMethods()[0].getName());
		return al;
	}

}
