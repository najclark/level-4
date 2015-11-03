import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Calendar;

public class Copywriter {

	public static void main(String[] args) {
		try {
			File f = new File(new java.io.File("src").getCanonicalPath() + "/"
					+ Copywriter.class.getName() + ".java");

			BufferedReader r = new BufferedReader(new FileReader(f));
			String line, prev = "";
			while ((line = r.readLine()) != null) {
				prev += (line + "\n");
			}
			r.close();
			
			int year = Calendar.getInstance().get(Calendar.YEAR);

			if (!prev.contains("//Copywrited Nicholas, " + year)) {
				BufferedWriter fw = new BufferedWriter(new FileWriter(f, true));
				fw.write("\n//Copywrited Nicholas, " + year);
				fw.close();
			}
			else{
				System.out.println("Already copywrited");
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
//Copywrited Nicholas, 2015