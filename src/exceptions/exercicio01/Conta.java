package exceptions.exercicio01;

public class Conta {
	
	private int numero;
	private String nome;
	private double saldo;
	private double limiteSaque;
	
	public Conta(int numero, String nome, double saldo, double limiteSaque) {
		this.numero = numero;
		this.nome = nome;
		this.saldo = saldo;
		this.limiteSaque = limiteSaque;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
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

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public double getLimiteSaque() {
		return limiteSaque;
	}

	public void setLimiteSaque(double limiteSaque) {
		this.limiteSaque = limiteSaque;
	}
	
	public void saque(double valor) {
		
		if (valor > limiteSaque) {
			throw new MyException ("O valor excedeu o limite de saque.");
		}
		
		if (valor > saldo) {
			throw new MyException ("Não há saldo.");
		}
		
		saldo -= valor;
		
	}
	
	
	

}
