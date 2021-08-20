package ex;



class hii implements Runnable
{
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println("Inside hi loop");
			try {Thread.sleep(1000);} catch(Exception e) {}
			
		}
		
	}
}

class helloi implements Runnable
{
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println("Inside hello loop");
			try {Thread.sleep(1000);} catch(Exception e) {}
		}
		
	}
}







public class multithreadngUsingInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		hii obj = new hii();
		helloi obj1 = new helloi();
		
		Thread t1 = new Thread(obj);
		Thread t2 = new Thread(obj1);
		
		
		t1.start();
		try {Thread.sleep(10);} catch(Exception e) {}
		t2.start();
		
	}

}
