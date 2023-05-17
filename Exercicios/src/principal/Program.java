package principal;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		//Faça um programa que mostre a mensagem "Olá mundo" na tela.
		
			System.out.println("Hello World");

		
}			public void Exercicio2(){
		//Faça um programa que peça um número e imprima.
		
			Scanner leia = new Scanner (System.in);
			System.out.println("Entre com um número:");
			int numeroValor =  leia.nextInt();
			System.out.println("O número informado foi: "+numeroValor);
		    leia.close();
			
			
			
}			public void Exercicio3(){
				//Faça um programa que receba dois numeros e imprime soma 

				int N1 = 5;
				int N2 = 10;
				int result = (N1+N2);
				System.out.println("o resultado é: " +result);		
			}
			
	}


