package ex01cliente;

public class TesteCliente {

	public static void main(String[] args) {

		// Contrutor cliente:

		Cliente cliente1 = new Cliente("Carol", "Feminino", 25, "123456789", "Brasileira");

		Cliente cliente2 = new Cliente("Tiago", "Masculino", 26, "123456789", "Brasileiro");

		cliente1.visualizar();
		cliente2.visualizar();

		/*
		 * cadastro.setCliente("Carol", "Feminino", 25);
		 * 
		 * System.out.println("Nome cliente: " + cadastro.getNome());
		 * System.out.println("Idade cliente: " + cadastro.getIdade());
		 * System.out.println("Gênero cliente: " + cadastro.getGenero());
		 */
	}

}