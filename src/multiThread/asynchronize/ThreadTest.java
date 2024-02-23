package multiThread.asynchronize;

/*
 * 동기화
 */
public class ThreadTest {
	public static Account myBank = new Account();
	
	public static void main(String[] args) throws Exception{
		System.out.println("초기잔고:" + myBank.balance);
	    
        //Thread 선언
		People1 people1 = new People1();
	    People2 people2 = new People2();
	    
	    people1.start(); //입금(3초지연)
	    people2.start(); //출금(2초지연)
	   
        people1.join();
	    people2.join();
	    
	    System.out.println("작업 완료!");
	}

}
