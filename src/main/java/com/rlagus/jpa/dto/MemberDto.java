package com.rlagus.jpa.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

// JPA
@Entity							// MemberDto 클래스를 엔티티로 선언(DB 테이블과 맵핑)
@Table(name="jpa_member")		// 엔티티와 맵핑할 DB 테이블 이름 지정

// lombok
@Data
@AllArgsConstructor
@NoArgsConstructor
public class MemberDto {

	@Id													// 맵핑될 DB 테이블의 기본키로 바로아래 속성값이 설정
	@Column(name="hakbun")								// 실제 DB 테이블의 필드 이름
	@GeneratedValue(strategy = GenerationType.AUTO)		// DB 기본키 생성 전략(AI) <AUTO시 DB 타입 상관없이 자동생성>
	private Long hakbun;
	
	@Column(name="name", nullable=false, length=20)
	private String name;
	
	@Column(name="age")
	private int age;
	
	@Column(name="grade")
	private int grade;
	
	@Column(name="etc", length=100)
	private String etc;
}
