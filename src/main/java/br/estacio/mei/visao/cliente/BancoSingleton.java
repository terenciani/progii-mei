/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.estacio.mei.visao.cliente;

import br.estacio.mei.model.Categoria;
import br.estacio.mei.model.Cliente;
import br.estacio.mei.model.Endereco;
import java.util.ArrayList;

/**
 *
 * @author aluno
 */
public class BancoSingleton {
    private static BancoSingleton bancoSingleton;
    public ArrayList<Cliente> tabelaClientes = new ArrayList(); 
    
    public ArrayList<Endereco> tabelaEndereco = new ArrayList(); 
    
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
