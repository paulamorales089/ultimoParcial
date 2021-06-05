package model;

import processing.core.PApplet;

public class Marco extends Thread  {
	
		
		private int xPolo, yPolo;
		private int size;
		private int direct1, direct2;
		private int speed;
		
		public Marco (int xPolo, int yPolo, int side,int direct) {
		
			this.xPolo=xPolo;
			this.yPolo=yPolo;
			this.size=50;
			this.direct1=direct;
			this.direct2=direct;
			this.speed=2;
		}
		

		public void run () {
			
		}
		
		public void paintMarco (PApplet app) {
			app.fill(244,114,162);
			app.ellipse(xPolo, yPolo, size, size);
			
		}

		public void positions () {
			
		}
		
		

}
