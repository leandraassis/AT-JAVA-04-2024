package assinaturaApp.model.domain;

public class Revista {
	private String nome;
	private int id;
	private int registro;
	private String dataPublicacao;
	private int qtdPagina;
	private int classIndicativa;

	public Revista() {
		this.setNome("Caras e Bocas");
		this.setRegistro(123456);
		this.setDataPublicacao("12/02/2024");
		this.setQtdPagina(20);
		this.setClassIndicativa(16);
	}
	
	public Revista(String nome, int id, int registro, String dataPublicacao, int qtdPagina, int classIndicativa) {
		this.nome = nome;
		this.id = id;
		this.registro = registro;
		this.dataPublicacao = dataPublicacao;
		this.qtdPagina = qtdPagina;
		this.classIndicativa = classIndicativa;
	}

	public String toString() {
		return "REVISTA: -" + id + nome + ", " + registro + ", " + dataPublicacao + ", " + qtdPagina + ", " + classIndicativa;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getRegistro() {
		return registro;
	}
	public void setRegistro(int registro) {
		this.registro = registro;
	}
	public String getDataPublicacao() {
		return dataPublicacao;
	}
	public void setDataPublicacao(String dataPublicacao) {
		this.dataPublicacao = dataPublicacao;
	}
	public int getQtdPagina() {
		return qtdPagina;
	}
	public void setQtdPagina(int qtdPagina) {
		this.qtdPagina = qtdPagina;
	}
	public int getClassIndicativa() {
		return classIndicativa;
	}
	public void setClassIndicativa(int classIndicativa) {
		this.classIndicativa = classIndicativa;
	}
	

}
