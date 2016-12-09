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
	
	
	
	@SuppressWarnings("unused")
	public int CalcularPeriodo(Item i){
			int qntAnos = 0;
			
			//Conversão de Datas para String
			String dataCompra = i.getDataAquisicao().toString();
			String dataVenda = i.getDataVenda().toString();
			
			//Extração Dia, Mes e Ano Compra
			String diaCompraString = dataCompra.substring(0,2);
			String mesCompraString = dataCompra.substring(3,5);
			String anoCompraString = dataCompra.substring(6,8);
			int diaCompra = Integer.parseInt(diaCompraString);
			int mesCompra = Integer.parseInt(mesCompraString);
			int anoCompra = Integer.parseInt(anoCompraString);
				
			
			//Extração Dia, Mes e Ano Venda
			String diaVendaString  = dataVenda.substring(0,2);
			String mesVendaString  = dataCompra.substring(3,5);
			String anoVendaString  = dataVenda.substring(6,8);
			int diaVenda  = Integer.parseInt(diaVendaString);
			int mesVenda  = Integer.parseInt(mesVendaString);
			int anoVenda  = Integer.parseInt(anoVendaString);
			
			
			if(diaCompra <= 15){
				
			}
		
			
			return qntAnos;
	}
}
