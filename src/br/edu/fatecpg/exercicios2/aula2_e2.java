package br.edu.fatecpg.exercicios2;

import java.util.Scanner;

public class aula2_e2 {

	public static void main(String[] args) {
		// Crie um programa que verifique se um login e senha confere com os dados de
		// uma matriz 6x2.
		
		Scanner scan = new Scanner(System.in);
		
		String[][] loginSenha = {{"login1","senha1"},
								 {"login2","senha2"},
								 {"login3","senha3"},
								 {"login4","senha4"},
								 {"login5","senha5"},
								 {"login6","senha6"},};
		
		System.out.println("digite seu log-in");
		String login = scan.nextLine();
		
		System.out.println("digite sua senha");
		String senha = scan.nextLine();
		
		for (int l = 0; l < 6; l++) {
			if (login.equals(loginSenha[l][0]) && senha.equals(loginSenha[l][1])) {
				System.out.println("Olá " +loginSenha[l][0]);
			} else if (l==5) {
				System.out.println("login e senha incorretos");
			}
		}
	}

}
