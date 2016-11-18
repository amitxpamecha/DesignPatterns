package com.amitpamecha.abstractfactory.demo;

public class TWFeedbackXMLParser implements XMLParser {

    @Override
    public String parse(String xml) {
        System.out.println("Parsing TW feedback XML...");
        xml = xml.replaceAll("<feedback>", "").replaceAll("</feedback>", "").trim();
        return xml;
    }

}
