package br.com.fiap;

import javax.swing.JOptionPane;

public class UsaTelevisor {
	public static void main(String[] args) {
		int volume, canal, escolha;
		String aux;
		Televisor tv1;
		
		try {
			aux = JOptionPane.showInputDialog("Escolha o canal");
			canal = Integer.parseInt(aux);
			
			aux = JOptionPane.showInputDialog("Escolha o volume");
			volume = Integer.parseInt(aux);
			
			tv1 = new Televisor(volume, canal);
			
			JOptionPane.showMessageDialog(null, "Canal: " + 
					tv1.getCanal() + "\nVolume: " + tv1.getVolume());
			
			aux = JOptionPane.showInputDialog("Escolaha uma opção:\n(1) Aumentar volume" +
					"\n(2) Diminuir volume\n(3) Trocar de canal");
					escolha = Integer.parseInt(aux);
					
			switch (escolha) {
			case 1:
				tv1.aumentarVolume();
				JOptionPane.showMessageDialog(null, "Canal: " + 
						tv1.getCanal() + "\nVolume: " + tv1.getVolume());
				break;
				
			case 2:
				tv1.diminuirVolume();
				JOptionPane.showMessageDialog(null, "Canal: " + 
						tv1.getCanal() + "\nVolume: " + tv1.getVolume());
				break;
			
			case 3:
				aux = JOptionPane.showInputDialog("Escolha o canal");
				canal = Integer.parseInt(aux);
				tv1.setCanal(canal);
				JOptionPane.showMessageDialog(null, "Canal: " + 
						tv1.getCanal() + "\nVolume: " + tv1.getVolume());
				break;

			default:
				JOptionPane.showMessageDialog(null, "Opção inválida");
				break;
			}
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
		}
	}
}
