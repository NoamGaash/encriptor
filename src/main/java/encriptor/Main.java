package encriptor;

import java.io.File;
import java.util.Arrays;
import java.util.Scanner;


public class Main {
	
	protected static Scanner sc = new Scanner(System.in);
	static String[] encryption = {"1", "e", "enc", "encryption"};
	static String[] decryption = {"2", "d", "dec", "decryption"};
	
	public static enum states {
		encryption, decryption
	}
	
	public static void main(String[] args) {
		String fileName = FileHandler.chooseFile();
		chooseEncryptDecrypt();
		
		
		 
		sc.close();
	}

	private static states chooseEncryptDecrypt() {
		System.out.println("choose between encryption and decription");
		System.out.println("to choose encription, you may type " + Arrays.toString(encryption));
		System.out.println("to choose decryption, you may type " + Arrays.toString(decryption));
		String ans;
		do{
			ans = sc.next();
		}while (!Arrays.asList(encryption).contains(ans) && !Arrays.asList(decryption).contains(ans));
		
		if(Arrays.asList(encryption).contains(ans)){
			return states.encryption;
		} else {
			return states.decryption;
		}
	}
	

}
