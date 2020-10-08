package com.example.helloWeb;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	
	//@RequestMapping(value="/", method=RequestMethod.GET) 와 @GetMapping("/")은 같은 의미이다.
	@GetMapping("/")
	public String home(HttpServletRequest request) {
		List<String> notice = new ArrayList<>();
		notice.add("가을 입니다");
		notice.add("감기 조심하세요~");
		notice.add("어쩌구..");
		notice.add("저쩌구..");
		
		request.setAttribute("notice", notice);
		
		return "home";
	}
}
