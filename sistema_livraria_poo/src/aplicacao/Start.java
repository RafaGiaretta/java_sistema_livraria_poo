package aplicacao;

import java.util.Locale;
import java.util.Scanner;

import bancoDados.Banco;
import utilitarios.MetodosCliente;
import utilitarios.MetodosProduto;

public class Start {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Banco banco = new Banco();
		
		menu(banco);		
		
		sc.close();
	}
	
	public static void menu(Banco banco) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("");
		System.out.println("***** Bem Vindo ao sistema: ***** \n");
		System.out.println(" ");
		System.out.println("*------------------------------------*");
		System.out.println("|     Selecione a opção desejada:    |");
		System.out.println("|                                    |");
		System.out.println("|       1- Opcoes de CLIENTES        |");
		System.out.println("|       2- Opcoes de PRODUTOS        |");
		System.out.println("|       3- Opcoes de PEDIDOS         |");
		System.out.println("|       4- Sair                      |");
		System.out.println("|                                    |");
		System.out.println("*------------------------------------*");
		System.out.println(" ");
		System.out.print("\nOpcao: ");
		opcaoMenu(sc.nextInt(), banco);
		sc.close();
	}
	public  static void  opcaoMenu(Integer opcao, Banco banco) {
		switch(opcao) {
		case 1: 
			MetodosCliente.menuClientes(banco);
			break;
		case 2:
			MetodosProduto.menuProdutos(banco);
			break;			
		case 4: 
			System.out.println("Programa encerrado!");
			System.exit(0);
			break;
		default:
			System.out.println("Opcao invalida!");
			Start.menu(banco);
			break;
		}
	}

}
