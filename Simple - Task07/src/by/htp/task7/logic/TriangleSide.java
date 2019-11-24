package by.htp.task7.logic;

import by.htp.task7.entity.Points;

public class TriangleSide {
	
	private double side;

	public double getSide(Points point1, Points point2) {
		
		side = Math.sqrt( Math.pow(( point1.getX() - point2.getX() ), 2) + Math.pow((point1.getY() - point2.getY()), 2) );
		
		return side;
	}
}
