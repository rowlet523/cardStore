package service.impl;

import java.util.List;

import dao.impl.MemberDaoImpl;
import model.Member;
import service.MemberService;

public class MemberServiceImpl implements MemberService{
	public static void main(String[] args) {
		

	}
	
	private static MemberDaoImpl memberdaoimpl=new MemberDaoImpl();

	@Override
	public void addMember(Member member) {
		memberdaoimpl.add(member);
		
	}

	@Override
	public Member Login(String username, String password) {
		Member member=null;
		List<Member> list=memberdaoimpl.selectUserAndPassword(username, password);
		if(list.size()!=0)
		{
			member=list.get(0);
		}
		return member;
	}

	@Override
	public boolean isUsernameBeenUse(String username) {
		
		return !memberdaoimpl.selectByUsername(username).isEmpty();
	}

}
