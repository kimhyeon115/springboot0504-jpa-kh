package com.rlagus.jpa;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.lang.reflect.Member;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;

import com.rlagus.jpa.dto.MemberDto;
import com.rlagus.jpa.repository.MemberRepository;

@SpringBootTest
@TestPropertySource(locations = "classpath:application-test.properties")	// 사용할 properties선택(테스트용)
public class jpaTest {

	@Autowired
	MemberRepository memberRepository;
	
//	@Test
//	@DisplayName("이름 검색 테스트")
//	public void serchName() {
//		List<MemberDto> memberDtos = memberRepository.findByName("조조");
//		for(MemberDto memberDto : memberDtos)								// memberDtos 리스트내 객체수 많큼 반복(객체가 memberDto)
//			System.out.println(memberDto.toString());						// Run As > JUnit Test(서버 실행)
//	}
//	
//	@Test
//	@DisplayName("회원 탈퇴 테스트")
//	public void deleteMember() {
//		memberRepository.deleteById(23L); 									// 학번이 23번 멤버 삭제(타입 Long)		
//	}
//	
//	@Test
//	@DisplayName("회원 리스트 테스트")
//	public void memberList() {
//		List<MemberDto> memberDtos = memberRepository.findAll();	// 모든 회원 리스트 가져오기
//		for(MemberDto memberDto : memberDtos) {
//			System.out.println(memberDto);
//		}
//	}
//	
//	@Test
//	@DisplayName("회원 정보 수정 테스트")
//	public void modifyMember() {
//		Optional<MemberDto> optionalDto  = memberRepository.findById(20L);	// java.util소속 Optional로 받아야함(주의)
//																			// null 값이 있을수 있기에 null값까지 받을수 있음
//																			// MemberDto는 null 값이 들어오면 에러발생
//		assertTrue(optionalDto.isPresent());								// null 값 체크(에러 방지)
//		
//		MemberDto memberDto = optionalDto.get();
//		memberDto.setAge(33);
//		memberDto.setName("조조");
//		memberRepository.save(memberDto);
//		System.out.println(optionalDto.get().toString());
//	}
//	
//	@Test
//	@DisplayName("회원 이름 중 성씨로 찾기")
//	public void searchFirst() {
//		List<MemberDto> memberDtos = memberRepository.findAllByStartingWith("조");
//		for(MemberDto memberDto : memberDtos) {
//			System.out.println(memberDto.toString());
//		}
//		
//	}
//	
//	@Test
//	@DisplayName("회원 이름 중 특정단어 포함된 회원 찾기")
//	public void searchFirst2() {
//		
//		List<MemberDto> memberDtos = memberRepository.findByNameLike("%가%");
//		
//		for(MemberDto memberDto : memberDtos) {
//			System.out.println(memberDto.toString());
//		}		
//	}
}
