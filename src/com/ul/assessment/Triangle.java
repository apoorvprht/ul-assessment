package com.ul.assessment;
import java.io.*;

/**
 * 
 * @author apoorvpurohit
 *
 */
class Triangle {

	// Stores the length of each side of the Triangle object.
	private double side1, side2, side3;
	private String message;

	// Constructor to initialize the sides of the triangle.
	public Triangle(double s1, double s2, double s3) {
		side1 = s1;
		side2 = s2;
		side3 = s3;
	}

	private boolean is_triangle() {
		if (side1 <= 0 || side2 <= 0 || side3 <= 0) {
			this.message = "Invalid Triangle: Sides Length should be more than 0!";
			return false;
		}
		if (side1 + side2 <= side3 || side1 + side3 <= side2 || side2 + side3 <= side1) {
			this.message = "Invalid Triangle: Sum of two sides should be more than third one!";
			return false;
		} else {
			this.message = "Valid Triangle!";
			return true;
		}
	}

	public String getTriangleType() {
		if (this.is_triangle()) {
			if (this.is_isosceles() || this.is_scalene() || this.is_equilateral()) {
				return this.message;
			}
		}
		return this.message;
	}

	// Method to test for a scalene triangle.
	private boolean is_scalene() {
		if ((side1 != side2) && (side1 != side3) && (side2 != side3)) {
			this.message = "Scalene Triangle!";
			return true;
		} else
			return false;
	}

	// Method to test for an isosceles triangle.
	private boolean is_isosceles() {
		if (((side1 == side2) && (side1 != side3)) || ((side1 == side3) && (side1 != side2))
				|| ((side2 == side3) && (side2 != side1))) {
			this.message = "Isoceles Triangle!";
			return true;
		} else
			return false;
	}

	// Method to test for an equilateral triangle.
	private boolean is_equilateral() {
		if ((side1 == side2) && (side1 == side3)) {
			this.message = "Equilateral Triangle!";
			return true;
		} else
			return false;
	}
}