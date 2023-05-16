package principal;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Estrutura {
	
	public static void p1(){
		//Faça um programa que leia 3 números e mostre o maior deles;

			String firstNumber = JOptionPane.showInputDialog("Entre com o primeiro número: ");
		    String secondNumber = JOptionPane.showInputDialog("Entre com o segundo número: ");
		    String thirdNumber = JOptionPane.showInputDialog("Entre com o terceiro número: ");
		    
		    int n1 = Integer.parseInt(firstNumber);
		    int n2 = Integer.parseInt(secondNumber);
		    int n3 = Integer.parseInt(thirdNumber);
		    
		    String msg = "o maior número é: ";
		    
		    if (n1 > n2 && n1 > n3) {
		    JOptionPane.showMessageDialog(null, msg + firstNumber);
		    
			}else if (n2 > n1 && n2 > n3) {
			JOptionPane.showMessageDialog(null, msg + secondNumber);
			}else if (n3 > n1 && n3 > n1) {
			JOptionPane.showMessageDialog(null, msg + thirdNumber);	
			} 
				
		    //Faça um programa que peça para o usuário entrar com um ano e dizer se esse ano é  bissexto ou não;
	}public static void p2(){

		String ano = JOptionPane.showInputDialog("Entre com o ano: ");
		int year = Integer.parseInt(ano);
		
		String msg = "É um ano bissexto!";
		String msg2 = "Não é um ano bissexto!";
		if ((year % 4 == 0 && year % 100!= 0) || year % 400 == 0) {
			JOptionPane.showMessageDialog(null, msg);
		
		}else JOptionPane.showMessageDialog(null, msg2);
	
		/*Faça
		um programa que leia 4 notas de um aluno e retorne a media, se media maior que
		5 e menor que 6 reprovado, se media entre 6 e 7 recuperação, se media acima de
		7 aprovado, se media 10 aprovado com honras;*/
	}public static void p3(){
		
		String n1 = JOptionPane.showInputDialog("Entre com o primeiro número: ");
		int number1 = Integer.parseInt(n1);
		
		String n2 = JOptionPane.showInputDialog("Entre com o primeiro número: ");
		int number2 = Integer.parseInt(n2);
		
		String n3 = JOptionPane.showInputDialog("Entre com o primeiro número: ");
		int number3 = Integer.parseInt(n3);
	
		String n4 = JOptionPane.showInputDialog("Entre com o primeiro número: ");
		int number4 = Integer.parseInt(n4);
				
		String msg = "Reprovado! média: ";
		String msg2 = "Recuperação! média: ";
		String msg3 = "Aprovado! média: ";
		String msg4 = "Aprovado com Honras! média: ";
		
		double media = (number1 + number2+ number3 + number4) / 4;
		
		if(media < 6) {
			JOptionPane.showMessageDialog(null, msg + media);
			
		}else if (media >= 6 && media < 7) {
			JOptionPane.showMessageDialog(null, msg2 + media);
		}else if (media >=7 && media < 10){
			JOptionPane.showMessageDialog(null, msg3 + media);
		}else {
		JOptionPane.showMessageDialog(null, msg4 + media);}
		}
}
