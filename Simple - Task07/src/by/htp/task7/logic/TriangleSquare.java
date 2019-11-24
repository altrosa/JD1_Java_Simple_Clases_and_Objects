package by.htp.task7.logic;

import by.htp.task7.entity.Triangle;

public class TriangleSquare {
	
	private double square;
	
	private double p;
		
	public double getSquare(Triangle triangle) {
			
		p = (triangle.getSideAB() + triangle.getSideBC() + triangle.getSideAC())/2;
		
		square = Math.sqrt(p * (p - triangle.getSideAB())*(p - triangle.getSideBC())*(p - triangle.getSideAC()));
		
		return square;
	}

}
