package view;

import processing.core.PApplet;

public class JugadorView {
	
	PApplet app;
	protected int x;
	protected int y;
	protected int tam;
	protected int movX;

	public JugadorView(int x, int y, int tam, int movX, PApplet app) {
		this.app = app;
		this.x = x;
		this.y = y;
		this.tam = 30;
	}
	
	public void dibujarJugador() {
		app.rect(this.x,this.y,this.tam,this.tam);
	}
	public void mover() {
		if(app.keyCode == app.RIGHT) {
			this.x += 20;
		}
		if(app.keyCode == app.LEFT) {
			this.x -= 20;
		}
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
