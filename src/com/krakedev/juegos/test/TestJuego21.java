package com.krakedev.juegos.test;

import java.util.ArrayList;

import com.krakedev.juegos.entidades.Jugador;
import com.krakedev.juegos.servicios.Juego21;

public class TestJuego21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//8 Prueba del juego
		Juego21 juego = new Juego21();
        
		//8 invoca inicializar
		juego.inicializar();

        Jugador j1 = new Jugador();
        j1.setNickname("J_Uno");
        Jugador j2 = new Jugador();
        j2.setNickname("J_Dos");
        Jugador j3 = new Jugador();
        j3.setNickname("J_Tres");

        //8 agrega 3 jugadores
        juego.agregarJugador(j1);
        juego.agregarJugador(j2);
        juego.agregarJugador(j3);
        
        //8 invoca repartirRonda
        juego.repartirRonda();
        //9 CalulcarTotal -- acumula puntaje de cada ronda
        juego.repartirRonda();
        juego.repartirRonda();
        
        System.out.println("PUNTAJES");
        for (int i = 0; i < juego.getJugadores().size(); i++) {
            juego.getJugadores().get(i).imprimir();
        }

        System.out.println("\nCartas restantes en naipe: "+ juego.getDealer().getNaipe().size());
        
        ArrayList<Jugador> ganadores = juego.validarGanador();

        System.out.println("\nGANADORES CON 21");
        if (ganadores.size() > 0) {
            for (int i = 0; i < ganadores.size(); i++) {
                System.out.println("Ganador: " + ganadores.get(i).getNickname()
                        + " | Puntaje: " + ganadores.get(i).getPuntajeCartas());
            }
        } else {
            System.out.println("Ningún jugador alcanzó 21 en esta ronda");
        }


	}

}
