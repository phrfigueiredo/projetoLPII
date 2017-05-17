


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Pedro
 */
import java.util.ArrayList;
public class Estado {
    private ArrayList<Autorizacao> autorizacoes;

    public Estado() {
        autorizacoes = new ArrayList();
    }
    
    public void addAutorizacao(Autorizacao autorizacao){
        autorizacoes.add(autorizacao);
    }
    
    public enum EstadoEnum{
        ESTADO1("PENDENTE"),ESTADO2("AUTORIZADO"),ESTADO3("NEGADO");
        public String estado;
        EstadoEnum(String estado){
            this.estado = estado;
        }
         public String getNome() {
            return estado;
        }

        public void setNome(String estado) {
            this.estado = estado;
        }
}
}

