/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.util.Date;

/**
 *
 * @author RAZIEL
 */

//quais jogos participou, pontos que ele fez, faltas cometidas e sofridas, punições que recebeu (cartões, expulsões, etc);
public class Jogador {
    
    Time time;
    String nomeJogador;
    String apelido;
    String posicao;
    Partida partidas;
    int qtdGolsCarreira;
    int qtdGolsPartida;
    int qtdGolsCampeonato;
    int qtdCartAmarelo;
    int qtdCartVermelho;    
    int idade;
    

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }
 
   
    
    public String getNomeJogador() {
        return nomeJogador;
    }

    public void setNomeJogador(String nomeJogador) {
        this.nomeJogador = nomeJogador;
    }

    public String getApelido() {
        return apelido;
    }

    public void setApelido(String apelido) {
        this.apelido = apelido;
    }

    public String getPosicao() {
        return posicao;
    }

    public void setPosicao(String posicao) {
        this.posicao = posicao;
    }

    public Partida getPartidas() {
        return partidas;
    }

    public void setPartidas(Partida partidas) {
        this.partidas = partidas;
    }

    public int getQtdGolsCarreira() {
        return qtdGolsCarreira;
    }

    public void setQtdGolsCarreira(int qtdGolsCarreira) {
        this.qtdGolsCarreira = qtdGolsCarreira;
    }

    public int getQtdGolsPartida() {
        return qtdGolsPartida;
    }

    public void setQtdGolsPartida(int qtdGolsPartida) {
        this.qtdGolsPartida = qtdGolsPartida;
    }

    public int getQtdGolsCampeonato() {
        return qtdGolsCampeonato;
    }

    public void setQtdGolsCampeonato(int qtdGolsCampeonato) {
        this.qtdGolsCampeonato = qtdGolsCampeonato;
    }

    public int getQtdCartAmarelo() {
        return qtdCartAmarelo;
    }

    public void setQtdCartAmarelo(int qtdCartAmarelo) {
        this.qtdCartAmarelo = qtdCartAmarelo;
    }

    public int getQtdCartVermelho() {
        return qtdCartVermelho;
    }

    public void setQtdCartVermelho(int qtdCartVermelho) {
        this.qtdCartVermelho = qtdCartVermelho;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    public Jogador(){
        
    
    
    }
    
}
