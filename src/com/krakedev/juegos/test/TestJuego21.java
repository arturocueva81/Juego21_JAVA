package com.krakedev.juegos.test;

import java.util.ArrayList;

import com.krakedev.juegos.entidades.Jugador;
import com.krakedev.juegos.servicios.Juego21;

public class TestJuego21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//12 Pruebas Fianles - modificacion de la clase
		//PRIMERA PRUEBA
		System.out.println(" PRIMERA PRUEBA");
		Juego21 juego = new Juego21();
        juego.inicializar();

        Jugador j1 = new Jugador();
        j1.setNickname("J_UNO");

        Jugador j2 = new Jugador();
        j2.setNickname("J_DOS");

        Jugador j3 = new Jugador();
        j3.setNickname("J_TRES");

        juego.agregarJugador(j1);
        juego.agregarJugador(j2);
        juego.agregarJugador(j3);

        //ejecutar jugar
        ArrayList<Jugador> ganadores = juego.jugar();

        System.out.println("\n PUNTAJES FINALES: ");
        for (int i = 0; i < juego.getJugadores().size(); i++) {
            juego.getJugadores().get(i).imprimir();
        }

        System.out.println("\n RESULTADO: ");
        if (ganadores.size() > 0) {
            for (int i = 0; i < ganadores.size(); i++) {
                System.out.println(" Ganador: " + ganadores.get(i).getNickname()
                        + " | Puntaje: " + ganadores.get(i).getPuntajeCartas());
            }
        } else {
            System.out.println("Ningún jugador alcanzó 21 en 3 rondas");
        }
        
        //SEGUNDA PRUEBA
        System.out.println(" SEGUNDA PRUEBA");
        //envolver en un for de 10 iteraciones
        for (int partida = 1; partida <= 10; partida++) {
            System.out.println("\nPARTIDA " + partida);

            juego.inicializar();

            Jugador p1 = new Jugador();
            p1.setNickname("J_UNO");

            Jugador p2 = new Jugador();
            p2.setNickname("J_DOS");

            Jugador p3 = new Jugador();
            p3.setNickname("J_TRES");

            juego.agregarJugador(p1);
            juego.agregarJugador(p2);
            juego.agregarJugador(p3);

            ArrayList<Jugador> resultado = juego.jugar();

            for (int i = 0; i < juego.getJugadores().size(); i++) {
                Jugador jug = juego.getJugadores().get(i);
                System.out.println("  " + jug.getNickname()
                        + " → Puntaje: " + jug.getPuntajeCartas());
            }

            if (resultado.size() > 0) {
                for (int i = 0; i < resultado.size(); i++) {
                    System.out.println(" Ganador: " + resultado.get(i).getNickname()
                            + " | Puntaje: " + resultado.get(i).getPuntajeCartas());
                }
            } else {
                System.out.println("  Sin ganadores en esta partida");
            }
        }
        
	}

}
