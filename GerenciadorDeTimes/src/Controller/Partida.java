/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

//import java.util.Date;
import static java.lang.String.format;
import java.sql.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 *
 * @author RAZIEL
 */
public class Partida {
    String data;
    String placar;
    String nomeArena;
    String vencedor;
    String perdedor; 
    String nomeCampeonato;
    boolean empate;
    int idPartida;
    

    public Partida(int idPartida, String data, String placar, String nomeArena, String nomeCampeonato, boolean empate) {
        this.data = data;
        this.placar = placar;
        this.nomeArena = nomeArena;
        this.nomeCampeonato = nomeCampeonato;
        this.empate = empate;
        this.idPartida = idPartida;
    }
      public Partida() {
    
    }

    public String getNomeCampeonato() {
        return nomeCampeonato;
    }

    public void setNomeCampeonato(String nomeCampeonato) {
        this.nomeCampeonato = nomeCampeonato;
    }
   

    public String getVencedor() {
        return vencedor;
    }

    public void setVencedor(String vencedor) {
        this.vencedor = vencedor;
    }

    public String getPerdedor() {
        return perdedor;
    }

    public void setPerdedor(String perdedor) {
        this.perdedor = perdedor;
    }

    public String getPlacar() {
        return placar;
    }

    public void setPlacar(String placar) {
        this.placar = placar;
    }

    public String getNomeArena() {
        return nomeArena;
    }

    public void setNomeArena(String nomeArena) {
        this.nomeArena = nomeArena;
    }
    

    public String getData() {
        return data;
    }

    public void setData(String data){       
        this.data = data;
    }

    public boolean isEmpate() {
        return empate;
    }

    public void setEmpate(boolean empate) {
        this.empate = empate;
    }

    public int getIdPartida() {
        return idPartida;
    }

    public void setIdPartida(int idPartida) {
        this.idPartida = idPartida;
    }
    
       
}
