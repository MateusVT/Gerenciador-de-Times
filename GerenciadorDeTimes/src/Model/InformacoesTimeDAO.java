/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Controller.Time;
import View.Menu;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author mateus
 */
public class InformacoesTimeDAO {
        public Time selectTime(String nomeTime){
        Time time = new Time();
        ConexaoBanco con = new ConexaoBanco();
        Connection conexao = con.conexao();

        try {
            String sql = "SELECT *"
                        + " FROM Time"
                        + " WHERE nomeTime = ?";
            PreparedStatement stm = conexao.prepareStatement(sql);
            
            stm.setString(1, nomeTime);
            ResultSet rs = stm.executeQuery();

            while (rs.next()) {
                time = new Time(rs.getString("nomeTime"), rs.getString("nomeArena"), rs.getString("nomeTreinador"), rs.getString("mascote"), rs.getInt("qtdTitulos"), rs.getInt("qtdVitorias"), rs.getInt("qtdDerrotas"), rs.getInt("qtdEmpates"), rs.getInt("qtdPontos"));
            }
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Listagem Falhou!");
        } finally{
            con.desconexao(conexao);
        }

        return time;
    }
        
      public ArrayList selectJogadores(String nomeTime){
        Time time = new Time();
        ArrayList list = new ArrayList();
        ConexaoBanco con = new ConexaoBanco();
        Connection conexao = con.conexao();

        try {
            String sql = "SELECT *"
                        + " FROM Time_has_jogador";
            
            PreparedStatement stm = conexao.prepareStatement(sql);
            
            ResultSet rs = stm.executeQuery();

            while (rs.next()) {
                list.add(rs.getString("Jogador_nomeJogador"));
            }
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Listagem Falhou!");
        } finally{
            con.desconexao(conexao);
        }

        return list;
    }
        
   
}
