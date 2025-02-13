package service;

import java.util.List;

import model.Porder;

public interface PorderService {
	//create
	void addPoder(Porder porder);
	
	//read
	String AllPorder();
	List<Porder>findAllPorder();
	Porder findById(int id);
	
	//update
	void updatePorder(String name,int id);
	void updatePorder(int pikachu,int mew,int rowlet,int gengar,int snorlax,int id);
	void updatePorder(Porder porder);
	
	//delete
	void deletePorderById(int id);

}
