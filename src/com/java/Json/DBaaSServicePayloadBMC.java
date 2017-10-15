package com.oracle.Json;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import javax.json.Json;
import javax.json.JsonArray;
import javax.json.JsonObject;
import javax.json.JsonReader;

//import com.oracle.dbaas.framework.payload.MetadataDBPayload;

public class DBaaSServicePayloadBMC {
	//public static final String SKELETON_FILE_NAME = System.getProperty("dbaas.payload", System.getProperty("jaas.root") + "/dbaas/config/sample-dbaas.json");
	public static final String SKELETON_FILE_NAME = "C:\\Users\\vishgarg.ORADEV\\Git\\qa141-metadata1741\\jcs\\weblogic\\test\\qa\\dbaas\\config\\sample-dbaas-metadata.json";
	private static DBaaSServicePayloadBMC instance = null;
	private JsonReader reader;
	private JsonObject payloadObj = null;
	
	private DBaaSServicePayloadBMC(){
		try{
			File jsonInputFile = new File(SKELETON_FILE_NAME);
			InputStream is = new FileInputStream(jsonInputFile);
			reader = Json.createReader(is);
			payloadObj = reader.readObject();
			reader.close();
		}catch (IOException e){
			e.printStackTrace();
		}
	}
	
	public static DBaaSServicePayloadBMC getBmcInstance(){
		if (instance == null)
			instance = new DBaaSServicePayloadBMC();
			return instance;
	}
	
	public String getComponent(String fieldName){
		JsonObject componentObj= this.payloadObj.getJsonObject("components").getJsonObject("DB");
		String fieldValue = componentObj.getString(fieldName);
		//fieldValue = fieldValue.replace("\"","");
		return fieldValue;
	}
	
	public String getValue(String fieldName){
		String fieldValue = this.payloadObj.getString(fieldName).toString();
		return fieldValue;
	}
	
	public static void main(String[] args){
		instance = DBaaSServicePayloadBMC.getBmcInstance();
		String sid = instance.getComponent("sid");
		System.out.println("SSSSSSSS:" + sid);
		
		String shape = instance.getComponent("shape");
		System.out.println("LLLLLLL:" + shape);
		String serviceName = instance.getValue("serviceName");
		System.out.println("CCCCCCC:" + serviceName);
		
		String edition = instance.getValue("edition");
		System.out.println("DDDDD:" + edition);
		
		String serviceLevel = instance.getValue("serviceLevel");
		System.out.println("FFFFFF: "+serviceLevel);
	}
	

}
