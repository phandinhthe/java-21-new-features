package org.example.recoredmatching;

public record Square(int edge) implements Shape {
	@Override
	public Number area() {
		return edge * edge;
	}
}
