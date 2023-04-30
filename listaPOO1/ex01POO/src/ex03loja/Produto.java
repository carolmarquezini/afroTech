package ex03loja;

public class Produto {

	private String nomeJogo;
	private String classificacao;
	private float preco;
	private float quantidadePecas;
	private float idadeIndicada;

	public Produto(String nomeJogo, String classificacao, float preco, float quantidadePecas, float idadeIndicada) {

		this.nomeJogo = nomeJogo;
		this.classificacao = classificacao;
		this.preco = preco;
		this.quantidadePecas = quantidadePecas;
		this.idadeIndicada = idadeIndicada;

	}

	public String getNomeJogo() {
		return nomeJogo;
	}

	public void setNomeJogo(String nomeJogo) {
		this.nomeJogo = nomeJogo;
	}

	public String getClassificacao() {
		return classificacao;
	}

	public void setClassificacao(String classificacao) {
		this.classificacao = classificacao;
	}

	public float getPreco() {
		return preco;
	}

	public void setPreco(float preco) {
		this.preco = preco;
	}

	public float getQuantidadePecas() {
		return quantidadePecas;
	}

	public void setQuantidadePecas(float quantidadePecas) {
		this.quantidadePecas = quantidadePecas;
	}

	public float getIdadeIndicada() {
		return idadeIndicada;
	}

	public void setIdadeIndicada(float idadeIndicada) {
		this.idadeIndicada = idadeIndicada;
	}

	public void visualizar() {

		System.out.println("\nJogo: " + this.nomeJogo);
		System.out.println("Classificacao do jogo: " + this.classificacao);
		System.out.println("Preço: R$ " + this.preco);
		System.out.println("Quantidade de peças: " + this.quantidadePecas);
		System.out.println("Idade indicada: " + this.idadeIndicada);

	}

}
