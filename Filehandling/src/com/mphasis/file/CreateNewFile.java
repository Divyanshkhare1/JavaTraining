package com.mphasis.file;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;

public class CreateNewFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		File file = new File ("src/test.txt");
		
		
		
		
		try {
			System.out.println(" is new file created" + file.createNewFile());
			
			FileWriter writer = new FileWriter(file , true);
			writer.write("Hello chinu,simplilearn");
			writer.flush();
			
			FileInputStream reader = new FileInputStream(file);
			
			int num = 0;

			while((num = reader.read()) != -1) {
				
				System.out.println((char)num);
			}
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
