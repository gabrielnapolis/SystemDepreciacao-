package br.com.sysdepre.model.depre;

import java.util.Calendar;

import br.com.sysdepre.model.item.Item;

public class DepreciacaoRN {

	public int CalcularPeriodo(Item i){
		int periodo = 0;
		
		Calendar dtInicial = Calendar.getInstance();
		Calendar dtFinal = Calendar.getInstance();
		
		dtInicial.setTime(i.getDataAquisicao());
		dtFinal.setTime(i.getDataVenda());
		
		periodo = (dtFinal.get(Calendar.YEAR) - dtInicial.get(Calendar.YEAR)) * 12;
		
		
		//Calcular Ano Inicial
		if(dtInicial.get(Calendar.DAY_OF_MONTH) <= 15)
			periodo = periodo - (dtInicial.get(Calendar.MONTH) - 1);
		else
			periodo = periodo - dtInicial.get(Calendar.MONTH);
		
		
		//Calcular Ano Final
		if(dtFinal.get(Calendar.DAY_OF_MONTH) <= 15)
			periodo = periodo + (dtFinal.get(Calendar.MONTH) - 1);
		else
			periodo = periodo + dtFinal.get(Calendar.MONTH);
				
		return periodo;	
	}
	

	public Depreciacao CalcularDepreciacao(Item i){
		
		Depreciacao depreciacao = new Depreciacao();
		
		//Depreciação Acumulada
		double DA;
		
		//Custo do Bem
		double CB = i.getCustoDoBem();
		
		//Taxa de Depreciação
		double taxa;
		
		//Periodo
		int N = CalcularPeriodo(i);
		
		//Valor Contábil
		double VC;
		
		//Ganho ou Perda
		double GP;
		
		//Valor Residual
		double VR = i.getValorResidual();
		
		//
		double C = CB-VR;
		
		
		//Calculo da Taxa de Depreciacao
		int turno = i.getTurno();
		
		taxa = 100/ i.getVidaUtil() ;
		
		if (turno == 2)
			taxa = taxa * 1.5;
		else if (turno == 3)
			taxa = taxa * 2;
		
		//Calculo da Depreciação Acumulada	
		DA = ((C * taxa)/12) * N ;
		
		
		//Calculo Valor Contabil
		VC = CB - DA;
		
		//Calculo Ganho ou Perda
		GP = i.getValorVenda() - VC;
		
		depreciacao.setDa(DA);
		depreciacao.setGp(GP);
		depreciacao.setVc(VC);
		
		return depreciacao;
	}
}
