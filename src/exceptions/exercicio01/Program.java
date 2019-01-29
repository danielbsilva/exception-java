package exceptions.exercicio01;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Program {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		boolean ok = true;
		
		JOptionPane.showMessageDialog(null, "Entre com os dados da conta");
		
		String number = JOptionPane.showInputDialog("Número: ");
		int numero = Integer.parseInt(number);
		String nome = JOptionPane.showInputDialog("Nome: ");
		String balance = JOptionPane.showInputDialog("Saldo inicial: ");
		double saldo = Double.parseDouble(balance);
		String withdrawLimit = JOptionPane.showInputDialog("Limite de saque: ");
		double limiteSaque = Double.parseDouble(withdrawLimit);
		System.out.println();
		
		Conta conta = new Conta(numero, nome, saldo, limiteSaque);
		
		while (ok) {
			String amount = JOptionPane.showInputDialog("Entre com o valor para saque: ");
			double valor = Double.parseDouble(amount);
			try {
				conta.saque(valor);
				JOptionPane.showMessageDialog(null, "Novo saldo: " + conta.getSaldo(), "Saldo", JOptionPane.INFORMATION_MESSAGE);
				ok = false;
			} catch (MyException e) {
				JOptionPane.showMessageDialog(null, "Erro de saque: "+e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
				ok = true;
			}
			
		}
		
	
	
		
	}

}
