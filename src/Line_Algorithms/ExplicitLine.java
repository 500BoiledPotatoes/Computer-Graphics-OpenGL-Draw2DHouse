package Line_Algorithms;

import java.awt.Color;
import java.awt.Graphics;

import GraphicsObjects.Point3f;

public class ExplicitLine {
	
	Point3f Start;
	Point3f End;
	float slope; 
	 
	public ExplicitLine(Point3f Start, Point3f End) { 
		this.Start = Start;
		this.End = End;
		slope = getSlope(); // you need to implement this before the class will compile 
	}
	
	// Implement and comment what the method does
	public float getSlope() {
		float y1 = End.y;
		float y0 = Start.y;
		float x1 = End.x;
		float x0 = Start.x;
		float k = 0.0f;

		float rise = y1 - y0;
		//rise is the difference between the y-coordinates of the starting and ending points
		float run = x1 - x0;
		//run is the difference between the x-coordinates of the starting and ending points
		if (run > 0) {
			if (rise > 0){
				//rise and run are both positive
				if (run > rise) {
					//when rise > run
					k = (rise / run);
					//rise / run is the slope
				} else {
					//when rise < run
					k = (run / rise);
					//run / rise is the slope
				}
			}
			else{
				//rise and run are both 0 or negative
				if (run > -rise) {
					//when rise > run
					k = (rise / run);
					//rise / run is the slope
				} else {
					//when rise < run
					k = (run / rise);
					//run / rise is the slope
				}
			}
		}
		slope = k;
		return k;
		//Return Slope
	}
	
	// Implement in Explicit form, and comment what the method does
	public void drawLine(Graphics g)
	{
		float y1 = End.y;
		float y0 = Start.y;
		float x1 = End.x;
		float x0 = Start.x;
		int x;
		int y;

		float c = y0 - x0 * getSlope();
		float b = x0 - y0 * getSlope();
		//Bring the starting point into the function expression to find the displacement
		float rise = y1 - y0;
		float run = x1 - x0;
		//The same method as for the slope is used for the classification discussion
		if (run > 0)
			if (rise > 0)
				if (run > rise)
					for (x = (int) x0; x < x1; x++) {
						y = (int) (getSlope() * x + c);
						setPixel(g, x, y); }
				else
					for (y = (int) y0; y < y1; y++) {
						x = (int) (getSlope() * y +  b);
						setPixel(g, x, y); }
			else
			if (run > -rise)
				for (x = (int) x0; x < x1; x++) {
					y = (int) (getSlope() * x +  c);
					setPixel(g, x, y); }
			else
				for (y = (int) y0; y < y1; y++) {
					x = (int) (getSlope() * y +  b);
					setPixel(g, x, y); }
	}
	
	//I have implemented this method to adapt Swings coordinate system 
	public void setPixel(Graphics g,int x,int y)  
	{
		g.drawRect(x+500, 500-y, 1,1);  // + 500 offset is to make the centre 0,0 at centre of the screen 
		  
	}

}
