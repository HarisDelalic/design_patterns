package main.java.creational.prototype.models;

public class TermsConditionDocument implements CapableDocument {

    @Override
    public CapableDocument makeCopy() throws CloneNotSupportedException {
        return (CapableDocument) super.clone();
    }
}
