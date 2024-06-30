package entidades;

public class Caderno {
	
	public enum Materias{
		M2,
		M5,
		M10;
	}
	
	private Materias tipo;

	public Materias getTipo() {
		return tipo;
	}

	public void setTipo(Materias tipo) {
		this.tipo = tipo;
	}

	public Caderno(int n) {
		if (n == 2) {
			this.tipo = Materias.M2;
		}
		if ( n == 5) {
			this.tipo = Materias.M5;
		}
		if ( n == 10) {
			this.tipo = Materias.M10;
		}
	}
	
	public String toString() {
		return "Materias: " + tipo + " ";
	}
	

	
	
}
