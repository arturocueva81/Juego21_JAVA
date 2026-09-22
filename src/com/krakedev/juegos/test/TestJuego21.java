package com.krakedev.juegos.test;

import com.krakedev.juegos.entidades.Jugador;
import com.krakedev.juegos.servicios.Juego21;

public class TestJuego21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Juego21 juego = new Juego21();
        juego.inicializar();

        Jugador j1 = new Jugador();
        j1.setNickname("J_Uno");
        Jugador j2 = new Jugador();
        j2.setNickname("J_Dos");
        Jugador j3 = new Jugador();
        j3.setNickname("J_Tres");

        juego.agregarJugador(j1);
        juego.agregarJugador(j2);
        juego.agregarJugador(j3);
        juego.repartirRonda();

        System.out.println("RONDA 1");
        for (int i = 0; i < juego.getJugadores().size(); i++) {
            juego.getJugadores().get(i).imprimir();
        }

        System.out.println("Cartas restantes en baraja: "+ juego.getDealer().getNaipe().size());

	}

}
