package dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import dao.PorderDao;
import model.Porder;
import util.DbConnection;

public class PorderDaoImpl implements PorderDao{

	public static void main(String[] args) {
		/*Porder p=new Porder("小華",1,1,0,0,0);
		new PorderDaoImpl().add(p);*/
		
		/*List<Porder> p=new PorderDaoImpl().selectAll();
		for(Porder allPorder:p){
			System.out.println(allPorder);
		}*/
		
		/*List<Porder> p=new PorderDaoImpl().selectById(5);
		System.out.println(p);*/
		
		/*PorderDaoImpl pdi=new PorderDaoImpl();
		Porder p=pdi.selectById(3).get(0);
		p.setCardName("小明");
		p.setPikachu(1);
		p.setMew(1);
		p.setRowlet(1);
		p.setGengar(1);
		p.setSnorlax(1);
		pdi.update(p);*/
		
		new PorderDaoImpl().delete(4);	
		

	}
	
	private static Connection conn=DbConnection.gerDb();

	@Override
	public void add(Porder porder) {
		String sql="insert into porder(cardname,pikachu,mew,rowlet,gengar,snorlax)"+"values(?,?,?,?,?,?)";
		try {
			PreparedStatement ps=conn.prepareStatement(sql);
			ps.setString(1, porder.getCardName());
			ps.setInt(2, porder.getPikachu());
			ps.setInt(3, porder.getMew());
			ps.setInt(4, porder.getRowlet());
			ps.setInt(5, porder.getGengar());
			ps.setInt(6, porder.getSnorlax());
			
			ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public List<Porder> selectAll() {
		String sql="select * from porder";
		List<Porder> list=new ArrayList();
		try {
			PreparedStatement ps=conn.prepareStatement(sql);
			ResultSet resultset=ps.executeQuery();
			while(resultset.next()) 
			{
				Porder porder=new Porder();
				porder.setId(resultset.getInt("id"));
				porder.setCardName(resultset.getString("cardname"));
				porder.setPikachu(resultset.getInt("pikachu"));
				porder.setMew(resultset.getInt("mew"));
				porder.setRowlet(resultset.getInt("rowlet"));
				porder.setGengar(resultset.getInt("gengar"));
				porder.setSnorlax(resultset.getInt("snorlax"));
				list.add(porder);
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		
		return list;
	}

	@Override
	public List<Porder> selectById(int id) {
		String sql="select * from porder where id=?";
		List<Porder>listPorder=new ArrayList();
		try {
			PreparedStatement ps=conn.prepareStatement(sql);
			ps.setInt(1, id);
			ResultSet resultset=ps.executeQuery();
			if(resultset.next())
			{
				Porder porder=new Porder();
				porder.setId(resultset.getInt("id"));
				porder.setCardName(resultset.getString("cardname"));
				porder.setPikachu(resultset.getInt("pikachu"));
				porder.setMew(resultset.getInt("mew"));
				porder.setRowlet(resultset.getInt("rowlet"));
				porder.setGengar(resultset.getInt("gengar"));
				porder.setSnorlax(resultset.getInt("snorlax"));
				listPorder.add(porder);
				
				
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return listPorder;
	}

	@Override
	public void update(Porder porder) {
		String sql="update porder set cardname=?,pikachu=?,mew=?,rowlet=?,gengar=?,snorlax=? where id=?" ;
		try {
			PreparedStatement ps=conn.prepareStatement(sql);
			ps.setString(1, porder.getCardName());
			ps.setInt(2, porder.getPikachu());
			ps.setInt(3, porder.getMew());
			ps.setInt(4, porder.getRowlet());
			ps.setInt(5, porder.getGengar());
			ps.setInt(6, porder.getSnorlax());
			ps.setInt(7,porder.getId());
			ps.executeUpdate();
		} catch (SQLException e) {
		
			e.printStackTrace();
		}
	}

	@Override
	public void delete(int id) {
		
		String sql="delete from porder where id=?";
		try {
			PreparedStatement ps=conn.prepareStatement(sql);
			ps.setInt(1,id);
			
			ps.executeUpdate();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
	}

}
