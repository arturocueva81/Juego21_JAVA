package com.krakedev.juegos.test;

import com.krakedev.juegos.servicios.Dealer;

public class TestConstructorDealer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dealer d= new Dealer();
		
		System.out.println("NAIPES GENERADOS : ");
		d.imprimirNaipe();
		System.out.println("\nTOTAL: "+d.getNaipe().size()+" cartas generadas");
	}
}