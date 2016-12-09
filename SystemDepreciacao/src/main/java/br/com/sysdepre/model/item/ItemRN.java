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
			int periodo = 0;
					
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
			
			periodo = (anoCompra - anoVenda) * 12;
			
			//Calcular Ano Inicial
			if(diaCompra <= 15)
				periodo = periodo - mesCompra - 1;
			else
				periodo = periodo - mesCompra;
			
			//Calcular Ano Final
			if(diaVenda <= 15)
				periodo = periodo + mesVenda -1;
			else
				periodo = periodo + mesVenda;
					
			return periodo;
	}
	
	public int CalcularTaxa(Item i){
		int taxa = 0;
		
		taxa = i.getVidaUtil() * 100;
		
		return taxa;
	}
	
	
	
	
	
	
	@SuppressWarnings("unused")
	public double CalcularDepreciacao(Item i){
		double DA = 0;

		double CB = i.getCustoDoBem();
		int TX = CalcularTaxa(i);
		int N = CalcularPeriodo(i);
		double VR = i.getValorResidual();
		
		
		
		
		return DA;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
