package principal;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class tests {

	public static void main(String[] args) {
		
	    
		Exercicio3 e3 = new Exercicio3();
		 do {
	        int dialogButton = JOptionPane.YES_NO_OPTION;
	        int n = JOptionPane.showConfirmDialog (null,"Deseja iniciar o programa 1?" ," App - Arthur",dialogButton,3);
	        if (dialogButton == JOptionPane.YES_OPTION) {
	            e3.Pro1();
	        } else if (dialogButton == JOptionPane.NO_OPTION)
	        {
                break;
       
	        } else {
	        
	       
	        int n2 = JOptionPane.showConfirmDialog (null,"Deseja iniciar o programa 2?" ," App - Arthur",dialogButton,3);
	        if (dialogButton == JOptionPane.YES_OPTION) {
	            e3.Pro2();
	        } else if (dialogButton == JOptionPane.NO_OPTION)
	        {while (dialogButton == 1);
	        
	        }
		
	    System.exit(0);
	        
	        }

}
