
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
public class Hospital extends Local{
    private int qtdMedicos;
    ArrayList<Cirurgico> cirurgico;

    

    public Hospital(int qtdMedicos, String nome, int cep) {
        super(cep,nome);
        this.qtdMedicos = qtdMedicos;
        cirurgico = new ArrayList();
    }

    public int getQtdMedicos() {
        return qtdMedicos;
    }

    public void setQtdMedicos(int qtdMedicos) {
        this.qtdMedicos = qtdMedicos;
    }
    
    public ArrayList<Cirurgico> getCirurgico() {
        return cirurgico;
    }

    public void addCirurgico(Cirurgico cirurgico) {
        this.cirurgico.add(cirurgico);
    }
    
}
