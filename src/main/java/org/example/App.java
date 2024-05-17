package org.example;

import org.example.patternmatching.PatternMatchingSwitch;
import org.example.preview.stringtemplate.StringTemplateDemo;
import org.example.recoredmatching.*;

import java.util.stream.Stream;

/**
 * Hello world!
 */
public class App {
	public static void main(String[] args) {
        System.out.println("================ String template literal demo ================");
		StringTemplateDemo.printModernString();
        System.out.println("\n\n\n");

        System.out.println("================ Pattern Matching Demo ================");
        Stream.of(
				2.0, 2F,
				1, 1L, Short.valueOf("1"), "string").forEachOrdered(PatternMatchingSwitch::patternMatchingDemo);
        System.out.println("\n\n\n");

        System.out.println("================ Record Matching Demo ================");
        Stream.of(new Rectangle(5, 6), new Round(182), new Square(56))
                .forEachOrdered(RecordMatchingDemo::printArea);
        System.out.println("\n\n\n");

    }
}
