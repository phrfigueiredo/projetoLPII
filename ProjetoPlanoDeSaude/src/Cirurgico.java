
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
public class Cirurgico extends Procedimento{
    private int qtdMedicos;
    ArrayList<Hospital> hospital;


    public Cirurgico(int qtdMedicos, String nome) {
        super(nome);
        this.qtdMedicos = qtdMedicos;
        hospital = new ArrayList();
    }

    public int getQtdMedicos() {
        return qtdMedicos;
    }

    public void setQtdMedicos(int qtdMedicos) {
        this.qtdMedicos = qtdMedicos;
    }
    
    public ArrayList<Hospital> getHospital() {
        return hospital;
    }

    public void addHospital(Hospital hospital) {
        this.hospital.add(hospital);
    }
}
