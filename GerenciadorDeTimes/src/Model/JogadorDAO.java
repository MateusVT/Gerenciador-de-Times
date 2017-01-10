/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Controller.Jogador;
import Controller.Time;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

/**
 *
 * @author mateus
 */
public class JogadorDAO {
    public Jogador insert (Jogador jogador) {
        ConexaoBanco con = new ConexaoBanco();
        Connection conexao = con.conexao();

        try {
            
            String sql = "INSERT INTO Jogador (nomeJogador, apelido, posicao, qtdGolsCarreira, qtdCardAmarelo, qtdCardVermelho, idade) VALUES (?, ?, ?, ?, ?, ?, ?)";

            PreparedStatement stmt = conexao.prepareStatement(sql);

            stmt.setString(1, jogador.getNomeJogador());
            stmt.setString(2, jogador.getApelido());
            stmt.setString(3, jogador.getPosicao());
            stmt.setInt(4, jogador.getQtdGolsCarreira());
            stmt.setInt(5, jogador.getQtdCartAmarelo());
            stmt.setInt(6, jogador.getQtdCartVermelho());
            stmt.setInt(7, jogador.getIdade());

            stmt.execute();
            
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Inserção Falhou!");
        } finally{
            con.desconexao(conexao);
        }
        
        return jogador;
    }

}
