package ex02funcionario;

public class TestaFuncionario {

	public static void main(String[] args) {

		Funcionario funcionario1 = new Funcionario("Carol", 25, "Feminano", "01/06/2023", "Dev. Junior");

		Funcionario funcionario2 = new Funcionario("Tiago", 26, "Masculino", "01/06/2023", "Dev. Senior");

		funcionario1.visualizar();
		funcionario2.visualizar();

	}

}
