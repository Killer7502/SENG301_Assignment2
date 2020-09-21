package main;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class LoadData {

	public static void loadCSV(File file) {
		File readFile = file;
		Scanner inFS = null;
		FileInputStream fileInput = null; 
		String readLine = null;
		ArrayList<String> items = new ArrayList<String>();
		ArrayList<Book> books = new ArrayList<Book>();
		
		
		if (readFile.canRead()) {
			try {
					fileInput = new FileInputStream(readFile);
					inFS = new Scanner(fileInput);
					
					while (inFS.hasNext()) {
						readLine = inFS.nextLine();
						
						String[] tempArray = readLine.split(",(?=(?:[^\"]*\"[^\"]*\")*(?![^\"]*\"))"); //FIXME: Fix to regex for ","
						
						for (int i = 0; i < tempArray.length; i++) {
							String temp = tempArray[i];
							temp = temp.replace("\"", "");
							items.add(temp);
						}
						
						Book book = new Book(items);
						books.add(book);
						
						//Clear tempArray and items
						items.clear();
						Arrays.fill(tempArray, ""); 
					}
			}
			//If an issue arises when trying to open/read the file
			catch (IOException e) {
				System.out.println(e);
			}
		}
		//If the file can't be read from at all or if it's empty
		else {
			System.out.println("File can't be read or is empty");
		}
	}
	
	/**/
	public static void main(String[] args) {
		String fName = ("C:\\MyDocuments\\JavaStuff\\testFile.csv");
		File file = new File(fName);
		loadCSV(file);
	}
	/**/
}
