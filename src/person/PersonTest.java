package person;

public class PersonTest {

	public static void main(String[] args) {
		Person p = new Person();
		//private 는 직접접근 불가 
		//p.name = "김수현";
		
		p.age =25;//protected는 자식 또는 같은 패키지에서 접근 가능함.
		p.height=123;//default는 같은 패키지 내에서만 접근 가능함.
		p.weight=30;//public은 모든 곳에서 접근가능
		

	}

}
