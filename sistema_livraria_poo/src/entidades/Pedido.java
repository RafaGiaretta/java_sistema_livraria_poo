package entidades;

import java.util.ArrayList;
import java.util.List;

public class Pedido {

	private int codigo;
	private Cliente cliente;
	public List<Produto> produtos = new ArrayList<>();
	private Double total;
	
	

	public Pedido(Integer codigo, Cliente cliente, List<Produto> produtos) {
		this.codigo = codigo;
		this.cliente = cliente;
		this.produtos = produtos;
	}
	public Pedido(Integer codigo, Cliente cliente) {
		this.codigo = codigo;
		this.cliente = cliente;
	}

	public Pedido(List<Produto> produtos) {
		this.produtos = produtos;
	}
	
	public Integer getCodigo() {
		return codigo;
	}


	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}


	public Cliente getCliente() {
		return cliente;
	}


	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	public void addProduto(Produto produto) {
		this.produtos.add(produto);
	}
	
	public List<Produto> getProdutos() {
		return produtos;
	}


	public void setProdutos(List<Produto> produtos) {
		this.produtos = produtos;
	}


	public Double getTotal() {
		return total;
	}


	public void setTotal(Double total) {
		this.total = total;
	}
	
	public String toString() {
		return 	"Codigo: " +  codigo + ", " +
				"Cliente: " + cliente + ", " + 
				"Produtos: " + produtos + ", " + 
				"Total: " + total + ".";

	}

	
}
