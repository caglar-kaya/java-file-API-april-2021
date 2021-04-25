package creatingFolderFileWriting;

import java.io.File;
import java.io.IOException;

public class CreateTextFile {

	public static void main(String[] args) {

		File directory = new File("F://Buttons");
		
		String folder = directory.getAbsolutePath();
		
		File file1 = new File(folder + "/Students.txt");
		File file2 = new File(folder + "/Teacher.txt");
		File file3 = new File(folder + "/Books.txt");
		File file4 = new File(folder + "/Syllabus.xlsx");
		
		try {
			file1.createNewFile();
			file2.createNewFile();
			file3.createNewFile();
			file4.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
