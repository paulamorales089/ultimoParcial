package view;
import java.util.ArrayList;


import model.Marco;
import model.Polo;
import processing.core.PApplet;
	// paso 0
public class Main extends PApplet{

	public static void main(String[] args) {	
		// paso 1
		PApplet.main("view.Main");
	}
	
	
	
	@Override
	public void settings() {
		
		size(700,500);
	}
	
	
	ArrayList <Polo> polo;
	Marco marco; 
	
	
	@Override
	public void setup() {
		
		polo = new ArrayList<Polo>();
		
		for (int i = 0; i < 20; i++) {
		polo.add(new Polo ((int)random(0,500),(int) random (0,500),30,1,-1));
		}
		
		marco = new Marco (350,250,40,-2,2);
		
		}
	
	@Override
	public void draw() {
		
		background(255);
		/*System.out.println(mouseX + ","+ mouseY);
		ellipse(mouseX, mouseY, 50,50); */
		
		for (int i = 0; i < polo.size(); i++) {
			polo.get(i).paintPolo(this);
			polo.get(i).move();
			polo.get(i).collitions();
		}
		
		marco.paintMarco(this);
		marco.move();
		marco.collitions();
		
		
		

	
		
		
		
		
		}
	
	
	
}
