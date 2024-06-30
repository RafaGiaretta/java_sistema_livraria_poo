package entidades;

import java.util.ArrayList;
import java.util.List;

public class Pedido {

	private String codigo;
	private Cliente cliente;
	private List<Produto> produtos;
	private Double total;
	
	
	public void produtos() {
		this.produtos = new ArrayList<>();	}
	 

	public Pedido(String codigo, Cliente cliente, List<Produto> produtos) {
		this.codigo = codigo;
		this.cliente = cliente;
		this.produtos = produtos;
	}

	public String getCodigo() {
		return codigo;
	}


	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}


	public Cliente getCliente() {
		return cliente;
	}


	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
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
	
	

	
}
