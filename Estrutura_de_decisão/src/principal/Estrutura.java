package principal;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Estrutura {
	
	public static void p1(){
		//Fa�a um programa que leia 3 n�meros e mostre o maior deles;

			String firstNumber = JOptionPane.showInputDialog("Entre com o primeiro n�mero: ");
		    String secondNumber = JOptionPane.showInputDialog("Entre com o segundo n�mero: ");
		    String thirdNumber = JOptionPane.showInputDialog("Entre com o terceiro n�mero: ");
		    
		    int n1 = Integer.parseInt(firstNumber);
		    int n2 = Integer.parseInt(secondNumber);
		    int n3 = Integer.parseInt(thirdNumber);
		    
		    String msg = "o maior n�mero �: ";
		    
		    if (n1 > n2 && n1 > n3) {
		    JOptionPane.showMessageDialog(null, msg + firstNumber);
		    
			}else if (n2 > n1 && n2 > n3) {
			JOptionPane.showMessageDialog(null, msg + secondNumber);
			}else if (n3 > n1 && n3 > n1) {
			JOptionPane.showMessageDialog(null, msg + thirdNumber);	
			} 
				
		    //Fa�a um programa que pe�a para o usu�rio entrar com um ano e dizer se esse ano �  bissexto ou n�o;
	}public static void p2(){

		String ano = JOptionPane.showInputDialog("Entre com o ano: ");
		int year = Integer.parseInt(ano);
		
		String msg = "� um ano bissexto!";
		String msg2 = "N�o � um ano bissexto!";
		if ((year % 4 == 0 && year % 100!= 0) || year % 400 == 0) {
			JOptionPane.showMessageDialog(null, msg);
		
		}else JOptionPane.showMessageDialog(null, msg2);
	
		/*Fa�a
		um programa que leia 4 notas de um aluno e retorne a media, se media maior que
		5 e menor que 6 reprovado, se media entre 6 e 7 recupera��o, se media acima de
		7 aprovado, se media 10 aprovado com honras;*/
	}public static void p3(){
		
		String n1 = JOptionPane.showInputDialog("Entre com o primeiro n�mero: ");
		int number1 = Integer.parseInt(n1);
		
		String n2 = JOptionPane.showInputDialog("Entre com o primeiro n�mero: ");
		int number2 = Integer.parseInt(n2);
		
		String n3 = JOptionPane.showInputDialog("Entre com o primeiro n�mero: ");
		int number3 = Integer.parseInt(n3);
	
		String n4 = JOptionPane.showInputDialog("Entre com o primeiro n�mero: ");
		int number4 = Integer.parseInt(n4);
				
		String msg = "Reprovado! m�dia: ";
		String msg2 = "Recupera��o! m�dia: ";
		String msg3 = "Aprovado! m�dia: ";
		String msg4 = "Aprovado com Honras! m�dia: ";
		
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
