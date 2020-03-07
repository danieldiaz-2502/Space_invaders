package model;

import static processing.core.PConstants.LEFT;
import static processing.core.PConstants.RIGHT;

import java.util.ArrayList;

import model.Bala;
import processing.core.PApplet;

public class Jugador {
	int x;
	int y;
	int tam;
	int vel;
	ArrayList<Bala> disparos;
	PApplet app;
	
	public Jugador(int x, int y, PApplet app) {
		
		disparos = new ArrayList<>();
		this.x = x;
		this.y = y ;
		this.tam = 20;
		this.vel = 20;
		this.app = app;
	}
	
	public void pintar() {
		app.fill(0,0,250);
		app.rect(this.x,this.y,this.tam,this.tam);
		for (int i = 0; i < disparos.size(); i++) {
			disparos.get(i).pintar();
		}
	}
	
	public void moveRight() {
		if(this.x <= 500) {
			this.x += this.vel;
		}else {
			this.x += 0;
		}
	}
	public void moveLeft() {
		if(this.x <= 0) {
			this.x -= 0;
		}else {
			this.x -= this.vel;
		}
	}
	
	public void keyPressed() {
		if (app.keyCode == RIGHT) {
			moveRight();
		}
		if (app.keyCode == LEFT) {
			moveLeft();
		}
		if (app.keyCode == ' ') {
			disparar();
		}
	}
	
	
	public void disparar() {
		Bala d = new Bala(this.x + 35, this.y,app);
		disparos.add(d);
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

	public ArrayList<Bala> getDisparos() {
		return disparos;
	}

	public void setDisparos(ArrayList<Bala> disparos) {
		this.disparos = disparos;
	}

	public PApplet getApp() {
		return app;
	}

	public void setApp(PApplet app) {
		this.app = app;
	}
	
}
