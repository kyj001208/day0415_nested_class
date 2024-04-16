package non_static;

public class Outter {
	
	int a=10;
	
	void disp() {

		int d;

		class MethodInner {

			int e = 1000;
		}

		MethodInner mi = new MethodInner();
		System.out.println(mi.e);

	}
	
	
	
	

	class Inner {

		int c = 100;

}

	static class StaticInner {
	}

}
