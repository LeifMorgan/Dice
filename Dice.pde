void setup()
{
	size(300,350);
	noLoop();
}
void draw()
{
	

int sum = 0;
	background((int)(Math.random()*100+155),(int)(Math.random()*100+155),(int)(Math.random()*100+155));

	for(int x = 0; x <= 250; x = x+ 50)
	{
	for(int y = 0; y <= 250; y = y + 50)
	{
		Die theDie = new Die(x,y);
	
		theDie.show();
		theDie.roll();
			sum = sum + theDie.value;
	}
	
}
strokeWeight(3);
textSize(45);
	

	text("Total: " + sum, 45,340);
	
}

void mousePressed()
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
	void roll()
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
	void show()
	{
		strokeWeight(3);
	fill((int)(Math.random()*55+200));
	rect(myX,myY,50,50,10);
	
	}
}
