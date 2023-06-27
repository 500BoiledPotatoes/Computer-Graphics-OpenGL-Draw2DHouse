import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

import GraphicsObjects.Point3f;
import Line_Algorithms.ExplicitLine;
import Line_Algorithms.ImplicitLine;
import Line_Algorithms.ParametricLine;
import Triangle_Algorithms.ParametricTriangle;

/*
 * 
 * This class to test your work and for you to make lines to draw your house , it will not compile till all the methods are complete in the other classes 
 * 
 */
public class Drawing2D extends JPanel {

	public Drawing2D() // set up graphics window
	{
		Color pixelColour = new Color(223,206,161);
		setBackground(pixelColour);

	}

	public void paintComponent(Graphics g) // draw graphics in the panel
	{
		int width = getWidth(); // width of window in pixels
		int height = getHeight(); // height of window in pixels

		// as swing starts at 0 , 0 , will need to modify drawing

		super.paintComponent(g); // call superclass to make panel display
									// correctly

		g.setColor(Color.BLACK);
		
		//line test code 
		
//		ExplicitLine FirstLine = new ExplicitLine(new Point3f(0, 0, 0), new Point3f(200, 100, 0));
//		ImplicitLine SecondLine = new ImplicitLine(new Point3f(0, 0, 0), new Point3f(200, 200, 0)); // 200
//		ParametricLine ThirdLine = new ParametricLine(new Point3f(0, 0, 0), new Point3f(75, 200, 0));
//
//		FirstLine.drawLine(g);
//		SecondLine.drawLine(g);
//		ThirdLine.drawLine(g);
		
		// Remove the comments for Explicit line and test it ,

//		ExplicitLine FirstLine = new ExplicitLine(new Point3f(0, 0, 0), new Point3f(200, 100, 0));
//		ExplicitLine SecondLine = new ExplicitLine(new Point3f(0, 0, 0), new Point3f(200, 200, 0)); // 200
//		ExplicitLine ThirdLine = new ExplicitLine(new Point3f(0, 0, 0), new Point3f(75, 200, 0));
//		ExplicitLine FourthLine = new ExplicitLine(new Point3f(0, 0, 0), new Point3f(25, 200, 0));

//		FirstLine.drawLine(g);
//		SecondLine.drawLine(g);
//		ThirdLine.drawLine(g);
//		FourthLine.drawLine(g);

		// */

		// Remove the comments for Implicit line and test it

//		ImplicitLine FirstLine = new ImplicitLine(new Point3f(0, 0, 0), new Point3f(200, 100, 0));
//		ImplicitLine SecondLine = new ImplicitLine(new Point3f(0, 0, 0), new Point3f(200, 200, 0));
//		ImplicitLine ThirdLine = new ImplicitLine(new Point3f(0, 0, 0), new Point3f(75, 200, 0));
//		ImplicitLine FourthLine = new ImplicitLine(new Point3f(0, 0, 0), new Point3f(25, 200, 0));
//
//		FirstLine.drawLine(g);
//		SecondLine.drawLine(g);
//		ThirdLine.drawLine(g);
//		FourthLine.drawLine(g);

		// Remove the comments for Parametric line and test it
//		ParametricLine FirstLine = new ParametricLine(new Point3f(0, 0, 0), new Point3f(200, 100, 0));
//		ParametricLine SecondLine = new ParametricLine(new Point3f(0, 0, 0), new Point3f(200, 200, 0));
//		ParametricLine ThirdLine = new ParametricLine(new Point3f(0, 0, 0), new Point3f(75, 200, 0));
//		ParametricLine FourthLine = new ParametricLine(new Point3f(0, 0, 0), new Point3f(25, 200, 0));
//
//		FirstLine.drawLine(g);
//		SecondLine.drawLine(g);
//		ThirdLine.drawLine(g);
//		FourthLine.drawLine(g);
		// */

		// Remove the comments for an example of square using Parametric lines

//		ParametricLine FirstLine = new ParametricLine(new Point3f(0, 0, 0), new Point3f(0, 300, 0));
//		ParametricLine SecondLine = new ParametricLine(new Point3f(0, 300, 0), new Point3f(300, 300, 0));
//		ParametricLine ThirdLine = new ParametricLine(new Point3f(300, 300, 0), new Point3f(300, 0, 0));
//		ParametricLine FourthLine = new ParametricLine(new Point3f(300, 0, 0), new Point3f(0, 0, 0));
//
//		FirstLine.drawLine(g);
//		SecondLine.drawLine(g);
//		ThirdLine.drawLine(g);
//		FourthLine.drawLine(g);
		// */

		//Draw house walls

		ParametricTriangle triangle12 = new ParametricTriangle(new Point3f(0, -10, 0),  new Point3f(435, -65, 0),
				new Point3f(435, 117, 0),169,169,169);
		ParametricTriangle triangle14 = new ParametricTriangle(new Point3f(5,170, 0), new Point3f(0, -10, 0),
				new Point3f(450, 125, 0),169,169,169);
		ParametricTriangle MyFirstTriangle = new ParametricTriangle(new Point3f(-350, 0, 0), new Point3f(-100,-50, 0),
				new Point3f(-90, 160, 0),169,169,169);
		ParametricTriangle Triangle = new ParametricTriangle(new Point3f(-350, 0, 0), new Point3f(-340,200, 0),
				new Point3f(-90, 160, 0),169,169,169);
		ParametricTriangle Triangle1 = new ParametricTriangle(new Point3f(-210, 280, 0), new Point3f(-340,200, 0),
				new Point3f(-90, 160, 0),169,169,169);
		ParametricTriangle triangle15 = new ParametricTriangle(new Point3f(435, 117, 0), new Point3f(435, -65, 0),
				new Point3f(540, 130, 0),80,80,80);
		ParametricTriangle triangle16 = new ParametricTriangle(new Point3f(539, -30, 0), new Point3f(540, 130, 0),
				new Point3f(435, -65, 0),80,80,80);

		ParametricLine ThirdLine = new ParametricLine(new Point3f(-340,200, 0), new Point3f(-350, 0, 0));
		ParametricLine FourthLine = new ParametricLine(new Point3f(-90, 160, 0), new Point3f(-100,-50, 0));
		ParametricLine FifthLine = new ParametricLine(new Point3f(-350, 0, 0), new Point3f(-100,-50, 0));
		ParametricLine SixthLine = new ParametricLine(new Point3f(0, -10, 0), new Point3f(-100,-50, 0));
		ParametricLine SeventhLine = new ParametricLine(new Point3f(0, -10, 0), new Point3f(5,170, 0));
		ParametricLine EighthLine = new ParametricLine(new Point3f(5,170, 0), new Point3f(-120, 160, 0));
		ParametricLine NinthLine = new ParametricLine(new Point3f(-430,190, 0), new Point3f(-340,200, 0));
		ParametricLine TenthLine = new ParametricLine(new Point3f(-430,190, 0), new Point3f(-240, 330, 0));
		ParametricLine line7 = new ParametricLine(new Point3f(450, 115, 0), new Point3f(330, 135, 0));
		ParametricLine line8 = new ParametricLine(new Point3f(435, 117, 0), new Point3f(435, -65, 0));
		ParametricLine line9 = new ParametricLine(new Point3f(540, -30, 0),  new Point3f(435, -65, 0));
		ParametricLine line11 = new ParametricLine(new Point3f(555, 135, 0),new Point3f(450, 115, 0));
		ParametricLine line12 = new ParametricLine(new Point3f(540, -30, 0), new Point3f(540, 130, 0));


		//Draw the door
		ParametricTriangle triangle17 = new ParametricTriangle(new Point3f(450, 115, 0), new Point3f(450, -57, 0),
				new Point3f(528, 130, 0),156,107,48);
		ParametricTriangle triangle18 = new ParametricTriangle(new Point3f(528, 130, 0), new Point3f(528, -33, 0),
				new Point3f(450, -57, 0),156,107,48);
		ParametricTriangle Triangle2 = new ParametricTriangle(new Point3f(0, -10, 0), new Point3f(-100,-52, 0),
				new Point3f(-90, 162, 0),80,80,80);
		ParametricTriangle Triangle3 = new ParametricTriangle(new Point3f(0, -10, 0), new Point3f(5,170, 0),
				new Point3f(-90, 162, 0),80,80,80);

		ParametricLine line13 = new ParametricLine(new Point3f(528, 130, 0), new Point3f(528, -33, 0));
		ParametricLine line10 = new ParametricLine(new Point3f(450, 115, 0), new Point3f(450, -57, 0));
		ParametricLine line36 = new ParametricLine(new Point3f(520, 50, 0), new Point3f(520, 60, 0));
		ParametricLine line37 = new ParametricLine(new Point3f(510, 46, 0), new Point3f(520, 50, 0));
		ParametricLine line38 = new ParametricLine(new Point3f(510, 46, 0), new Point3f(510, 56, 0));
		ParametricLine line39 = new ParametricLine(new Point3f(510, 56, 0), new Point3f(520, 60, 0));

		//Draw roofs
		ParametricTriangle triangle1 = new ParametricTriangle(new Point3f(-430,190, 0), new Point3f(-340,200, 0),
				new Point3f(-240, 330, 0),51,0,0);
		ParametricTriangle triangle2 = new ParametricTriangle(new Point3f(-205, 280, 0), new Point3f(-340,200, 0),
				new Point3f(-240, 330, 0),51,0,0);
		ParametricTriangle triangle3 = new ParametricTriangle(new Point3f(170,370, 0), new Point3f(-240, 330, 0),
				new Point3f(-120, 160, 0),110,40,14);
		ParametricTriangle triangle8 = new ParametricTriangle(new Point3f(560, 220, 0),new Point3f(373, 220, 0),
				new Point3f(420, 310, 0),51,0,0);
		ParametricTriangle triangle7 = new ParametricTriangle(new Point3f(510, 220, 0),new Point3f(405, 280, 0),
				new Point3f(373, 220, 0),80,80,80);
		ParametricTriangle triangle9 = new ParametricTriangle(new Point3f(510, 220, 0),new Point3f(490, 200, 0),
				new Point3f(373, 220, 0),80,80,80);
		ParametricTriangle triangle4 = new ParametricTriangle(new Point3f(170,370, 0), new Point3f(340, 200, 0),
				new Point3f(-120, 160, 0),110,40,14);
		ParametricTriangle triangle5 = new ParametricTriangle(new Point3f(5,170, 0), new Point3f(-25, 330, 0),
				new Point3f(420, 310, 0),110,40,14);
		ParametricTriangle triangle6 = new ParametricTriangle(new Point3f(5,170, 0),new Point3f(330, 135, 0),
				new Point3f(420, 310, 0),110,40,14);
		ParametricTriangle triangle10 = new ParametricTriangle(new Point3f(555, 135, 0),new Point3f(450, 115, 0),
				new Point3f(490, 200, 0),51,0,0);
		ParametricTriangle triangle11 = new ParametricTriangle(new Point3f(373, 220, 0), new Point3f(490, 200, 0),
				new Point3f(450, 115, 0),110,40,14);
		ParametricTriangle triangle13 = new ParametricTriangle(new Point3f(373, 220, 0), new Point3f(450, 115, 0),
				new Point3f(330, 135, 0),110,40,14);

		ParametricLine FirstLine = new ParametricLine(new Point3f(-205, 280, 0), new Point3f(-340,200, 0));
		ParametricLine SecondLine = new ParametricLine(new Point3f(-120, 160, 0), new Point3f(-240, 330, 0));
		ParametricLine line1 = new ParametricLine(new Point3f(170,370, 0), new Point3f(-240, 330, 0));
		ParametricLine line2 = new ParametricLine(new Point3f(5,170, 0), new Point3f(-25, 330, 0));
		ParametricLine line3 = new ParametricLine(new Point3f(5,170, 0), new Point3f(330, 135, 0));
		ParametricLine line4 = new ParametricLine(new Point3f(0, -10, 0),  new Point3f(435, -65, 0));
		ParametricLine line5 = new ParametricLine(new Point3f(420, 310, 0), new Point3f(-25, 330, 0));
		ParametricLine line6 = new ParametricLine(new Point3f(420, 310, 0),new Point3f(330, 135, 0));
		ParametricLine line14 = new ParametricLine(new Point3f(450, 115, 0), new Point3f(490, 200, 0));
		ParametricLine line15 = new ParametricLine(new Point3f(373, 220, 0), new Point3f(490, 200, 0));
		ParametricLine line16 = new ParametricLine(new Point3f(555, 135, 0), new Point3f(490, 200, 0));
		ParametricLine line17 = new ParametricLine(new Point3f(560, 220, 0),new Point3f(420, 310, 0));
		ParametricLine line18 = new ParametricLine(new Point3f(510, 220, 0),new Point3f(405, 280, 0) );
		ParametricLine line19 = new ParametricLine(new Point3f(560, 220, 0), new Point3f(510, 220, 0));
		ParametricLine line20 = new ParametricLine(new Point3f(490, 200, 0), new Point3f(510, 220, 0));
		ParametricLine line21 = new ParametricLine(new Point3f(220, 320, 0), new Point3f(170,370, 0));

		//Draw windows
		ParametricTriangle Triangle4 = new ParametricTriangle(new Point3f(-150, 160, 0), new Point3f(-270,180, 0),
				new Point3f(-270,85, 0), 0,191,255);
		ParametricTriangle Triangle5 = new ParametricTriangle(new Point3f(-150, 60, 0), new Point3f(-270,85, 0),
				new Point3f(-150, 110, 0), 0,191,255);

		ParametricTriangle triangle19 = new ParametricTriangle(new Point3f(60, 30, 0),  new Point3f(180, 17, 0),
				new Point3f(180, 97, 0),0,191,255);
		ParametricTriangle triangle20 = new ParametricTriangle(new Point3f(60, 110, 0),  new Point3f(180, 97, 0),
				(new Point3f(60, 30, 0)),0,191,255);

		ParametricTriangle triangle30 = new ParametricTriangle(new Point3f(270, 10, 0),  new Point3f(390, -3, 0),
				new Point3f(390, 77, 0),0,191,255);
		ParametricTriangle triangle31 = new ParametricTriangle(new Point3f(270, 90, 0),  new Point3f(390, 77, 0),
				(new Point3f(270, 10, 0)),0,191,255);


		ParametricLine line22 = new ParametricLine(new Point3f(60, 30, 0),  new Point3f(180, 17, 0));
		ParametricLine line23 = new ParametricLine(new Point3f(60, 70, 0),  new Point3f(180, 57, 0));
		ParametricLine line24 = new ParametricLine(new Point3f(60, 110, 0),  new Point3f(180, 97, 0));
		ParametricLine line25 = new ParametricLine(new Point3f(60, 30, 0),  new Point3f(60, 110, 0));
		ParametricLine line26 = new ParametricLine(new Point3f(180, 17, 0),  new Point3f(180, 97, 0));
		ParametricLine line27 = new ParametricLine(new Point3f(120, 24, 0),  new Point3f(120, 104, 0));

		ParametricLine line40 = new ParametricLine(new Point3f(270, 10, 0),  new Point3f(390, -3, 0));
		ParametricLine line41 = new ParametricLine(new Point3f(270, 50, 0),  new Point3f(390, 37, 0));
		ParametricLine line42 = new ParametricLine(new Point3f(270, 90, 0),  new Point3f(390, 77, 0));
		ParametricLine line43 = new ParametricLine(new Point3f(270, 10, 0),  new Point3f(270, 90, 0));
		ParametricLine line44 = new ParametricLine(new Point3f(390, -3, 0),  new Point3f(390, 77, 0));
		ParametricLine line45 = new ParametricLine(new Point3f(330, 4, 0),  new Point3f(330, 84, 0));

		ParametricLine Line1 = new ParametricLine(new Point3f(-150, 160, 0), new Point3f(-270,180, 0));
		ParametricLine Line2 = new ParametricLine(new Point3f(-150, 60, 0), new Point3f(-270,85, 0));
		ParametricLine Line3 = new ParametricLine(new Point3f(-150, 110, 0), new Point3f(-270,135, 0));
		ParametricLine Line4 = new ParametricLine(new Point3f(-270,85, 0), new Point3f(-270,180, 0));
		ParametricLine Line5 = new ParametricLine(new Point3f(-150, 160, 0),new Point3f(-150, 60, 0));
		ParametricLine Line6 = new ParametricLine(new Point3f(-210, 75, 0),new Point3f(-210, 170, 0));

		//Draw shadows
		ParametricTriangle triangle21 = new ParametricTriangle(new Point3f(540, -30, 0), new Point3f(660, 40, 0),
				new Point3f(540, 100, 0),41,44,47);

		ParametricLine line28 = new ParametricLine(new Point3f(540, -30, 0), new Point3f(660, 40, 0));
		ParametricLine line29 = new ParametricLine(new Point3f(540, 100, 0), new Point3f(660, 40, 0));

		//Draw roads
		ParametricLine line30 = new ParametricLine(new Point3f(-500, -150, 0), new Point3f(1000, -150, 0));
		ParametricLine line31 = new ParametricLine(new Point3f(-500, -170, 0), new Point3f(1000, -170, 0));
		ParametricLine line32 = new ParametricLine(new Point3f(-500, -310, 0), new Point3f(1000, -310, 0));
		ParametricLine line33 = new ParametricLine(new Point3f(-500, -320, 0), new Point3f(1000, -320, 0));
		ParametricLine line34 = new ParametricLine(new Point3f(-500, -340, 0), new Point3f(1000, -340, 0));
		ParametricLine line35 = new ParametricLine(new Point3f(-500, -350, 0), new Point3f(1000, -350, 0));
		ParametricTriangle triangle22 = new ParametricTriangle(new Point3f(-500, -150, 0), new Point3f(1000, -150, 0),
				new Point3f(-500, -170, 0),255,255,255);
		ParametricTriangle triangle23 = new ParametricTriangle(new Point3f(-500, -170, 0), new Point3f(1000, -170, 0),
				new Point3f(1000, -150, 0),255,255,255);
		ParametricTriangle triangle24 = new ParametricTriangle(new Point3f(-500, -170, 0), new Point3f(-500, -800, 0),
				new Point3f(1000, -800, 0),80,80,80);
		ParametricTriangle triangle25 = new ParametricTriangle(new Point3f(-500, -170, 0), new Point3f(1000, -170, 0),
				new Point3f(1000, -800, 0),80,80,80);
		ParametricTriangle triangle26 = new ParametricTriangle(new Point3f(-500, -310, 0), new Point3f(1000, -310, 0),
				new Point3f(-500, -320, 0),247,186,11);
		ParametricTriangle triangle27 = new ParametricTriangle(new Point3f(-500, -320, 0), new Point3f(1000, -320, 0),
				new Point3f(1000, -310, 0),247,186,11);
		ParametricTriangle triangle28 = new ParametricTriangle(new Point3f(-500, -340, 0), new Point3f(1000, -340, 0),
				new Point3f(-500, -350, 0),247,186,11);
		ParametricTriangle triangle29 = new ParametricTriangle(new Point3f(-500, -350, 0), new Point3f(1000, -350, 0),
				new Point3f(1000, -340, 0),247,186,11);

		//Triangle implementation
		triangle12 .drawTriangle(g);
		triangle8.drawTriangle(g);
		triangle14 .drawTriangle(g);
		MyFirstTriangle.drawTriangle(g);
		Triangle.drawTriangle(g);
		Triangle1.drawTriangle(g);
		Triangle4.drawTriangle(g);
		Triangle5.drawTriangle(g);
		triangle1.drawTriangle(g);
		triangle2.drawTriangle(g);
		triangle3.drawTriangle(g);
		triangle4.drawTriangle(g);
		triangle5.drawTriangle(g);
		triangle6.drawTriangle(g);
		triangle7.drawTriangle(g);
		triangle9.drawTriangle(g);
		Triangle2.drawTriangle(g);
		Triangle3.drawTriangle(g);
		triangle15.drawTriangle(g);
		triangle16.drawTriangle(g);
		triangle19 .drawTriangle(g);
		triangle20.drawTriangle(g);
		triangle21.drawTriangle(g);
		triangle17.drawTriangle(g);
		triangle18.drawTriangle(g);
		triangle11.drawTriangle(g);
		triangle13.drawTriangle(g);
		triangle10.drawTriangle(g);
		triangle22.drawTriangle(g);
		triangle23.drawTriangle(g);
		triangle25.drawTriangle(g);
		triangle24.drawTriangle(g);
		triangle29.drawTriangle(g);
		triangle26.drawTriangle(g);
		triangle27.drawTriangle(g);
		triangle28.drawTriangle(g);
		triangle30.drawTriangle(g);
		triangle31.drawTriangle(g);

		// Implementation of drawing lines
		Line1.drawLine(g);
		Line2.drawLine(g);
		Line3.drawLine(g);
		Line4.drawLine(g);
		Line5.drawLine(g);
		Line6.drawLine(g);
		line1.drawLine(g);
		line2.drawLine(g);
		line3.drawLine(g);
		line4.drawLine(g);
		line5.drawLine(g);
		line6.drawLine(g);
		line7.drawLine(g);
		line8.drawLine(g);
		line9.drawLine(g);
		line10.drawLine(g);
		line11.drawLine(g);
		line12.drawLine(g);
		line13.drawLine(g);
		line14.drawLine(g);
		line15.drawLine(g);
		line16.drawLine(g);
		line17.drawLine(g);
		line18.drawLine(g);
		line19.drawLine(g);
		line20.drawLine(g);
		line21.drawLine(g);
		line22.drawLine(g);
		line23.drawLine(g);
		line24.drawLine(g);
		line25.drawLine(g);
		line26.drawLine(g);
		line27.drawLine(g);
		line28.drawLine(g);
		line29.drawLine(g);
		line30.drawLine(g);
		line31.drawLine(g);
		line32.drawLine(g);
		line33.drawLine(g);
		line34.drawLine(g);
		line35.drawLine(g);
		line36.drawLine(g);
		line37.drawLine(g);
		line38.drawLine(g);
		line39.drawLine(g);
		line40.drawLine(g);
		line41.drawLine(g);
		line42.drawLine(g);
		line43.drawLine(g);
		line44.drawLine(g);
		line45.drawLine(g);
		FirstLine.drawLine(g);
		SecondLine.drawLine(g);
		ThirdLine.drawLine(g);
		FourthLine.drawLine(g);
		FifthLine.drawLine(g);
		SixthLine.drawLine(g);
		SeventhLine.drawLine(g);
		EighthLine.drawLine(g);
		NinthLine.drawLine(g);
		TenthLine.drawLine(g);






	}

	public static void main(String[] args) {
		Drawing2D panel = new Drawing2D();
		JFrame ScreenToDrawOn = new JFrame();
		ScreenToDrawOn.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ScreenToDrawOn.setTitle("2D Drawing Application");
		ScreenToDrawOn.setSize(1300, 1000);
		ScreenToDrawOn.setVisible(true);
		ScreenToDrawOn.add(panel);
	}

}
