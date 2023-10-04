package com.kaique.iphone;

import com.kaique.interfaces.AparelhoTelefonico;
import com.kaique.interfaces.NavegadorInternet;
import com.kaique.interfaces.ReprodutorMusical;

public class Iphone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical {
	
    public void ligar(String numeroCelular) {
        System.out.println("Ligando para o número: "+ numeroCelular);
    }

    public void atender() {
        System.out.println("Ligação atendida");
    }

    public void iniciarCorreioVoz() {
        System.out.println("Reproduzindo correio de voz");
    }

    public void exibirPagina() {
        System.out.println("Mostrando página");
    }

    public void adicionarNovaAba() {
        System.out.println("Criado nova aba");
    }

    public void atualizarPagina() {
        System.out.println("Página atualizada");
    }

    public void tocar(String musica) {
        System.out.println("Tocando nesse momento: " + musica);
    }

    public void pausar() {
        System.out.println("Musica pausada");
    }

    public void selecionarMusica(String musicaEscolhida) {
        System.out.println("Musica selecionada: "+ musicaEscolhida);
    }
}
