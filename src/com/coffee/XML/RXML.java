package com.coffee.XML;

import java.io.File;
import java.io.IOException;

import javax.swing.text.Document;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.*;
import org.xml.sax.SAXException;
public class RXML {

	public static void main(String[] args) {
  try {
	  
	  //dom
	  DocumentBuilderFactory factory=DocumentBuilderFactory.newInstance();
	DocumentBuilder builder=factory.newDocumentBuilder();
	org.w3c.dom.Document document=	builder.parse(new File("newxml.xml"));
   Element root=document.getDocumentElement();
   System.out.println("cat="+root.getAttribute("cat"));
   NodeList list=root.getElementsByTagName("lan");
   for (int i = 0; i < list.getLength(); i++) {
	Element lan=(Element) list.item(i);
	System.out.println("--------------");
	System.out.println("id="+lan.getAttribute("id"));
	
//	Element name=(Element) lan.getElementsByTagName("name").item(0);
//	System.out.println("name"+name.getTextContent());
NodeList clList=lan.getChildNodes();
for (int j = 0; j < clList.getLength(); j++) {
	Element c=(Element) clList.item(j);
	if (c instanceof Element) {
		System.out.println(c.getTagName()+"="+c.getTextContent());
	}
	
}
}
  
  
  
  
  
  
  
  } catch (ParserConfigurationException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
} catch (SAXException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
} catch (IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
	}

}
