package com.oracle.IO;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class ReadWordFromFile {
	public static void main(String[] args) throws IOException {
		String filename="C:\\Users\\vishgarg.ORADEV\\workspace\\VishalJava\\src\\com\\oracle\\IO\\inputfile1.txt";
		FileReader fr = new FileReader(filename);
		BufferedReader br = new BufferedReader(fr);
		String line="";
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		while((line = br.readLine())!= null){
			//System.out.println(line);
			int count = 1;
			String words[] = line.split(" ");
			for(String st: words){
				if (map.containsKey(st)){
					map.put(st, count + 1);
				} else {
					map.put(st,1);
				}
			}
			
		}
		
		for(Map.Entry<String, Integer> entry: map.entrySet()){
			System.out.println("Word:" + entry.getKey() + " " + entry.getValue());
		}
		
		
	}

}
