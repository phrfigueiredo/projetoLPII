/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 31610714
 */import java.util.ArrayList;
 
public class PlanoDeSaude {
    private int numDeAutorzacao;
    private String nome;
    private Operadora operadora;
    private ArrayList<Segurado> segurado;
    private ArrayList<Procedimento> procedimento;
    
    public PlanoDeSaude(){
        segurado = new ArrayList();
        procedimento = new ArrayList();
    }
    
    public PlanoDeSaude(int numDeAutorizacao, String nome,Operadora operadora){
        this.numDeAutorzacao = numDeAutorizacao;
        this.nome = nome;
        this.operadora = operadora;
        segurado = new ArrayList();
        procedimento = new ArrayList();
        
    }

    public ArrayList<Procedimento> getProcedimento() {
        return procedimento;
    }

    public void addProcedimento(Procedimento procedimento) {
        this.procedimento.add(procedimento);
    }

    public Operadora getOperadora() {
        return operadora;
    }

    public void setOperadora(Operadora operadora) {
        this.operadora = operadora;
    }


    public void addSegurado(Segurado segurado) {
        this.segurado.add(segurado);
    }
    
   

    public long getNumDeAutorzacao() {
        return numDeAutorzacao;
    }

    public void setNumDeAutorzacao(int nomeDeAutorzacao) {
        this.numDeAutorzacao = nomeDeAutorzacao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    } 

    public ArrayList<Segurado> getSegurado() {
        return segurado;
    }
    
}



