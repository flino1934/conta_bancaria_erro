package application;



import javax.swing.JOptionPane;

import entities.Account;
import entities.exceptions.DomainException;

public class Program {

	public static void main(String[] args) {

		try {
			int number = Integer.parseInt(JOptionPane.showInputDialog("Enter with number of account"));
			String holder = JOptionPane.showInputDialog("Holder: ");
			double balance = Double.parseDouble(JOptionPane.showInputDialog("Balance: "));
			double withdrawLimit = Double.parseDouble(JOptionPane.showInputDialog(""));
			Account account = new Account(number, holder, balance, withdrawLimit);
			System.out.println(account);
			System.out.println();

			double amount = Double.parseDouble(JOptionPane.showInputDialog("Value of deposit"));
			account.deposit(amount);
			System.out.println("====================");
			System.out.println(account);

			amount = Double.parseDouble(JOptionPane.showInputDialog("Value of withdraw"));
			account.withDraw(amount);
			System.out.println("====================");
			System.out.println(account);

		} catch (DomainException e) {

			System.out.println(e.getMessage());
			//Vai retornar o erro que a classe Doman=inExceptions recebeu
		}catch(RuntimeException e) {
			
			System.out.println("Unexpected Error");
			
		}
	}

}
