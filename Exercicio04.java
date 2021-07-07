package br.com.generation.AulaDia06;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {

	
		Scanner read = new Scanner(System.in);
		double[][] n1 = new double[4][6];
		double[][] n2 = new double[4][6];
		double[][] m1 = new double[4][6];
		double[][] m2 = new double[4][6];

	
		for(int l = 0; l < n1.length; l++) {
			for(int c = 0; c < n1[l].length; c++) {
				System.out.printf("Insira os valores da Matriz N1: [%d][%d]", l,c);
				n1[l][c] = read.nextDouble();
				System.out.printf("Insira os valores da Matriz N2: [%d][%d]", l,c);
				n2[l][c] = read.nextDouble();

				
				m1[l][c] = n1[l][c] + n2[l][c];
				m2[l][c] = n1[l][c] - n2[l][c];

			}
			System.out.println("");
		}

		System.out.print("===Matriz M1====\n");

		for(int l = 0; l < n1.length ; l++) {
			for(int c = 0; c < n1[l].length; c++) {
				System.out.print(m1[l][c]+ " | ");	
			}
			System.out.print("\n");

		}
		
		System.out.print("\n===Matriz M2====\n");

		for(int l = 0; l < n2.length ; l++) {
			for(int c = 0; c < n2[l].length; c++) {
				System.out.print(m2[l][c]+ " | ");	
			}
			System.out.println("");
		}
		read.close();
	}
} 
