package com.krakedev.juegos.servicios;

import java.util.ArrayList;
import com.krakedev.juegos.entidades.Carta;

public class Dealer {
	// 2. Clase Dealer
	private ArrayList<Carta> naipe;
	
	//2 constructor
	public Dealer() {
	    naipe = new ArrayList<Carta>();
	    generarNaipe();
	}
	
	//2. getters y setters
	public ArrayList<Carta> getNaipe() {
		return naipe;
	}

	public void setNaipe(ArrayList<Carta> naipe) {
		this.naipe = naipe;
	}

	
	//2. metodo genrar naipe
	public void generarNaipe() {
		ArrayList<String> palos = new ArrayList<String>();
		
		palos.add("CN"); // corazon negro
		palos.add("T "); //trebol
		palos.add("CR"); // corazon rojo
		palos.add("D "); // diamante
		
		String [] valores = {" A"," 2"," 3"," 4"," 5"," 6"," 7"," 8"," 9","10"," J"," Q"," K"};
		
		for (int i = 0; i < palos.size(); i++) {
	        for (int j = 0; j < valores.length; j++) {
	            Carta carta = new Carta();
	            carta.setPalo(palos.get(i));
	            carta.setValor(valores[j]);
	            naipe.add(carta);
	        }
	    }
	}
	
	//2 metodo imprimirNaipe
	public void imprimirNaipe() {
	    for (Carta carta : naipe) {
	        carta.imprimir();
	    }
	}
}