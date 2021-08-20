class outer{
	int a;
	public void show() {
		System.out.println("Hello");
	}
	class inner{
		public void display() {
			System.out.println("Hai");
		}
	}
}
public class innerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		outer obj;
		obj = new outer();
		outer.inner obj1;
		obj1=obj.new inner();
		obj.show();
		obj1.display();
		
	}

}
