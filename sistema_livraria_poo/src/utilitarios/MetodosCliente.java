package utilitarios;

import java.util.Scanner;

import aplicacao.Start;
import bancoDados.Banco;
import entidades.Cliente;

public class MetodosCliente {

	

	
	public static void menuClientes(Banco banco) {
		System.out.println(" ");
		System.out.println("*------------------------------------*");
		System.out.println("|   1- Cadastrar novo CLIENTE        |");
		System.out.println("|   2- Clientes CADASTRADOS          |");
		System.out.println("|   3- Remover CLIENTE CADASTRADO    |");
		System.out.println("|   4- Retornar ao MENU              |");
		System.out.println("*------------------------------------*");
		System.out.println(" ");
		Scanner sc = new Scanner(System.in);
		System.out.print("\nOpcao: ");
		opcaoClientes(sc.nextInt(), banco);
		sc.close();
	}
	
	public static void opcaoClientes(int opcao, Banco banco) {
		switch(opcao) {
		case 1:
				cadastroCliente(banco);
			break;
		case 2:
				consultarClientes(banco);
			break;
		case 3:
				removerCliente(banco);
			break;
		case 4: 
				Start.menu(banco);
			
		default:
			System.out.println("Opcao invalida!");
			menuClientes(banco);
			break;
		}
	}
	
	public static void cadastroCliente(Banco banco){
		Scanner sc = new Scanner(System.in);
		System.out.println("\nNome: ");
		String nome = sc.nextLine();
		System.out.println("CPF: ");
		String cpf = sc.nextLine();
		Cliente cliente = new Cliente(nome, cpf);
		banco.novoCliente(cliente);
		
		System.out.println("\nDeseja cadastrar outro CLIENTE? (S/N)");
		String continuar = sc.next();
		if (continuar.equals("S") || continuar.equals("s")) {
			cadastroCliente(banco);			
		}
		else {
			Start.menu(banco);
		}

		sc.close();
	}

	public static void consultarClientes(Banco banco) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Clientes cadastrados no sistema: \n");
		System.out.println(banco.getCliente()); 
		System.out.println("Aperte ENTER para voltar ao menu.");
		sc.nextLine();
		menuClientes(banco);
		sc.close();
	}
	

	public static void removerCliente(Banco banco) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Entre com o CPF do cliente que deseja remover: ");
		String cpf = sc.next();
		for (Cliente cliente : banco.getCliente()) {
			if (cliente.getCpf().equals(cpf)) {
				banco.removerCliente(cliente);
				System.out.println("Cliente removido com sucesso!");
				Start.menu(banco);
				break;
			}
		}
		System.out.println("CPF nao encontrado!");
		System.out.println("Aperte ENTER para voltar ao menu.");
		sc.nextLine();
		menuClientes(banco);
		sc.close();
	}
	
	public static Cliente consultarCPF(Banco banco, Scanner sc ) {
		System.out.println("Entre com o CPF do CLIENTE: ");
		String cpf = sc.nextLine();
		for (Cliente cliente : banco.getCliente()) {
			if (cliente.getCpf().equals(cpf)) {				
				System.out.println("Cliente encontrado!\n" + banco.getCliente());			
				return cliente;
			}
			else {
				System.out.println("CPF invalido!");
				System.out.println("Aperte ENTER para tentar novamente.");
				sc.nextLine();
				consultarCPF(banco, sc );
				sc.close();
			}
			
		}
		return null;

	}



}
