package Model;

import Controller.Time;
import Controller.Jogador;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class TimeDAO {
      public Time insert (Time time) {
        ConexaoBanco con = new ConexaoBanco();
        Connection conexao = con.conexao();
        int i=0;
        try {
            
            
            String sql = "INSERT INTO Time (nomeTime, nomeArena, nomeTreinador, mascote, qtdTitulos, qtdVitorias, qtdDerrotas, qtdEmpates, qtdPontos) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";            
            PreparedStatement stmt = conexao.prepareStatement(sql);
            for(i=0;i<time.getListAdd().size();i++){
            String sql0 = "SET FOREIGN_KEY_CHECKS=0";
            PreparedStatement stmt0 = conexao.prepareStatement(sql0);
            String sql2 = "INSERT INTO Time_has_jogador (Time_nomeTime, Jogador_nomeJogador) VALUES (?, ?)";            
            PreparedStatement stmt2 = conexao.prepareStatement(sql2);
            stmt2.setString(1, time.getNomeTime());
            stmt2.setString(2, (String) time.getListAdd().get(i));
            stmt0.execute();
            stmt2.execute();
            }
            String sql3 = "SET FOREIGN_KEY_CHECKS=1";
            PreparedStatement stmt3 = conexao.prepareStatement(sql3);

            stmt.setString(1, time.getNomeTime());
            stmt.setString(2, time.getNomeArena());
            stmt.setString(3, time.getNomeTreinador());
            stmt.setString(4, time.getMascote());
            stmt.setInt(5, time.getQtdTitulos());
            stmt.setInt(6, time.getQtdVitorias());
            stmt.setInt(7, time.getQtdDerrotas());
            stmt.setInt(8, time.getQtdEmpates());
            stmt.setInt(9, time.getQtdPontos());
           
                     


            
            stmt.execute();
            
            
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Inserção Falhou!");
        } finally{
            con.desconexao(conexao);
        }
        
        return time;
    }
      public List selectJogadores(int op){
        Time time = new Time();
        List lista = new ArrayList();
        ConexaoBanco con = new ConexaoBanco();
        Connection conexao = con.conexao();

        try {
           
            String sql = "SELECT *"
                        + " FROM Jogador";
           
            PreparedStatement stm = conexao.prepareStatement(sql);
            
            ResultSet rs = stm.executeQuery();
            
            
            while (rs.next()) {      
                if(op==0){
                lista.add (rs.getString ("nomeJogador"));
                }
                else{
                    lista.add (rs.getString ("apelido"));
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Listagem Falhou!");
        } finally{
            con.desconexao(conexao);
        }

        return lista;
    }


}
