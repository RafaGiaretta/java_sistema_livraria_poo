package bancoDados;

import java.util.ArrayList;
import java.util.List;

import entidades.Cliente;
import entidades.Cupom;
import entidades.Pedido;
import entidades.Produto;

public class Banco {
	
	private List<Produto> produtos = new ArrayList<>();
	private List<Pedido> pedidos;
	private List<Cupom> cupons;
	private List<Cliente> cliente = new ArrayList<>();
		
	public Banco(List<Produto> produtos, List<Pedido> pedidos, List<Cupom> cupons, List<Cliente> cliente) {
		this.produtos = produtos;
		this.pedidos = pedidos;
		this.cupons = cupons;
		this.cliente = cliente;
	}
	
	public Banco() {

	}

	public void novoCliente(Cliente cliente) {
		this.cliente.add(cliente);
	}
	
	public void removerCliente(Cliente cliente) {
		this.cliente.remove(cliente);
	}
	
	public void novoProduto(Produto produto) {
		this.produtos.add(produto);
	}
	
	public List<Produto> getProdutos() {
		return produtos;
	}	
	public void setProdutos(List<Produto> produtos) {
		this.produtos = produtos;
	}
	public List<Pedido> getPedidos() {
		return pedidos;
	}
	public void setPedidos(List<Pedido> pedidos) {
		this.pedidos = pedidos;
	}
	public List<Cupom> getCupons() {
		return cupons;
	}
	public void setCupons(List<Cupom> cupons) {
		this.cupons = cupons;
	}
	public List<Cliente> getCliente() {
		return cliente;
	}
	public void setCliente(List<Cliente> cliente) {
		this.cliente = cliente;
	}
	
	public void addProduto(Produto produto) {
		produtos.add(produto);
	}
	
	public void addPedido(Pedido pedido) {
		pedidos.add(pedido);
	}
	
	

}
