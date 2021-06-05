package view;
import processing.core.PApplet;
	// paso 0
public class Main extends PApplet{

	public static void main(String[] args) {	
		// paso 1
		PApplet.main("principal");
	}
	
	
	@Override
	public void settings() {
		
		size(500,500);
	}
	
	@Override
	//paso 3
	public void setup() {
		}
	
	@Override
	public void draw() {
		// paso 4
		
		background(255);
		
		System.out.println(mouseX + ","+ mouseY);
		ellipse(mouseX, mouseY, 50,50); 
		
		
		

	
		
		
		
		
		}
	
}
