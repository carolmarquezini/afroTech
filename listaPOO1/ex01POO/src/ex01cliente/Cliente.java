/* 
 * Utilizando os conceitos de Classe, Objeto e Métodos, da Programação Orientada a
Objetos, crie a Classe Cliente com os seus respectivos Métodos e Atributos. Na
sequência, crie uma Classe chamada TestaCliente, instancie dois objetos da Classe
Cliente e apresente as informações destes 2 Objetos no console.
 */

package ex01cliente;

public class Cliente {

	// Criando atributos do cliente:

	private String nome;
	private String genero;
	private float idade;
	private String cpf;
	private String nascionalidade;

	// Criando metodos do cliente
	public Cliente(String nome, String genero, float idade, String cpf, String nascionalidade) {

		this.nome = nome;
		this.genero = genero;
		this.idade = idade;
		this.cpf = cpf;
		this.nascionalidade = nascionalidade;

	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getNascionalidade() {
		return nascionalidade;
	}

	public void setNascionalidade(String nascionalidade) {
		this.nascionalidade = nascionalidade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public float getIdade() {
		return idade;
	}

	public void setIdade(float idade) {
		this.idade = idade;
	}

	public void visualizar() {

		System.out.println("\nNome: " + this.nome);
		System.out.println("Idade: " + this.idade);

	}

}
