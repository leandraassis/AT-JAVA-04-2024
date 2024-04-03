package assinaturaApp.model.domain;

public class Usuario {
	
	private int id;
	private String nome;
	private int idade;
	private int cpf;
	private int telefone;
	private Assinatura assinatura; //relação um-p-um
	private Endereco endereco; //relação um-p-um
	
	public Usuario() {
		this.setNome("Leandra Assis");
		this.setIdade(19);
		this.setCpf(1234567890);
		this.setTelefone(83948329);
		this.setAssinatura(new Assinatura());
		this.setEndereco(new Endereco());
	}
	
	public Usuario(String nome, int idade, int cpf, int telefone) {
		this.setNome(nome);
		this.setIdade(idade);
		this.setCpf(cpf);
		this.setTelefone(telefone);
	}
	
	public String toString() {
		return id + "- " + nome + ", " + idade + ", " + cpf + ", " + telefone + ", " + assinatura + ", " + endereco;
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
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public int getCpf() {
		return cpf;
	}
	public void setCpf(int cpf) {
		this.cpf = cpf;
	}
	public int getTelefone() {
		return telefone;
	}
	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}
	public Assinatura getAssinatura() {
		return assinatura;
	}
	public void setAssinatura(Assinatura assinatura) {
		this.assinatura = assinatura;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
}
