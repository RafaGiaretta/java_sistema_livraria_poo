package entidades;

import bancoDados.Banco;

public class Cliente extends Banco {

	private String nome;
	private String cpf;
	
	public Cliente() {
	}
	
	public Cliente(String nome, String cpf) {
		this.nome = nome;
		this.cpf = cpf;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getCpf() {
		return cpf;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
    public String toString() {
        return  "\nNome: " + nome +",  CPF: " + cpf + ".\n";
    }
	
	
}
