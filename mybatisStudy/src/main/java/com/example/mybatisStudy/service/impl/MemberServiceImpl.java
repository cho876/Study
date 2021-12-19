package com.example.mybatisStudy.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.mybatisStudy.repository.MemberRepository;
import com.example.mybatisStudy.service.MemberService;
import com.example.mybatisStudy.vo.MemberVo;

@Service
public class MemberServiceImpl implements MemberService{
	
	@Autowired
	private MemberRepository memberDao;
	
	@Override
	public List<MemberVo> getAllMember(){
		return memberDao.getAllMember();
	}
	
	@Override
	public String hello() {
		return "hello world";
	}
}
