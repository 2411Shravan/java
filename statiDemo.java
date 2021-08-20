
class Employee{
	int id;
	int sal;
	static String ceo;
	public void show() {
		System.out.println(id + ": "+ sal +": "+ ceo);
	}
}



public class statiDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee Obj;
		Obj = new Employee();
		Obj.id=9;
		Obj.sal=5000;
		Obj.ceo="suresh";
		
		Employee Obj1;
		Obj1=new Employee();
		Obj1.id=8;
		Obj1.sal=5500;
		Obj.ceo="mahesh";
		
		Obj.show();
		Obj1.show(); 
		
	}

}
