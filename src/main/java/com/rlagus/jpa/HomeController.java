package com.rlagus.jpa;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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
//	public String joinOk(HttpServletRequest request) {
//		
//		String name = request.getParameter("name");
//		int age = Integer.parseInt(request.getParameter("age"));
//		int grade = Integer.parseInt(request.getParameter("grade"));
//		String etc = request.getParameter("etc");
//		
//		MemberDto dto = new MemberDto();
//		dto.setName(name);
//		dto.setAge(age);
//		dto.setGrade(grade);
//		dto.setEtc(etc);
//		
//		memberRepository.save(dto);
//		
//		return "joinOk";
//	}
	
	public String joinOk(MemberDto dto, Model model) {		// 매개변수로 MemberDto 주입시 간결해짐
		
		memberRepository.save(dto);
		model.addAttribute("memberDto", dto);
	
		return "joinOk";		
	}
	
	@RequestMapping(value = "/search")
	public String search() {
		
		return "search";		
	}
	
	@RequestMapping(value = "/searchOk")
	public String searchOk(HttpServletRequest request, Model model) {
		
		String searchName = request.getParameter("searchName");
		List<MemberDto> memberDtos = memberRepository.findByName(searchName);
		
		model.addAttribute("memberDtos", memberDtos);
		
		return "searchOk";
	}
	
	@RequestMapping(value = "/delete")
	public String delete() {
		
		return "delete";
	}
	
	@RequestMapping(value = "/deleteOk")
	public String deleteOk(HttpServletRequest request) {
		
		String hakbun = request.getParameter("hakbun");
		memberRepository.deleteById(Long.parseLong(hakbun));		
		
		return "redirect:memberList";
	}
	
	@RequestMapping(value = "/deleteOk2")
	public String deleteOk2(HttpServletRequest request) {
		
		String name = request.getParameter("name");
		memberRepository.deleteAllByName(name);
		
		return "redirect:memberList";
	}
	
	@RequestMapping(value = "/memberList")
	public String memberList(Model model) {
		model.addAttribute("memberDtos", memberRepository.findAllByOrderByHakbunDesc());
		// 학번의 내림차순 정렬
		
		return "memberList";
	}	
}