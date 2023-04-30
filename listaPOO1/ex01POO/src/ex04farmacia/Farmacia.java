package ex04farmacia;

public class Farmacia {

	private String nome;
	private String fabricante;
	private String dataVencimento;
	private float preco;

	public Farmacia(String nome, String fabricante, String dataVencimento, float preco) {

		this.nome = nome;
		this.fabricante = fabricante;
		this.dataVencimento = dataVencimento;
		this.preco = preco;

	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getFabricante() {
		return fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

	public String getDataVencimento() {
		return dataVencimento;
	}

	public void setDataVencimento(String dataVencimento) {
		this.dataVencimento = dataVencimento;
	}

	public float getPreco() {
		return preco;
	}

	public void setPreco(float preco) {
		this.preco = preco;
	}

	public void visualizar() {

		System.out.println("\nNome do produto: " + nome);
		System.out.println("Nome do fabricante: " + fabricante);
		System.out.println("Data de vencimento: " + dataVencimento);
		System.out.println("Preço do produto: R$ " + preco);
	}

}
