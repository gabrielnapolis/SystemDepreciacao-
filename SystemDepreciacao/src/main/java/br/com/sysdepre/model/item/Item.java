package br.com.sysdepre.model.item;

import java.io.Serializable;


public class Item implements Serializable{

	private static final long serialVersionUID = 1L;

	private String descricao;
	private double custoDoBem;
	private double valorResidual;
	private String dataAquisicao;
	private double valorVenda;
	private int taxaDepre;
	
	
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public double getCustoDoBem() {
		return custoDoBem;
	}
	public void setCustoDoBem(double custoDoBem) {
		this.custoDoBem = custoDoBem;
	}
	public double getValorResidual() {
		return valorResidual;
	}
	public void setValorResidual(double valorResidual) {
		this.valorResidual = valorResidual;
	}
	public String getDataAquisicao() {
		return dataAquisicao;
	}
	public void setDataAquisicao(String dataAquisicao) {
		this.dataAquisicao = dataAquisicao;
	}
	public double getValorVenda() {
		return valorVenda;
	}
	public void setValorVenda(double valorVenda) {
		this.valorVenda = valorVenda;
	}
	public int getTaxaDepre() {
		return taxaDepre;
	}
	public void setTaxaDepre(int taxaDepre) {
		this.taxaDepre = taxaDepre;
	}
	

	
}
