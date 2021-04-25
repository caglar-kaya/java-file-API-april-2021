package creatingFolderFileWriting;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class WriteFile {

	public static void main(String[] args) {

		String pathString = "F://Buttons//Students.txt";
		Scanner input;
		
		try {
			FileWriter writer = new FileWriter(pathString);
			
			input = new Scanner(System.in);
			
			System.out.println("How many students to add?");
			int num = input.nextInt();
			
			for (int i = 0; i < num; i++) {
				System.out.print("Enter student ID: ");
				String id = input.next();
				System.out.print("Enter student name: ");
				String name = input.next();
				
				writer.write((i + 1) + ". " + id + " : " + name + "\n");
			}
			
			writer.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		// Read file and write console
		try {
			File fileRead = new File(pathString);
			
			input = new Scanner(fileRead);
			
			while (input.hasNext()) {
				String line = input.nextLine();
				System.out.println(line);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

}
