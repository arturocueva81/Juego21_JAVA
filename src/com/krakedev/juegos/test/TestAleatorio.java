package com.krakedev.juegos.test;

import com.krakedev.juegos.servicios.Dealer;

public class TestAleatorio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dealer dealer = new Dealer();
        int maximo = 13;

        boolean encontroCero = false;
        boolean encontroMaximo = false;
        boolean sePasoDelMaximo = false;

        System.out.println("=== 100 NÚMEROS ALEATORIOS (0 a " + maximo + ") ===");

        for (int i = 0; i < 100; i++) {
            int aleatorio = dealer.generarAleatorio(maximo);
            System.out.print(aleatorio + " ");

            // Verificar condiciones
            if (aleatorio == 0) {
                encontroCero = true;
            }
            if (aleatorio == maximo) {
                encontroMaximo = true;
            }
            if (aleatorio > maximo) {
                sePasoDelMaximo = true;
            }
        }

        // Resultados de validación
        System.out.println("\n\n=== VALIDACIONES ===");

        if (encontroCero) {
            System.out.println("Se generó el valor 0");
        } else {
            System.out.println("No se generó el valor 0 en esta ejecución");
        }

        if (encontroMaximo) {
            System.out.println("Se generó el valor máximo (" + maximo + ")");
        } else {
            System.out.println("No se generó el valor máximo en esta ejecución");
        }

        if (!sePasoDelMaximo) {
            System.out.println("Ningún valor superó el máximo (" + maximo + ")");
        } else {
            System.out.println("ERROR: Se generó un valor mayor al máximo");
        }
    }
}