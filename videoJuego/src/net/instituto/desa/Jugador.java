package net.instituto.desa;

public class Jugador {
	int y, x;

	
	public void subir(int i) {
		this.y = this.y + i;
		
	}
	
	public void bajar(int i) {
		
		this.y = this.y - i;
		
	}

	public void izquierda(int i) {
		
		this.x = this.x - i;
		
	}
	
	public void derecha(int i) {
		
		this.x = this.x + i;
		
	}



}
