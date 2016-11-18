package com.amitpamecha.abstractfactory.demo;

public class TWErrorXMLParser implements XMLParser {

    @Override
    public String parse(String xml) {
        System.out.println("Parsing TW error XML...");
        xml = xml.replaceAll("<error>", "").replaceAll("</error>", "").trim();
        return xml;
    }
}
