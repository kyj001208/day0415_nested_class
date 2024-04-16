package non_static;

public class AnonymousTest02 {

	public static void main(String[] args) {
		
		Runnable runnable=new Runnable() {

			@Override
			public void run() {
				System.out.println("익명 객체 생성 테스트!");
				
			}};
			
			
			runnable.run();

	}

}
