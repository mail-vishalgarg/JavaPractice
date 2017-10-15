package com.oracle.IO;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class AppendToFileExample {
	private static final String FILENAME="C:\\Users\\vishgarg.ORADEV\\workspace\\VishalJava\\src\\IO\\testAppendText.txt";
	
	public static void main(String[] args) {
		BufferedWriter bw = null;
		FileWriter fw = null;
		BufferedReader br = null;
		
		try{
			String data = "\nHello how are you!!";
			File file=new File(FILENAME);
			//If file does not exist, then create it.
			if(!file.exists()){
				file.createNewFile();
			}
			System.out.println("File absolute File name:"+ file.getAbsoluteFile());
			fw = new FileWriter(file.getAbsoluteFile(),true);
			bw = new BufferedWriter(fw);
			
			//Single line syntax
			//bw = new BufferedWriter(new FileWriter(file.getAbsoluteFile(),true));
			bw.write(data);
			System.out.println("Done...");
		} catch (IOException e){
			e.printStackTrace();
		} finally{
			System.out.println("This is the finaly block");
			try{
				if (bw != null){
					bw.close();
				}
				if (fw != null){
					fw.close();
				}
			}catch (IOException e){
				e.printStackTrace();
			}
		}
		
		System.out.println("\n Now read the appended file");
		try{
			br = new BufferedReader(new FileReader(FILENAME));
			String line="";
			while ((line=br.readLine()) !=null){
				System.out.println(line);
			}
		}catch (IOException e){
			e.printStackTrace();
		}
		
	}

}
