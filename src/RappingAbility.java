import java.io.IOException;

public class RappingAbility {
	public void spitRhymes() {
		try {
			Runtime.getRuntime().exec("say All agree that I am the best rapper, All the others should drive a tractor.");
		} catch (IOException e) {
		}
	}

}
