package non_static;

import java.util.function.Consumer;

interface  AA{
	
	abstract void run();
	
}

public class AnonymousTest04<T> {

	
	 void display(Consumer<T> consumer, T str) {
		
		consumer.accept(str);
	}
	
	
	
	public static void main(String[] args) {
		
		
		AnonymousTest04<String> obj=new AnonymousTest04<String>();
		
		
		obj.display(new Consumer<String>(){

			@Override
			public void accept(String t) {
				
				System.out.println(t + " 몽이 ♥");
				
			}}, "♥ 여름");
		
		
		//FunctionalInterface -추상 메서드가 1개만 존재 , 람다식을 사용 가능 
		
		obj.display((t)->{System.out.println(t + "몽");},"여름"); //람다식
		
		
		AA aa=new AA() {

			@Override
			public void run() {
				System.out.println("익명 객체");
				
			}};
		
		aa.run();
		
		AA aa1=()->{};
		
		
		
		

	}

}
