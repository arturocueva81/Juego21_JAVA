package com.krakedev.juegos.entidades;

import java.util.ArrayList;

public class Jugador {
	
	//6. Clase Jugador
	private String nickname;
	private ArrayList<Carta> cartas = new ArrayList<Carta>();
	
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
	
	//6 metodo recibirCarta
	public void recibirCarta(Carta c) {
		cartas.add(c);
	}

}
