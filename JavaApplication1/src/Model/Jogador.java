package Model;

import View.NovoJogo;
import javax.swing.JTextArea;

 
public class Jogador {
    
    private int id;
    private String nome; 
    private int recordeMax;
    private int recordeMin;
    private int qtdRecordeQuebradoMax;
    private int qtdRecordeQuebradoMin;
    private int placar;

    public Jogador(String nome, int recordeMax, int recordeMin, int qtdRecordeQuebradoMax, int qtdRecordeQuebradoMin) {
        this.setNome(nome);
        this.setRecordeMax(0);
        this.setRecordeMin(0);
        this.setQtdRecordeQuebradoMax(0);
        this.setQtdRecordeQuebradoMin(0);
        this.setPlacar(placar);
    }

    public int getPlacar() {
        return placar;
    }

    public void setPlacar(int placar) {
        this.placar = placar;
    }
    
    public String getNome() {
        return nome;
    }
    
    public int getID(){
        return id;
    }
    
    public void setID(int id){
        this.id = id;
    }

    public void setNome(String nome) {
        
        this.nome = nome;
    }

    public int getRecordeMax() {
        return recordeMax;
    }

    public void setRecordeMax(int recordeMax) {
        this.recordeMax = recordeMax;
        
    }

    public int getRecordeMin() {
        return recordeMin;
    }

    public void setRecordeMin(int recordeMin) {
        this.recordeMin = recordeMin;
    }

    public int getQtdRecordeQuebradoMax() {
        return qtdRecordeQuebradoMax;
    }

    public void setQtdRecordeQuebradoMax(int qtdRecordeQuebradoMax) {
        this.qtdRecordeQuebradoMax = qtdRecordeQuebradoMax;
    }

    public int getQtdRecordeQuebradoMin() {
        return qtdRecordeQuebradoMin;
    }

    public void setQtdRecordeQuebradoMin(int qtdRecordeQuebradoMin) {
        this.qtdRecordeQuebradoMin = qtdRecordeQuebradoMin;
    }
    
    public void comparaResultados(){
       
    }
        
    
    
}
