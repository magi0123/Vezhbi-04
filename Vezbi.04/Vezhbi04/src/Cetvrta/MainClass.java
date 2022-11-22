package Cetvrta;

public class MainClass {

	public static void main(String[] args) {
		Avtomobil a = new Avtomobil("Opel", "Corsa", 12000, "bela");
		a.PrvMetod(2);

		System.out.println(a.getMarka() + " " + a.getModel() + " " + a.getPominatiKm() + " " + a.getBoja());

	}

}
