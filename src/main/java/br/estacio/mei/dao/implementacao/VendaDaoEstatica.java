/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.estacio.mei.dao.implementacao;

import br.estacio.mei.banco.estatico.BancoSingleton;
import java.util.ArrayList;
import br.estacio.mei.dao.VendaDao;
import br.estacio.mei.model.ItemVenda;
import br.estacio.mei.model.Venda;
import java.util.Date;

/**
 *
 * @author venda
 */
public class VendaDaoEstatica implements VendaDao {

    @Override
    public ArrayList<Venda> buscarVendas() {
        for (Venda venda : BancoSingleton.getInstance().tabelaVenda) {
            System.out.println(venda.toString());
        }
        return BancoSingleton.getInstance().tabelaVenda;
    }

    @Override
    public Venda salvarVenda(Venda venda) {
        venda.setData(new Date());
        venda.setStatus(0);
        venda.setCodigo(BancoSingleton.getInstance().tabelaVenda.size() + 1);
        BancoSingleton.getInstance().tabelaVenda.add(venda);
        return venda;
    }

    @Override
    public Venda atualizarVenda(Venda venda) {
        BancoSingleton.getInstance().tabelaVenda.add(venda);
        return venda;
    }

    @Override
    public boolean excluirVenda(Venda venda) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ItemVenda salvarItemVenda(ItemVenda itemVenda) {
        itemVenda.setCodigo(BancoSingleton.getInstance().tabelaItemVenda.size() + 1);
        BancoSingleton.getInstance().tabelaItemVenda.add(itemVenda);
        return itemVenda;
    }

    @Override
    public double valorTotal(Venda venda) {
        ArrayList<ItemVenda> tabela = BancoSingleton.getInstance().tabelaItemVenda;

        double soma = 0;
        for (int i = 0; i < tabela.size(); i++) {
            if (venda.getCodigo() == tabela.get(i).getCodigo()) {
                soma += (tabela.get(i).getValor() * tabela.get(i).getQuantidade());
            }
        }
        return soma;
    }

    @Override
    public void finalizarVendaAPrazo(Venda venda) {
        ArrayList<Venda> tabela = BancoSingleton.getInstance().tabelaVenda;

        double soma = 0;
        for (int i = 0; i < tabela.size(); i++) {
            if (venda.getCodigo() == tabela.get(i).getCodigo()) {
                tabela.get(i).setStatus(2);
            }
        }
    }

    @Override
    public ArrayList<Venda> listarVendasAPrazo() {
        ArrayList<Venda> tabela = BancoSingleton.getInstance().tabelaVenda;
        ArrayList<Venda> tabelaFiltrada = new ArrayList<>();
        double soma = 0;
        for (int i = 0; i < tabela.size(); i++) {
            if (tabela.get(i).getStatus() == 2) {
                tabelaFiltrada.add(tabela.get(i));
            }
        }
        return tabelaFiltrada;
    }

}
