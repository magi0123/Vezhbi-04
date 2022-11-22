package Vtora;

public class MainClass {

	public static void main(String[] args) {
		Restoran r = new Restoran();
		r.setIme("Aleksandar");
		r.setLokacija("Boulevard");
		r.setTelefon("075209333");
		r.setSediste("Bitola");

		System.out.println("Restoran: " + r.getIme() + " \nLokacija: " + r.getLokacija() + " \nTelefonski broj: "
				+ r.getTelefon() + " \nSediste: " + r.getSediste());

	}

}
