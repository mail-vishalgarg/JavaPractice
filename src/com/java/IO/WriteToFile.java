package IO;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class WriteToFile {

	public static void main(String[] args) throws Exception{
		FileOutputStream fout= new FileOutputStream("D://testout.txt");
		BufferedOutputStream bout=new BufferedOutputStream(fout);
		String s="Welcome to the java world!!";
		byte b[] = s.getBytes();
		System.out.println("Value of b:" + b);
		
		bout.write(b);
		bout.flush();
		bout.close();
		fout.close();
		System.out.println("success...");
		
		FileInputStream fin = new FileInputStream("D://testout.txt");
		BufferedInputStream bin = new BufferedInputStream(fin);
		int i;
		while((i=bin.read())!=-1){
			System.out.println((char)i);
		}
		bin.close();
		fin.close();
		System.out.println("File read success...");
	}
}
