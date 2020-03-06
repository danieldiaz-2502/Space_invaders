package model;

import processing.core.PApplet;


public class Enemigo {
	
	PApplet app;
	protected int x;
	protected int y;
	protected int tam;
	protected int vel;

	public Enemigo(int x, int y, int tam, int vel, PApplet app) {
		this.app = app;
		this.x = x;
		this.y = y;
		this.tam = 30;
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

	public int getVel() {
		return vel;
	}

	public void setVel(int vel) {
		this.vel = vel;
	}
	
	
}
