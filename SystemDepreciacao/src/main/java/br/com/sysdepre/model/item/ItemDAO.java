package br.com.sysdepre.model.item;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import br.com.sysdepre.util.ConnectFactory;

public class ItemDAO extends ConnectFactory {

	Connection con;
	PreparedStatement ps;
	ResultSet rs;

	public void insert(Item i) {
		String sql = "INSERT INTO item (descricao, custoDoBem, valorResidual,"
				+ " dataAquisicao, valorVenda) VALUES (?,?,?,?,?)";

		try {
			con = openConnection();
			ps = con.prepareStatement(sql);
			ps.setString(1, i.getDescricao());
			ps.setDouble(2, i.getCustoDoBem());
			ps.setDouble(3, i.getValorResidual());
			ps.setString(4, i.getDataAquisicao());
			ps.setDouble(5, i.getValorVenda());
			ps.executeUpdate();
		}
		catch (Exception e) {
			System.err.println("----------------------------");
			System.err.println("Erro" + e.getMessage());
			e.printStackTrace();
			System.err.println("----------------------------");
		} finally {
			closeConnection(con, ps);
		}
	}

	public List<Item> listar() {
		List<Item> lista = null;
		String sql = "Select descricao, custoDoBem, valorResidual, dataAquisicao, "
				+ "valorVenda FROM item ORDER BY descricao";

		try {
			con = openConnection();
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();

			lista = new ArrayList<Item>();

			while (rs.next()) {
				Item i = new Item();
				i.setDescricao(rs.getString("descricao"));
				i.setCustoDoBem(rs.getDouble("custoDoBem"));
				i.setValorResidual(rs.getDouble("dataAquisicao"));
				i.setValorVenda(rs.getDouble("valorVenda"));
				lista.add(i);
			}

		} catch (Exception e) {
			System.err.println("Erro: " + e.getMessage());
			e.printStackTrace();
		} finally {
			closeConnection(con, ps);
		}
		return lista;
	}
}