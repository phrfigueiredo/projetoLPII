
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 31610714
 */

public class ItemDeProcedimento {

    private int quantidade;
    private ArrayList<Autorizacao> autorizacao;

    public ItemDeProcedimento(int quantidade) {
        this.quantidade = quantidade;
        autorizacao = new ArrayList();
    }

    public ArrayList<Autorizacao> getAutorizacao() {
        return autorizacao;
    }

    public void addAutorizacao(Autorizacao autorizacao) {
        this.autorizacao.add(autorizacao);
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

   

}

