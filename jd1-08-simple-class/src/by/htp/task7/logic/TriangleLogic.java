package by.htp.task7.logic;

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

}
