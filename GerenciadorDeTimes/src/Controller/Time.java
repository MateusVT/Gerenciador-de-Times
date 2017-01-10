/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.TimeDAO;
import java.util.ArrayList;

/**
 *
 * @author RAZIEL
 */
//Armazenar dados de vitória, derrota ou empate do time, guardando inclusive contra quem foi a partida e os pontos de cada equipe;
public class Time {


     String nomeTime;
     String nomeArena;
     String nomeTreinador;
     int qtdTitulos;
     int qtdVitorias;
     int qtdDerrotas;
     int qtdEmpates;
     int qtdPontos;
     String mascote;
     String jogadores;
     ArrayList listAdd;

    public ArrayList getListAdd() {
        return listAdd;
    }

    public void setListAdd(ArrayList listAdd) {
        this.listAdd = listAdd;
      
    }
    

    public Time() {
    
    }

    public Time(String nomeTime, String nomeArena, String nomeTreinador, String mascote, int qtdTitulos, int qtdVitorias, int qtdDerrotas, int qtdEmpates, int qtdPontos) {
        this.nomeTime = nomeTime;
        this.nomeArena = nomeArena;
        this.nomeTreinador = nomeTreinador;
        this.mascote = mascote;
        this.qtdTitulos = qtdTitulos;
        this.qtdVitorias = qtdVitorias;
        this.qtdDerrotas = qtdDerrotas;
        this.qtdEmpates = qtdEmpates;
        this.qtdPontos = qtdPontos;
      
    }

    public String getJogadores() {
        return jogadores;
    }

    public void setJogadores(String jogadores) {
        this.jogadores = jogadores;
    }
    
//    public boolean Insert(Time time){
//    timeDAO.insert(time);
//    
//    return true;
//    }
    public String getNomeTime() {
        return nomeTime;
    }

    public void setNomeTime(String nomeTime) {
        this.nomeTime = nomeTime;
    }

    public String getNomeArena() {
        return nomeArena;
    }

    public void setNomeArena(String nomeArena) {
        this.nomeArena = nomeArena;
    }

    public int getQtdTitulos() {
        return qtdTitulos;
    }

    public void setQtdTitulos(int qtdTitulos) {
        this.qtdTitulos = qtdTitulos;
    }

    public String getNomeTreinador() {
        return nomeTreinador;
    }

    public void setNomeTreinador(String nomeTreinador) {
        this.nomeTreinador = nomeTreinador;
    }

    public String getMascote() {
        return mascote;
    }

    public void setMascote(String mascote) {
        this.mascote = mascote;
    }

    public int getQtdVitorias() {
        return qtdVitorias;
    }

    public void setQtdVitorias(int qtdVitorias) {
        this.qtdVitorias = qtdVitorias;
    }

    public int getQtdDerrotas() {
        return qtdDerrotas;
    }

    public void setQtdDerrotas(int qtdDerrotas) {
        this.qtdDerrotas = qtdDerrotas;
    }

    public int getQtdEmpates() {
        return qtdEmpates;
    }

    public void setQtdEmpates(int qtdEmpates) {
        this.qtdEmpates = qtdEmpates;
    }

    public int getQtdPontos() {
        return qtdPontos;
    }

    public void setQtdPontos(int qtdPontos) {
        this.qtdPontos = qtdPontos;
    }
}
