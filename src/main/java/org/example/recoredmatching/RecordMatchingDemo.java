package org.example.recoredmatching;

// Apply record matching in switch expression
public class RecordMatchingDemo {

	public static void printArea(Object shape) {
		Number area =  switch (shape) {
			case Rectangle r -> r.area();
			case Square r -> r.area();
			case Round r -> r.area();
			default -> throw new RuntimeException("This is an invalid Shape");
		};

	System.out.println(STR."\"\{((Shape)shape).introduce()}\" has area \{area}");
	}
}
