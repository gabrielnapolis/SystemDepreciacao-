package br.com.sysdepre.web;

import java.io.Serializable;
import java.util.List;
import javax.faces.bean.ManagedBean;

import br.com.sysdepre.model.depre.Depreciacao;
import br.com.sysdepre.model.item.Item;
import br.com.sysdepre.model.item.ItemRN;

@ManagedBean(name = "itemView")
public class ItemBean implements Serializable {

	private static final long serialVersionUID = 1L;

	private Item item = new Item();
	private Depreciacao depreciacao = new Depreciacao();
	
	public Item getItem() {
		return item;
	}

	public void setItem(Item item) {
		this.item = item;
	}
	
	public Depreciacao getDepreciacao() {
		return depreciacao;
	}

	public void setDepreciacao(Depreciacao depreciacao) {
		this.depreciacao = depreciacao;
	}

	public String Cadastar() {
		new ItemRN().inserir(getItem());
		return "item_listagem";
	}

	public List<Item> getListar() {
		return new ItemRN().listar();
	}

	public String actionCalcular() {
		depreciacao = new DepreciacaoBean().CalcularDepreciacao(item);
		return "tela_depre";
	}

	public String IrParaLista() {
		return "item_listagem";
	}

}
