package com.text.test;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class TextFileWrite {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		File f = new File("C:\\Selenium_Workspace\\TextFileReadWrite\\src\\test\\java\\Write.txt");
		FileWriter wr = new FileWriter(f);
		BufferedWriter bwr = new BufferedWriter(wr);
		
		bwr.write("hello!!!!---First Line");
		bwr.newLine();
		
		bwr.write("second line");
		bwr.newLine();
		
		bwr.write("third line");
		bwr.newLine();
		
		bwr.write("fourth line");
		bwr.newLine();
		
		bwr.close();
		
		System.out.println("Data Entered");

	}

}
