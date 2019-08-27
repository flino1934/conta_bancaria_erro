package entities;

import entities.exceptions.DomainException;

public class Account {

	private Integer number;
	private String holder;
	private Double balance;
	private Double withdrawLimit;
	
	public Account() {
		
	}

	public Account(Integer number, String holder, Double balance, Double withdrawLimit) throws DomainException {
		
		if (number == null) {
			
			throw new DomainException("All fields must be filled");
			
		}
		
		this.number = number;
		this.holder = holder;
		this.balance = balance;
		this.withdrawLimit = withdrawLimit;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public Double getBalance() {
		return balance;
	}

	public void setBalance(Double balance) {
		this.balance = balance;
	}

	public Double getWithdrawLimit() {
		return withdrawLimit;
	}

	public void setWithdrawLimit(Double withdrawLimit) {
		this.withdrawLimit = withdrawLimit;
	}
	
	public Double withDraw(double amount) throws DomainException{
		
		if (amount > balance) {
			
			throw new DomainException("Insufficient funds");
			//Vai passar para a classe DomainExceptions um erro
		}
		if (amount>withdrawLimit) {
			
			throw new DomainException("Cashout limit exceeded");
			//Vai passar para a classe DomainExceptions um erro
		}
		
		return balance -=amount+5.0;
		
	}
	
	public Double deposit(double amount) {
		
		return balance += amount;
	}
	
	public String toString() {
		
		return "Number: "+number+" Holder: "+holder
				+"\nBalance: "+balance+" R$";
		
	}
}
