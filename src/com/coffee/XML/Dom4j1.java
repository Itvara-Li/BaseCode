package com.coffee.XML;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.DocumentHelper;

public class Dom4j1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String xmlString="<root><people>¡ıŒ∞</people></root>";
try {
	
	
	
	Document document=DocumentHelper.parseText(xmlString);
    
	System.out.println(document.asXML());




} catch (DocumentException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}

	}

}
