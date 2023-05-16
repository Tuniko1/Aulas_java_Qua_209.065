package principal;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Program {

	public static void main(String[] args) {
		// Faça	um programa que leia 3 números e mostre o maior deles;
		
		
		Estrutura e1 = new Estrutura();
		
			
		int dialogButton = JOptionPane.YES_NO_OPTION;
        int n = JOptionPane.showConfirmDialog (null,"Deseja iniciar o programa 1?" ," App - Arthur",dialogButton,3);
        
        if (n == JOptionPane.YES_OPTION) {
            e1.p1();
        }else System.exit(0);

        if (n == JOptionPane.YES_OPTION) {	
        
		int dialogButton2 = JOptionPane.YES_NO_OPTION;
        int n2 = JOptionPane.showConfirmDialog (null,"Deseja iniciar o programa 2?" ," App - Arthur",dialogButton2,3);
        if (n2 == JOptionPane.YES_OPTION) {
            e1.p2();            
        } else 
        	System.exit(0);}
        
        if (n == JOptionPane.YES_OPTION) {	
          
    		int dialogButton2 = JOptionPane.YES_NO_OPTION;
            int n3 = JOptionPane.showConfirmDialog (null,"Deseja iniciar o programa 3?" ," App - Arthur",dialogButton2,3);
            if (n3 == JOptionPane.YES_OPTION) {
                e1.p3();            
            } else 
            	System.exit(0);}
   	
	if (dialogButton == JOptionPane.YES_OPTION) {	
        JOptionPane sair = new JOptionPane();
        int Sair = sair.showConfirmDialog(null,"Você deseja sair do programa?","Sair",JOptionPane.YES_NO_OPTION);
      if(Sair == JOptionPane.YES_OPTION){
          System.exit(0);
        
	}}}
}