package com.amitpamecha.prototype.demo;

public interface Prototype extends Cloneable {
    public AccessControl clone() throws CloneNotSupportedException;
}
