import java.util.Arrays;
import java.util.Random;


public class GithubLove {

	public static void main(String[] args) {
		new GithubLove().setup();
	}
	
	public void setup(){
		String[] array = {"titaniumsapphire", "michaelmvv"};
		
		for(int i = 0; i < array.length; i++){
			if(array[i].compareTo(array[i--])==-1){ //TODO make it sort alphabetically
				
			}
		}
		
		
		System.out.println(array[new Random().nextInt(array.length)]);
		
	}

}
