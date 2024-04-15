package day0415_nested_class;

class AAA{
	
	public static int a;
	
	public static class AAAInner{
		
		int b;
		void dispA() {
			System.out.println("AAA안에 있는 멤버필드" + a);
			System.out.println("AAAU=Inner안에 있는 멤버필드" + b);
		}
		public AAAInner() {
			
		}
	}
	
}

public class StaticInnerTest {
	
	public static void main(String[] args) {
		System.out.println(AAA.a);
		
		
		AAA.AAAInner obj =new AAA.AAAInner();
		System.out.println(obj.b);
		obj.dispA();
	}

}
