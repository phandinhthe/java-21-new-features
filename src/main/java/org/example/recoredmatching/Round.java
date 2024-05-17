package org.example.recoredmatching;

public record Round(int diameter) implements Shape {
	@Override
	public Number area() {
		return diameter * Math.toRadians(180.0);
	}
}
