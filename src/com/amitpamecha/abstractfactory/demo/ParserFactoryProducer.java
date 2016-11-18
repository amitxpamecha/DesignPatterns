package com.amitpamecha.abstractfactory.demo;

public class ParserFactoryProducer {

    private ParserFactoryProducer() {
        throw new AssertionError();
    }

    public static AbstractParserFactory getFactory(String factoryType) {
        switch (factoryType) {
            case "NWFactory":
                return new NWXMLParserFactory();
            case "TWFactory":
                return new TWXMLParserFactory();
        }
        return null;
    }

}
