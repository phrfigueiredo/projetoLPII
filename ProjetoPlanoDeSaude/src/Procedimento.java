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

public class Procedimento {

    private String nome;
    private ArrayList<Procedimento> itemProcedimentos;
    private ArrayList<PlanoDeSaude> planoDeSaude;

    public Procedimento() {
    }

    
    public Procedimento(String nome) {
        itemProcedimentos = new ArrayList();
        planoDeSaude = new ArrayList();
        this.nome = nome;
    }

    public ArrayList<PlanoDeSaude> getPlanoDeSaude() {
        return planoDeSaude;
    }

    public void addPlanoDeSaude(PlanoDeSaude planoDeSaude) {
        this.planoDeSaude.add(planoDeSaude);
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    
    public String getNome() {
        return nome;
    }


    public ArrayList<Procedimento> getItemProcedimentos() {
        return itemProcedimentos;
    }

    public void addProcedimento(Procedimento procedimento) {
        itemProcedimentos.add(procedimento);
    }
}

