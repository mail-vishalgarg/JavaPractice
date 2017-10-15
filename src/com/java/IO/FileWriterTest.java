package com.oracle.IO;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;

public class FileWriterTest {
	public static void main(String[] args){
		try{
			FileWriter fw = new FileWriter("D:\\testout.txt");
			fw.write("This is the new file.!!");
			fw.close();
			
		}catch (Exception e) {
			System.out.println(e);
		}
		System.out.println("Write to the file is success...");
	//Read the file code
		System.out.println("\nNow from here read the file");
		try{
			FileReader fr = new FileReader("D:\\testout.txt");
			int i;
			while((i=fr.read())!= -1){
				System.out.print((char)i);
			}
			fr.close();
		}catch (Exception e){
			System.out.println(e);
		}
	
	//Writing to the file using BuffredWriter
		try{
			FileWriter fw1 = new FileWriter("C:\\Users\\vishgarg.ORADEV\\workspace\\VishalJava\\src\\IO\\testoutput.txt");
			BufferedWriter bw = new BufferedWriter(fw1);
			bw.write("Now write to the file using BufferedWriter method!!");
			bw.close();
			System.out.println("\nWrite to the file is success...");
		} catch(Exception e){
			System.out.println(e);
		}
		
	//Reading file using BufferedReader method
		System.out.println("\n\nRead file using BufferedReader method");
		try{
			FileReader fr1 = new FileReader("C:\\Users\\vishgarg.ORADEV\\workspace\\VishalJava\\src\\IO\\testoutput.txt");
			BufferedReader br1 = new BufferedReader(fr1);
			int i;
			while((i=br1.read())!= -1){
				System.out.print((char)i);
			}
			br1.close();
			fr1.close();
		}catch (Exception e){
			System.out.println(e);
		}
	
		//Read data from console
		try{
		System.out.println("\n\n Read data from console using InputStreamReader");
		InputStreamReader ir = new InputStreamReader(System.in);
		BufferedReader brd = new BufferedReader(ir);
		String line = brd.readLine();
		System.out.println("Welcome :"+line);
		}catch (Exception e){
			System.out.println(e);
		}
		
	}
}
