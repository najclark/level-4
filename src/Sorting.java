import java.util.ArrayList;
import java.util.Arrays;

public class Sorting {
	public static String[] sort(String[] array) {
		Arrays.sort(array);
		return array;
	}

	public static ArrayList<String> sort(ArrayList<String> array) {

		String[] a = new String[array.size()];

		int index = 0;
		for (String s : array) {
			a[index] = s;
			index++;
		}

		Arrays.sort(a);
		
		array.clear();
		for(String s : a){
			array.add(s);
		}
		return array;
	}
}
