package com.text.test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TextFileRead {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		File f = new File("C:\\Selenium_Workspace\\TextFileReadWrite\\src\\test\\java\\Write.txt");
		FileReader fr = new FileReader(f);
		BufferedReader br = new BufferedReader(fr);
		
		br.mark(1);
		String str = br.readLine();
		System.out.println(str);
		
		str = br.readLine();
		System.out.println(str);
		br.reset();
		
		
		
		
		System.out.println("------------------print for each line-----------------------");
		
		String s;
		int i = 0 ;
		while((s = br.readLine())!=null) {
			System.out.println(s);
			i++;
		}
		
		System.out.println("Total Number of lines : "+i);
		

	}

}
