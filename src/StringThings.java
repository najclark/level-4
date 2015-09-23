import java.util.Scanner;

public class StringThings {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("First: ");
		String firstString = scanner.next();
		System.out.println("Second: ");
		String secondString = scanner.next();
		scanner.close();
		String abc = "abcdefghijklmnopqrstuvwxyz";

		// 1. Print the total length of the strings.
		System.out.println(firstString.length() + secondString.length());

		// 2. Is firstString lexicographically larger than than secondString?
		// Print "Yes" or "No".
		if (firstString.length() < secondString.length()) {
			for (int i = 0; i < secondString.length(); i++) {
				String s = String.valueOf(secondString.charAt(i));
				System.out.println(firstString.charAt(i));
				if(abc.indexOf(s) < abc.indexOf(firstString.charAt(i))){
					System.out.println("Yes");
					break;
				}
				else if(abc.indexOf(s) > abc.indexOf(firstString.charAt(i))){
					System.out.println("No");
					break;
				}
			}
		} else {
			for (String s : firstString.split("")) {

			}
		}

		// 3. Capitalize both strings and print them on a single line separated
		// by a space.
		System.out.println(firstString.toUpperCase() + " "
				+ secondString.toUpperCase());
	}
}
