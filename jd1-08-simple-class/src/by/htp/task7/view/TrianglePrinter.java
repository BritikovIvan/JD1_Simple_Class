package by.htp.task7.view;

import by.htp.task7.entity.Triangle;

public class TrianglePrinter {
	
	public void print(Triangle triangle) {
		System.out.print("Triangle: ");
		PointPrinter pointPrinter = new PointPrinter();
		pointPrinter.print(triangle.getPointA());
		pointPrinter.print(triangle.getPointB());
		pointPrinter.print(triangle.getPointC());
	}

}
