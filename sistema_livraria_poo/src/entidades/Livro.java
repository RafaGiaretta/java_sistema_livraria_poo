package entidades;

public class Livro {
	
	private String nome;
	private String genero;
	
	
	public Livro() {

	}
	
	public Livro(String nome, String genero) {
		this.nome = nome;
		this.genero = genero;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String toString() {
		return "Nome: " + nome + ", Genero: " + genero;
	}
}
