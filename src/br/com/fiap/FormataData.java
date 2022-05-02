package br.com.fiap;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

import javax.swing.JOptionPane;

public class FormataData {
	public static void main(String[] args) {
		LocalDate dataAtual = LocalDate.now();
		LocalDate fimDosTempos = LocalDate.parse("2012-12-21");
		
		//obtendo período de tempo entre as datas
		Period periodo = Period.between(fimDosTempos, dataAtual);
		JOptionPane.showMessageDialog(null, periodo.getYears() + " anos!");
		JOptionPane.showMessageDialog(null, periodo.getMonths() + " meses!");
		JOptionPane.showMessageDialog(null, periodo.getDays() + "dias!");
		
		//formatando a data no padrão dia-mês-ano
		DateTimeFormatter dft= DateTimeFormatter.ofPattern("dd-MM-yyyy");
		String dataFormatada = fimDosTempos.format(dft);
		JOptionPane.showMessageDialog(null, dataFormatada);
	}
}
