package view;

import processing.core.PApplet;
import controller.JugadorController;

public class JugadorView {
	
	JugadorController jugador = new Jugador();
	
	public void dibujarJugador() {
		app.rect(this.x,this.y,this.tam,this.tam);
	}

	public PApplet getApp() {
		return app;
	}

	public void setApp(PApplet app) {
		this.app = app;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getTam() {
		return tam;
	}

	public void setTam(int tam) {
		this.tam = tam;
	}

	public int getMovX() {
		return movX;
	}

	public void setMovX(int movX) {
		this.movX = movX;
	}
	
	
}
