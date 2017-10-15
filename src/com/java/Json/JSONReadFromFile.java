package com.oracle.Json;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.StringWriter;
import java.util.Collections;

import javax.json.Json;
import javax.json.JsonArray;
import javax.json.JsonObject;
import javax.json.JsonReader;
import javax.json.JsonValue;
import javax.json.JsonWriter;
import javax.json.JsonWriterFactory;
import javax.json.stream.JsonGenerator;

public class JSONReadFromFile {

	public static void main(String[] args) throws IOException {
		        InputStream fis = new FileInputStream("C:\\Users\\vishgarg.ORADEV\\workspace\\VishalJava\\src\\com\\oracle\\Json\\file1.json");

		        JsonReader reader = Json.createReader(fis);

		        JsonObject personObject = reader.readObject();

		        reader.close();
		        System.out.println(personObject);
		        
		        StringWriter string = new StringWriter();
		        JsonWriterFactory writerFactory = Json.createWriterFactory(Collections.singletonMap(
		                        JsonGenerator.PRETTY_PRINTING, null));
		        try (JsonWriter writer = writerFactory.createWriter(string)) {
		            writer.write(personObject);
		        }
		        System.out.println(string.toString());

		        System.out.println("Name   : " + personObject.getString("name"));
		        System.out.println("Age    : " + personObject.getInt("age"));
		        System.out.println("Married: " + personObject.getBoolean("isMarried"));

		        JsonObject addressObject = personObject.getJsonObject("address").getJsonObject("DB");
		        System.out.println("Address: ");
		        System.out.println("STREET:" + addressObject.getString("street"));
		        System.out.println("ZIP:"+addressObject.getString("zipCode"));

		        System.out.println("Phone  : ");
		        JsonArray phoneNumbersArray = personObject.getJsonArray("phoneNumbers");

		        for (JsonValue jsonValue : phoneNumbersArray) {
		            System.out.println(jsonValue.toString());
		        }
		    }
}
