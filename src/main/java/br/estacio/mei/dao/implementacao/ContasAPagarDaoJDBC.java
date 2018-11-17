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
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ContasAPagar salvarContasApagar(ContasAPagar contasApagar) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ContasAPagar atualizarContasApagar(ContasAPagar contasApagar) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean excluirContasApagar(ContasAPagar contasApagar) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
