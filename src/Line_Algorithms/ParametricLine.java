package Line_Algorithms;

import java.awt.*;

import GraphicsObjects.Point3f;

import static java.lang.Math.round;

public class ParametricLine {

	Point3f Start;
	Point3f End;

	public ParametricLine(Point3f Start, Point3f End) {
		this.Start = Start;
		this.End = End;

	}

	// Implement in Parametric form , and comment what it does 
	public void drawLine(Graphics g) {
		for (double t = 0.0; t <= 1.0; t += 0.001)
		//The width of the pixel point is 1.0
		{
			Point3f point_r = Start.PlusVector ((End.MinusPoint(Start).byScalar((float) t)));
			//point_r = Start + (End - Start * t)
			setPixel(g, round(point_r.x), round(point_r.y));
		}

		// setPixel(g, (int) CurrentPoint.x, (int) CurrentPoint.y);
	 
	}

	// I have implemented this method to adapt Swings coordinate system
	public void setPixel(Graphics g, int x, int y) {
		Color pixelColour = new Color(0,0,0);
		g.setColor(pixelColour);
		//Set the color of the line to black
		g.drawRect(x + 500, 500 - y, 1, 1); // + 500 offset is to make the
											// centre 0,0 at centre of the
											// screen for swing :-)

	}
}
