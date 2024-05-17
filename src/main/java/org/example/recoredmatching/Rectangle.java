package org.example.recoredmatching;

public record Rectangle(int length, int width) implements Shape {
	@Override
	public Number area() {
		return length * width;
	}
}
