package br.com.fiap;

public class Televisor {
	private int volume;
	private int canal;

	public Televisor() {

	}

	public Televisor(int volume, int canal) {
		this.volume = volume;
		this.canal = canal;
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		try {
			if (volume >= 0 && volume <= 10) {
				this.volume = volume;
			} else {
				throw new Exception("Volume fora da faixa (0 - 10)");
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public int getCanal() {
		return canal;
	}

	public void setCanal(int canal) {
		try {
			if (canal == 2 || canal == 4 || canal == 5 || canal == 13) {
				this.canal = canal;
			} else {
				throw new Exception("Canal fora da faixa (2, 4, 5 ou 13)");
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public void aumentarVolume() {
		if (volume < 10) {
			volume++;
		}
	}
	
	public void diminuirVolume() {
		if (volume > 0) {
			volume--;
		}
	}

}
