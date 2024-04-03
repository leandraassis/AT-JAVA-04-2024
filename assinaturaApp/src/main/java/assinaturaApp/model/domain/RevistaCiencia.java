package assinaturaApp.model.domain;

public class RevistaCiencia extends Revista { 
	private String areaEstudo;
	private int nivelComplexidade; //5 o maior, 1 o menor
	private boolean interdisciplinaridade; //abrange mais de uma area de estudo
	
	
	public RevistaCiencia() {
		super();
		this.setAreaEstudo("Biologia");
		this.setNivelComplexidade(4);
		this.setInterdisciplinaridade(false);
	}
	
	public String toString() {
		return "CIÊNCIA " + super.toString() + ", " + areaEstudo + ", " + nivelComplexidade + ", " + interdisciplinaridade;
	}
	
	public String getAreaEstudo() {
		return areaEstudo;
	}
	public void setAreaEstudo(String areaEstudo) {
		this.areaEstudo = areaEstudo;
	}
	public int getNivelComplexidade() {
		return nivelComplexidade;
	}
	public void setNivelComplexidade(int nivelComplexidade) {
		this.nivelComplexidade = nivelComplexidade;
	}
	public boolean isInterdisciplinaridade() {
		return interdisciplinaridade;
	}
	public void setInterdisciplinaridade(boolean interdisciplinaridade) {
		this.interdisciplinaridade = interdisciplinaridade;
	}
	
	
	
}
