
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


public class Autorizacao {
    private String dataDaAvaliação;
    private Estado.EstadoEnum estado;
    private Local local;
    private ArrayList<ItemDeProcedimento> itemDeProcedimento;
    private ArrayList<Segurado> segurado;
    

    
    
    
    public Autorizacao(String dataDaAvaliação){
        this.dataDaAvaliação = dataDaAvaliação;
        estado = estado.ESTADO1;
        this.local = local;
        itemDeProcedimento = new ArrayList();
        segurado = new ArrayList();
    }

    public ArrayList<ItemDeProcedimento> getItemDeProcedimento() {
        return itemDeProcedimento;
    }

    public void addItemDeProcedimento(ItemDeProcedimento itemDeProcedimento) {
        this.itemDeProcedimento.add(itemDeProcedimento);
    }

    public ArrayList<Segurado> getSegurado() {
        return segurado;
    }

    public void addSegurado(Segurado segurado) {
        this.segurado.add(segurado);
    }

    public String getDataDaAvaliação() {
        return dataDaAvaliação;
    }

    public void setDataDaAvaliação(String dataDaAvaliação) {
        this.dataDaAvaliação = dataDaAvaliação;
    }

    public void autorizar(){
        this.estado = estado.ESTADO2;
    }
    
    public void negar(){
        this.estado = estado.ESTADO3;
    }

    public String getEstado() {
        return estado.getNome();
    }
    public Local getLocal() {
        return local;
    }

    public void setLocal(Local local) {
        this.local = local;
    }
}
