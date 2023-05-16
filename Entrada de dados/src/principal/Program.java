package principal;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		double tempFahr,tempCelsius;
		
		Scanner leia = new Scanner (System.in);
		
		System.out.println("Qual a temperatura em graus Fahrenheit? ");
		tempCelsius=  leia.nextDouble();
		
		
		
		double tempTotal = (tempFahr =((tempCelsius * 1.8)+ 32 ));
		
		
		System.out.println("A temperatura ("+tempCelsius+" C°)em graus Fahrenheit é: "+tempTotal);
		leia.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*
		
			int    numeroValor = 10;
			double preçoDaCamisa = 10.5;
			String nomeDoAluno = "Arthur";
			char sexoGenero = 'M';
			
			Scanner leia = new Scanner (System.in);
			
			System.out.println("Escreva seu nome: ");		
			nomeDoAluno =  leia.nextLine();
			
			System.out.println("Entre com seu sexo:");
			sexoGenero =  leia.next().charAt(0);
			
			System.out.println("Entre com sua idade:");
			numeroValor =  leia.nextInt();
			
			System.out.println("Entre com o preço da camisa:");
			preçoDaCamisa =  leia.nextDouble();
			
			System.out.println("Seu nome nome é: "+nomeDoAluno);
			System.out.println("Seu nome nome é: "+sexoGenero);
			System.out.println("Seu nome nome é: "+numeroValor);
			System.out.println("Seu nome nome é: R$ "+preçoDaCamisa);
				
		
		leia.close();*/
		
		/*
		JFrame frame = new JFrame("JOptionPane exemplo");

		
		int resposta = JOptionPane.showConfirmDialog(frame,"Masculino", "Feminino", JOptionPane.DEFAULT_OPTION);
		String[] choices = {"Masculino", "Feminino"};
	    if (resposta == JOptionPane.) {
	        JOptionPane.showMessageDialog(null, "Sexo Masculino");
	      }
	      else {
	         JOptionPane.showMessageDialog(null, "Sexo Feminino");
	         System.exit(0);
	      }
	    System.exit(0);
	*/
	}

}
