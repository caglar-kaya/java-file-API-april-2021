package creatingFolderFileWriting;

import java.io.File;

public class FileDirectory {

	public static void main(String[] args) {

		File directory = new File("F://Buttons");
		
		directory.mkdir(); // Buttons folder was created in (F:)
		
		String dirLocation = directory.getAbsolutePath();
		System.out.println(dirLocation); // F:\Buttons
		
		String folderName = directory.getName();
		System.out.println(folderName); // Buttons
		
//		if (directory.delete()) {
//			System.out.println(folderName + " folder has been deleted.");
//		}
		
	}

}
