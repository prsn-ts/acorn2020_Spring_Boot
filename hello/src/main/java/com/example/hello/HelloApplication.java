package com.example.hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.hello.mypac.Car;

@SpringBootApplication
public class HelloApplication {

	public static void main(String[] args) {
		System.out.println("app 이 시작 됩니다.");
		//Spring app 을 실행시키고 ApplicationContext type 의 참조값 리턴받기
		ApplicationContext context = SpringApplication.run(HelloApplication.class, args);
		//Car type 의 참조값 얻어와서
		Car car1 = context.getBean(Car.class);
		Car car2 = (Car)context.getBean("myCar");
		//사용하기
		car1.drive();
		car2.drive();
		//참조값 비교(spring이 관리하는 객체를 필요한 곳에 똑같이 주기 때문에 car1과 car2 객체의 참조값이 둘다 같게된다.)
		System.out.println("car1 == car2 : "+ (car1==car2));
	}

}
