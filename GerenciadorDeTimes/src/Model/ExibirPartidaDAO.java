
package Model;

import Controller.Partida;
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
public class ExibirPartidaDAO{
    
        public Partida selectPartida(String idPartida){
        Partida partida = new Partida();
        ConexaoBanco con = new ConexaoBanco();
        Connection conexao = con.conexao();

        try {
            String sql = "SELECT *"
                        + " FROM Partida"
                        + " WHERE id_Partida = ?";
            PreparedStatement stm = conexao.prepareStatement(sql);
            stm.setString(1, idPartida);
            ResultSet rs = stm.executeQuery();

            while (rs.next()) {
                partida = new Partida(rs.getInt("id_Partida"),rs.getString("data"),rs.getString("placar"),rs.getString("nomeArena"),rs.getString("Campeonato_nome"),rs.getBoolean("empate"));
            }
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Listagem Falhou!");
        } finally{
            con.desconexao(conexao);
        }

        return partida;
    }
        
      public ArrayList selectTimes(String idPartida){
        Partida partida = new Partida();      
        ArrayList list = new ArrayList();
        ConexaoBanco con = new ConexaoBanco();
        Connection conexao = con.conexao();

        try {
            String sql = "SELECT *"
                        + " FROM partida_has_time"
                          + " WHERE partida_id_partida = ?";
            
            PreparedStatement stm = conexao.prepareStatement(sql);
            stm.setString(1, idPartida);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                list.add(rs.getString("Time_nomeTime_Vencedor"));
                list.add(rs.getString("Time_nomeTime_Perdedor"));
            }
//            partida.setVencedor(rs.getString("Time_nomeTime_Vencedor"));
//            partida.setPerdedor(rs.getString("Time_nomeTime_Perdedor"));
                
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Listagem Falhou!");
        } finally{
            con.desconexao(conexao);
        }

        return list;
    }
        
   
}
