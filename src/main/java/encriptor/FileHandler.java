package encriptor;

import java.io.File;

public class FileHandler {

	/**
	 * asks the user to select a file
	 * @return file name / path
	 */
	public static String chooseFile() {
		String fileName;
		do{
			fileName = StdIn.getInput("please enter path of file");
		}while(fileName == null || !fileExist(fileName));
		return fileName;
	}
	
	/**
	 * check whether a file exists or not
	 * @param fileName
	 * @return true if the file exist, false if the file does not exist
	 */
	public static boolean fileExist(String fileName) {
		File f = new File(fileName);
		return f.exists() && f.isFile();
	}
}
