package com.example.hello;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.hello.mypac.Car;
import com.example.hello.mypac.MemberDto;

@Configuration
public class MyConfig {
	//예전 프로젝트에 init.xml 문서에 아래와 같이 한것과 비슷한 효과다.
	//<bean id="myCar" class="com.example.hello.mypac.myCar" />
	//이 클래스를 사용할 때 사용하는 곳에서 직접 myCar의 메소드를 실행해서 객체를 얻는 것이 아닌
	//spring에서 객체를 갖고있다가 필요한 곳에 참조값을 주입하는 방식으로 동작이 수행된다.
	@Bean
	public Car myCar() {
		return new Car();
	}
	@Bean
	public MemberDto myMember() {
		
		return new MemberDto();
	}
}
