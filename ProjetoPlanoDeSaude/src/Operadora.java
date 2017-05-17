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

public class Operadora {

    private String nome;
    private ArrayList<PlanoDeSaude> planos;

    public Operadora(String nome) {
        planos = new ArrayList();
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public ArrayList<PlanoDeSaude> getPlanos() {
        return planos;
    }

    public void addPlanos(PlanoDeSaude plano) {
        this.planos.add(plano);
    }
}

