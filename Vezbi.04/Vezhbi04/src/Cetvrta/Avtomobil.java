package Cetvrta;

public class Avtomobil {

	private String marka;
	private String model;
	private int pominatiKm;
	private String boja;

	public Avtomobil(String marka, String model, int pominatiKm, String boja) {
		this.marka = marka;
		this.model = model;
		this.pominatiKm = pominatiKm;
		this.boja = boja;
	}

	public String getMarka() {
		return marka;
	}

	public String getModel() {
		return model;
	}

	public int getPominatiKm() {
		return pominatiKm;
	}

	public String getBoja() {
		return boja;
	}

	public int PrvMetod(int pomnoziKm) {

		return this.pominatiKm = pominatiKm * pomnoziKm;
	}
}
