package com.oracle.Json;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

import javax.json.Json;
import javax.json.JsonArray;
import javax.json.JsonObject;
import javax.json.JsonReader;
import javax.json.JsonValue;

import com.oracle.Abstract.AbstractTest1;

public abstract class ReadJsonExample extends AbstractTest1 {
	
	private static File jsonInputFile;
	private static InputStream is;
	private static JsonReader reader;
	private static JsonObject empObj;
	public static JsonObject readJson(){
		jsonInputFile = new File("C:\\Users\\vishgarg.ORADEV\\workspace\\VishalJava\\src\\com\\oracle\\Json\\payload.json");
		
		try {
			is = new FileInputStream(jsonInputFile);
			// Create JsonReader from Json.
			reader = Json.createReader(is);
			// Get the JsonObject structure from JsonReader.
			empObj = reader.readObject();
			reader.close();
		}catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return empObj;
	}
	/*public static String getStringValue(String fieldName){
		return readJson().getString(fieldName);
	}
	
	public static int getJsonInt(String fieldName){
		return readJson().getInt(fieldName);
		}
	}*/

	public static String getStringValue(String fieldName) {
		return fieldName;
	}
	
	public static Integer getIntValue(String fieldName){
		return null;
		
	}
}

