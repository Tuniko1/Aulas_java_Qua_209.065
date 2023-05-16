package principal;
import javax.swing.JOptionPane;

public class Program {

	public static void main(String[] args) {
		
		// Faça um aplicativo que receba o ano de nascimento e o ano atual e mostre na tela sua idade;
		
	   	int idade;
	    
	    String anoNasc = "";
	    anoNasc = JOptionPane.showInputDialog("Digite o ano do seu nascimento: ");
	    
	    String anoAtual= "";
	    anoAtual = JOptionPane.showInputDialog("Digite o ano atual: ");
	    
	    String msg = "Sua idade é: ";
	    
	    String msg2 = " anos";
	    
	    idade = Integer.parseInt(anoAtual) - Integer.parseInt(anoNasc) ;
	    JOptionPane.showMessageDialog(null, msg + idade + msg2);
		    
}
}