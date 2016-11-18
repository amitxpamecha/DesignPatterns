package com.amitpamecha.abstractfactory.demo;

public class NWFeedbackXMLParser implements XMLParser {

    @Override
    public String parse(String xml) {
        System.out.println("Parsing NW feedback XML...");
        xml = xml.replaceAll("<feedback>", "").replaceAll("</feedback>", "").trim();
        return xml;
    }

}
