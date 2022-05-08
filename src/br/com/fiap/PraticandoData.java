package br.com.fiap;

import java.time.LocalDate;
import java.time.Period;

import javax.swing.JOptionPane;

public class PraticandoData {
	public static void main(String[] args) {
		String data1, data2, formatoUSA;
		LocalDate datai, dataf;
		try {
			data1 = JOptionPane.showInputDialog("Digite uma data Inicial");
			data2 = JOptionPane.showInputDialog("Digite uma data Final");
			// 0 1 2 3 4 5 6 7 8 9
			// 0 8 / 0 1 / 1 9 9 0
			formatoUSA = data1.substring(6, 10); // 1990
			formatoUSA += "-" + data1.substring(3, 5); // 1990-01
			formatoUSA += "-" + data1.substring(0, 2); // 1990-01-08
			datai = LocalDate.parse(formatoUSA);
			
			formatoUSA = data2.substring(6, 10);
			formatoUSA += "-" + data2.substring(3, 5);
			formatoUSA += "-" + data2.substring(0, 2);
			dataf = LocalDate.parse(formatoUSA);
			
			Period periodo = Period.between(datai, dataf);
			
			JOptionPane.showMessageDialog(null,
					"Data inicial: " + data1 + "\nData final: " + data2 +
					"\nEntre as datas fornecidas existem " + periodo.getYears()
					+ " ano(s), " + periodo.getMonths() + " mes(es) e "
					+ periodo.getDays() + " dia(s)!");
			
		} catch (Exception e) {
			JOptionPane.showInternalMessageDialog(null, e.getMessage());
		}
	}
}
