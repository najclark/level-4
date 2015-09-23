import static org.junit.Assert.*;

import java.util.Scanner;

import org.junit.Test;

public class Anagram {

	static boolean isAnagram(String A, String B) {

		String[] a = A.split("");

		for (String s : a) {
			if (!B.contains(s)) {
				return false;
			}
		}
		return true;
	}

//	public static void main(String[] args) {
//
//		Scanner sc = new Scanner(System.in);
//		String A = sc.next();
//		String B = sc.next();
//		sc.close();
//		if (isAnagram(A, B))
//			System.out.println("Anagrams");
//		else
//			System.out.println("Not Anagrams");
//
//	}
	
	@Test
	public void test(){
		assertEquals("Test 1", true, isAnagram("abc", "cba"));
	}
	
	
	@Test
	public void testNot(){
		assertEquals("Test 1", false, isAnagram("abcd", "cbae"));
	}
}