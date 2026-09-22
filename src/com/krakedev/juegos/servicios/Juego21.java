package com.krakedev.juegos.servicios;

import java.util.ArrayList;
import com.krakedev.juegos.entidades.Carta;
import com.krakedev.juegos.entidades.Jugador;

public class Juego21 {
	
	//7. Clase Juego21
	private ArrayList<Jugador> jugadores;
    private Dealer dealer;
    
    
    //getters y setters
    public ArrayList<Jugador> getJugadores() {
		return jugadores;
	}

	public void setJugadores(ArrayList<Jugador> jugadores) {
		this.jugadores = jugadores;
	}

	public Dealer getDealer() {
		return dealer;
	}

	public void setDealer(Dealer dealer) {
		this.dealer = dealer;
	}

	//7. Metodo cargarValores
    public void cargarValores() {
        for (int i = 0; i < dealer.getNaipe().size(); i++) {
            Carta carta = dealer.getNaipe().get(i);

            if (carta.getValor().equals("A")) {
                carta.setValorJuego(11);
            } else if (carta.getValor().equals("J") ||
                       carta.getValor().equals("Q") ||
                       carta.getValor().equals("K")) {
                carta.setValorJuego(10);
            } else {
                carta.setValorJuego(Integer.parseInt(carta.getValor()));
            }
        }
    } 
    
    //7. metodo inicializar
    public void inicializar() {
        jugadores = new ArrayList<Jugador>();
        dealer = new Dealer();
        cargarValores();
    }
    
    //7. metodo agregarJugador
    public void agregarJugador(Jugador jugador) {
        jugadores.add(jugador);
    }
    
    //7 metodo repartirCarta
    public void repartirCarta(Jugador jugador) {
        Carta carta = dealer.entregarCarta();
        jugador.recibirCarta(carta);
    }
    
    //7 metodo repartirRonda
    public void repartirRonda() {
        for (int i = 0; i < jugadores.size(); i++) {
            repartirCarta(jugadores.get(i));
        }
        //9 calcularTotal
        calcularTotal();
    }
    
    //9 CalcularTotal
    public void calcularTotal() {
        for (int i = 0; i < jugadores.size(); i++) {
            Jugador jugador = jugadores.get(i);
            int total = 0;
            for (int j = 0; j < jugador.getCartas().size(); j++) {
                total = total + jugador.getCartas().get(j).getValorJuego();
            }
            jugador.setPuntajeCartas(total);
        }
    }

}
