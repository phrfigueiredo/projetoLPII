
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
public class Local {
    private int cep;
    private String nome;
    private ArrayList<Autorizacao> autorizacao;

    public Local(int cep, String nome) {
        this.cep = cep;
        this.nome = nome;
        autorizacao = new ArrayList();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCep() {
        return cep;
    }

    public void setCep(int cep) {
        this.cep = cep;
    }

    public ArrayList<Autorizacao> getAutorizacao() {
        return autorizacao;
    }

    public void addAutorizacao(Autorizacao autorizacao) {
        this.autorizacao.add(autorizacao);
    }

    
    
}
