package encriptor;

import java.io.File;

public class FileHandler {


	protected static String chooseFile() {
		String fileName;
		do{
			fileName = Main.sc.next();
		}while(fileName != null && fileExist(fileName));
		return fileName;
	}

	protected static boolean fileExist(String fileName) {
		File f = new File(fileName);
		return f.exists() && f.isFile();
	}
}
