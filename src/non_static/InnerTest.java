package non_static;

public class InnerTest {

	public static void main(String[] args) {
		
		/*
		Outter out=new Outter();
		
		System.out.println(out.a);
		
		out.new Inner();

		
		Outter.Inner inner=out.new Inner();
		
		System.out.println(inner.c);
		*/
		
		Outter.StaticInner si=new Outter.StaticInner();
	
		
		//out.disp();
	
		
		
		
	}

}
