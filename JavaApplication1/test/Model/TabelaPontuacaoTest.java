/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Pablo
 */
public class TabelaPontuacaoTest {

    /**
     * Test of retornarUltimoJogo method, of class TabelaPontuacao.
     */
    @Test
    public void testRetornarUltimoJogo() {
        System.out.println("retornarUltimoJogo");
        TabelaPontuacao instance = new TabelaPontuacao();
        Jogador expResult = new Jogador("Maria", 1, 33, 0, 0);
        instance.adicionarJogo(expResult);
        Jogador result = instance.retornarUltimoJogo();
        assertEquals(expResult, result);
    }

    @Test
    public void testAdicionarJogo() {
        System.out.println("adicionarJogo");
        Jogador jogo = new Jogador("Maria", 1, 33, 0, 0);
        TabelaPontuacao instance = new TabelaPontuacao();
        instance.adicionarJogo(jogo);
    }

    /**
     * Test of retornarTabela method, of class TabelaPontuacao.
     */
    @Test
    public void testRetornarTabela() {
        System.out.println("retornarTabela");
        TabelaPontuacao instance = new TabelaPontuacao();
        String expResult = "";
        String result = instance.retornarTabela();
        assertEquals(expResult, result);
    }

}
