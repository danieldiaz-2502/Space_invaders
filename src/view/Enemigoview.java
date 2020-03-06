package view;

import controller.EnemigoController;
import processing.core.PApplet;

public class Enemigoview extends EnemigoController{

		public Enemigoview(int x, int y, int tam, int vel, PApplet app) {
			super(x, y, tam, vel, app);
		}
		public void dibujarEnemigo() {
			app.ellipse(this.x, this.y, this.tam, this.tam); 
		}
}
