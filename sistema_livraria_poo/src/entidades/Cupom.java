package entidades;

public class Cupom {

	private String cupom;
	private int desconto;
		
	public Cupom() {
	}
	
	public Cupom(String cupom, int desconto) {
		this.cupom = cupom;
		this.desconto = desconto;
	}
	
	public String getCupom() {
		return cupom;
	}
	
	public void setCupom(String cupom) {
		this.cupom = cupom;
	}
	
	public int getDesconto() {
		return desconto;
	}
	
	public void setDesconto(int desconto) {
		this.desconto = desconto;
	}
	
	
}
