package model;

import processing.core.PApplet;

public class Polo extends Thread {
	
	private int xPolo, yPolo;
	private int size;
	private int direct1, direct2;
	private int speed;
	
	public Polo (int xPolo, int yPolo, int size,int direct1,int direct2) {
	
		this.xPolo=xPolo;
		this.yPolo=yPolo;
		this.size=size;
		this.direct1= direct1;
		this.direct2= direct2; 
		this.speed=2;
		
		
	}
	
	public void run () {
		
	}
	
	public void paintPolo (PApplet app) {
		app.fill(53,226,234);
		app.ellipse(xPolo, yPolo, size, size);
	}

	public void move() {
		xPolo += direct1;
		yPolo += direct2;
		
	}
		
	public void collitions() {
		if(xPolo-size/2<0) {
			direct1 = 1;
		}
		
		if(yPolo-size/2<0) {
			direct2 = 1;
		}
		
		if(xPolo+size/2>500) {
			direct1 = -1 ;
		}
		
		if(xPolo+size/2>500) {
			direct2 = -1;
		}
	}
	
		
	
	public void positions () {
		
	}
	
	public int getxPolo() {
		return xPolo;
	}
	public void setxPolo(int xPolo) {
		this.xPolo = xPolo;
	}
	
	public int getyPolo() {
		return yPolo;
	}
	public void setyPolo(int yPolo) {
		this.yPolo = yPolo;
	}
	
	public int getDirect1() {
		return direct1;
	}
	public void setDirect1(int direct1) {
		this.direct1 = direct1;
	}
	
	public int getDirect2() {
		return direct2;
	}
	public void setDirect2(int direct2) {
		this.direct2 = direct2;
	}
	
	
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}	
}
