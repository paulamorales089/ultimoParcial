package model;

import processing.core.PApplet;

public class Marco extends Thread  {
	
		
		private int xPolo, yPolo;
		private int size;
		private int direct1, direct2;
		private int speed;
		
		public Marco (int xPolo, int yPolo, int size,int direct1,int direct2) {
		
			this.xPolo=xPolo;
			this.yPolo=yPolo;
			this.size=size;
			this.direct1=direct1;
			this.direct2=direct2;
			this.speed=2;
		}
		

		public void run () {
			
		}
		
		public void paintMarco (PApplet app) {
			app.noStroke();
			app.fill(244,114,162);
			app.ellipse(xPolo, yPolo, size, size);
			
		}

		public void move () {
			xPolo += direct1;
			yPolo += direct2;
		
		}
		
		public void collitions() {
			if(xPolo-size/2<0) {
				direct1 = 2;
			}
			
			if(yPolo-size/2<0) {
				direct2 = 2;
			}
			
			if(xPolo+size/2>700) {
				direct1 = -2 ;
			}
			
			if(yPolo+size/2>500) {
				direct2 = -2;
			}
		}
		
		
		

}
