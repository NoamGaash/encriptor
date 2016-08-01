package encriptor;

import java.util.Scanner;

public final class StdIn {
	
	private static Scanner sc = new Scanner(System.in);
	private StdIn(){} // no reason to create StdIn object
	
	/**
	 * get user input from System.in
	 * @return user input
	 */
	public static String getInput() {
		return sc.nextLine();
	}

	/**
	 * output the given string, than return user input from System.in
	 * @param string output string
	 * @return user input
	 */
	public static String getInput(String string) {
		System.out.println(string);
		return getInput();
	}
}
