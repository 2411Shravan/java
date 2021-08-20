class calc //super, parent class
{
	public int add(int i, int j) {
		return i+j;
	}
}

class calAdv extends calc //subclass child class
{
	
	public int sub(int l, int m)
	{
		return l-m;
	}
}
class multip extends calAdv //class after subclass
{
	public int multi(int h, int y) {
		return h*y;
	}
}

public class inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		calc obj=new calc();
		System.out.println(obj.add(3, 5));
		calAdv res=new calAdv();
		int res1=res.add(5,6);
		int res2=res.sub(6,5);
		System.out.println(res1);
		System.out.println(res2);
		multip ast=new multip();
		int red= ast.add(4,5);
		int red1= ast.sub(4,5);
		int red2= ast.multi(4,5);
		System.out.println(red);
		System.out.println(red1);
		System.out.println(red2);
		
		
	}

}
