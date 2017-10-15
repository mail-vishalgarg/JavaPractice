package com.oracle.IO;

public class GetProperty {
	public static void main(String[] args) {
		String password = PropertyUtils.getProperty("dbpassword");
		String username= PropertyUtils.getProperty("dbuser");
		String databases= PropertyUtils.getProperty("database");
		
		System.out.println(password);
		System.out.println(username);
		System.out.println(databases);
		System.out.println("\n");
		
		//set the properties into the config.properties file
		PropertyUtils.setProperty("hostname", "localhost");
		PropertyUtils.setProperty("url", "http://www.google.com");
		
		System.out.println(PropertyUtils.getProperty("hostname"));
		System.out.println(PropertyUtils.getProperty("url"));
	}

}
