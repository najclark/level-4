import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.Random;

public class FileEncryptor {

	public static void main(String[] args) {
		String toDecrypt = readFileContents(new File("secretfile.txt"));
		String e = encrypt("public class FileEncryptor {");
		System.out.println("Encrypted: " + e);
		System.out.println(toDecrypt);
		System.out.println("Decrypted: " + decrypt(e));
	}

	public static File openSecretFile() {
		return new File(System.getProperty("user.dir") + "/secretfile.txt");
	}

	public static String readOneLine(File file) {
		try {
			BufferedReader br = new BufferedReader(new FileReader(file));
			String line = br.readLine();
			br.close();
			return line;
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}

	public static String readFileContents(File file) {
		if(!file.toString().contains("/")){
			file = new File(System.getProperty("user.dir") + "/" + file.toString());
		}
		try {
			BufferedReader br = new BufferedReader(new FileReader(file));
			String line = "", total = "";
			while ((line = br.readLine()) != null) {
				total += line + "\n";
			}
			br.close();
			return total.trim();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}

	public static String encrypt(String encryptMe) {
		String encrypted = "";
		double multiplier = Math.round(new Random().nextInt(7)+2);
		for (char c : encryptMe.toCharArray()) {
			int ascii = (int) c * (int) multiplier;
			encrypted += (char) ascii;
		}
		encrypted += (int)multiplier;
		return encrypted;
	}

	public static File saveFile(String fileName) {
		PrintWriter writer;
		try {
			writer = new PrintWriter(fileName, "UTF-8");
			writer.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		return new File(fileName);
	}

	public static void saveStuffInAFile(String string, File file) {
		if(!file.toString().contains("/")){
			file = new File(System.getProperty("user.dir") + "/" + file.toString());
		}
		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter(file));
			bw.write(string);
			bw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static String decrypt(String decryptMe) {
		String decrypt = "";
		int multiplier = Integer.parseInt(String.valueOf(decryptMe.charAt(decryptMe.length()-1)));
		for (char c : decryptMe.toCharArray()) {
			int ascii = (int) c;
			decrypt += (char) (ascii / multiplier);
		}
		return decrypt.trim();
	}

}
