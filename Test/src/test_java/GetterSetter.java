package test_java;

public class GetterSetter {

	private int account_number;
	private int account_balance; 
	    // getter method
		public int getBalance() {
	        return this.account_balance;
	    }
	    // setter method
		public void setNumber(int num) {
	        this.account_number = num;
	        account_balance= account_number*2;
	    }
	
}
