package entidades;

public enum Genero {

		DRAMA("Drama"),
		SUSPENSE("Suspense"),
		ROMANCE("Romance");

	private String descricao;
	
	Genero(String descricao){
		this.descricao = descricao;
	}
	public String getDescricao() {
		return descricao;
	}

}
