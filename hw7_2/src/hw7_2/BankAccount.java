package hw7_2;

public class BankAccount implements Resettable {
	int balance; //잔액
	final int rebalance;
	
	public BankAccount(int rebalance) {
		this.rebalance = rebalance;
		this.balance = rebalance;
	} //잔액을 매개변수로 하여 초기화 하는 생성자
	
	void deposit(int d) {
		balance += d;
	} //입금
	void withdraw(int w) {
		balance -= w;
	} //출금
	
	@Override
	public String toString() {
		return "잔액: " + balance;
	}; //toString 오버라이드
	
	@Override
	public void reset() {
		this.balance = rebalance;
	} //reset구현

}
