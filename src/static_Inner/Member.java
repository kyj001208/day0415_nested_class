package static_Inner;

public class Member {

	private String email;
	private String name;
	private String pass;

	public static MemberBuilder builder() {

		return new MemberBuilder();
	}

	// private 생성자: 존재하긴 하나 객체 생성 불가
	public Member(String email, String name, String pass) {

		this.email = email;
		this.name = name;
		this.pass = pass;

	}

	// static 내부 클래스 (정적 클래스)
	public static class MemberBuilder {

		private String email;
		private String name;
		private String pass;

		// 초기화하는 기능(메서드)
		public MemberBuilder email(String email) {
			this.email = email;
			return this; // 현재 클래스를 지칭하는 뜻

		}

		// 초기화하는 기능(메서드)
		public MemberBuilder name(String name) {
			this.name = name;
			return this; // 현재 클래스를 지칭하는 뜻

		}

		// 초기화하는 기능(메서드)
		public MemberBuilder pass(String pass) {
			this.pass = pass;
			return this; // 현재 클래스를 지칭하는 뜻

		}

		public Member build() {

			return new Member(email, name, pass);

		}

	}

}
