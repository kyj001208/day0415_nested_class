package day0415_nested_class;

public class MemberTest {

	public static void main(String[] args) {
		
		//Member.MemberBuilder innner=new Member.MemberBuilder();
		
		//빌더 패턴
		Member mem=Member.builder()
				.email("test@test.com")
				.name("테스트")
				.pass("1234")
				.build();
		
		Member mem1=Member.builder()
				.pass("1234")
				.email("test@test.com")
				.name("테스트")
				.build();
		
		Member mem2=Member.builder()
				.pass("1234")
				.name("테스트")
				.build();
		
		//장점: 메서드 이름으로 데이터 구별 가능,순서가 달라져도 상관없다
		//멤버 오버로딩 생성자가 있는것처럼 사용 가능
		
		//단점 : 정의하기 불편 

		Member men =new Member("test","테스트","1234");
		Member men1 =new Member("1234", "테스트","test");
		
		
		
		
	}

}
