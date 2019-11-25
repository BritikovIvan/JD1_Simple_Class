package by.htp.task7.main;

import by.htp.task7.entity.Point;
import by.htp.task7.entity.Triangle;
import by.htp.task7.logic.TriangleLogic;
import by.htp.task7.view.PointPrinter;

public class Main {

	public static void main(String[] args) {
		Point pointA = new Point(2, 1);
		Point pointB = new Point(3, 4);
		Point pointC = new Point(1, 6);
		
		Triangle triangle = new Triangle(pointA, pointB, pointC);
		
		TriangleLogic logic = new TriangleLogic();
		double perimeter = logic.perimeter(triangle);
		System.out.println("Perimeter = " + perimeter);
		
		double square = logic.square(triangle);
		System.out.println("Square = " + square);
		
		PointPrinter pointPrinter = new PointPrinter();
		System.out.println("Intersection of medians: ");
		pointPrinter.print(logic.intersectionMedians(triangle));

	}

}
