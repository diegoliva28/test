package ar.edu.unlam.dominio;

import java.util.Iterator;

public class Ahorcado {
		
	
	private int vidas;
	private char [] palabraAAdivinar;
	private char [] palabraAdivinada;
	private String nombre;
	
	public Ahorcado(String nombre, String palabra) {
		this.palabraAAdivinar=new char[palabra.length()];
		this.palabraAdivinada=new char[palabra.length()];
		this.palabraAAdivinar=palabra.toCharArray();
		this.vidas=6;
		this.nombre=nombre;
		for (int i = 0; i < palabraAdivinada.length; i++) {
			this.palabraAdivinada[i]='-';
		}
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public String getPalabraAdivinada() {
		String respuesta="";
		for (int i = 0; i < palabraAdivinada.length; i++) {
			respuesta+=this.palabraAdivinada[i]+" ";
		}
		return respuesta;
	}
	
	public boolean ingresarLetra(char letra) {
		boolean respuesta=false;
		if(vidas!=0) {
			int coincidencias=0;
			for(int i=0;i < this.palabraAdivinada.length;i++) {
				if(letra==this.palabraAAdivinar[i]) {
					this.palabraAdivinada[i]= letra;
					coincidencias++;
				}
			}
			if(coincidencias==0) {
				this.vidas--;
			}else 
				respuesta=true;
		}
		return respuesta;
		}
	

	public boolean arriesgar(String palabra) {
		boolean respuesta=false;
		if(vidas!=0) {
			this.palabraAdivinada=palabra.toCharArray();
			int descoincidencias=0;
			for (int i = 0; i < palabraAAdivinar.length; i++) {
				if(palabraAdivinada[i]!= palabraAAdivinar[i]) {
					descoincidencias++;
				}
			}
			if(descoincidencias!=0) {
				this.vidas=0;
			}else 
				respuesta=true;
		}
		return respuesta;
	}
	
	public int getVidas() {
		return this.vidas;
	}
	
}
