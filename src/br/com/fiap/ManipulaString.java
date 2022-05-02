package br.com.fiap;

import javax.swing.JOptionPane;

public class ManipulaString {
	public static void main(String[] args) {
		String frase = "O rato roeu a roupa do rei de Roma";
		JOptionPane.showMessageDialog(null, frase);
		
		//exibindo a quantidade de caracteres
		int qtChar = frase.length();
		JOptionPane.showMessageDialog(null, qtChar);
		
		//exibindo a frase em maiúsculo
		String maiuscula = frase.toUpperCase();
		JOptionPane.showMessageDialog(null, maiuscula);
		
		//exibindo a frase em minusculo
		String minusculo = frase.toLowerCase();
		JOptionPane.showMessageDialog(null, minusculo);
		
		//obtendo e exibindo a palavra Roma
		String palavra = frase.substring(30, 34);
		JOptionPane.showMessageDialog(null, palavra);
		
		//substituindo a palavra roupa por parede
		String frase2 = frase.replace("roupa", "parede");
		JOptionPane.showMessageDialog(null, frase2);
		
	}

}
