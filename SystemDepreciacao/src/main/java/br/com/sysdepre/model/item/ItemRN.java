package br.com.sysdepre.model.item;

import java.io.Serializable;

import java.util.List;

public class ItemRN implements Serializable{

	private static final long serialVersionUID = 1L;

	public void inserir(Item i){
		new ItemDAO().insert(i);
	}
	
	public List<Item> listar(){
		return new ItemDAO().listar();
	}
	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

