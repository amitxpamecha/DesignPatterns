package com.amitpamecha.abstractfactory.demo;

public interface AbstractParserFactory {

    public XMLParser getParser(String parserType);
}
