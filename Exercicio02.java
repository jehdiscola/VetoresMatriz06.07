package br.com.generation.AulaDia06;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
	

			Scanner read = new Scanner(System.in);

			int[] arrayVetor = new int[5];
			int i, maior = 0, maiorOcorrencia = 0, soma = 0;
			double media = 0.0;

			for (i = 0; i < arrayVetor.length; i++) {
				System.out.print("Digite o " + (i+1) + "º lançamento: ");
				arrayVetor[i] = read.nextInt();
				soma += arrayVetor[i];
				media = soma/5;

				if (arrayVetor[i] > maior ) {
					maior = arrayVetor[i];
				}
				if (arrayVetor[i] == maior) {
					maiorOcorrencia++;
				}
			}
			System.out.println("\nA média dos lançamentos é :" + media);
			System.out.println("O maior valor apareceu " + maiorOcorrencia + " vezes");
			read.close();
		}	


	}

