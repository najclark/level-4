// Copyright Wintriss Technical Schools 2013
import java.io.File;

import junit.framework.TestCase;

public class FileReadingTest extends TestCase {

	/* Create a file in your project. Use the File object to open it. */
	public void testOpenFile() throws Exception {
		assertTrue(FileEncryptor.openSecretFile().isFile());
	}

	/* Adjust these asserts to match the text in your secret file. */
	public void testReadFile() throws Exception {
		File file = FileEncryptor.openSecretFile();
		assertEquals("Happy friyday!!", FileEncryptor.readOneLine(file));
		assertEquals("Happy friyday!!other stuff",
				FileEncryptor.readFileContents(file));
	}

	/* Create your own encryption algorithm and adjust the asserts. */
	public void testEncrypt() throws Exception {
		String encryptMe = "lalala";
		String encrypted = FileEncryptor.encrypt(encryptMe);
		assertEquals(FileEncryptor.decrypt(encrypted), encryptMe);
	}

	public void testSaveAFile() throws Exception {
		assertTrue(FileEncryptor.saveFile("fileName").isFile());
	}

	public void testSaveStuffInFile() throws Exception {
		File file = new File("file_with_stuff");
		FileEncryptor.saveStuffInAFile("stuff", file);
		System.out.println(FileEncryptor.readFileContents(file));
		assertEquals("stuff", FileEncryptor.readFileContents(file));
	}

	public void testDecrypt() throws Exception {
		String decryptMe = FileEncryptor.encrypt("lalala");
		assertEquals("lalala", FileEncryptor.decrypt(decryptMe));
	}

	public void testEverythingTogether() throws Exception {
		String secretfileName = "secretfile.txt";
		
		File secretFile = new File(secretfileName);
		String stuffToEncrypt = FileEncryptor.readFileContents(secretFile);
		
		String encryptedStuff = FileEncryptor.encrypt(stuffToEncrypt);
		
		FileEncryptor.saveStuffInAFile(encryptedStuff, secretFile);
		String toDecrypt = FileEncryptor.readOneLine(secretFile);
		assertEquals(stuffToEncrypt, FileEncryptor.decrypt(FileEncryptor
				.readOneLine(secretFile)));
	}

}
