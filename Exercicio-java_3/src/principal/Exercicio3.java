package principal;

import javax.swing.JOptionPane;

public class Exercicio3 {

	//public void Pro1(){
	public static void main(String[] args) {
		//Fa�a um programa que receba o salario base de um funcion�rio (salario bruto) fa�a o desconto de inss 5% e IR 11% 
		//mostre o valor dos descontos, e o valor do salario liquido;

		
		double salarioLiquido;
		double salarioLiquido1;
				
		String salBruto= "";
	    salBruto= JOptionPane.showInputDialog("Digite o sal�rio base (bruto): ");
	        
	    String msg = "o sal�rio l�quido �: ";
	    
	    //String msg2 = "";
	    
	    salarioLiquido = Integer.parseInt(salBruto) - (Integer.parseInt(salBruto) * 5/100) ;
	    salarioLiquido1 = salarioLiquido - (Integer.parseInt(salBruto) * 11/100)  ;
	    JOptionPane.showMessageDialog(null, msg + salarioLiquido1);
	}
	public void Pro2(){
		// Fa�a um aplicativo que receba o ano de nascimento e o ano atual e mostre na tela sua idade;
		
	   	int idade;
	    
	    String anoNasc = "";
	    anoNasc = JOptionPane.showInputDialog("Digite o ano do seu nascimento: ");
	    
	    String anoAtual= "";
	    anoAtual = JOptionPane.showInputDialog("Digite o ano atual: ");
	    
	    String msg = "Sua idade �: ";
	    
	    String msg2 = " anos";
	    
	    idade = Integer.parseInt(anoAtual) - Integer.parseInt(anoNasc) ;
	    JOptionPane.showMessageDialog(null, msg + idade + msg2);
	    

	}

}
