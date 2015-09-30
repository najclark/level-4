import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Stack;



public class Palandrums {
	
	public static void main(String[] args) {
		new Palandrums().setup();
	}
	
	public void setup(){
		try {
			URL url = new URL("https://raw.githubusercontent.com/eneko/data-repository/master/data/words.txt");
			BufferedReader r = new BufferedReader(new InputStreamReader(url.openStream()));
			
			String word;
			int count = 0;
			
			while((word = r.readLine()) != null){
				Stack<String> letter = new Stack<String>();
				word = word.toLowerCase(); //not case sensitive
				
				for(String l : word.split("")){
					letter.add(l);
				}
				
				String backward = "";
				while(!letter.isEmpty()){
					backward += letter.pop();
				}
				
				if(backward.equals(word)){
					count++;
					System.out.println(word);
				}
				
				
			}
			System.out.println("Total: " + count);
			r.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
