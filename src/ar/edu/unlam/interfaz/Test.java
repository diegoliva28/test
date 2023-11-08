package ar.edu.unlam.interfaz;

import java.util.Scanner;

import ar.edu.unlam.dominio.Ahorcado;
import ar.edu.unlam.dominio.Jugador;

public class Test {

	public static void main(String[] args) {
		Scanner key= new Scanner(System.in);
		Ahorcado juegoNuevoJ1,juegoNuevoJ2;
		String palabraUsuario="";
		char letraUsuario='0';
		String nombreUsuario="";
		int opcion=0;
		
		System.out.println("Bienvenido al Ahorcado");
//		System.out.println("Ingrese el nombre del jugador 1");
//		nombreUsuario=key.next();
//		System.out.println("Ingrese la palabra a adivinar");
//		palabraUsuario=key.next();
//		juegoNuevoJ1=new Ahorcado(nombreUsuario, palabraUsuario);
		juegoNuevoJ1=new Ahorcado("diego", "gurren");
//
//		System.out.println("Ingrese el nombre del jugador 2");
//		nombreUsuario=key.next();
//		System.out.println("Ingrese la palabra a adivinar");
//		palabraUsuario=key.next();
//		juegoNuevoJ2=new Ahorcado(nombreUsuario, palabraUsuario);
		juegoNuevoJ2=new Ahorcado("choco", "laggan");

		int orden = turnoAleatorio();
		do {
			if(orden==0)
			turnoJugador1(juegoNuevoJ2,key);
			if(orden==1)
			turnoJugador2(juegoNuevoJ1,key);
			
			orden = siguienteTurno(orden);
		}while(juegoNuevoJ1.getVidas()!=0 && juegoNuevoJ2.getVidas()!=0);
//		System.out.println(orden);
//		System.out.println(siguienteTurno);
//		Scanner key = new Scanner(System.in);
//
//		Jugador uno = crearJugadores(key);
//		Jugador dos = new Jugador("choco", "foo");
//
//		Ahorcado juego = new Ahorcado(uno, dos);
//
//		char[] x = juego.esconderPalabra(uno);
//
//		int orden = turnoAleatorio();
//
//		int x1 = 0;
//		do {
//
//			if (orden == 0) {
//				System.out.println("Es turno de " + juego.getPlayer1().getNombre());
//				System.out.println(juego.getPalabraAAdivinar2());
//	
//				mostrarOpciones();
//				int opcion = key.nextInt();
//				
//				switch(opcion){
//				case 1:
//					System.out.println("Ingrese una letra");
//					char intento=key.next().charAt(0);
//					juego.getPlayer1().ingresarLetra(intento);
//					juego.setPalabraAAdivinar2(juego.comprobacion(intento, dos));
//				}
//			}
//			if (orden == 1) {
//				System.out.println("Es turno de " + juego.getPlayer2().getNombre());
//				System.out.println(juego.getPalabraAAdivinar1());
//				
//				mostrarOpciones();
//				
//			}
//
//			orden = siguienteTurno(orden);
//			x1++;
//		} while (x1 <= 5);

	}
	
	private static void seleccionDeOpcion(Ahorcado juego, int opcion, Scanner key) {
		switch(opcion) {
		case 1:
			System.out.println("Ingrese una letra");
			juego.ingresarLetra(key.next().charAt(0));
			System.out.println(juego.getPalabraAdivinada());
			System.out.println("A usted le restan "+juego.getVidas()+" vidas.");
			break;
		case 2:
			System.out.println("Ingrese la palabra a arriesgar");
			juego.arriesgar(key.next());
			if(juego.getVidas()!=0) {
				System.out.println("Ha ganado el juego");
			}else {
				System.out.println(juego.getNombre()+" ha perdido");
			}
		}
	}
	
	private static void turnoJugador1(Ahorcado juegoNuevoJ2, Scanner key) {
		System.out.println("Turno del jugador 1: diego ");
		System.out.println(juegoNuevoJ2.getPalabraAdivinada());
		int opcion=0;
		
		mostrarOpciones();
		opcion=key.nextInt();
		
		seleccionDeOpcion(juegoNuevoJ2, opcion, key);
	}
	
	private static void turnoJugador2(Ahorcado juegoNuevoJ1, Scanner key) {
		System.out.println("Turno del jugador 2: choco ");
		System.out.println(juegoNuevoJ1.getPalabraAdivinada());
		int opcion=0;
		
		mostrarOpciones();
		opcion=key.nextInt();
		
		seleccionDeOpcion(juegoNuevoJ1, opcion, key);
	}

	private static void mostrarOpciones() {
		System.out.println("Las opciones son: \n 1. Ingresar letra \n 2. Arriesgar");
	}

//	private static Jugador crearJugadores(Scanner key) {
//		// int contador=contador+1;
//
//		String mensaNombre = "Ingrese el nombre del jugador ";
//		String mensaPalabra = "Ingrese la palabra del jugador ";
//
//		System.out.println(mensaNombre);// +contador
//		// String nombre=key.next();
//		String nombre = "diego";
//		System.out.println(mensaPalabra);// +contador
//		// String palabra=key.next();
//		String palabra = "gurenn";
//
//		Jugador player = new Jugador(nombre, palabra);
//		// contador++;
//		return player;
//	}

	private static int turnoAleatorio() {
		Double random = Math.random();
		if (random < 0.5)
			return 1;
		return 0;
	}

	private static int siguienteTurno(int turnoInicial) {
		if (0 < turnoInicial)
			return 0;
		return 1;
	}
}
