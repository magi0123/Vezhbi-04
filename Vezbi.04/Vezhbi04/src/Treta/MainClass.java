package Treta;

public class MainClass {
	public static void main(String[] args) {

		Proizvod p = new Proizvod();
		System.out.println(p.getIme() + "to od " + p.getCena() + " denari od proizvoditel " + p.getProizvoditel()
				+ " ima tezina od " + p.getTezina() + "g.");
	}
}