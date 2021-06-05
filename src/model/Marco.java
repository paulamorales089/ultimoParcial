package model;

import processing.core.PApplet;

public class Marco extends Thread  {
	
		
		private int xMarco, yMarco;
		private int size;
		private int direct1, direct2;
		private int speed;
		private boolean call;
		public Marco (int xPolo, int yPolo, int size,int direct1,int direct2) {
		
			this.xMarco=xPolo;
			this.yMarco=yPolo;
			this.size=size;
			this.direct1=direct1;
			this.direct2=direct2;
			this.speed=2;
			this.call=false;
		}
		

		public void run () {
			
			call = true; 
			try {
				
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		public void paintMarco (PApplet app) {
			app.noStroke();
			app.fill(244,114,162);
			app.ellipse(xMarco, yMarco, size, size);
		}

		public void move () {
			xMarco += direct1;
			yMarco += direct2;
		
		}
		
		public void collitions() {
			if(xMarco-size/2<0) {
				direct1 = 2;
			}
			
			if(yMarco-size/2<0) {
				direct2 = 2;
			}
			
			if(xMarco+size/2>700) {
				direct1 = -2 ;
			}
			
			if(yMarco+size/2>500) {
				direct2 = -2;
			}
		}
		
		public void followPolo () {
			
		}


		public boolean isCall() {
			return call;
		}


		public void setCall(boolean call) {
			this.call = call;
		}
		
		
		public int getxMarco() {
			return xMarco;
		}


		public void setxMarco(int xMarco) {
			this.xMarco = xMarco;
		}


		public int getyMarco() {
			return yMarco;
		}


		public void setyMarco(int yMarco) {
			this.yMarco = yMarco;
		}


		public int getSize() {
			return size;
		}


		public void setSize(int size) {
			this.size = size;
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


		public int getSpeed() {
			return speed;
		}


		public void setSpeed(int speed) {
			this.speed = speed;
		}


		
		

}
