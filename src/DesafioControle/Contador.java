package DesafioControle;

import java.util.Scanner;

public class Contador {

	public static void main(String[] args) {
		Scanner terminal = new Scanner(System.in);
		
		System.out.println("Digite o primeiro parametro: ");
		int parametroUm = terminal.nextInt();
		System.out.println("Digite o segundo parametro: ");
		int parametroDois = terminal.nextInt();
		
		try {
			
			//chamando o metodo contendo a logica de contagem
			contar(parametroUm , parametroDois);
		}catch (ParametrosInvalidosException e) {
			System.out.println(e.getMessage());
			//imprimir a mensagem: O segundo parametro deve ser maior que o primeiro
		}

	}
	static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
		//validade se parametroUm é maior que parametroDOis e lançar a exceçao 
		
		int contagem = parametroDois - parametroUm;
		//realizar o for para imprimir os numeros com base na variavel contagem
		for (int i = 1; i <= contagem; i++) {
			System.out.println("IMprimindo o numero " + i);
		}
	}

}
