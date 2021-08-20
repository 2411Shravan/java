class A{
	public A() {
		System.out.println("Hello world\npublic A");
	}
	public A(int i) {
		System.out.println("public A with arguements taken");
	}
}
class B extends A{
	public B() {
		//super();
		System.out.println("Hello world\npublic B");
	}
	public B(int h) {
		super(h);
		System.out.println("public B with arguements taken");
	}
}
public class superKeyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B obj = new B(5);
		
	}

}
