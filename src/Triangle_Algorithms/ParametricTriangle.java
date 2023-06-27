package Triangle_Algorithms;

import java.awt.Color;
import java.awt.Graphics;

import GraphicsObjects.Point3f;
import GraphicsObjects.Vector3f;

import static java.lang.Math.abs;

public class ParametricTriangle {

	Point3f A;
	Point3f B;
	Point3f C;
	float R;
	float G;
	float D;


	public ParametricTriangle(Point3f a, Point3f b, Point3f c, float r, float g, float d) {
		A = a;
		B = b;
		C = c;
		R = r;
		G = g;
		D = d;

	}
	 

	// Implement in Parametric form ,and comment what it does 
	public void drawTriangle(Graphics g) {
		float xMin = Math.min(Math.min(A.x, B.x), C.x);
		//Find the smallest x-coordinate of the three points
		float xMax = Math.max(Math.max(A.x, B.x), C.x);
		//Find the x-coordinate of the largest of the three points
		float yMin = Math.min(Math.min(A.y, B.y), C.y);
		//Find the y-coordinate of the smallest of the three points
		float yMax = Math.max(Math.max(A.y, B.y), C.y);
		//Find the y-coordinate of the largest of the three points
		float alpha = 0.0f;
		float gamma = 0.0f;
		float beta = 0.0f;
		float x;
		float y = 0;
		for (x = xMin; x < xMax; x++) {
			for (y = yMin; y < yMax; y++) {
				alpha = Distance(new Point3f(x, y, 0), B, C) / Distance(A, B, C);
				// alpha = dist(P, CB)/dist(A, CB)

				gamma = Distance(new Point3f(x, y, 0), A, B) / Distance(C, A, B);
				// gamma = dist(P, AC)/dist(B, AC)

				beta = 1 - alpha - gamma;
				// alpha + beta + gamma = 1
				if ((alpha < 0.0) || (beta < 0.0) || (gamma < 0.0)) {
					//If alpha, beta, gamma are less than 0, then continue traversing
					continue;
				}
				else{
					//Otherwise, draw the triangle
					setPixel(g, (int) x, (int) y, (int) R, (int) G, (int) D);
				}
			}
		}




	}

	//I have implemented this method to adapt Swings coordinate system 
	public void setPixel(Graphics g, int x, int y, int R, int G, int B) {
		//Set the color according to the input r, g, b value
		Color pixelColour = new Color(R, G, B);
		g.setColor(pixelColour);
		g.drawRect(x + 500, 500 - y, 1, 1); // + 500 offset is to make the
											// centre 0,0 at centre of the
											// screen

	}

	//Implement the distance ,  you may use your previous Distance formulas and comment what it does 
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
		float distance = (float) ((k * Check.x - Check.y + b) / Math.sqrt(1 + k*k));
		/**
		 *  The formula for finding the distance from a point to a line is
		 *   d = k * x0 - y0 / sqrt(1 + k*k))
		 */

		return distance;
	}

}
