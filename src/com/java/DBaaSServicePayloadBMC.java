package com.oracle.dbaas.framework.payload;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import javax.json.Json;
import javax.json.JsonArray;
import javax.json.JsonObject;
import javax.json.JsonReader;

public class DBaaSServicePayloadBMC {
	public static final String SKELETON_FILE_NAME = System.getProperty("dbaas.payload", System.getProperty("jaas.root") + "/dbaas/config/sample-dbaas.json");
	
	JsonReader reader;
	public DBaaSServicePayloadBMC() throws IOException {
		File jsonInputFile = new File(SKELETON_FILE_NAME);
		InputStream is = new FileInputStream(jsonInputFile);
		reader = Json.createReader(is);
	}
	public String getStandByPrameter(String fieldName){
		String fieldValue;
		//is = new FileInputStream(jsonInputFile);
		//JsonReader reader = Json.createReader(is);
		JsonObject payloadObj = reader.readObject();
		reader.close();
		JsonArray standbyArray= payloadObj.getJsonArray("standbys");
		fieldValue = standbyArray.getJsonObject(0).get("fieldName").toString();
		return fieldValue;
		
	}

}
