import java.util.ArrayList;
import java.util.List;

public class Bank {
	//1.variable
	private ArrayList<BankAccount> accounts;
	//2.constructor
	public Bank(){
		accounts = new ArrayList<BankAccount>();
	}
	//3.methods
	//add an account to this bank
	public void addAccount(BankAccount a){
		accounts.add(a);
	}
	//gets the sum of the balances of all accounts in this bank
	public double getTotalBalance(){
		
		//**************** YOUR CODE HERE****************
		double totalbalance = 0;
        for(BankAccount a : accounts){
            totalbalance += a.getBalance();
        }

		return totalbalance;
		//*********************************************
	}
	//counts the number of bank account whose balance is at least given value.
	public int countBalanceAtLeast(double atLeast){
		
		//**************** YOUR CODE HERE****************
		int count = 0 ;
        for(BankAccount a: accounts){
            if(a.getBalance() >= atLeast){
                count++;
            }
        }
		return count;
		//*********************************************
	}
	
	//finds a bank account with a given number
	public BankAccount find(int accountNumber){
		
		//**************** YOUR CODE HERE****************
		for(BankAccount a : accounts){
            if (a.getAccountNumber() == accountNumber) {
                return a;
            }
        }
		return null;
		//*********************************************
	}
	
	//gets the bank account with the largest balance.
	public BankAccount getMax(){
		
		//**************** YOUR CODE HERE****************
		BankAccount max = accounts.get(0);
        for(BankAccount x : accounts){
            if (x.getBalance() > max.getBalance()) {
                max = x;  
            }
        }
		return max;
		//*********************************************
	}
	
	//gets the bank account with the minimum balance.
	public BankAccount getMin(){
		
		//**************** YOUR CODE HERE****************
		BankAccount min = accounts.get(0);
        for(BankAccount x : accounts){
            if (x.getBalance() < min.getBalance()) {
                min = x;  
            }
        }
		return min;
		//*********************************************
	}
}