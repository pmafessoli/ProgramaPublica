
package Model;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JOptionPane;


public class TabelaPontuacao {
    public ArrayList<Jogador> jogos;
    private int recordeMaximo;
    private int recordeMinimo;
    private int qtdQuebrouMax;
    private int qtdQuebrouMin;
    private int ultimoID;
    
    public TabelaPontuacao(){
        jogos = new ArrayList<Jogador>();
        recordeMaximo = 0;
        recordeMinimo = Integer.MAX_VALUE;
        qtdQuebrouMax = 0;
        qtdQuebrouMin = 0;
        ultimoID = 0;
    }
    
    public Jogador retornarUltimoJogo(){
        if (!jogos.isEmpty()){
            return jogos.get(jogos.size()-1);
        }
        return null;
    }
    
    public void adicionarJogo(Jogador jogo){
        jogos.add(jogo);
        jogo.setID(++ultimoID);
       
        if (jogo.getPlacar() > recordeMaximo){
            recordeMaximo = jogo.getPlacar();
            qtdQuebrouMax++;
        }
        if (jogo.getPlacar() < recordeMinimo){
            recordeMinimo = jogo.getPlacar();
            qtdQuebrouMin++;
        }
        
        jogo.setRecordeMax(recordeMaximo);
        jogo.setRecordeMin(recordeMinimo);
        jogo.setQtdRecordeQuebradoMax(qtdQuebrouMax);
        jogo.setQtdRecordeQuebradoMin(qtdQuebrouMin);
    }
    
    public String retornarTabela(){
        String retorno = "";
        
        for (Jogador jogo : jogos) {
            retorno = "Placar: "+jogo.getPlacar()+" "+
                      "Recorde max: "+jogo.getRecordeMax()+" "+
                      "Recorde Min: "+jogo.getRecordeMin()+" "+
                      "Qtd quebra max: "+jogo.getQtdRecordeQuebradoMax()+" "+
                      "qtd quebra min: "+jogo.getQtdRecordeQuebradoMin()+"\n";
        }
        return retorno;
    }
    
    public void gravarArquivo(String caminho) throws IOException{
        BufferedWriter salvar = new BufferedWriter(new FileWriter(caminho));
        for (Jogador jogo : jogos) {
            salvar.write(jogo.getID()+";"+jogo.getPlacar()+";"+jogo.getQtdRecordeQuebradoMax()+";"+jogo.getQtdRecordeQuebradoMin()+";"+jogo.getRecordeMax()+";"+jogo.getRecordeMin()+";");
            salvar.newLine();
        }
        salvar.close();
        
    }
    
    public void carregarArquivo(String caminho) throws FileNotFoundException, IOException{
        BufferedReader carregar = new BufferedReader(new FileReader(caminho));
        
        String linha = carregar.readLine();
        
        while (linha instanceof String){
            String [] valores = linha.split(";");
            Jogador jogo = new Jogador("Maria", 0, 0, 0, 0);
            jogo.setPlacar(Integer.parseInt(valores[1]));
            adicionarJogo(jogo);
            linha = carregar.readLine();
        }
        carregar.close();
    }
    
}
