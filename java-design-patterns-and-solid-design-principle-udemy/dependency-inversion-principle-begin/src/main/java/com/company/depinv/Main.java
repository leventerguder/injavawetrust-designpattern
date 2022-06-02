package com.company.depinv;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        Message msg = new Message("This is a message again");
        MessagePrinter printer = new MessagePrinter();
        printer.writeMessage(msg, "test_msg.txt");
    }

}
