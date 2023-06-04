package Practice1;

public class Print {
	String x="m1 method executed";
	public void m1() {
		System.out.println(x);
	}
	public void m2() {
		System.out.println("m2 method exeuted");
		
	}
	public static void main(String[] args) {
		System.out.println("Welcome to selenium");
		Print z=new Print();
		z.m1();
		z.m2();
	}
		
	}


