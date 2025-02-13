package dao;

import java.util.List;

import model.Member;

public interface MemberDao {
	//create
	void add(Member member);
	//read
	List<Member>selectAll();
	List<Member>selectById(int id);
	List<Member>selectByUsername(String username);
	List<Member>selectUserAndPassword(String username,String password);
	//update
	void update(Member member);
	//delete
	void delete(int id);

}
