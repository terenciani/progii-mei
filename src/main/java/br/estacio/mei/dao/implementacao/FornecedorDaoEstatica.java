/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.estacio.mei.dao.implementacao;

import br.estacio.mei.banco.estatico.BancoSingleton;
import br.estacio.mei.dao.FornecedorDao;
import br.estacio.mei.model.Fornecedor;
import java.util.ArrayList;

/**
 *
 * @author Marcelo
 */
public class FornecedorDaoEstatica implements FornecedorDao {

    @Override
    public Fornecedor salvarFornecedor(Fornecedor fornecedor) {
        BancoSingleton.getInstance().tabelaFornecedor.add(fornecedor);
        return fornecedor;
    }

    @Override
    public Fornecedor alterarFornecedor(Fornecedor fornecedor) {
        for (int i = 0; i < BancoSingleton.getInstance().tabelaFornecedor.size(); i++) {
            if (BancoSingleton.getInstance().tabelaFornecedor.get(i).getCodigo() == fornecedor.getCodigo()) {
                BancoSingleton.getInstance().tabelaFornecedor.set(i, fornecedor);
            }
        }

        return fornecedor;
    }

    @Override
    public boolean excluirFornecedor(Fornecedor fornecedor) {
        if (BancoSingleton.getInstance().tabelaFornecedor.remove(fornecedor)) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public ArrayList<br.estacio.mei.model.Fornecedor> listarFornecedores() {
        return BancoSingleton.getInstance().tabelaFornecedor;
    }

}
