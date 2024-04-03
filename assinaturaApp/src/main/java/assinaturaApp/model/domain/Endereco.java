package assinaturaApp.model.domain;

public class Endereco {
	private int id;
    private String cep;
    private String logradouro;
    private String complemento;
    private String bairro;
    private String localidade;
	private String Uf;

    public Endereco() {
    	this.setCep("01001000");
    	this.setLogradouro("Praça da Sé");
    	this.setComplemento("lado ímpar");
    	this.setBairro("Sé");
    	this.setLocalidade("São Paulo");
    	this.setUf("SP");
    }

	public Endereco(String cep, String logradouro, String complemento, String bairro, String localidade,
			String uf) {
		super();
		this.cep = cep;
		this.logradouro = logradouro;
		this.complemento = complemento;
		this.bairro = bairro;
		this.localidade = localidade;
		Uf = uf;
	}

	@Override
	public String toString() {
		return "Endereco [id=" + id + ", cep=" + cep + ", logradouro=" + logradouro + ", complemento=" + complemento
				+ ", bairro=" + bairro + ", localidade=" + localidade + ", Uf=" + Uf + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getLocalidade() {
		return localidade;
	}

	public void setLocalidade(String localidade) {
		this.localidade = localidade;
	}

	public String getUf() {
		return Uf;
	}

	public void setUf(String uf) {
		Uf = uf;
	}
    
    
}
