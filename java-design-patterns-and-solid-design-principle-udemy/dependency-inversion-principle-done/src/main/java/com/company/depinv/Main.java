package com.company.depinv;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Main {

	public static void main(String[] args) throws IOException {
		
		Message msg = new Message("This is a message again");
		MessagePrinter printer = new MessagePrinter();
		try(PrintWriter writer = new PrintWriter(System.out)) {
			printer.writeMessage(msg, new JSONFormatter(), writer);
		}
	}

}
