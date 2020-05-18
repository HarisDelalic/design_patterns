package main.java.creational.prototype.models;

public interface CapableDocument extends Cloneable {

    CapableDocument makeCopy() throws CloneNotSupportedException;
}
