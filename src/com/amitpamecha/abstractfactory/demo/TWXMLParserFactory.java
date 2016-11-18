package com.amitpamecha.abstractfactory.demo;

public class TWXMLParserFactory implements AbstractParserFactory{

    @Override
    public XMLParser getParser(String xmlType) {
        if (xmlType == null) {
            return null;
        }
        if (xmlType.equalsIgnoreCase("ERROR")) {
            return new TWErrorXMLParser();
        } else if (xmlType.equalsIgnoreCase("FEEDBACK")) {
            return new TWFeedbackXMLParser();
        } else if (xmlType.equalsIgnoreCase("ORDER")) {
            return new TWOrderXMLParser();
        }
        return null;
    }

}
