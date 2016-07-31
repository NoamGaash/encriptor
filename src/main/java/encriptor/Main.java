package encriptor;

import java.io.File;
import java.util.Arrays;
import java.util.Scanner;


public class Main {
	
	protected static Scanner sc = new Scanner(System.in);
	static String[] encryption = {"1", "e", "enc", "encryption"};
	static String[] decryption = {"2", "d", "dec", "decryption"};
	
	public static enum State {
		encryption, decryption
	}
	
	public static void main(String[] args) {
		String fileName = FileHandler.chooseFile();
		State chosenState = chooseEncryptDecrypt();
		if(chosenState == State.encryption) {
			Encryption.encrypt(fileName);
		} else {
			Encryption.decrypt(fileName);
		}
		
		 
		sc.close();
	}

	private static State chooseEncryptDecrypt() {
		System.out.println("choose between encryption and decription");
		System.out.println("to choose encription, you may type one of the following: " + Arrays.toString(encryption));
		System.out.println("to choose decryption, you may type one of the following: " + Arrays.toString(decryption));
		String ans;
		do{
			ans = sc.next();
		}while (!Arrays.asList(encryption).contains(ans) && !Arrays.asList(decryption).contains(ans));
		
		if(Arrays.asList(encryption).contains(ans)){
			return State.encryption;
		} else {
			return State.decryption;
		}
	}
	

}
