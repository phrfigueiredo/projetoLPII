
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Pedro
 */
public class Ambulatorial extends Procedimento {
    private int qtdTecnicos;
    ArrayList<Clinica> clinica;
    

    public Ambulatorial(int qtdTecnicos, String nome) {
        super(nome);
        this.qtdTecnicos = qtdTecnicos;
        clinica = new ArrayList();
    }

    public int getQtdTecnicos() {
        return qtdTecnicos;
    }

    public void setQtdTecnicos(int qtdTecnicos) {
        this.qtdTecnicos = qtdTecnicos;
    }

    public ArrayList<Clinica> getClinica() {
        return clinica;
    }

    public void addClinica(Clinica clinica) {
        this.clinica.add(clinica);
    }
    
    
}
