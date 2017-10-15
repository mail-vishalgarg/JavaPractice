package com.oracle.map;

import java.util.HashMap;
import java.util.Map;

public class NestedHashMap {
	public static HashMap<String, String> flattenDictionary(HashMap<String, Object> dict) {
	    HashMap<String, Object> hm = new HashMap<String, Object>();
	    HashMap<String, String> sub_dict=null;
	    for(String i: dict.keySet()){
	      String key = i;
	      HashMap<String, Object> val = (HashMap<String, Object>) dict.get(i);
	      //hm.put(key); // key = Key2
	      if (val instanceof HashMap) {
	          sub_dict = flattenDictionary(val);
	          for(String x: sub_dict.keySet()){
	            String new_key = key + "." + x;
	            String value = sub_dict.get(x);
	            
	            hm.put(new_key, value);
	          }
	      } else {
	        // Moved to here ?
	        hm.put(key, val); 
	      }
	      
	    }
	    return sub_dict;
	  }

	  public static void main(String[] args) {
		/*HashMap<String, Object> test = { "Key1" : "1",
			      		"Key2" : {
            					"a" : "2",
            					"b" : "3",
            					"c" : {
                 					   "d" : "3",
                 					   "e" : "1"
             						 }
         						 }
					};*/
		  
	    HashMap<String, Object> testhm = new HashMap<String, Object>();
	    testhm.put("key1","1");
	    testhm.put("key2", new HashMap<String, Object>().put("a", "2"));
	    		
	   HashMap<String , String> resultDict = flattenDictionary(testhm);
	   for(String k : resultDict.keySet()){
	     System.out.println(k + ":" + resultDict.get(k));
	   }
	    
	  }
}
