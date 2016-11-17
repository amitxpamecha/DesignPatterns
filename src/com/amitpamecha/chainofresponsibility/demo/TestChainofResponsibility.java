package com.amitpamecha.chainofresponsibility.demo;

public class TestChainofResponsibility {

    public static void main(String[] args) {
        File file = null;
        Handler textHandler = new TextFileHandler("Text Handler");
        Handler docHandler = new DocFileHandler("Doc Handler");
        Handler audioHandler = new AudioFileHandler("Audio Handler");
        textHandler.setHandler(docHandler);
        docHandler.setHandler(audioHandler);
        file = new File("Abc.mp3", "audio", "C:");
        textHandler.process(file);
        System.out.println("************************************");
        file = new File("Abc.txt", "text", "C:");
        textHandler.process(file);
        System.out.println("************************************");
        file = new File("Abc.doc", "doc", "C:");
        textHandler.process(file);
        System.out.println("************************************");
        file = new File("Abc.bat", "bat", "C:");
        textHandler.process(file);
        System.out.println("************************************");
    }
}
