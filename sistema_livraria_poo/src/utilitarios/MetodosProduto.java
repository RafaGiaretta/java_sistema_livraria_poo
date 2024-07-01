package utilitarios;

import java.util.Scanner;

import aplicacao.Start;
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
		System.out.println("|   3- Remover Produto CADASTRADO    |");
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
				removerProduto(banco);
			break;
		case 4: 
			Start.menu(banco);
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
		System.out.println("\n1 - Livro");
		System.out.println("2 - Caderno");
		System.out.print("\nOpcao: ");
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
				System.out.print("R$ ");
				double preco = sc.nextDouble();
				Livro livro = new Livro(nome, genero);
				Produto produto = new Produto(preco, quantidade, Produto.Tipo.LIVRO, livro);
				banco.novoProduto(produto);
				System.out.println(" ");
				System.out.println("Produto cadastrado com sucesso");
				System.out.println(" ");
				Start.menu(banco);
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
				Start.menu(banco);
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

	public static void removerProduto(Banco banco) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Entre com o TIPO do PRODUTO que deseja remover: (Livro/Caderno): ");
		String tipo = sc.next();
		switch (tipo) {
			case "Livro":
				System.out.println("Qual nome do Livro que deseja remover: ");
				String nome = sc.nextLine();
				for (Produto produto : banco.getProdutos()) {
					if(produto.getLivro().getNome().equals(nome)) {
						banco.removerProdutoLivro(produto);
						System.out.println(produto + "removido!");
						System.out.println("Aperte ENTER para voltar ao menu.");
						sc.nextLine();
						menuProdutos(banco);					
					}
					else {
						System.out.println("Produto nao encontrado!");
						System.out.println("Aperte ENTER para voltar ao menu.");
						sc.nextLine();
						menuProdutos(banco);
					}	
				}
			break;
				
			case "Caderno": 
				System.out.println("Digite a QUANTIDADE de materias do caderno que deseja remover: (M2/M5/M10)");
				String qmaterias = sc.next();
				for (Produto produto : banco.getProdutos()) {
					if(produto.getCaderno().getTipo().toString().equals(qmaterias)) {
						banco.removerProdutoCaderno(produto);
						System.out.println(produto + "removido!");
						System.out.println("Aperte ENTER para voltar ao menu.");
						sc.nextLine();
						menuProdutos(banco);					
						}
					else {
						System.out.println("Produto nao encontrado!");
						System.out.println("Aperte ENTER para voltar ao menu.");
						sc.nextLine();
						menuProdutos(banco);
						}
				}
			break;
			
			default:					
			System.out.println("DEU RUIM");
			break;
			}
				

		sc.close();
		}
	}
