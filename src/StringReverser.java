import static org.junit.Assert.*;

import java.util.Stack;

import org.junit.Test;


public class StringReverser {
	
	public String reverse(String word){
		Stack<String> s = new Stack<String>();
		
		for(String l : word.split("")){
			s.add(l);
		}
		
		String reverse = "";
		while(!s.isEmpty()){
			reverse += s.pop();
		}
		return reverse;
		
	}
	
	@Test
	public void test() {
		assertEquals("frab", reverse("barf"));
	}
}
