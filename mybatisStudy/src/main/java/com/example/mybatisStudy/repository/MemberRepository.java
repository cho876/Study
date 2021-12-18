package com.example.mybatisStudy.repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.mybatisStudy.vo.MemberVo;

@Mapper
public interface MemberRepository {
	List<MemberVo> getAllMember();
}