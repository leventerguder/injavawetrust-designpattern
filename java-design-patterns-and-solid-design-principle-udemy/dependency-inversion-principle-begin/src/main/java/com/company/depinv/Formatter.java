package com.company.depinv;

//Common interface for classes formatting Message object
public interface Formatter {

    public String format(Message message) throws FormatException;

}
