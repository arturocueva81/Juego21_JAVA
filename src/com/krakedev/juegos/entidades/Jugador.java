package com.krakedev.juegos.entidades;

import java.util.ArrayList;

public class Jugador {
	
	//6. Clase Jugador
	private String nickname;
	private ArrayList<Carta> cartas = new ArrayList<Carta>();
	
	//9 CalcularTotal
	private int puntajeCartas;
	
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public ArrayList<Carta> getCartas() {
		return cartas;
	}
	public void setCartas(ArrayList<Carta> cartas) {
		this.cartas = cartas;
	}
	
	public int getPuntajeCartas() {
	    return puntajeCartas;
	}

	public void setPuntajeCartas(int puntajeCartas) {
	    this.puntajeCartas = puntajeCartas;
	}
	
	//6 metodo recibirCarta
	public void recibirCarta(Carta c) {
		cartas.add(c);
	}
	
	//7 metodo imprimir
	public void imprimir() {
	    System.out.println("Jugador: " + nickname +", Puntaje: "+puntajeCartas);
	    for (Carta carta : cartas) {
	        carta.imprimir();
	    }
	}

}
