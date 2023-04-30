package ex02funcionario;

public class Funcionario {

	private String nome;
	private float idade;
	private String genero;
	private String dataInicio;
	private String cargo;

	public Funcionario(String nome, float idade, String genero, String dataInicio, String cargo) {

		this.nome = nome;
		this.idade = idade;
		this.genero = genero;
		this.dataInicio = dataInicio;
		this.cargo = cargo;

	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public float getIdade() {
		return idade;
	}

	public void setIdade(float idade) {
		this.idade = idade;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getDataInicio() {
		return dataInicio;
	}

	public void setDataInicio(String dataInicio) {
		this.dataInicio = dataInicio;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public void visualizar() {

		System.out.println("Nome: " + this.nome);
		System.out.println("Cargo: " + this.cargo);

	}

}
