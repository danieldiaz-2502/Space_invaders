package controller;

import model.ModelE;
import processing.core.PApplet;

public class EnemigoController extends ModelE{

	public EnemigoController(int x, int y, int tam, int vel, PApplet app) {
		super(x, y, tam, vel, app);
		// TODO Auto-generated constructor stub
	}

	public void mover() {
		this.x += vel;
		

	}
}
