package controller;

import model.Model;
import processing.core.PApplet;

public class Controller2 {
	
	PApplet app;
	Model model;
	
	public Controller2(PApplet app) {
		this.app = app;
		this.model = new Model(app);
		
	}
	
	public void empezar() {
		model.jugar();
	}
	
	public void espacio() {
		model.key();
	}
	public void click() {
		model.mouse();
	}
	
}
