package br.com.sysdepre.model.item;

import java.io.Serializable;
import java.util.Date;


public class Item implements Serializable{

	private static final long serialVersionUID = 1L;

	private String descricao;
	private int vidaUtil;
	private double custoDoBem;
	private double valorResidual;
	private Date dataAquisicao;
	private Date dataVenda;
	private double valorVenda;
	private int taxaDepre;
	private int turno;
	
	
	public int getTurno() {
		return turno;
	}
	public void setTurno(int turno) {
		this.turno = turno;
	}
	public int getVidaUtil() {
		return vidaUtil;
	}
	public void setVidaUtil(int vidaUtil) {
		this.vidaUtil = vidaUtil;
	}
	public Date getDataVenda() {
		return dataVenda;
	}
	public void setDataVenda(Date dataVenda) {
		this.dataVenda = dataVenda;
	}
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
	public Date getDataAquisicao() {
		return dataAquisicao;
	}
	public void setDataAquisicao(Date dataAquisicao) {
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
