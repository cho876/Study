package com.example.mybatisStudy.service;

import java.util.List;

import com.example.mybatisStudy.vo.MemberVo;


public interface MemberService {
	public List<MemberVo> getAllMember();
	public String hello();
}
