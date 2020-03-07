package model;

import processing.core.PApplet;

public class Bala {
	int posX;
	int posY;
	int tam;
	int vel;
	PApplet app;
	
	public Bala(int posX, int posY, PApplet app) {
		this.posX = posX;
		this.posY = posY;
		this.tam = 10;
		this.vel = 5;
		this.app = app;
	}
	
	public void pintar() {
		disparar();
	}
	
	public void disparar () {
		app.fill(250,0,0);
		app.ellipse(this.posX - 24, this.posY, this.tam, this.tam);
		this.posY -= this.vel;
	}

	public int getPosX() {
		return posX;
	}

	public void setPosX(int posX) {
		this.posX = posX;
	}

	public int getPosY() {
		return posY;
	}

	public void setPosY(int posY) {
		this.posY = posY;
	}

	public int getTam() {
		return tam;
	}

	public void setTam(int tam) {
		this.tam = tam;
	}

	public int getVel() {
		return vel;
	}

	public void setVel(int vel) {
		this.vel = vel;
	}

	public PApplet getApp() {
		return app;
	}

	public void setApp(PApplet app) {
		this.app = app;
	}
	
	
}