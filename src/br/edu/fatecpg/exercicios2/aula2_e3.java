package br.edu.fatecpg.exercicios2;

import java.util.Scanner;

public class aula2_e3 {

	public static void main(String[] args) {
//		Desenvolva um código que realiza a transposição de uma matriz (as colunas viram
//		linhas e as linhas viram colunas). Peça aos usuários para inserirem os elementos
//		da matriz, exibindo a matriz transposta no console.
		Scanner scan = new Scanner(System.in);
		
		int[][] matriz = new int[3][3];
		
		for (int l = 0; l < 3; l++) {
			for (int c = 0; c < 3; c++) {
				System.out.println("digite o numero da linha "+ (l+1) +" coluna "+(c+1));
				matriz[l][c] = scan.nextInt();
			}
		}
		
		int[][] transposicao = new int[3][3];
		
		for (int c = 0; c < 3; c++) {
			for (int l = 0; l < 3; l++) {
				System.out.print(matriz[l][c]);
			}
			System.out.print("\n");
		}
	}

}
