
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
public class Clinica extends Local{
    private String medicoResponsavel;
    ArrayList<Ambulatorial> ambulatorial;

    public Clinica(String medicoResponsavel,String nome, int cep) {
        super(cep,nome);
        this.medicoResponsavel = medicoResponsavel;
        ambulatorial = new ArrayList();
    }

    public String getMedicoResponsavel() {
        return medicoResponsavel;
    }

    public void setMedicoResponsavel(String medicoResponsavel) {
        this.medicoResponsavel = medicoResponsavel;
    }

    public ArrayList<Ambulatorial> getAmbulatorial() {
        return ambulatorial;
    }

    public void addAmbulatorial(Ambulatorial ambulatorial) {
        this.ambulatorial.add(ambulatorial);
    }
    
}
