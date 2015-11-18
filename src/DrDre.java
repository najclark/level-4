import java.util.ArrayList;

public class DrDre {

	RappingAbility r;

	public static void main(String[] args) {
		new DrDre().setup();
	}

	public ArrayList<String> setup() {
		r = new RappingAbility();
		Beatmaker b = new Beatmaker();
		ArrayList<String> al = new ArrayList<String>();
		al.add(this.getClass().getName() + " knows how to");
		al.add(b.getClass().getDeclaredMethods()[0].getName());
		al.add(r.getClass().getMethods()[0].getName());
		return al;
	}

}
