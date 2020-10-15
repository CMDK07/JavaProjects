package myfirstproject;

import processing.core.PApplet;


public class MyFirstProject extends PApplet {

	public void setup() {
		System.out.println("Oh, hello!");
	    size(800, 700);
	    background(255, 81, 225);
	}

	public void  draw()
	{
	    face();
	    eyes();
	    mouth();
	    leftear();
	    rightear();
	}
	
	public void face() {
	fill(234, 224, 24);
	rect(100, 300, 500, 300, 4);
	}

    public void eyes() {

    fill(90, 245, 15);
    ellipse(200, 400, 100, 100);
    ellipse(500, 400, 25, 25);

    }    
    
    public void mouth() {
    	
    	fill(17, 242, 242);
        triangle(250, 500, 500, 500, 350, 575);
    
    }
    
    public int pointAX = 75;
    public int pointAY = 400;
    
    public void leftear() {
    
    fill(241,18,174);
    rect(pointAX, pointAY, 25, 100);
    rect(pointAX - 25, pointAY + 12, 25, 75);
    line(pointAX - 35, 430, pointAX - 35, 100);
    rect(pointAX - 50, pointAY + 24, 25, 50);
    fill(0, 0, 0);
    ellipse(pointAX - 35, 100, 30, 30);}
    
    public int pointBX = pointAX + 25 + 500;
    public int pointBY = pointAY;
    
    
    
    
    
    
    public void rightear() {
    	
    	fill(255, 121, 6);
        rect(pointBX, pointBY, 25, 100);
        rect(pointBX + 25, pointBY + 12, 25, 75);
        line(pointBX + 65, 430, pointBX + 65, 100);
        rect(pointBX + 50, pointBY + 24, 25, 50);
        fill(255, 255, 255);
        ellipse(pointBX + 65, 100, 30, 30);

    }

















}