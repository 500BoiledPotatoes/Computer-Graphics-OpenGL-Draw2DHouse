package Line_Algorithms;

import java.awt.Color;
import java.awt.Graphics;

import GraphicsObjects.Point3f;
import GraphicsObjects.Vector3f;

import static java.lang.Math.abs;

public class ImplicitLine {

	Point3f Start;
	Point3f End;

	public ImplicitLine(Point3f Start, Point3f End) {
		this.Start = Start;
		this.End = End;

	}

	// Implement in Explict form , Extra marks for reducing the search space
	// before you draw the line , and comment what the method does 
	public void drawLine(Graphics g) {
		float xMin = Start.x;
		float xMax = End.x;
		float yMin = Start.y;
		float yMax = End.y;

		/** Discussion in four categories
		 * xMin <= xMax && yMin <= yMax
		 * xMax <= xMin && yMin <= yMax
		 * xMax <= xMin && yMax <= yMin
		 * xMin <= xMax && yMax <= yMin
		 */

		if (xMin <= xMax && yMin <= yMax){
			for (float x = xMin; x <= xMax; x++)
				for (float y = yMin; y <= yMax; y++){
					//Traverse the coordinates from the starting point to the end point, connecting one point to another to form a line
					if (abs(Distance(new Point3f(x, y, 0), Start, End)) < 1.0) {
						//To make the lines thicker, I set the width of the pixel points to 1.0
						setPixel(g, (int) x, (int) y);
					}
				}

		}else if (xMax <= xMin && yMin <= yMax){
			for (float x = xMax; x <= xMin; x++)
				for (float y = yMin; y <= yMax; y++)
					//Traverse the coordinates from the starting point to the end point, connecting one point to another to form a line
					if (abs(Distance(new Point3f(x, y, 0), Start, End)) < 1.0){
						//To make the lines thicker, I set the width of the pixel points to 1.0
						setPixel(g, (int) x, (int) y);
					}

		}
		else if (xMax <= xMin && yMax <= yMin){
			for (float x = xMax; x <= xMin; x++)
				for (float y = yMax; y <= yMin; y++)
					//Traverse the coordinates from the starting point to the end point, connecting one point to another to form a line
					if (abs(Distance(new Point3f(x, y, 0), Start, End)) < 1.0){
						//To make the lines thicker, I set the width of the pixel points to 1.0
						setPixel(g, (int) x, (int) y);
					}

		}
		else if (xMin <= xMax && yMax <= yMin){
			for (float x = xMin; x <= xMax; x++)
				for (float y = yMax; y <= yMin; y++)
					//Traverse the coordinates from the starting point to the end point, connecting one point to another to form a line
					if (abs(Distance(new Point3f(x, y, 0), Start, End)) < 1.0){
						//To make the lines thicker, I set the width of the pixel points to 1.0
						setPixel(g, (int) x, (int) y);
					}

		}


	}

	 
	//implement Distance formulas using your notes , and comment what the method does
	public float Distance(Point3f Check, Point3f Beginning, Point3f End) {

		float k = (End.y - Beginning.y)/( End.x - Beginning.x);
		/**
		 * The formula for finding the slope is
		 *       k =  y1 - y2 / x1 - x2
		 */
		float b = Beginning.y - k * Beginning.x;
		/**
		 *  The equation to find the displacement is
		 *       b = y - k * x
		 */
		float distance = (float) ( (k * Check.x - Check.y + b) / Math.sqrt(1 + k*k));
		/**
		 *  The formula for finding the distance from a point to a line is
		 *   d = k * x0 - y0 / sqrt(1 + k*k))
		 */
		return distance;
	}

	// I have implemented this method to adapt Swings coordinate system
	public void setPixel(Graphics g, int x, int y) {
		g.drawRect(x + 500, 500 - y, 1, 1); // + 500 offset is to make the
											// centre 0,0 at centre of the
											// screen

	}

}
