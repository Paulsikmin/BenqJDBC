package com.kh.jdbc.day03.pstmt.member.controller;

import com.kh.jdbc.day03.pstmt.member.model.dao.MemberDAO;
import com.kh.jdbc.day03.pstmt.member.model.vo.Member;

public class MemberController {
	
	MemberDAO mDao;
	
	public MemberController() {
		mDao = new MemberDAO();
	}

	public int registerMember(Member mOne) {
		int result = mDao.insertMember(mOne);
		return result;
	}

	public int updateMember(Member member) {
		int result = mDao.updateMember(member);
		return result;
	}

	public int removeMember(String memberId) {
		int result = mDao.deleteMember(memberId);
		return result;
	}

	public Member checkLogin(Member member) {
		Member result = mDao.selectOne(member);
		return result;
	}

	public Member checkMember(String memberId) {
		Member result = mDao.selectOne(memberId);
		return result;
	}

}
