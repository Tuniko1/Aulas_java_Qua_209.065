package principal;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		//Fa�a um programa que mostre a mensagem "Ol� mundo" na tela.
		
			System.out.println("Hello World");

		
}			public void Exercicio2(){
		//Fa�a um programa que pe�a um n�mero e imprima.
		
			Scanner leia = new Scanner (System.in);
			System.out.println("Entre com um n�mero:");
			int numeroValor =  leia.nextInt();
			System.out.println("O n�mero informado foi: "+numeroValor);
		    leia.close();
			
			
			
}			public void Exercicio3(){
				//Fa�a um programa que receba dois numeros e imprime soma 

				int N1 = 5;
				int N2 = 10;
				int result = (N1+N2);
				System.out.println("o resultado �: " +result);		
			}
			
	}


