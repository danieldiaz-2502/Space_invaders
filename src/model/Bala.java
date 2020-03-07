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
		this.tam = 30;
		this.vel = 5;
		this.app = app;
	}
	
	public void pintar() {
		disparar();
	}
	
	public void disparar () {
		app.fill(250,0,0);
		app.rect(this.posX, this.posY, this.tam, this.tam+10);
		this.posY -= this.vel;
	}
}