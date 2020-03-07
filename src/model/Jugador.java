package model;

import processing.core.PApplet;

public class Jugador {

	public int x;
	public int y;
	public int tam;
	public PApplet app;

	public Jugador(int x, int y, int tam, PApplet app) {
		this.x = x;
		this.y = y;
		this.tam = tam;
		this.app = app;
	}
	
	public void dibujarJugador() {
		app.fill(0);
		app.rect(this.x,this.y,this.tam,this.tam);
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

	public PApplet getApp() {
		return app;
	}

	public void setApp(PApplet app) {
		this.app = app;
	}
	
	
}
