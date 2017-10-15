package com.oracle.IO;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class CSVReader {
	private static final String FILENAME="C:\\Users\\vishgarg.ORADEV\\workspace\\VishalJava\\src\\IO\\country.csv";
	public static void main(String[] args) {
		//FileReader fr = null;
		BufferedReader br = null;
		String line = "";
		String csvSplitBy=",";
		
		File file = new File(FILENAME);
		if(!file.exists()){
			System.out.println("File does not exist");
			System.exit(0);
		}
		try{
			br = new BufferedReader(new FileReader(file.getAbsoluteFile()));
			while((line=br.readLine()) != null){
				String[] country = line.split(csvSplitBy);
				System.out.println("Code:"+ country[2] + " Name:"+country[5] + " contry ACR:"+country[4]);
			}
			
		} catch (IOException e){
			e.printStackTrace();
		} finally {
			if (br!= null){
				try {
					br.close();
				}catch (IOException e){
					e.printStackTrace();
				}
			}
		}
	}
}
