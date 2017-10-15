package com.oracle;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class ReadCSVAndPrint {
	public static void main(String args[]){
		BufferedReader br = null;
		try{
			String line;
			
			br = new BufferedReader(new FileReader("C:\\Users\\vishgarg.ORADEV\\workspace\\VishalJava\\src\\com\\oracle\\test.csv"));
			while ((line = br.readLine()) != null){
				StringTokenizer st = new StringTokenizer(line,"|");
				while(st.hasMoreElements()){
					//Integer id = Integer.parseInt(st.nextElement().toString());
					Integer id = Integer.parseInt(st.nextElement().toString());
					Double price=Double.parseDouble(st.nextElement().toString());
					String username=st.nextElement().toString();
					
					StringBuilder sb=new StringBuilder();
					sb.append("\nId: " + id);
					sb.append("\nPrice: "+price);
					sb.append("\nUsername: " + username);
					
					System.out.println(sb.toString());
				}
			}
			System.out.println("Done");
		} catch(IOException e){
			e.printStackTrace();
		} finally {
			try{
				if(br != null)
					br.close();
			} catch(IOException ex){
				ex.printStackTrace();
			}
		}
	}

}
