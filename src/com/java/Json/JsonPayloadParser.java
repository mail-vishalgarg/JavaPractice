package com.oracle.Json;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

import javax.json.Json;
import javax.json.JsonArray;
import javax.json.JsonObject;
import javax.json.JsonReader;
import javax.json.JsonValue;

public class JsonPayloadParser {
	
	public static void main(String[] args) throws IOException {
		File jsonInputFile = new File("C:\\Users\\vishgarg.ORADEV\\workspace\\VishalJava\\src\\com\\oracle\\Json\\payload.json");
        InputStream is;
        try {
            is = new FileInputStream(jsonInputFile);
            JsonReader reader = Json.createReader(is);
            // Get the JsonObject structure from JsonReader.
            JsonObject empObj = reader.readObject();
            reader.close();
            // read string data
            System.out.println("Emp Name: " + empObj.getString("emp_name"));
            // read integer data
            System.out.println("Emp Id: " + empObj.getInt("emp_id"));
            // read inner json element
/*            JsonObject addrObj = empObj.getJsonObject("address");
            System.out.println("City: " + addrObj.getString("city"));*/
            JsonArray reportArray= empObj.getJsonArray("direct_reports");
            JsonValue report = reportArray.getJsonObject(0).get("Nataraj");
            System.out.println("RRR:" + report);
            
            JsonArray empArray = empObj.getJsonArray("address");
            System.out.println("AAAA:" + empArray);
            
            String street = empArray.getJsonObject(0).get("street").toString();
            System.out.println("Street: " + street);
            
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
	
}
