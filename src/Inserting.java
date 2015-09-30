import java.util.ArrayList;

public class Inserting {
	public static int[] insertAt(int[] array, int index, int value) {
		array[index] = value;
		return array;
	}

	public static String[] insertAlphabetically(String[] array, String word) {
		ArrayList<String> a = new ArrayList<String>();

		for (String s : array) {
			a.add(s);
		}
		a.add(word);

		String[] tempA = new String[a.size()];

		int index = 0;
		for (String s : a) {
			tempA[index] = s;
			index++;
		}

		Sorting.sort(tempA);
		
		return tempA;
	}
}
