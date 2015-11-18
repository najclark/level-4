import java.util.ArrayList;

public class KanyeWest {

	RappingAbility r;
	
	public static void main(String[] args) {
		new KanyeWest().setup1();
	}
	
	public void setup1(){
		Beatmaker b = new Beatmaker();
		System.out.println(this.getClass().getName() + " knows how to " + b.getClass().getDeclaredMethods()[0].getName());
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
