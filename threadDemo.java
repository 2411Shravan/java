package ex;



class hi extends Thread
{
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println("Inside hi loop");
			try {Thread.sleep(1000);} catch(Exception e) {}
			
		}
		
	}
}

class hello extends Thread
{
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println("Inside hello loop");
			try {Thread.sleep(1000);} catch(Exception e) {}
		}
		
	}
}







public class threadDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		hi obj = new hi();
		hello obj1 = new hello();
		
		obj.start();
		
		try {Thread.sleep(10);} catch(Exception e) {}
		obj1.start();
		
	}

}
