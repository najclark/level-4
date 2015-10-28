import java.util.HashMap;


public class HorseBarn {
	private Horse[] spaces;
	
	public void addHorses(Horse[] h){
		spaces = h;
	}
	
	public int findHorseSpace(String name){
		int index = 0;
		
		for(Horse h : spaces){
			if(h != null && h.getName().equals(name)) return index;
			index++;
		}
		
		return -1;
	}
	
	public void consolidate(){
		
		HashMap<Integer, String> donkey = new HashMap<Integer, String>();
		int[] horses = new int[spaces.length];
		int index = 0;
		
		for(Horse h : spaces){
			if(h != null){
				spaces[index] = h;
				index++;
			}
		}
		
	}
	
	public Horse[] getSpaces(){
		return spaces;
	}

	public static HorseBarn createTestBarn() {
		Horse[] h = new Horse[7];
		h[0] = new Horse("Trigger", 1340);
		h[1] = null;
		h[2] = new Horse("Silver", 1210);
		h[3] = new Horse("Lady", 1575);
		h[4] = null;
		h[5] = new Horse("Patches", 1350);
		h[6] = new Horse("Duke", 1410);
		
		HorseBarn hb = new HorseBarn();
		hb.addHorses(h);
		return hb;
	}
	
}
