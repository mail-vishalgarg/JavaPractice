package IO;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.SequenceInputStream;

public class TwoInputOneOutput {
	public static void main(String[] args) throws IOException {
		FileInputStream fin1=new FileInputStream("C:\\Users\\vishgarg.ORADEV\\workspace\\VishalJava\\src\\IO\\inputfile1.txt");
		FileInputStream fin2=new FileInputStream("C:\\Users\\vishgarg.ORADEV\\workspace\\VishalJava\\src\\IO\\inputfile2.txt");
		FileOutputStream fout = new FileOutputStream("C:\\Users\\vishgarg.ORADEV\\workspace\\VishalJava\\src\\IO\\outputFile.txt");
		SequenceInputStream sis =new SequenceInputStream(fin1,fin2);
		int i;
		while((i=sis.read())!=-1){
			fout.write(i);
		}
		sis.close();
		fout.close();
		fin2.close();
		fin1.close();
	}

}
