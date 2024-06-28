package com.kh.jdbc.day02.stmt.member.controller;


import java.util.List;

import com.kh.jdbc.day02.stmt.member.model.dao.MemberDAO;
import com.kh.jdbc.day02.stmt.member.model.vo.Member;

public class MemberController {
	
	MemberDAO mDao; 
	
	public MemberController() {
		mDao = new MemberDAO();
	}

	public void insertMember(Member member) {
		mDao.insertMember(member);
	}
	public int modifyMember(Member modifyInfo) {
		// DML의 결과는 int니까 int result
		// modifyInfo 전달해야되니까 updateMember(modifyInfo)
		int result = mDao.updateMember(modifyInfo);
		// 호출한 곳에서 써야되니까 return result, MemberView:66
		return result;
	}

	// View에서 memberId값 받아야하니까 removeMember(String memberId)
	// return하는 값의 자료형이 int니까 void대신 int
	public int removeMember(String memberId) {
		// DML의 결과는 int니까 int result
		// memberId 전달해야되니까 deleteMember(memberId)
		int result = mDao.deleteMember(memberId);
		// 호출한 곳에서 써야되니까 return result, MemberView:55
		return result;
	}

	public List<Member> printAllMember() {
		// 여러개니까 List, 멤버니까 List<Member>
		List<Member> mList = mDao.selectList();
		// 호출한 곳에서 써야되니까 return, MemberView:34
		return mList;
	}

	// View가 준것 받아야 되니까 printOneMember(String memberId)
	public Member printOneMember(String memberId) {
		// 한개니까 List없어도 됨, Member
		// DAO로 전달해야되니까 selectOne(memberId)
		Member member = mDao.selectOne(memberId);
		// 호출한 곳에서 써야되니까 return member, MemberView:44
		return member;
	}

}





















