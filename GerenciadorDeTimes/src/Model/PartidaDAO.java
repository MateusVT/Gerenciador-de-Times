/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Controller.Jogador;
import Controller.Partida;
import Controller.Time;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

/**
 * Date data;
    String placar;
    String nomeArena;
    Time vencedor;
    Time perdedor; 
    boolean empate;
    int idPartida;
    * `partida`.`id_Partida`, `partida`.`time_vencedor`, `partida`.`time_perdedor`, `partida`.`empate`, `partida`.`data`, `partida`.`placar`
 *
 * @author mateus
 */
public class PartidaDAO {
    public Partida insert (Partida partida) {
        ConexaoBanco con = new ConexaoBanco();
        Connection conexao = con.conexao();

        try {
            String sql0 = "SET FOREIGN_KEY_CHECKS=0";            
            String sql = "INSERT INTO Partida (id_Partida, empate, data, placar, nomeArena, Campeonato_nome) VALUES (?, ?, ?, ?, ?, ?)";
            String sql1 = "INSERT INTO partida_has_time (Partida_id_Partida, Time_nomeTime_Vencedor, Time_nomeTime_Perdedor) VALUES (?, ?, ?)";
            String sql2 = "SET FOREIGN_KEY_CHECKS=1"; 

            PreparedStatement stmt0 = conexao.prepareStatement(sql0);
            PreparedStatement stmt = conexao.prepareStatement(sql);
            PreparedStatement stmt1 = conexao.prepareStatement(sql1);
            PreparedStatement stmt2 = conexao.prepareStatement(sql2);
            stmt.setInt(1, partida.getIdPartida());
            stmt1.setInt(1, partida.getIdPartida());
            stmt1.setString(2, partida.getVencedor());
            stmt.setBoolean(2, partida.isEmpate());
            stmt1.setString(3, partida.getPerdedor());
            stmt.setString(3, partida.getData());
            stmt.setString(4, partida.getPlacar());
            stmt.setString(5, partida.getNomeArena());
            stmt.setString(6, partida.getNomeCampeonato());
//            stmt.setString(2, partida.getVencedor());
//            stmt.setString(3, partida.getPerdedor());
            
            stmt0.execute();
            stmt.execute();
            stmt1.execute();
            stmt2.execute();
            
//            f.setId(id);
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Inserção Falhou!");
        } finally{
            con.desconexao(conexao);
        }        
        return partida;
    }

}
