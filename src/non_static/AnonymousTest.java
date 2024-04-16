package non_static;

abstract class Creeting { // 추상클래스

	abstract void greet(); // 추상 메서드
}

interface Button { // 인터페이스

	void exec(); // 추상 메서드
}

public class AnonymousTest {

	void hello(Creeting creeting) {// 추상클래스가 매개 변수로 활용된 예
		creeting.greet();

	}

	public static void main(String[] args) {

		AnonymousTest obj = new AnonymousTest();
		obj.hello(new Creeting() {

			@Override
			void greet() {
				System.out.println("메서드의 인자로 전달되는 익명 객체");

			}
		}); // () 구현 객체가 들어와야한다, 추상클래스의 자식 객체

		// AnonymousTest 내부에서 객체생성

		Creeting greeting = new Creeting() {

			@Override
			void greet() {

				System.out.println("안녕하세요");

			}

		};

		greeting.greet();

		// AnonymousTest$2.class
		Creeting greeting1 = new Creeting() {

			@Override
			void greet() {
				System.out.println("안녕");

			}

		};// 익명클래스
		greeting1.greet();

		Button botton = new Button() {

			@Override
			public void exec() {
				// TODO Auto-generated method stub

			}
		};

		botton.exec();

	}

}