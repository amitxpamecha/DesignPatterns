package com.amitpamecha.factory.demo;

public class TestFacotryPattern {

    public static void main(String args[]) {

        String xml = "<error> error message </error>";
        DisplayService displayService = new DisplayService();
        displayService.display("ERROR",xml);
        
        xml = "<feedback> feedback message </feedback>";
        displayService = new DisplayService();
        displayService.display("FEEDBACK",xml);
        
        xml = "<order> order request </order>";
        displayService = new DisplayService();
        displayService.display("ORDER",xml);
        
    }
}
