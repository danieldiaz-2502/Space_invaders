package view;

import controller.Controller2;
import processing.core.PApplet;

public class SpaceView2 {
	
	PApplet app;
	Controller2 controlador;
	
	public SpaceView2(PApplet app) {
		this.app = app;
		this.controlador = new Controller2(app);
	}
	
	public void iniciarJuego(){
		controlador.empezar();
	}
	public void iniciarEspacio() {
		controlador.espacio();
	}
	public void iniciarMouse() {
		controlador.click();
	}
	

}