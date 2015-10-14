import java.util.ArrayList;
import java.util.HashMap;

import javax.swing.JOptionPane;

public class PythonChallenge {

	public static void main(String[] args) {
		String stuff = JOptionPane.showInputDialog("Input");
		new PythonChallenge().calculateElectionWinner(stuff);
	}
	
	public void calculateElectionWinner(String stuff) {
		for(int i = 0; i < stuff.length(); i++){
			//System.out.println(stuff.charAt(i));
			String s = String.valueOf(stuff.charAt(i));
			if(i > 6 && !isUpper(String.valueOf(stuff.charAt(i-7))) && isUpper(String.valueOf(stuff.charAt(i-6))) && isUpper(String.valueOf(stuff.charAt(i-5))) && isUpper(String.valueOf(stuff.charAt(i-4))) && isUpper(String.valueOf(stuff.charAt(i-2))) && isUpper(String.valueOf(stuff.charAt(i-1))) && isUpper(String.valueOf(stuff.charAt(i))) && !isUpper(String.valueOf(stuff.charAt(i-3))) && !isUpper(String.valueOf(stuff.charAt(i+1)))){
				System.out.println(String.valueOf(stuff.charAt(i-6)) + String.valueOf(stuff.charAt(i-5)) + String.valueOf(stuff.charAt(i-4)) + String.valueOf(stuff.charAt(i-3)) + String.valueOf(stuff.charAt(i-2)) + String.valueOf(stuff.charAt(i-1)) + String.valueOf(stuff.charAt(i)));
			}
		}
	}

	public static boolean isUpper(String s) {
		for (char c : s.toCharArray()) {
			if (!Character.isUpperCase(c))
				return false;
		}

		return true;
	}

}
