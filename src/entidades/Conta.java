package entidades; // Seção 4 - Aula 64 (Exercício de fixação) 

public class Conta {
	
	private int numero;
	private String nome;
	private double saldo;
	
	public Conta(int numero, String nome) {
		this.numero = numero;
		this.nome = nome;
	}
	
	public Conta(int numero, String nome, double depositoInicial) {
		this.numero = numero;
		this.nome = nome;
		deposito(depositoInicial);
	}

	public int getNumero() {
		return numero;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSaldo() {
		return saldo;
	}

	public void deposito(double valor) {
		saldo += valor;
	}
	
	public void saque(double valor) {
		saldo -= valor + 5.0;
	}
	
	public String toString() { // cria string dos dados abaixo para instanciar nos objetos
		return "Conta " 
				+ numero 
				+ ", Nome: " 
				+ nome 
				+ ", Saldo: $ " 
				+ String.format("%.2f", saldo);
	}
}
