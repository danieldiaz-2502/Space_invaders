package controller;

import model.Jugador;
import processing.core.PApplet;


public class JugadorController extends Jugador{
	
	public JugadorController(int posX,int posY, int tam, PApplet y) {
		super(posX, posY, tam, y);
	}
	
	
	public void moverIzq() {
		posX-=5;
	}
	
	public void moverDer() {
		posX+=5;
	}
	

