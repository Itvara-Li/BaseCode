package com.coffee.JSON;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

public class CJSON {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
      JsonObject object=new JsonObject();
      object.addProperty("cat", "it");
      
      JsonArray array=new JsonArray();
      
      JsonObject lan1=new JsonObject();
     lan1.addProperty("id", 1);
     lan1.addProperty("name", "java");
     lan1.addProperty("ide", "eclipse");
     array.add(lan1);
     
     JsonObject lan2=new JsonObject();
     lan2.addProperty("id", 2);
     lan2.addProperty("name", "liu");
     lan2.addProperty("ide", "xxx");
     array.add(lan2);
     
     JsonObject lan3=new JsonObject();
     lan3.addProperty("id", 3);
     lan3.addProperty("name", "wei");
     lan3.addProperty("ide", "haha");
     array.add(lan3);
     
     object.add("languages", array);
     object.addProperty("pop", true);
     
     System.out.println(object.toString());
     File file=new File("liu.json");
     try {
		FileUtils.writeStringToFile(file, object.toString(), "UTF-8");
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}

}
