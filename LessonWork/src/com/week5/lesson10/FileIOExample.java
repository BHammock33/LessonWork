package com.week5.lesson10;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileIOExample {

	public static void main(String[] args) {

		BufferedReader fileReader = null;
		try {
			fileReader = new BufferedReader(new FileReader("data.txt"));
			
			String line;
			while((line = fileReader.readLine()) != null) {
				System.out.println(line);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			System.out.println("File not found");
		} catch (IOException e) {
			System.out.println("IO problem");
			e.printStackTrace();
		} finally {
			try {
				System.out.println("Closing File Reader");
				fileReader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
