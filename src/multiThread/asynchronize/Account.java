package multiThread.asynchronize;

public class Account {
	int balance = 10000;
	
	//출금
	public void withdraw(int money) {
		//synchronized (this) {
		int amount = balance;
		try {
			Thread.sleep(2000);
		} catch(Exception e) {
			e.printStackTrace();
		}
			balance = amount - money;
			System.out.println(money + " 출금 처리");
		}
	//}
	
	//입금
	public void deposit(int money) {
		//synchronized (this) {
		int amount = balance;
		try { 
			Thread.sleep(3000);
			} catch(Exception e) {
				e.printStackTrace();
			}
			balance = amount + money;
			System.out.println(money + " 입금 처리");
		}
	//}

}
