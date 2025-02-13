package dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import dao.MemberDao;
import model.Member;
import util.DbConnection;

public class MemberDaoImpl implements MemberDao{

	public static void main(String[] args) {
		/*Member m=new Member("小e","e123","e123","0944444444","台中","e123@gmail.com");
		new MemberDaoImpl().add(m);*/

		/*List<Member> m=new MemberDaoImpl().selectAll();
		for(Member allMember:m) {
			System.out.println(allMember);
		}*/
		
		/*List<Member> m=new MemberDaoImpl().selectById(2);
		System.out.println(m);*/
		
		/*List<Member> m=new MemberDaoImpl().selectByUsername("e123");
		System.out.println(m);*/
		
		/*List<Member> m=new MemberDaoImpl().selectUserAndPassword("c123","c123");
		System.out.println(m);*/
	
		/*MemberDaoImpl mdi=new MemberDaoImpl();
		Member m=mdi.selectById(1).get(0);
		m.setMemberName("小e");
		m.setPassword("h123");
		m.setPhone("0911111111");
		m.setAddress("高雄");
		m.setEmail("h123@gmail.com");
		mdi.update(m);*/
		
		new MemberDaoImpl().delete(5);
		
		
	}
	private static Connection conn=DbConnection.gerDb();

	@Override
	public void add(Member member) {
		String sql="insert into member(membername,username,password,phone,address,email)"
		+"values(?,?,?,?,?,?)";
		try {
			PreparedStatement ps=conn.prepareStatement(sql);
			ps.setString(1, member.getMemberName());
			ps.setString(2, member.getUsername());
			ps.setString(3,member.getPassword());
			ps.setString(4,member.getPhone());
			ps.setString(5,member.getAddress());
			ps.setString(6,member.getEmail());
			ps.executeUpdate();
		} catch (SQLException e) {

			e.printStackTrace();
		}
	}

	@Override
	public List<Member> selectAll() {
		String sql="select * from member";
		List<Member> listMember=new ArrayList();
		
		try {
			PreparedStatement ps=conn.prepareStatement(sql);
			ResultSet resultset=ps.executeQuery();
			
			while(resultset.next())
			{
				Member m=new Member();
				m.setId(resultset.getInt("id"));
				m.setMemberName(resultset.getString("membername"));
				m.setUsername(resultset.getString("username"));
				m.setPassword(resultset.getString("password"));
				m.setPhone(resultset.getString("phone"));
				m.setAddress(resultset.getString("address"));
				m.setEmail(resultset.getNString("email"));
				
				listMember.add(m);				
			}
		} catch (SQLException e) {
		
			e.printStackTrace();
		}
		return listMember;
	}

	@Override
	public List<Member> selectById(int id) {
		String sql="select * from member where id=?";
		List<Member>listMember=new ArrayList();
		try {
			PreparedStatement ps=conn.prepareStatement(sql);
			ps.setInt(1,id);
			
			ResultSet resultset=ps.executeQuery();
			if(resultset.next())
			{
				Member m=new Member();
				m.setId(resultset.getInt("id"));
				m.setMemberName(resultset.getString("membername"));
				m.setUsername(resultset.getString("username"));
				m.setPassword(resultset.getString("password"));
				m.setPhone(resultset.getString("phone"));
				m.setAddress(resultset.getString("address"));
				m.setEmail(resultset.getString("email"));
				
				listMember.add(m);
				
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return listMember;
	}

	@Override
	public List<Member> selectByUsername(String username) {
		String sql="select * from member where username=?";
		List<Member>listMember=new ArrayList();
		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1,username);
			
			ResultSet resultset=ps.executeQuery();
			
			if(resultset.next())
			{
				Member m=new Member();
				m.setId(resultset.getInt("id"));
				m.setMemberName(resultset.getString("membername"));
				m.setUsername(resultset.getString("username"));
				m.setPassword(resultset.getString("password"));
				m.setPhone(resultset.getString("phone"));
				m.setAddress(resultset.getString("address"));
				m.setEmail(resultset.getString("email"));
				
				listMember.add(m);
				
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}

		
		return listMember;
	}

	@Override
	public List<Member> selectUserAndPassword(String username, String password) {
		String sql="select * from member where username=? and password=?";
		List<Member> listMember=new ArrayList();
		try {
			PreparedStatement ps=conn.prepareStatement(sql);
			ps.setString(1, username);
			ps.setString(2, password);
			
			ResultSet resultset=ps.executeQuery();
			
			if(resultset.next())
			{
				Member m=new Member();
				m.setId(resultset.getInt("id"));
				m.setMemberName(resultset.getString("membername"));
				m.setUsername(resultset.getString("username"));
				m.setPassword(resultset.getString("password"));
				m.setAddress(resultset.getString("address"));
				m.setPhone(resultset.getString("phone"));
				m.setEmail(resultset.getString("email"));
				
				listMember.add(m);
			}
		
		
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
	
		return listMember;
	}

	@Override
	public void update(Member member) {
		String sql="update member set membername=?,password=?,phone=?,address=?,email=? where id=?";
		try {
			PreparedStatement ps=conn.prepareStatement(sql);
			ps.setString(1,member.getMemberName());
			ps.setString(2, member.getPassword());
			ps.setString(3, member.getPhone());
			ps.setString(4, member.getAddress());
			ps.setString(5, member.getEmail());
			ps.setInt(6,member.getId());
			ps.executeUpdate();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
	}

	@Override
	public void delete(int id) {
		String sql="delete from member where id=?";
		try {
			PreparedStatement ps=conn.prepareStatement(sql);
			ps.setInt(1, id);
			ps.executeUpdate();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
	}
	

}
