package com.company.example1.NamingConvention;


/**
 * 모든 변수나 함수, 클래스들은 CamelCase 스타일로 한다. (클래스는 첫자가 대문자)
 */
public class UserService {
	private String firstName;
	//상수는 전부 대문자에 언더스코어로 띄어쓰기를 하는게 좋음
	private final int MAX_AGE = 20;

	public String getFirstName(){
		return firstName;
	}

	public void makeUserServices(){
		// 특수기호나 숫자의 사용은 피해라
		UserService userService1 = new UserService();
		UserService userService2$ = new UserService();

	}
}