package principal;

import java.util.Scanner;

public class Exercicio2 {
	
	public void Method1(){// Imprima Olá Mundo

		System.out.println("Programa que imprime 'OlÃ¡ Mundo':");
		
		System.out.println("Hello world");
		System.out.println("");
				
			
}	public void Method2(){//Receba um número e imprima
		
		System.out.println("Programa que imprime o número recebido:");
		
		Scanner leia = new Scanner (System.in);
		System.out.println("Entre com um número:");
		int numeroValor =  leia.nextInt();
		System.out.println("O número informado foi: "+numeroValor);
		System.out.println("");

}	public void Method3(){//Dois numeros e imprime soma 
		
		System.out.println("Programa que imprime a soma de dois números recebidos:");
		
		Scanner leia = new Scanner (System.in);
		System.out.println("Entre com o primeiro número:");
		int N1 =  leia.nextInt();
		System.out.println("Entre com o primeiro número:");
		int N2 =  leia.nextInt();
		int result = (N1+N2);
		System.out.println("o resultado da soma de "+N1+" + "+N2+" é: "+result);		
		System.out.println("");

}	public void Method4(){//Receba 4 valores e retorne a mÃ©dia bimestral 

		
		System.out.println("Programa que imprime a MÉDIA BIMESTRAL:");
		
	
		double nota1, nota2, nota3, nota4;
		
		Scanner leia = new Scanner (System.in);
		
		System.out.println("Entre com a primeira nota bimestral:");
		nota1 =  leia.nextInt();
		
		System.out.println("Entre com a segunda nota bimestral:");
		nota2 =  leia.nextInt();
		
		System.out.println("Entre com a terceira nota bimestral:");
		nota3 =  leia.nextInt();
		
		System.out.println("Entre com a quarta nota bimestral:");
		nota4 =  leia.nextInt();
		
		
		double resultado = (nota1 + nota2 + nota3 + nota4)/4;
		System.out.println("O resultado da média bimestral é: "+resultado);
		System.out.println("");

}	public void Method5(){//Receba os ganhos por hora e horas trabalhadas mensal e retorne o salÃ¡rio total mensal
	
		System.out.println("Programa que imprime o salário mensal:");
		
	
		double valorHora, tempoMes;
		
		Scanner leia = new Scanner (System.in);
		
		System.out.println("Quanto voc}e ganha por hora? ");
		valorHora =  leia.nextDouble();
		
		System.out.println("Qual seu total de horas trabalhadas mensal? ");
		tempoMes =  leia.nextDouble();
		
		double salTotal = (valorHora * tempoMes);
				
		System.out.println("O salário total no mês referido é: "+salTotal);
		

}	public void Method6(){//Receba graus em Celsius e retorne em Farhenheit
		
		System.out.println("Programa que imprime o valor de graus Farhenheit para Celsius:");
		
		
		double tempFahr,tempCelsius;
		
		Scanner leia = new Scanner (System.in);
		
		System.out.println("Qual a temperatura em graus Fahrenheit? ");
		tempFahr=  leia.nextDouble();
		
		
		
		double tempTotal = (tempCelsius =5*((tempFahr-32)/9));
		
		
		System.out.println("A temperatura ("+tempFahr+" F° em graus Celsius é: "+tempTotal+" C°");
		System.out.println("");

}	public void Method7(){//Receba graus em Farhenheite retorne em Celsius  

		System.out.println("Programa que imprime o valor de graus Celsius para Farhenheit:");

	
		double tempFahr,tempCelsius;
		
		Scanner leia = new Scanner (System.in);
		
		System.out.println("Qual a temperatura em graus Fahrenheit? ");
		tempCelsius=  leia.nextDouble();
		
		
		
		double tempTotal = (tempFahr =((tempCelsius * 1.8)+ 32 ));
		
		
		System.out.println("A temperatura ("+tempCelsius+" C°em graus Fahrenheit é: "+tempTotal+" F°");
		leia.close();
		
}



}
