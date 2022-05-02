package br.com.fiap;

import javax.swing.JOptionPane;

public class ComparaString {
	public static void main(String[] args) {
		String senha;
		senha = JOptionPane.showInputDialog("Digite sua senha!");
		
		if (senha.equals("P4ssw0rD")) {
			JOptionPane.showMessageDialog(null, "Acesso Autorizado!");
		} else {
			JOptionPane.showMessageDialog(null, "Acesso Negado!");	
		}
		
		if (senha.equalsIgnoreCase("P4ssw0rD")) {
			JOptionPane.showMessageDialog(null, "Acesso Concedido!");
		} else {
			JOptionPane.showMessageDialog(null, "Acesso Impedido!");	
		}
	}
}
