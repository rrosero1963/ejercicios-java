package com.arkaitzgarro.arrays;

import java.util.Arrays;

public class EJ4_01 {

	/**
	 * Construir un programa que pida al usuario una serie de n�meros enteros,
	 * los almacene en un array, y obtenga el m�ximo y el m�nimo de los valores almacenados.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		int[] numeros;
		int max, min;
		
		numeros = new int[10];
		// Inicializar el array de n�meros
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = (int) (100*Math.random()+1);
		}
		
		// System.out.println(Arrays.toString(numeros));
		
		max = Integer.MIN_VALUE;
		// Calcular el m�ximo
		for (int i = 0; i < numeros.length; i++) {
			if(numeros[i] > max) 
				max = numeros[i];
		}
		
		System.out.println("El m�ximo es: " + max);
		
		min = Integer.MAX_VALUE;
		// Calcular el m�ximo
		for (int i = 0; i < numeros.length; i++) {
			if(numeros[i] < min) 
				min = numeros[i];
		}
		
		System.out.println("El m�nimo es: " + min);
		
		Arrays.sort(numeros);
		System.out.println("El minimo es: " + numeros[0]);
		System.out.println("El maximo es: " + numeros[numeros.length - 1]);
		
	}

}
