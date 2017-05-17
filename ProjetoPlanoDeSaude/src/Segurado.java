/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 31610714
 */
import java.util.ArrayList;
public class Segurado {
    private String nome;
    private int cpf;
    private ArrayList<PlanoDeSaude> planoDeSaude;
    private ArrayList<Autorizacao> autorizacao;
    
    public Segurado(){
        planoDeSaude = new ArrayList();
        autorizacao = new ArrayList();
    }
    
    public Segurado(String nome, int cpf) {
        this.nome = nome;
        this.cpf = cpf;
        planoDeSaude = new ArrayList();
        autorizacao = new ArrayList();
    }

    public ArrayList<Autorizacao> getAutorizacao() {
        return autorizacao;
    }

    public void addAutorizacao(Autorizacao autorizacao) {
        this.autorizacao.add(autorizacao);
    }


    public void addPlanoDeSaude(PlanoDeSaude planoDeSaude) {
        this.planoDeSaude.add(planoDeSaude);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public long getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public ArrayList<PlanoDeSaude> getPlanoDeSaude() {
        return planoDeSaude;
    }
  
}

