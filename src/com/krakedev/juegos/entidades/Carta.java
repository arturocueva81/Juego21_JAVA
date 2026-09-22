package com.krakedev.juegos.entidades;

public class Carta {
	
	private String valor;
	private int valorJuego;
	private String palo;
	
	//1 CLASE CARTA getters y seters
	public String getValor() {
		return valor;
	}
	public void setValor(String valor) {
		this.valor = valor;
	}
	public int getValorJuego() {
		return valorJuego;
	}
	public void setValorJuego(int valorJuego) {
		this.valorJuego = valorJuego;
	}
	public String getPalo() {
		return palo;
	}
	public void setPalo(String palo) {
		this.palo = palo;
	}
	
	//1 CLASE CARTA metodo imprimir 
	
	public void imprimir() {
		System.out.print("Carta: "+valor);
		System.out.print(" Palo: "+palo);
		System.out.print(" Valor Juego: "+valorJuego+"\n");
		

	}

}
