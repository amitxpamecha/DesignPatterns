package com.amitpamecha.abstractfactory.demo;

public class NWOrderXMLParser implements XMLParser {

    @Override
    public String parse(String xml) {
        System.out.println("Parsing NW order XML...");
        xml = xml.replaceAll("<order>", "").replaceAll("</order>", "").trim();
        return xml;
    }

}
