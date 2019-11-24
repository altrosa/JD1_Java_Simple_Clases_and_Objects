package by.htp.task7.main;

import by.htp.task7.entity.Points;
import by.htp.task7.entity.Triangle;
import by.htp.task7.logic.TrianglePerimeter;
import by.htp.task7.logic.TriangleSide;
import by.htp.task7.logic.TriangleSquare;
import by.htp.task7.view.TriangleView;

public class Main {

	public static void main(String[] args) {
	
		Points pointA = new Points(2, -5);
		Points pointB = new Points(-6, 1);
		Points pointC = new Points(6, -2);
		
		
		Triangle triangle = new Triangle();
		TriangleSide side = new TriangleSide();
		
		triangle.setSideAB(side.getSide(pointA, pointB));
		triangle.setSideBC(side.getSide(pointA, pointC));
		triangle.setSideAC(side.getSide(pointB, pointC));
				
		
		TriangleView print = new TriangleView();
		TriangleSquare square = new TriangleSquare();
		TrianglePerimeter perimeter = new TrianglePerimeter();
		
		print.viewSquare(square.getSquare(triangle));
		print.viewPerimeter(perimeter.getPerimeter(triangle));
		
	}
}
