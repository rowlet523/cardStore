package service.impl;

import java.util.List;

import dao.impl.PorderDaoImpl;
import model.Porder;
import service.PorderService;

public class PorderServiceImpl implements PorderService{
	public static void main(String[] args) {
		

	}
	
	private static PorderDaoImpl porderdaoimpl=new PorderDaoImpl();

	@Override
	public void addPoder(Porder porder) {
		if(porder.getPikachu()>=0 &&
		   porder.getMew()>=0 &&
		   porder.getRowlet()>=0 &&
		   porder.getGengar()>=0 &&
		   porder.getSnorlax()>=0)
		{
			porderdaoimpl.add(porder);
		}
		
	}

	@Override
	public String AllPorder() {
		List<Porder> listPorder=porderdaoimpl.selectAll();
		String show="";
		
		for(Porder porder:listPorder)
		{
			int  sum=porder.getPikachu()*1200+
					porder.getMew()*1800+
					porder.getRowlet()*2500+
					porder.getGengar()*800+
					porder.getSnorlax()*500;
			
			show+="訂單編號:"+porder.getId()+
				  "\t會員姓名:"+porder.getCardName()+
			      "\t皮卡丘:"+porder.getPikachu()+
			      "\t夢幻:"+porder.getMew()+
			      "\t木木梟:"+porder.getRowlet()+
			      "\t耿鬼:"+porder.getGengar()+
			      "\t卡比獸:"+porder.getSnorlax()+
			      "\t總金額:"+sum+"元\n";
		}
		return show;
	}

	@Override
	public List<Porder> findAllPorder() {
		
		return porderdaoimpl.selectAll();
	}

	@Override
	public Porder findById(int id) {
		Porder porder=null;
		if(id>0) {
			List<Porder> listPorder=porderdaoimpl.selectById(id);
		    if(listPorder.size()>0) {
		    	porder=listPorder.get(0);
		    }
		}
		
		return porder;
	}

	@Override
	public void updatePorder(String name, int id) {
		Porder porder=findById(id);
		porder.setCardName(name);
		
		porderdaoimpl.update(porder);
		
	}

	@Override
	public void updatePorder(int pikachu, int mew, int rowlet, int gengar, int snorlax ,int id) {
		Porder porder=findById(id);
		porder.setPikachu(pikachu);
		porder.setMew(mew);
		porder.setRowlet(rowlet);
		porder.setGengar(gengar);
		porder.setSnorlax(snorlax);
		
		porderdaoimpl.update(porder);
		
	}

	@Override
	public void updatePorder(Porder porder) {
		Porder p=findById(porder.getId());
		porderdaoimpl.update(porder);
	}

	@Override
	public void deletePorderById(int id) {
		if(id>0) {
			porderdaoimpl.delete(id);
		}
		
	}

}
