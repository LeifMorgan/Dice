import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class Dice extends PApplet {

public void setup()
{
	size(300,300);
	noLoop();
}
public void draw()
{
	background((int)(Math.random()*100+155),(int)(Math.random()*100+155),(int)(Math.random()*100+155));

	for(int x = 0; x <= 250; x = x+ 50)
	for(int y = 0; y <= 250; y = y + 50)
	{
		Die theDie = new Die(x,y);
	
		theDie.show();
			theDie.roll();
	}
}
	
public void mousePressed()
{
	redraw();
}
class Die //models one single dice cube
{
	//variable declarations here
	int value;
	int myX, myY;
	Die(int x, int y) //constructor
	{
		//variable initializations here
		value = (int)(Math.random()*6+1);
		myX = x;
		myY = y;
	}
	public void roll()
	{
		//one
		if(value == 1)
		{
			fill(0);
			ellipse(myX+25,myY+25,5,5);
		}
		//two
		if(value == 2)
		{
			fill(0);
			ellipse(myX+17,myY+25,5,5);
			ellipse(myX+33,myY+25,5,5);
		}
		//three
		if(value == 3)
		{
			fill(0);
			ellipse(myX+13,myY+13,5,5);
			ellipse(myX+37,myY+37,5,5);
			ellipse(myX+25,myY+25,5,5);
		}
		//four
		if(value == 4)
		{
			fill(0);
			ellipse(myX+17,myY+35,5,5);
			ellipse(myX+33,myY+35,5,5);
			ellipse(myX+17,myY+15,5,5);
			ellipse(myX+33,myY+15,5,5);

		}
		//five
		if(value == 5)
		{

			fill(0);
			ellipse(myX+17,myY+35,5,5);
			ellipse(myX+33,myY+35,5,5);
			ellipse(myX+17,myY+15,5,5);
			ellipse(myX+33,myY+15,5,5);
			ellipse(myX+25,myY+25,5,5);
		}
		
		//six
		if(value == 6)
		{
			fill(0);
			ellipse(myX+17,myY+37,5,5);
			ellipse(myX+33,myY+37,5,5);
			ellipse(myX+17,myY+25,5,5);
			ellipse(myX+33,myY+25,5,5);
			ellipse(myX+17,myY+13,5,5);
			ellipse(myX+33,myY+13,5,5);
		}
	}
	public void show()
	{
	fill((int)(Math.random()*55+200));
	rect(myX,myY,50,50,10);
	}
}
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "Dice" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
