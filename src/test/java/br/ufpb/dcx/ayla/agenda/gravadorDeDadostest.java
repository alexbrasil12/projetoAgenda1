package br.ufpb.dcx.ayla.agenda;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.*;

public class gravadorDeDadostest {
    @Test
    public void testerecuperaçao() throws IOException {
        File arquivoContatos = new File(GravadorDeDados.ARQUIVO_CONTATOS);
        if (arquivoContatos.exists()){
            arquivoContatos.delete();
        }
        GravadorDeDados gravadorDeDados = new GravadorDeDados();
        File arquivo = new File(GravadorDeDados.ARQUIVO_CONTATOS);
        assertFalse(arquivo.exists());
        HashMap <String, Contato> contatomap = new HashMap<>();
        contatomap.put("Ayla", new Contato("Ayla", 5, 10));
        gravadorDeDados.salvarContatos(contatomap);
        assertTrue(arquivo.exists());
        HashMap<String, Contato> contatosRecuperados  = gravadorDeDados.recuperaContatos();
        Contato c1 = contatosRecuperados.get("Ayla");
        assertEquals(5,c1.getDiaAniversario());
        assertEquals(10,c1.getMesAniversario());
        assertEquals("Ayla",c1.getNome());

        arquivo.delete();
    }
}
