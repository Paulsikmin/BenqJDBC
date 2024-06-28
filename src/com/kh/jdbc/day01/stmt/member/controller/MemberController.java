package com.kh.jdbc.day01.stmt.member.controller;

import java.util.List;

import com.kh.jdbc.day01.stmt.member.model.dao.MemberDAO;
import com.kh.jdbc.day01.stmt.member.model.vo.Member;

public class MemberController {
	MemberDAO mDao;
	
	public MemberController() {
		mDao = new MemberDAO();
	}
	
	public void insertMember(Member member) {
		mDao.insertMember(member);
	}
	
	public List<Member> listMember() {
		return mDao.selectList();
	}

	public Member printOneMember(String memberId) {
		Member member = mDao.selectOne(memberId);
		return member;
	}
}
