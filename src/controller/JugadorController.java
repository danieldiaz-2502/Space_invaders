package controller;

import model.Jugador;
import processing.core.PApplet;

public class JugadorController {
	
	PApplet app;
	public Jugador jugador = new Jugador(250,400,25,25);
	
	public JugadorController(PApplet app) {
		this.app = app;
	}
	
	public void mover() {
		if(app.keyCode == app.RIGHT) {
			jugador.x += 20;
		}
		if(app.keyCode == app.LEFT) {
			jugador.x -= 20;
		}
	}
}
