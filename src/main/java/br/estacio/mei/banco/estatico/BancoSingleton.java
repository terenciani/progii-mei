/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.estacio.mei.banco.estatico;

import br.estacio.mei.model.Aluno;
import br.estacio.mei.model.Categoria;
import br.estacio.mei.model.Cliente;
import br.estacio.mei.model.Compras;
import br.estacio.mei.model.ContasAPagar;
import br.estacio.mei.model.Endereco;
import br.estacio.mei.model.Fornecedor;
import br.estacio.mei.model.Produto;
import br.estacio.mei.model.Usuario;
import br.estacio.mei.model.Venda;
import java.util.ArrayList;

/**
 *
 * @author aluno
 */
public class BancoSingleton {
    private static BancoSingleton bancoSingleton;
    public ArrayList<Cliente> tabelaCliente = new ArrayList(); 
    public ArrayList<Categoria> tabelaCategoria = new ArrayList();
    public ArrayList<Endereco> tabelaEndereco = new ArrayList();
    public ArrayList<Aluno> tabelaAluno = new ArrayList();
    public ArrayList<Compras> tabelaCompra = new ArrayList();
    public ArrayList<ContasAPagar> tabelaContaAPagar = new ArrayList();
    //public ArrayList<ContasAReceber> tabelaContaAReceber = new ArrayList();
    public ArrayList<Fornecedor> tabelaFornecedor = new ArrayList();
    public ArrayList<Produto> tabelaProduto = new ArrayList();
    public ArrayList<Usuario> tabelaUsuario = new ArrayList();
    public ArrayList<Venda> tabelaVenda = new ArrayList();
    //public ArrayList<Sac> tabelaSac = new ArrayList();
    
    private BancoSingleton(){
    }
    
    public static BancoSingleton getInstance(){
        if(bancoSingleton == null){
            bancoSingleton = new BancoSingleton();
            return bancoSingleton;
        }else{
            return bancoSingleton;
        }
    }
}
