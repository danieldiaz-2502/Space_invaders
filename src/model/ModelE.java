package model;

import processing.core.PApplet;

public class ModelE{
	protected PApplet app;
	protected int x;
	protected int y;
	protected int tam;
	protected int vel;
	
	public ModelE(int x, int y, int tam, int vel, PApplet app) {
		this.app = app;
		this.x = x;
		this.y = y;
		this.tam = 30;
	}
}
