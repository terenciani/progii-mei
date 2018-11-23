/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.estacio.mei.dao.implementacao;

import br.estacio.mei.banco.estatico.Conexao;
import br.estacio.mei.dao.ComprasDao;
import br.estacio.mei.model.Compras;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author aluno
 */
public class ComprasDaoJDBC implements ComprasDao {

    @Override
    public ArrayList<Compras> buscarCompras() {
        ArrayList<Compras> listaCompras = new ArrayList<>();
        String SQL = "SELECT * FROM tb_compras";
        try {
            PreparedStatement SQLPreparada = Conexao.retornaConexao().prepareStatement(SQL);                      
            ResultSet resultado = SQLPreparada.executeQuery();
            while(resultado.next()){
                Compras compras = new Compras();

                compras.setDescricao(resultado.getString("descricao"));
                compras.setValor(resultado.getDouble("valor"));
                compras.setQuantidade(resultado.getInt("quantidade"));
                compras.setData(resultado.getDate("data"));
                compras.setTotal(resultado.getDouble("total"));
                
                listaCompras.add(compras);
            }
        } catch(Exception excecao){
            excecao.printStackTrace();
        }
        return listaCompras;
    }

    @Override
    public Compras salvarCompras(Compras compras) {
        String SQL = "INSERT INTO tb_compras (descricao, valor, quantidade, data, total)"
                + "VALUES (?, ?, ?, ?, ?)";;
        try {
            PreparedStatement SQLPreparada = Conexao.retornaConexao().prepareStatement(SQL);                      
            ResultSet resultado = SQLPreparada.executeQuery();
            while(resultado.next()){
                Compras compra = new Compras();
                compra.setData(resultado.getDate("data"));

            }
        } catch(Exception excecao){
            excecao.printStackTrace();
        }
        return null; 
    }

    @Override
    public Compras editarCompras(Compras compras) {
       String sql = "UPDATE tb_compras set descricao = ?, valor = ?, quantidade = ?, data = ?, total = ? where data = ?";
        Compras compra = new Compras();
       
    
        try {
            PreparedStatement preparacaoDaInstrucao1 = Conexao.retornaConexao().prepareStatement(sql);
            preparacaoDaInstrucao1.setString(1, compra.getDescricao());
            preparacaoDaInstrucao1.setDouble(2, compra.getValor());
            preparacaoDaInstrucao1.setInt(3, compra.getQuantidade());
            preparacaoDaInstrucao1.setDate(4, compra.getDate());
            preparacaoDaInstrucao1.setDouble(5, compra.getTotal());
          
  

            preparacaoDaInstrucao1.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
            
        }
       return null;   
    }
    

    @Override
    public boolean excluirCompras(Compras compras) {
    return true;
    }
    
}
