package com.amitpamecha.abstractfactory.demo;

public class TWOrderXMLParser implements XMLParser {

    @Override
    public String parse(String xml) {
        System.out.println("Parsing TW order XML...");
        xml = xml.replaceAll("<order>", "").replaceAll("</order>", "").trim();
        return xml;
    }

}
