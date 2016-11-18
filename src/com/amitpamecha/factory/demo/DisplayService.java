package com.amitpamecha.factory.demo;

public class DisplayService {

    
    public void display(String xmlType, String xml){
        XMLParserFactory xmlParserFactory = new XMLParserFactory();
        
        XMLParser parser = xmlParserFactory.getParser(xmlType);
        String msg = parser.parse(xml);
        System.out.println(msg);
        }
    
}
