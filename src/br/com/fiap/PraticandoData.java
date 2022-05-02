package br.com.fiap;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

import javax.swing.JOptionPane;

public class PraticandoData {
	public static void main(String[] args) {
		String aux;
		LocalDate data1, data2;
		
		DateTimeFormatter dft = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		DateTimeFormatter dfta = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		
		aux = JOptionPane.showInputDialog("Digite a data inicial: ");
		data1 = LocalDate.parse(aux);
		String dataAm1 = data1.format(dfta);
		String dataFormatada1 = data1.format(dft);
		
		
		aux = JOptionPane.showInputDialog("Digite a data final: ");
		data2 = LocalDate.parse(aux);
		String dataAm2 = data1.format(dfta);
		String dataFormatada2 = data1.format(dft);
		
		Period periodo = Period.between(data1, data2);
		JOptionPane.showMessageDialog(null, "Data Inicial: " + dataFormatada1 +
				"\nData Final: " + dataFormatada2 + "\n Entre as datas fornecidas existem"
						+ periodo.getYears() + " ano(s), " + periodo.getMonths()
						+ " mes(es) e " + periodo.getDays() + " dia(s)!");
	}
}
