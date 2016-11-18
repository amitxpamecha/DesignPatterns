package com.amitpamecha.abstractfactory.demo;

import com.amitpamecha.factory.demo.ErrorXMLParser;
import com.amitpamecha.factory.demo.FeedbackXMLParser;
import com.amitpamecha.factory.demo.OrderXMLParser;

public class NWXMLParserFactory implements AbstractParserFactory{

    @Override
    public XMLParser getParser(String xmlType) {
        if (xmlType == null) {
            return null;
        }
        if (xmlType.equalsIgnoreCase("ERROR")) {
            return new NWErrorXMLParser();
        } else if (xmlType.equalsIgnoreCase("FEEDBACK")) {
            return new NWFeedbackXMLParser();
        } else if (xmlType.equalsIgnoreCase("ORDER")) {
            return new NWOrderXMLParser();
        }
        return null;
    }

}
