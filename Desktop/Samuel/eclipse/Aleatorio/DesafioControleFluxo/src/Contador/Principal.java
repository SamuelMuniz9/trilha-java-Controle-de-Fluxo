package Contador;

import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		Scanner terminal = new Scanner(System.in);
		
		System.out.println("Digite o primeiro parâmetro");
		int parametroUm = terminal.nextInt();
		System.out.println("Digite o segundo parâmetro");
		int parametroDois = terminal.nextInt();
		
		terminal.close();
		
		//ele cria os parametros ja na hora de pegar as informações com o scanner
		
		try {
			//chamando o método contendo a lógica de contagem
			contar(parametroUm, parametroDois);
		
		}catch (ParametrosInvalidosException e) {
			  System.out.println("Erro: " + e.getMessage());
			
		}
		
	}
	static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
		//validar se parametroUm é MAIOR que parametroDois e lançar a exceção
		if( parametroUm >= parametroDois) {
			throw new ParametrosInvalidosException("O segundo parametro tem que ser maior que o primeiro");
			
		//por que nao precisa de return? 
		} 
		
	
		
		int resultado = (parametroDois - parametroUm);  
			for( int numero = 1; numero <= resultado; numero++)
			System.out.println("Imprimindo o número" + numero); 
			
	
	}

}
