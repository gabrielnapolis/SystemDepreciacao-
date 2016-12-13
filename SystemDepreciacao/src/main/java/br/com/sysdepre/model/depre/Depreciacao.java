package br.com.sysdepre.model.depre;

import java.io.Serializable;

public class Depreciacao implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private double da;
	private double vc;
	private	double gp;
	
	public double getDa() {
		return da;
	}
	public void setDa(double da) {
		this.da = da;
	}
	public double getVc() {
		return vc;
	}
	public void setVc(double vc) {
		this.vc = vc;
	}
	public double getGp() {
		return gp;
	}
	public void setGp(double gp) {
		this.gp = gp;
	}
	
	
}
