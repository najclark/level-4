
public class RunningRappers {

	public static void main(String[] args) {
		new RunningRappers().setup();
	}
	
	public void setup(){
		KanyeWest kw = new KanyeWest();
		DJShadow djs = new DJShadow();
		DrDre drd = new DrDre();
		
		for(String s : kw.setup()){
			System.out.println(s);
		}
		System.out.println();
		for(String s : djs.setup()){
			System.out.println(s);
		}
		System.out.println();
		for(String s : drd.setup()){
			System.out.println(s);
		}
	}

}
