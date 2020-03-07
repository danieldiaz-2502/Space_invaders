package model;

import java.util.ArrayList;

import processing.core.PApplet;

public class Model {
	
	public PApplet app;
	int pantalla;
	Jugador player;
	ArrayList<Enemigo> enemigos;
	
	public Jugador getH() {
		return player;
	}
	
	public Model(PApplet app) {
		this.app = app;
		pantalla = 0;
		
		player = new Jugador(350,640,app);
		enemigos = new ArrayList<>();
		for(int i = 0; i< 12; i++) {
			enemigos.add(new Enemigo(70 * i,50,app));
		}	
	}
	
	public void ejecutar() {
		
		switch(pantalla) {
		case 0:
			app.background(0);
			app.fill(250,0,0);
			app.rect(250,300,200,40);
			app.text("Space Invaders",170,250);
			app.textSize(25);
			app.fill(250);
			app.text("Empezar",300,330);
			app.textSize(50);
			break;
		case 1:
			app.background(0);
			
			player.pintar();
			
			for (int i = 0; i < enemigos.size(); i++) {
			enemigos.get(i).mover();
			enemigos.get(i).pintar();
			System.out.println(enemigos.get(i).getPosY());
			
			if(enemigos.get(i).getPosY() > 43000) {
				pantalla = 2;
			}

			}
			
			for (int i = 0; i < player.getDisparos().size(); i++) {
				for (int j = 0; j < enemigos.size(); j++) {
					if(PApplet.dist(player.getDisparos().get(i).getPosX(), player.getDisparos().get(i).getPosY(), enemigos.get(j).getPosX()+25,
						enemigos.get(j).getPosY())<25) {
						enemigos.remove(j);
						player.getDisparos().get(i).setPosX(5000);
					}
				}
			}
			
			
			
			break;
		case 2:
			app.background(250);
			
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

