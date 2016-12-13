package br.com.sysdepre.web;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;

import br.com.sysdepre.model.depre.Depreciacao;
import br.com.sysdepre.model.depre.DepreciacaoRN;
import br.com.sysdepre.model.item.Item;

@ManagedBean (name="DepreView")
public class DepreciacaoBean implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private Depreciacao depreciacao = new Depreciacao();

	public Depreciacao getDepreciacao() {
		return depreciacao;
	}

	public void setDepreciacao(Depreciacao depreciacao) {
		this.depreciacao = depreciacao;
	}

	
	public Depreciacao CalcularDepreciacao(Item i){
		depreciacao = new Depreciacao();
		depreciacao = new DepreciacaoRN().CalcularDepreciacao(i);		

		return depreciacao;
		}
	
	
}
