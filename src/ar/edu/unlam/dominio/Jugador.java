package ar.edu.unlam.dominio;

import java.util.Scanner;

public class Jugador {
	private String nombre;
	private String palabraElegida;
	private int chances;
	private boolean ganador=false;
	private char intento;


	public Jugador(String nombre, String palabraElegida) {
		this.nombre = nombre;
		this.palabraElegida = palabraElegida;
		this.chances = 6;
		this.intento=' ';
	}

	public boolean arriesgar(String palabra) {
		boolean acierto =false;

		return acierto;
	}

	public void ingresarLetra(char letra) {
			this.intento=letra;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPalabraElegida() {
		return palabraElegida;
	}

	public void setPalabraElegida(String palabraElegida) {
		this.palabraElegida = palabraElegida;
	}

	public int getChances() {
		return chances;
	}

	public void setChances(int chances) {
		this.chances = chances;
	}

	public boolean isGanador() {
		return ganador;
	}

	public void setGanador(boolean ganador) {
		this.ganador = ganador;
	}
	
}
