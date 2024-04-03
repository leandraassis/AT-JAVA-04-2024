package assinaturaApp.model.domain;

public class RevistaFofoca extends Revista {
	
	private String celebridadeCapa;
	private String tema;
	private boolean jogo; //se tem quiz ou não
	
	
	public RevistaFofoca() {
		super();
		this.setCelebridadeCapa("Beyoncé");
		this.setTema("Família");
		this.setJogo(true);
	}
	
	@Override
	public String toString() {
		return "FOFOCA" + super.toString() + ", " + celebridadeCapa + ", " + tema + ", " + jogo;
	}
	
	public String getCelebridadeCapa() {
		return celebridadeCapa;
	}
	public void setCelebridadeCapa(String celebridadeCapa) {
		this.celebridadeCapa = celebridadeCapa;
	}
	public String getTema() {
		return tema;
	}
	public void setTema(String tema) {
		this.tema = tema;
	}
	public boolean isJogo() {
		return jogo;
	}
	public void setJogo(boolean jogo) {
		this.jogo = jogo;
	}
	
	
}
