package com.rlagus.jpa.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

import com.rlagus.jpa.dto.MemberDto;

public interface MemberRepository extends JpaRepository<MemberDto, Long> {	 // mybatis에서의 DAO 역할
													   // <엔티티 클래스의 타입, 엔티티 클래스의 기본키의 타입>
	
	public List<MemberDto> findByName(String name);	   // List import시 java.util사용(주의:여러개 있음)
	
	public List<MemberDto> findAllByOrderByHakbunDesc();	// 학번 내림차순 정렬후 모든 리스트 가져오기(메소드 만들어야함)
	
	@Transactional											// springframwork 소속에서 추가(delete 여러번 실행시에 필수)
	public void deleteAllByName(String name);				// 이름으로 조회하여 삭제
	
	public List<MemberDto> findByNameStartingWith(String nameKeyword);	// 이름의 첫글자로 검색
	public List<MemberDto> findByNameEndingWith(String nameKeyword);		// 이름의 끝자리로 검색
	public List<MemberDto> findByNameLike(String nameKeyword);			// 이름에 포함된 글자로 검색
}
