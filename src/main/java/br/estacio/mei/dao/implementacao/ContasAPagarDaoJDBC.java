/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.estacio.mei.dao.implementacao;

import br.estacio.mei.banco.estatico.Conexao;
import br.estacio.mei.dao.ContasAPagarDao;
import br.estacio.mei.model.ContasAPagar;
import br.estacio.mei.model.Usuario;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author joaos
 */
public class ContasAPagarDaoJDBC implements ContasAPagarDao {

    private Object ListaContasApagar;

    @Override
    public ArrayList<ContasAPagar> buscarContasApagar() {
    ArrayList<ContasAPagar> buscarContasApagar = new ArrayList<>();
        String SQL = "SELECT * FROM tb_contas_a_pagar";
        try {
            PreparedStatement SQLPreparada = Conexao.retornaConexao().prepareStatement(SQL);                      
            ResultSet resultado = SQLPreparada.executeQuery();
            while(resultado.next()){
                ContasAPagar conta = new ContasAPagar();
                conta.setCodigo(resultado.getInt("codigo"));

            }
        } catch(Exception excecao){
            excecao.printStackTrace();
        }
        return (ArrayList<ContasAPagar>) ListaContasApagar; 
    }

    @Override
    public ArrayList<ContasAPagar> buscarContaPorCodigo(int codigo) {
    String SQL = "SELECT * FROM tb_contas_a_pagar where codigo = ?";
        try {
            PreparedStatement SQLPreparada = Conexao.retornaConexao().prepareStatement(SQL);                      
            ResultSet resultado = SQLPreparada.executeQuery();
            while(resultado.next()){
                ContasAPagar conta = new ContasAPagar();
                conta.setCodigo(resultado.getInt("codigo"));

            }
        } catch(Exception excecao){
            excecao.printStackTrace();
        }
        return (ArrayList<ContasAPagar>) ListaContasApagar; 
    }

    @Override
    public ContasAPagar salvarContasApagar(ContasAPagar contasApagar) {
       String SQL = "INSERT INTO tb_contas_a_pagar (codigo, dataVencimento, descricao, valor, dataPagamento, status)"
                + "VALUES (?, ?, ?, ?, ?, ?)";;
        try {
            PreparedStatement SQLPreparada = Conexao.retornaConexao().prepareStatement(SQL);                      
            ResultSet resultado = SQLPreparada.executeQuery();
            while(resultado.next()){
                ContasAPagar conta = new ContasAPagar();
                conta.setCodigo(resultado.getInt("codigo"));

            }
        } catch(Exception excecao){
            excecao.printStackTrace();
        }
        return null; 
    }

    @Override
    public ContasAPagar atualizarContasApagar(ContasAPagar contasApagar) {
    String sql = "UPDATE tb_cliente set codigo = ?, dataVencimento = ?, descricao = ?, valor = ?, dataPagamento = ?, status = ? where codigo = ?";
        ContasAPagar conta = new ContasAPagar();
       
    
        try {
            PreparedStatement preparacaoDaInstrucao1 = Conexao.retornaConexao().prepareStatement(sql);
            preparacaoDaInstrucao1.setInt(1, conta.getCodigo());
            preparacaoDaInstrucao1.setString(2, conta.getDataVencimento());
            preparacaoDaInstrucao1.setString(3, conta.getDescricao());
            preparacaoDaInstrucao1.setDouble(4, conta.getValor());
            preparacaoDaInstrucao1.setString(5, conta.getDataPagamento());
            preparacaoDaInstrucao1.setString(6, conta.getStatus());
  

            preparacaoDaInstrucao1.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
            
        }
        return null;    
    }

    @Override
    public boolean excluirContasApagar(ContasAPagar contasApagar) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    
    }
    
}
