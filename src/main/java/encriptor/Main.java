package encriptor;

import java.io.File;
import java.util.Arrays;
import java.util.Scanner;


public class Main {
	
	/**
	 * represent all legal states: encryption state or decryption state.
	 */
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
		
		 
	}

	/**
	 * let the user choose (via standard input/output) between encryption state and decryption state
	 * @return the chosen state
	 */
	private static State chooseEncryptDecrypt() {
		String[] encryptionOptions = {"1", "e", "enc", "encryption"};
		String[] decryptionOptions = {"2", "d", "dec", "decryption"};
		
		String msg = "choose between encryption and decription\n";
		msg += "\tto choose encription, you may type one of the following: " + Arrays.toString(encryptionOptions)+'\n';
		msg += "\tto choose decryption, you may type one of the following: " + Arrays.toString(decryptionOptions);
		String ans;
		do{
			ans = StdIn.getInput(msg);
		}while (!Arrays.asList(encryptionOptions).contains(ans) && !Arrays.asList(decryptionOptions).contains(ans));
		
		if(Arrays.asList(encryptionOptions).contains(ans)){
			return State.encryption;
		} else {
			return State.decryption;
		}
	}
	

}
