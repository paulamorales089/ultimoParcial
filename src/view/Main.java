package view;

import java.util.ArrayList;

import model.Marco;
import model.Polo;
import processing.core.PApplet;

// paso 0
public class Main extends PApplet {

	public static void main(String[] args) {
		// paso 1
		PApplet.main("view.Main");
	}

	@Override
	public void settings() {

		size(700, 500);
	}

	ArrayList<Polo> polos;
	Marco marco;

	@Override
	public void setup() {

		polos = new ArrayList<Polo>();

		for (int i = 0; i < 20; i++) {
			polos.add(new Polo((int) random(0, 500), (int) random(0, 500), 30, 1, -1));
		}

		marco = new Marco(350, 250, 40, -2, 2);

		for (int i = 0; i < polos.size(); i++) {
			polos.get(i).start();
		}
		marco.start();
	}

	@Override
	public void draw() {

		background(255);
		/*
		 * System.out.println(mouseX + ","+ mouseY); ellipse(mouseX, mouseY, 50,50);
		 */

		for (int i = 0; i < polos.size(); i++) {
			polos.get(i).paintPolo(this);
			polos.get(i).move();

		}

		marco.paintMarco(this);
		marco.move();

		textMarco();
		textPolo();

		kill();
		findPolo();
	}

	public void textMarco() {

		if (marco.isCall()) {
			fill(0);
			text("Marco", marco.getxMarco() - (marco.getSize() / 2), marco.getyMarco());
			// System.out.println(marco.isCall());
		}
	}

	public void textPolo() {

		for (int i = 0; i < polos.size(); i++) {

			if (polos.get(i).isAnswer()) {
				text("POLO ", (polos.get(i).getxPolo() - 17), (polos.get(i).getyPolo() - 15));
				text(polos.get(i).getxPolo() + ", " + polos.get(i).getyPolo(), (polos.get(i).getxPolo() - 25),
						(polos.get(i).getyPolo() + 25));
				System.out.println(polos.get(i).isAnswer());
			}
		}

	}

	public void kill() {
		for (int i = 0; i < polos.size(); i++) {
			if (dist(marco.getxMarco(), marco.getyMarco(), polos.get(i).getxPolo(), polos.get(i).getyPolo()) < 10) {
				polos.remove(i);
				polos.add(new Polo(marco.getxMarco(), marco.getyMarco(), 30, 1, -1));
				/*marco.setxMarco(polos.get(i).getxPolo());
				marco.setyMarco(polos.get(i).getyPolo());*/
			}
		}
	}

	public void findPolo() {
		for (int i = 0; i < polos.size(); i++) {
			if (dist(marco.getxMarco(), marco.getyMarco(), polos.get(i).getxPolo(), polos.get(i).getyPolo()) < 30) {
				marco.setxMarco(polos.get(i).getxPolo());
				marco.setyMarco(polos.get(i).getyPolo());
			}
		}

	}
}
