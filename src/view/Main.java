package view;

import processing.core.PApplet;

public class Main extends PApplet {
	
	JugadorView jugador;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PApplet.main("view.Main");
	}
	
    public void settings() {
		size(500,500);
		jugador = new JugadorView(250,400,25,25,this);
	}
    
	public void setup() {
		
	}
	
    public void draw() {
    	background(0);
    	jugador.dibujarJugador();
    }
    public void keyPressed() {
    	jugador.mover();
    }
}