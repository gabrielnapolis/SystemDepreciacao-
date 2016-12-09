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
	
	
	
	public int CalcularPeriodo(Item i){
			int qntAnos = 0;
			
			//Conversão de Datas para String
			String dataCompra = i.getDataAquisicao().toString();
			String dataVenda = i.getDataVenda().toString();
			
			//Extração do Dia
			String diaCompra = dataCompra.substring(0,2);
			String diaVenda  = dataVenda.substring(0,2);
			
			//Extração do Mes
			String mesCompra = dataCompra.substring(3,5);
			String mesVenda  = dataCompra.substring(3,5);
			
			//Extração do Ano
			String anoCompra = dataCompra.substring(6,8);
			String anoVenda  = dataVenda.substring(6,8);
			
			System.out.println("Data Compra: "+dataCompra);
			System.out.println("Dia Compra: "+diaCompra);
			System.out.println("Mes compra: "+mesCompra);
			System.out.println("Ano compra: "+anoCompra);
			
				
			System.out.println("Data Venda: "+dataVenda);
			System.out.println("Mes Venda: "+diaVenda);
			System.out.println("Dia Venda: "+mesVenda);
			System.out.println("Ano Venda: "+anoVenda);
			
			return qntAnos;
	}
}
