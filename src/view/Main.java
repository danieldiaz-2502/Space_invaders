package view;

import model.Model;
import processing.core.PApplet;

public class Main extends PApplet {
	
	SpaceView2 inicio;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PApplet.main("view.Main");
	}
	public void settings () {
		size (500,500);
		
	}
	
	public void setup () {
		inicio = new SpaceView2(this);
		
	}
	
	public void draw () {
	background(120,180,350);
	inicio.iniciarJuego();
	
	}
	
	public void mousePressed() {
	inicio.iniciarMouse();
		
	}
	
	public void keyPressed() {
	inicio.iniciarEspacio();
	}
		
}
