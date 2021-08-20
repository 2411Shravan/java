//variable arguements
class review{
	public int showData(int ... i) {
		int sum=0;
		for(int k : i) {
			sum=sum + k;
		}
		return sum;
	}
}

public class Varargs {
	public static void main(String[] args) {
		review obj= new review();
		System.out.println(obj.showData(4,5,6,7,8,9));
	}
}
