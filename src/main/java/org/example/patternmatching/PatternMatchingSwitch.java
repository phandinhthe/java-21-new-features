package org.example.patternmatching;

public class PatternMatchingSwitch {

	// This is the enhancement from instanceOf pattern matching from java 17.
	public static void patternMatchingDemo(Object input) {
		switch (input) {
			case Long l -> System.out.println(STR."\{l} this is \{l.getClass().getSimpleName()}");
			case Float l -> System.out.println(STR."\{l} this is \{l.getClass().getSimpleName()}");
			case Short l -> System.out.println(STR."\{l} this is \{l.getClass().getSimpleName()}");
			case Integer l -> System.out.println(STR."\{l} this is \{l.getClass().getSimpleName()}");
			case Double l -> System.out.println(STR."\{l} this is \{l.getClass().getSimpleName()}");

			default -> System.out.println(STR."\"\{input.toString()}\" this is not a Number type");
		}
	}
}
