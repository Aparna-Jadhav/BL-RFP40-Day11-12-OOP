package com.BL_Assignment;

import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class ReadJSONFile {

	public static void main(String[] args) throws IOException, ParseException {
		
		JSONParser jp= new JSONParser();
		
		FileReader reader = new FileReader(".\\JSON_FileRead\\data.json");
		Object obj=jp.parse(reader);
		
		JSONObject JSONObj=(JSONObject)obj; 
		
		JSONArray array = (JSONArray)JSONObj.get("inventoryData");
       
		for (int i=0; i<array.size(); i++)
		{
			JSONObject data = (JSONObject) array.get(i);
		
		String name=(String) data.get("Name");
		String weight=(String) data.get("Weight");
		String price=(String) data.get("Price");
		
		System.out.println("Inventory Data of " +i+ " is : ");
		System.out.println("Name : " +name);
		System.out.println("Weight : " +weight);
		System.out.println("Price : " +price);
		System.out.println();
		
		}
	}

}
