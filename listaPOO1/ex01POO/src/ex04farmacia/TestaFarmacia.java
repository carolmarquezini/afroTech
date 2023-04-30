package ex04farmacia;

public class TestaFarmacia {

	public static void main(String[] args) {

		Farmacia produto1 = new Farmacia("Remedio xx", "xx", "01/01/1900", 20);

		Farmacia produto2 = new Farmacia("Remedio yy", "yy", "01/01/1990", 60);

		produto1.visualizar();
		produto2.visualizar();

	}

}
