package entidades;

public enum Materias {
	M2("Duas materias"),
	M5("Cinco materias"),
	M10("Dez materias");
	
	private String descricao;
	
	Materias(String descricao){
		this.descricao = descricao;
	}
	public String getDescricao() {
		return descricao;
	}
	
}
