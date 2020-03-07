package model;

import processing.core.PApplet;

public class Enemigo {
	int posX;
	int posY;
	int tam;
	int vel;
	PApplet app;
	
	public Enemigo(int posX, int posY, PApplet app) {
		this.posX = posX;
		this.posY = posY;
		this.tam = 20;
		this.vel = 1;
		this.app = app;
	}
	
	public void pintar() {
		app.fill(0,250,0);
		app.rect(this.posX, this.posY, this.tam, this.tam);
	}
	
	public void mover() {
		this.posY += this.vel;
		
		if(this.posY == 530) {
			this.posY = -30;
		}	
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
