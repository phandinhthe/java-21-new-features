package org.example.preview.stringtemplate;

import static java.lang.StringTemplate.STR;

public class StringTemplateDemo {
	// classic way
	public static void printClassicString() {
		String name = "The Phan";
		System.out.println("Hello " + name);
	}

	public static void printModernString() {
		String name = "The Phan";
		String hello = STR."Hello \{name}. This is a demostration for string template in JDK21, it is still in preview.";
		System.out.println(hello);
	}
}
