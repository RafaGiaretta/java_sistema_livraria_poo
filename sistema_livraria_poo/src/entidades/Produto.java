package entidades;

public class Produto{
	 
	public enum Tipo {
		LIVRO,
		CADERNO;
	}
	
	private Double preco;
	private Integer quantidade;	
	private Livro livro;
	private Caderno caderno;
	private Tipo tipo;


	public Produto() {

	}
	
	public Produto(Integer quantidade) {
		this.quantidade = quantidade;
	}
	
	public Produto( Livro livro) {
        this.livro = livro;;
	}
	
	
    public Produto(Double preco, Integer quantidade, Tipo tipo,  Livro livro) {
        this.preco = preco;
        this.quantidade = quantidade;
        this.livro = livro;
        this.tipo = tipo;
    }
    public Produto(Double preco, Integer quantidade, Tipo tipo, Caderno caderno) {
        this.preco = preco;
        this.quantidade = quantidade;
        this.caderno = caderno;
        this.tipo = tipo;
    }
	
    public Livro getLivro() {
    	return livro;
    }
    
    public Caderno getCaderno() {
    	return caderno;
    }

	public Double getPreco() {
		return preco;
	}
	
	public void setPreco(Double preco) {
		this.preco = preco;
	}
	
	public Integer getQuantidade() {
		return quantidade;
	}
	
	public void pedidoQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}
	
	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}	

	public void removerEstoque(Integer quantidade) {
		this.quantidade -= quantidade;
	}
	
	public String toString() {
		if (caderno == null) {
			return "Tipo: " + tipo + ", " + livro + "Quantidade: " + quantidade + " Preco: R$"+ preco +"\n";
		}
		else {
			return "Tipo: " + tipo + ", " + caderno + "Quantidade: " + quantidade + " Preco: R$"+ preco +"\n";
		}

	}
	

  
  


}
