package by.htp.task7.logic;

import by.htp.task7.entity.Triangle;

public class TrianglePerimeter {
	
	private double P;
	
	public double getPerimeter(Triangle triangle) {
		
		P = triangle.getSideAB() + triangle.getSideAC() + triangle.getSideBC();
		
		return P;
	}

}
