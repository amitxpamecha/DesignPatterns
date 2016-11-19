package com.amitpamecha.template.demo;

public class MySqLCSVCon extends ConnectionTemplate {
    @Override
    public void setDBDriver() {
        System.out.println("Setting MySQL DB drivers...");
    }

    @Override
    public void setCredentials() {
        System.out.println("Setting credentials for MySQL DB...");
    }

    @Override
    public void setData() {
        System.out.println("Setting up data from csv file....");
    }

    //hook method is overriden and logging is disabled
    @Override
    public boolean disableLogging() {
        return false;
    }

}
