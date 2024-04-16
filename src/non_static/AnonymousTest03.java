package non_static;

import java.util.function.Function;

public class AnonymousTest03 {
	
	static void calc(Function<Integer, Long> func, int num) {
		
		System.out.println( num + "+" +num+ "=" +func.apply(num));
		
	}

	public static void main(String[] args) {
		
		AnonymousTest03.calc(new Function<Integer, Long>() {

			@Override
			public Long apply(Integer t) {
				// TODO Auto-generated method stub
				return (long) t+t;
			}
		},10);
		

		Function<Integer, Long> func = new Function<>() {

			@Override
			public Long apply(Integer t) {

				return (long) t + t;
			}
		};

		long result = func.apply(10);
		System.out.println(result);
	}

}
