package com.amitpamecha.abstractfactory.demo;

public class NWErrorXMLParser implements XMLParser {

    @Override
    public String parse(String xml) {
        System.out.println("Parsing NW error XML...");
        xml = xml.replaceAll("<error>", "").replaceAll("</error>", "").trim();
        return xml;
    }
}
