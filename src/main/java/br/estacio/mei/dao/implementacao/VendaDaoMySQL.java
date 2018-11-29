/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.estacio.mei.dao.implementacao;

import br.estacio.mei.banco.estatico.ConexaoMySQL;
import br.estacio.mei.model.Cliente;
import br.estacio.mei.model.Venda;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Familia TOPz
 */
public class VendaDaoMySQL {
       public ArrayList<Venda> buscarVenda() {
        ArrayList<Venda> listaParaRetorno = new ArrayList<>();
        String sql = "SELECT * FROM tb_venda";

        try {
            PreparedStatement preparacaoDaInstrucao = ConexaoMySQL.retornaConexao().prepareStatement(sql);
            ResultSet resultado = preparacaoDaInstrucao.executeQuery();

            while (resultado.next()) {
                Venda venda = transformaResultSetEmObjeto(resultado);
                listaParaRetorno.add(venda);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            return null;
        }

        return listaParaRetorno;
    }

    private Venda transformaResultSetEmObjeto(ResultSet resultado) throws SQLException {
        Venda venda = new Venda();
        try {
            venda.setCodigo(resultado.getInt("codigo"));
            venda.setCliente((Cliente) resultado.getObject("cliente"));
            venda.setStatus(resultado.getInt("status"));
            venda.setValor(resultado.getDouble("valor"));
            venda.setData((Date) resultado.getObject("data"));
            venda.setObservacao( resultado.getString("observacao"));
            venda.setFormaPagamento(resultado.getString("formaPagamento"));
            return venda;
        } catch (SQLException ex) {
            throw new SQLException("Erro na Transformação");
        }
    }
}
