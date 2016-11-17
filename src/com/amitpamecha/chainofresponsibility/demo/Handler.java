package com.amitpamecha.chainofresponsibility.demo;

public interface Handler {

    public void setHandler(Handler handler);

    public void process(File file);

    public String getHandlerName();

}
