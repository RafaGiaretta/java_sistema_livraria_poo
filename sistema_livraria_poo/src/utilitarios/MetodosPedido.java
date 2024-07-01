package utilitarios;

import java.util.Locale;
import java.util.Scanner;

import aplicacao.Start;
import bancoDados.Banco;
import entidades.Cliente;
import entidades.Pedido;
import entidades.Produto;

public class MetodosPedido {
	
	public static void menuPedidos(Banco banco) {
		
		Locale.setDefault (Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println(" ");
		System.out.println("*------------------------------------*");
		System.out.println("|   1- Cadastrar novo PEDIDO         |");
		System.out.println("|   2- Exibir PEDIDOS não Finalizados|");
		System.out.println("|   3- Remover PEDIDO CADASTRADO     |");
		System.out.println("|   4- Retornar ao MENU              |");
		System.out.println("*------------------------------------*");
		System.out.println(" ");
		System.out.print("\nOpcao: ");
		opcaoPedido(sc.nextInt(), banco);		
		sc.close();
		
	}
	
	public static void opcaoPedido(int opcao, Banco banco) {
			switch(opcao) {
			case 1:
					cadastroPedido(banco);
				break;
			case 2:
					//consultarPedido(banco);
				break;
			case 3:
					//removerPedido(banco);
				break;
			case 4: 
					Start.menu(banco);
				
			default:
				System.out.println("Opcao invalida!");
				menuPedidos(banco);
				break;
			}
		}
		
	public static void cadastroPedido(Banco banco) {
		Scanner sc = new Scanner(System.in);

		Cliente cliente = MetodosCliente.consultarCPF(banco,sc);
		
		int codigo = 0;
		for (Pedido pedido : banco.getPedidos()) {
				while(pedido.getCodigo() >= codigo) {
				codigo ++;				
			}	
		}
		
		Pedido novoPedido = new Pedido(codigo, cliente);
		
		novoProduto(banco, sc, novoPedido);
		
		

		System.out.println("*******************************");
		System.out.println(novoPedido);
		System.out.println("*******************************");
		System.out.println("--------------------------------");
		System.out.println(banco.getProdutos()); 
		System.out.println("--------------------------------");
		
		sc.close();	
	}
	
	
	public static void novoProduto(Banco banco, Scanner sc, Pedido novoPedido) {
		System.out.println("Produtos disponiveis: ");
		System.out.println(banco.getProdutos());		
		
		System.out.println("\nTipo do produto que deseja colocar no pedido: (Livro/Caderno) ");
		String tipo = sc.next();

			if (tipo.equals("Livro")) {
				System.out.println("\nDigite o nome do Livro: ");
				String nomeLivro = sc.next();
				for (Produto livro : banco.getProdutos()) {
					if(livro.getLivro().getNome().equals(nomeLivro)) {	
						Produto aux = new Produto(livro.getLivro());
						System.out.println("\nDigite a Quantidade: ");;
						int quantidade = sc.nextInt();
							int estoque = livro.getQuantidade();
							if ((estoque - quantidade ) >= 0) {
								livro.removerEstoque(quantidade);
								aux.setQuantidade(quantidade);
								novoPedido.addProduto(aux);
			                } 
							else {
			                    System.out.println("Quantidade fora do estoque.");
			                    novoProduto(banco,sc,novoPedido);
			                }
			            }

			        }
		        System.out.println("Livro não encontrado!");
			    } 
			else {
			        System.out.println("Tipo de produto inválido.");
			    }
	}	
	
}	
	
	

