package com.amitpamecha.factory.demo;

public class XMLParserFactory {

    public XMLParser getParser(String xmlType) {
        if (xmlType == null) {
            return null;
        }
        if (xmlType.equalsIgnoreCase("ERROR")) {
            return new ErrorXMLParser();
        } else if (xmlType.equalsIgnoreCase("FEEDBACK")) {
            return new FeedbackXMLParser();
        } else if (xmlType.equalsIgnoreCase("ORDER")) {
            return new OrderXMLParser();
        }
        return null;
    }
}
