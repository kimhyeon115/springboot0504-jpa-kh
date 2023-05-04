package com.rlagus.jpa;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.rlagus.jpa.dto.MemberDto;
import com.rlagus.jpa.repository.MemberRepository;

@Controller
public class HomeController {
	
	@Autowired
	MemberRepository memberRepository;
	
	@RequestMapping(value = "/join")
	public String join() {		
		return "join";
	}

	@RequestMapping(value = "/joinOk")
	public String joinOk(HttpServletRequest request) {
		
		String name = request.getParameter("name");
		int age = Integer.parseInt(request.getParameter("age"));
		int grade = Integer.parseInt(request.getParameter("grade"));
		String etc = request.getParameter("etc");
		
		MemberDto dto = new MemberDto();
		dto.setName(name);
		dto.setAge(age);
		dto.setGrade(grade);
		dto.setEtc(etc);
		
		memberRepository.save(dto);
		
		return "joinOk";
	}
}
