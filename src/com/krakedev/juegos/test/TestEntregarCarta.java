package com.krakedev.juegos.test;

import com.krakedev.juegos.entidades.Carta;
import com.krakedev.juegos.servicios.Dealer;

public class TestEntregarCarta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dealer dealer = new Dealer();
		int numCartas =10;

        System.out.println("Cartas en el naipe antes de repartir: " + dealer.getNaipe().size());
        System.out.println("\nCARTAS ENTREGADAS: ");
        
        for (int i = 0; i < numCartas; i++) {
            Carta carta = dealer.entregarCarta();
            carta.imprimir();
        }

        System.out.println("\nCartas en el naipe después de repartir: " + dealer.getNaipe().size());

        if (dealer.getNaipe().size() == 42) {
            System.out.println("Se eliminaron correctamente "+numCartas+ " cartas del naipe");
        } else {
            System.out.println("Error: el naipe no tiene el tamaño esperado");
        }
	}
}
