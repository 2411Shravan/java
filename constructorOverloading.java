class showData{
	int n1;
	public showData(int i) {
		System.out.println(i);
		
	}
	public showData(int i,int j) {
		System.out.println(i+j);
		
	}
	public showData(int i,int j,int k) {
		System.out.println(i+j+k);
		
	}
}




public class constructorOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		showData Obj;
		Obj = new showData(6,4,7);
		
	}

}
