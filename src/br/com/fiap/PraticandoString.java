package br.com.fiap;

import javax.swing.JOptionPane;

public class PraticandoString {
	public static void main(String[] args) {
		String frase = "Correr e melhor que morrer";
		JOptionPane.showMessageDialog(null, frase);
		
		int qtChar = frase.length();
		JOptionPane.showMessageDialog(null, qtChar);
		
		String maiusculo = frase.toUpperCase();
		JOptionPane.showMessageDialog(null, maiusculo);
		
		String sub1 = JOptionPane.showInputDialog("Digite uma palavra que deseja "
				+ "substituir!");
		
		String sub2 = JOptionPane.showInputDialog("Digite uma palavra que deseja "
				+ "coloca-la no lugar!");
		
		String frase2 = frase.replace(sub1, sub2);
		JOptionPane.showMessageDialog(null, frase2);
		
		qtChar = frase2.length();
		JOptionPane.showMessageDialog(null, qtChar);
		
		
		
		
	}
}
