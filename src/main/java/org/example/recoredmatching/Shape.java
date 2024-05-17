package org.example.recoredmatching;

public interface Shape {
	Number area();
	default String introduce() {
		return this.getClass().getSimpleName();
	}
}
