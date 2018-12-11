/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.estacio.mei.dao.implementacao;

import br.estacio.mei.banco.estatico.Conexao;
import br.estacio.mei.dao.VendaDao;
import br.estacio.mei.model.Cliente;
import br.estacio.mei.model.ItemVenda;
import br.estacio.mei.model.Venda;
import br.estacio.mei.visao.relatorio.vendas.RelatorioVendasPrincipal;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Familia TOPz
 */
public class VendaDaoJDBC implements VendaDao{

    @Override
    public ArrayList<Venda> buscarVendas() {
        ArrayList<Venda> listaParaRetorno = new ArrayList<>();
        String sql = "SELECT * FROM tb_venda";

        try {
            PreparedStatement preparacaoDaInstrucao = Conexao.retornaConexao().prepareStatement(sql);
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

    @Override
    public Venda salvarVenda(Venda venda) {
         String sql = "INSERT "
                + "INTO "
                + "tb_venda (codigo, cliente, data, observacao, formapagamento, valor, status)"
                + "VALUES (?, ?, ?, ?, ?, ?, ?)";
        try {
            // Objeto PreparedStatement é um objeto que prepara a instrução de sql
            // ou seja, preenche os valores
            PreparedStatement preparacaoDaInstrucao = Conexao.retornaConexao().prepareStatement(sql);
            //De acordo com a posicao do ponto de interrogacao na SQL e o tipo do dado
            
            preparacaoDaInstrucao.setInt(1, venda.getCodigo());
            preparacaoDaInstrucao.setObject(2, venda.getCliente());
            preparacaoDaInstrucao.setString(3, venda.getData());
            preparacaoDaInstrucao.setString(4, venda.getObservacao());
            preparacaoDaInstrucao.setObject(5, venda.getFormaPagamento());
            preparacaoDaInstrucao.setDouble(6, venda.getValor());
            preparacaoDaInstrucao.setInt(7, venda.getStatus());
            return venda;

        } catch (SQLException ex) {
            ex.printStackTrace();
            return null;
        }
    }

    @Override
    public ItemVenda salvarItemVenda(ItemVenda itemVenda) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double valorTotal(Venda venda) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Venda atualizarVenda(Venda venda) {
        // Instrução SQL que será executada no banco
        String sql = "UPDATE tb_venda "
                + "SET codigo=? , cliente=?, data=?, observacao=?, formapagamento=?, valor=?, status=?"
                + "WHERE codigo=?";
        try {
            // Objeto PreparedStatement é um objeto que prepara a instrução de sql
            // ou seja, preenche os valores
            PreparedStatement preparacaoDaInstrucao = Conexao.retornaConexao().prepareStatement(sql);
            //De acordo com a posicao do ponto de interrogacao na SQL e o tipo do dado
            preparacaoDaInstrucao.setInt(1, venda.getCodigo());
            preparacaoDaInstrucao.setObject(2, venda.getCliente());
            preparacaoDaInstrucao.setString(3, venda.getData());
            preparacaoDaInstrucao.setString(4, venda.getObservacao());
            preparacaoDaInstrucao.setObject(5, venda.getFormaPagamento());
            preparacaoDaInstrucao.setDouble(6, venda.getValor());
            preparacaoDaInstrucao.setInt(7, venda.getStatus());

            preparacaoDaInstrucao.executeUpdate();

            
            return venda;

        } catch (SQLException ex) {
            ex.printStackTrace();
            return null;
        }
    }

    @Override
    public boolean excluirVenda(Venda venda) {
        String sql = "DELETE FROM tb_venda "
                + "WHERE codigo=?";
        try {
            // Objeto PreparedStatement é um objeto que prepara a instrução de sql
            // ou seja, preenche os valores
            PreparedStatement preparacaoDaInstrucao = Conexao.retornaConexao().prepareStatement(sql);
            //De acordo com a posicao do ponto de interrogacao na SQL e o tipo do dado
           preparacaoDaInstrucao.setInt(1, venda.getCodigo());

            preparacaoDaInstrucao.executeUpdate();

            return true;

        } catch (SQLException ex) {
            ex.printStackTrace();
            return false;
        }
    }

    @Override
    public void finalizarVendaAPrazo(Venda venda) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Venda> listarVendasAPrazo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private Venda transformaResultSetEmObjeto(ResultSet resultado) throws SQLException {
        Venda venda = new Venda();
        try {
            venda.setCodigo(resultado.getInt("codigo"));
            Cliente cliente = new Cliente();
            cliente.setNome((String) resultado.getObject("cliente"));
            venda.setCliente(cliente);
            venda.setStatus(resultado.getInt("status"));
            venda.setValor(resultado.getDouble("valor"));
            venda.setData((String) resultado.getObject("data"));
            venda.setObservacao( resultado.getString("observacao"));
            venda.setFormaPagamento(resultado.getString("formaPagamento"));
            return venda;
        } catch (SQLException ex) {
            throw new SQLException("Erro na Transformação"+ ex);
        }
    }

   
    @Override
    public ArrayList<Venda> buscarVendaData(Venda dataI, Venda dataF, Venda formaPag) {
        
        ArrayList<Venda> listaParaRetorno = new ArrayList<>();
        try {
            
            String sql = "SELECT * FROM tb_venda WHERE (data,'%d/%m/%Y') BETWEEN (?,'%d/%m/%Y') AND (?,'%d/%m/%Y') AND (formapagamento = ?) ORDER BY data";
            PreparedStatement preparacaoDaInstrucao = Conexao.retornaConexao().prepareStatement(sql);
            
            preparacaoDaInstrucao.setString(1,dataI.getData());
            preparacaoDaInstrucao.setString(2,dataF.getData());
            preparacaoDaInstrucao.setObject(3,formaPag.getFormaPagamento());  
             
            ResultSet resultado = preparacaoDaInstrucao.executeQuery();
      
            while (resultado.next()) {
                Venda venda = transformaResultSetEmObjeto(resultado);
                listaParaRetorno.add(venda);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return listaParaRetorno;
       } 

    @Override
    public ArrayList<Venda> buscarVendaData2(Venda dataI, Venda dataF) {
            ArrayList<Venda> listaParaRetorno = new ArrayList<>();
        try {
            
            String sql = "SELECT * FROM tb_venda WHERE (data,'%d/%m/%Y') BETWEEN (?,'%d/%m/%Y') AND (?,'%d/%m/%Y') ORDER BY data";
            PreparedStatement preparacaoDaInstrucao = Conexao.retornaConexao().prepareStatement(sql);
            
            preparacaoDaInstrucao.setString(1,dataI.getData());
            preparacaoDaInstrucao.setString(2,dataF.getData());
             
            ResultSet resultado = preparacaoDaInstrucao.executeQuery();
      
            while (resultado.next()) {
                Venda venda = transformaResultSetEmObjeto(resultado);
                listaParaRetorno.add(venda);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return listaParaRetorno;
        
         }
    }
    
