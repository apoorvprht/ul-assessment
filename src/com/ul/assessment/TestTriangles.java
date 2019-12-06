package com.ul.assessment;
import org.junit.Test;


public class TestTriangles {

	@Test
	public void test() {
		Double[][] sideArray = new Double[][]{
			{10.0, 10.0, 10.0},
			{2.3, 3.1, 4.6},
			{1.4, 1.4, 2.7},
			{0.0, 0.3, 1.3},
			{1.0, 1.0, 3.0},
			{-1.0, 1.0, 3.0}
		};
		
		for(int i= 0; i< sideArray.length; i++){
			Triangle t = new Triangle(sideArray[i][0], sideArray[i][1], sideArray[i][2]);
			System.out.println("Triangle-"+(i+1)+" => "+t.getTriangleType());			
		}
	}

}
