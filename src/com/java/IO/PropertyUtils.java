package com.oracle.IO;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

public class PropertyUtils {
	static Properties prop = new Properties();
	static InputStream input = null;
	static OutputStream output = null;
	private static final String FILENAME="C:\\Users\\vishgarg.ORADEV\\workspace\\VishalJava\\src\\com\\oracle\\IO\\config.properties";
	public static String getProperty(String propname) {
		try{
			input = new FileInputStream(FILENAME);
			//load a property file
			prop.load(input);

		}catch (IOException e){
			e.printStackTrace();
		}finally {
			if (input != null) {
				try {
					input.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		return prop.getProperty(propname);
	}
	
	public static void setProperty(String propName, String propValue){
		try{
			output = new FileOutputStream(FILENAME);
			prop.setProperty(propName, propValue);
		}catch (IOException e){
			e.printStackTrace();
		}finally {
			if(output != null){
				try{
					output.close();
				}catch (IOException e){
					e.printStackTrace();
				}
			}
		}
	}

}
