package br.ufpb.dcx.ayla.agenda;

import java.util.HashMap;
import java.util.Map;

public class AgendaAyla implements Agenda{
    private Map<String,Contato> contatos;
    private GravadorDeDados gravador;

    public AgendaAyla(){
        this.contatos = new HashMap<>();
        this.gravador = new GravadorDeDados();
    }

    public boolean cadastraContato(String nome, int )
}
