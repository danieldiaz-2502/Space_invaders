package model;

import java.util.ArrayList;

import processing.core.PApplet;

public class Model {
	
	public PApplet app;
	int pantalla;
	Jugador player;
	ArrayList<Enemigo> enemigos;
	
	public Jugador getPlayer() {
		return player;
	}
	
	public Model(PApplet app) {
		this.app = app;
		pantalla = 0;
		player = new Jugador(350,470,app);
		enemigos = new ArrayList<>();
		for(int i = 0; i< 12; i++) {
			enemigos.add(new Enemigo(50 * i,50,app));
		}	
	}
	
	public void jugar() {
		
		switch(pantalla) {
		case 0:
			app.background(0);
			app.fill(250,0,0);
			app.rect(150,240,200,40);
			app.textSize(50);
			app.text("Space Invaders",78,200);
			app.textSize(25);
			app.fill(250);
			app.text("Empezar",200,270);
			break;
		case 1:
			app.background(0);
			
			player.pintar();
			
			for (int i = 0; i < enemigos.size(); i++) {
			enemigos.get(i).mover();
			enemigos.get(i).pintar();
			
			if(enemigos.get(i).getPosY() >= 500) {
				pantalla = 3;
			}

			}
			for (int i = 0; i < player.getDisparos().size(); i++) {
				for (int j = 0; j < enemigos.size(); j++) {
					if(PApplet.dist(player.getDisparos().get(i).getPosX(), player.getDisparos().get(i).getPosY(), enemigos.get(j).getPosX()+20,
						enemigos.get(j).getPosY())<20) {
						enemigos.remove(j);
						player.getDisparos().get(i).setPosX(80000);
					}
				}
			}
			break;
		case 2:
			app.background(250);
			app.background(0);
			app.fill(0,250,0);
			app.textSize(50);
			app.text("Ganaste",170,250);
			break;
		case 3:
			app.background(0);
			app.fill(225,0,0);
			app.textSize(50);
			app.text("Perdiste",180,250);
			break;
		}	
	}
	
	public void mouse() {
		switch(pantalla) {
		case 0:
			pantalla = 1;
			break;
			
		case 1:
			
			break;
			
		case 2:
			pantalla = 0;
			break;
			
		case 3:
			pantalla = 0;
			break;
		}
	}
	
	public void key() {
		player.keyPressed();
	}

	public int getPantalla() {
		return pantalla;
	}

	public void setPantalla(int pantalla) {
		this.pantalla = pantalla;
	}

}

