package com.java.Abstract;

import javax.json.JsonObject;

public abstract class AbstractTest1 {
	private static JsonObject empObj;
	abstract JsonObject readJson();
	abstract int getIntValue();
	abstract String getStringValue();
	abstract String[] getArrayValue();
	abstract Object getObjectValue();
}
