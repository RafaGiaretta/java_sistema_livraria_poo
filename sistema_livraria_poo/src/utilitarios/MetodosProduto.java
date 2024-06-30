package utilitarios;

import java.util.Scanner;

import bancoDados.Banco;
import entidades.Caderno;
import entidades.Livro;
import entidades.Produto;

public class MetodosProduto {

	public static void  menuProdutos(Banco banco){

		System.out.println(" ");
		System.out.println("*------------------------------------*");
		System.out.println("|   1- Cadastrar novo PRODUTO        |");
		System.out.println("|   2- Produtos CADASTRADOS          |");
		System.out.println("|   3- Remover Produto CADASTRADO    |"); // talvez a remocao seja apenas ao efetuar pedidos
		System.out.println("|   4- Retornar ao MENU              |");
		System.out.println("*------------------------------------*");
		System.out.println(" ");
		Scanner sc = new Scanner(System.in);
		System.out.print("\nOpcao: ");
		opcaoProduto(sc.nextInt(), banco);
		sc.close();
	}
	
	public static void opcaoProduto(int opcao, Banco banco){
		
		switch(opcao) {
		case 1:
				cadastroProduto(banco);
			break;
		case 2:
				consultarProduto(banco);
			break;
		case 3:
				//removerCliente(banco);
			break;
			
		default:
			System.out.println("Opcao invalida!");
			menuProdutos(banco);
			break;
		}
		
	}
	
	public static void cadastroProduto(Banco banco){
		Scanner sc = new Scanner(System.in);
		System.out.println(" ");
		System.out.println("Tipo do produto:  ");
		System.out.println("1 - Livro");
		System.out.println("2 - Caderno");
		int opcao = sc.nextInt();
		System.out.println(" ");
		sc.nextLine();
		
		switch (opcao) {
			case 1: 
				System.out.println("Genero: ");
				String genero = sc.nextLine();
				System.out.println("Nome: ");
				String nome = sc.nextLine();
				System.out.println("Quantidade: ");
				int quantidade = sc.nextInt();
				System.out.println("Preço da unidade: ");
				double preco = sc.nextDouble();
				Livro livro = new Livro(nome, genero);
				Produto produto = new Produto(preco, quantidade, Produto.Tipo.LIVRO, livro);
				banco.novoProduto(produto);
				System.out.println(" ");
				System.out.println("Produto cadastrado com sucesso");
				System.out.println(" ");
				menuProdutos(banco);
			break;
			
			case 2:
				System.out.println("Quantidade de Materias: (2, 5 ou 10) ");
				int materias = sc.nextInt();
				System.out.println("Quantidade: ");
				quantidade = sc.nextInt();
				System.out.println("Preço da unidade: ");
				preco = sc.nextDouble();
				Caderno caderno = new Caderno(materias);
				produto = new Produto(preco, quantidade, Produto.Tipo.CADERNO, caderno);
				banco.novoProduto(produto);
				System.out.println(" ");
				System.out.println("Produto cadastrado com sucesso");
				System.out.println(" ");
				menuProdutos(banco);
			break;
			
			default: 
				System.out.println("Opcao invalida!");
				menuProdutos(banco);
				break;
		}
		sc.close();
	}	
		public static void consultarProduto(Banco banco) {
			Scanner sc = new Scanner(System.in);
			System.out.println(banco.getProdutos()); 
			System.out.println("Aperte ENTER para voltar ao menu.");
			sc.nextLine();
			menuProdutos(banco);
			sc.close();
		}

	
}
