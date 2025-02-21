package br.edu.fatecpg.exercicios2;



public class aula2_e1 {

	public static void main(String[] args) {
		
		//Desenvolva um programa que realiza a soma de duas matrizes 3X3,
		//exibindo o resultado no console. 
		
		int[][] matriz1 = new int[3][3];
		int[][] matriz2 = new int[3][3];
		
		//populando matrizes
		for (int l = 0; l < 3; l++) {
			for (int c = 0; c < 3; c++) {
				matriz1[l][c] = l;
			}
		}
		
		for (int l = 0; l < 3; l++) {
			for (int c = 0; c < 3; c++) {
				matriz2[l][c] = l+1;
			}
		}
		
		//somando matrizes
		int[][] matrizSum = new int[3][3];
		for (int l = 0; l < 3; l++) {
			for (int c = 0; c < 3; c++) {
				matrizSum[l][c] = matriz1[l][c]+matriz2[l][c];
			}
		}
		
		//exibindo calculo
		for (int l = 0; l < 3; l++) {
			for (int c = 0; c < 3; c++) {
				System.out.print(matriz1[l][c]);
			}
			
			if (l == 1) {
				System.out.print(" + ");
			} else {
				System.out.print("   ");
			}
			
			for (int c = 0; c < 3; c++) {
				System.out.print(matriz2[l][c]);
			}
			
			if (l == 1) {
				System.out.print(" = ");
			} else {
				System.out.print("   ");
			}
			
			for (int c = 0; c < 3; c++) {
				System.out.print(matrizSum[l][c]);
			}
			System.out.print("\n");
		}
		
	}

}
