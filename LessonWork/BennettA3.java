package com.coderscampus.assignment3;

import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

// String[0] username String [1] password String [2] name
public class BennettA3 {

	public static void main(String[] args) throws IOException{
		
		Scanner scan = new Scanner(System.in);
		int fails = 0;
		
		//User user = new User(String username, String name, String password);
		System.out.println("Enter a Username: ");
		String username = scan.nextLine();
		System.out.println("Enter a Password");
		String password = scan.nextLine();
		//System.out.println(username);
		//System.out.println(password);
		//if username && password == user objects array move to match 
		//if no match display invalid login iterate failed logins by 1
		//for each user in users if username.equalsIgnoreCase([0]) move on to password.equals([1]) 
		
		BufferedReader fileReader = null;
		try {
			fileReader = new BufferedReader(new FileReader("data.txt"));
			String line = "";
			while ((line = fileReader.readLine()) != null) {
				System.out.println(line);
				String[] piece = line.split(",");
				System.out.println(piece);
			}
		}finally {
			fileReader.close();
		}
	}

}
// if String username.equalsIgnoreCase(user1[0])