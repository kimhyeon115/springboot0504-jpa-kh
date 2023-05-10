package com.rlagus.jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rlagus.jpa.dto.MemberDto;

public interface MemberRepository extends JpaRepository<MemberDto, Long> {	 // mybatis에서의 DAO 역할
													   // <엔티티 클래스의 타입, 엔티티 클래스의 기본키의 타입>
	
}
