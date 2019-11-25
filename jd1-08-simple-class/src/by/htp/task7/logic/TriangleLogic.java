package by.htp.task7.logic;

import by.htp.task7.entity.Point;
import by.htp.task7.entity.Triangle;

public class TriangleLogic {
	
	public double perimeter(Triangle triangle) {
		double perimeter;
		double ab;
		double bc;
		double ac;
		int perm1;
		int perm2;
		
		perm1 = triangle.getPointA().getX() - triangle.getPointB().getX();
		perm2 = triangle.getPointA().getY() - triangle.getPointB().getY();
		ab = Math.sqrt(perm1 * perm1 + perm2 * perm2);
		
		perm1 = triangle.getPointB().getX() - triangle.getPointC().getX();
		perm2 = triangle.getPointB().getY() - triangle.getPointC().getY();
		bc = Math.sqrt(perm1 * perm1 + perm2 * perm2);
		
		perm1 = triangle.getPointA().getX() - triangle.getPointC().getX();
		perm2 = triangle.getPointA().getY() - triangle.getPointC().getY();
		ac = Math.sqrt(perm1 * perm1 + perm2 * perm2);
		
		perimeter = ab + bc + ac;
		
		return perimeter;
	}
	
	public double square(Triangle triangle) {
		double square;
		int len1 = triangle.getPointA().getX() - triangle.getPointC().getX();
		int len2 = triangle.getPointB().getX() - triangle.getPointC().getX();
		int len3 = triangle.getPointA().getY() - triangle.getPointC().getY();
		int len4 = triangle.getPointB().getY() - triangle.getPointC().getY();
		
		square = Math.abs(0.5 * (len1 * len4 - len2 * len3));
		
		return square;
	}
	
	public Point intersectionMedians(Triangle triangle) {
		int x;
		int y;
		
		x = (triangle.getPointA().getX() + triangle.getPointB().getX() + triangle.getPointC().getX()) / 3;
		y = (triangle.getPointA().getY() + triangle.getPointB().getY() + triangle.getPointC().getY()) / 3;
		
		return new Point(x, y);
	}

}
