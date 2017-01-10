/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import Controller.Partida;
import Controller.Time;
import Model.ConexaoBanco;
import Model.ExibirPartidaDAO;
import Model.InformacoesTimeDAO;
import Model.TimeDAO;
import com.sun.corba.se.spi.orb.StringPair;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import static java.util.Collections.list;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author RAZIEL
 */
public class ExibirPartida extends JFrame implements ActionListener {
//    String data;
//    String placar;
//    String nomeArena;
//    String vencedor;
//    String perdedor; 
//    String nomeCampeonato;
//    boolean empate;
//    int idPartida;

    JPanel p;
    JLabel background;
    
    JLabel data;
    JLabel placar;
    JLabel nomeArena;
    JLabel vencedor;
    JLabel perdedor;
    JLabel nomeCampeonato;
    JLabel empate;
    JLabel idPartidaLab;
    String idPartida;
   
    Partida partida;
    
    JTextField dataGet;
    JTextField placarGet;
    JTextField nomeArenaGet;
    JTextField vencedorGet;
    JTextField perdedorGet;
    JTextField nomeCampeonatoGet;
    JTextField empateGet;
//    JTextField idPartidaGet;
    
    JButton btnInserirTime;
    JButton btnInfoTimes;
    JButton btnInserirJogador;
    JButton btnSair;
    JButton btnVoltar;
    JList listaJogadores;
    String[] lista = null;

    public ExibirPartida() {
        idPartida = JOptionPane.showInputDialog("Digite o ID da partida");
        Partida partida = new Partida();
        Partida partida2 = new Partida();
        ExibirPartidaDAO infoPartida = new ExibirPartidaDAO();
        partida = infoPartida.selectPartida(idPartida);
        ArrayList list = infoPartida.selectTimes(idPartida);
//        partida2 = infoPartida.selectTimes(idPartida);

        setTitle("Informações Partida");
        this.setSize(800, 600);
        


        dataGet = new JTextField();
        dataGet.setEditable(false);
        dataGet.setBounds(260, 20, 200, 25);
        dataGet.setText(partida.getData());

        placarGet = new JTextField();
        placarGet.setEditable(false);
        placarGet.setBounds(260, 48, 200, 25);
        placarGet.setText(partida.getPlacar());

        nomeArenaGet = new JTextField();
        nomeArenaGet.setEditable(false);
        nomeArenaGet.setBounds(260, 76, 200, 25);
        nomeArenaGet.setText(partida.getNomeArena());
        
        nomeCampeonatoGet = new JTextField();
        nomeCampeonatoGet.setEditable(false);
        nomeCampeonatoGet.setBounds(260, 104, 200, 25);
        nomeCampeonatoGet.setText(partida.getNomeCampeonato());

        vencedorGet = new JTextField();
        vencedorGet.setEditable(false);
        vencedorGet.setBounds(260, 132, 200, 25);
        vencedorGet.setText((String) list.get(0));

        perdedorGet = new JTextField();
        perdedorGet.setEditable(false);
        perdedorGet.setBounds(260, 160, 200, 25);
        perdedorGet.setText((String) list.get(1));

        

        empateGet = new JTextField();
        empateGet.setEditable(false);
        empateGet.setBounds(260, 188, 200, 25);
        empateGet.setText(String.valueOf(partida.isEmpate()));

//        idPartidaGet = new JTextField();
//        idPartidaGet.setEditable(false);
//        idPartidaGet.setBounds(260, 216, 200, 25);
//        idPartidaGet.setText(String.valueOf(time.getQtdEmpates()));
      

        data = new JLabel("Data :");
        data.setBounds(50, 20, 210, 25);
        data.setFont(new java.awt.Font("Noto Sans", 0, 18));
        data.setForeground(Color.white);
        data.setOpaque(true);
        data.setBackground(Color.black);

        placar = new JLabel("Placar :");
        placar.setBounds(50, 48, 210, 25);
        placar.setFont(new java.awt.Font("Noto Sans", 0, 18));
        placar.setForeground(Color.white);
        placar.setOpaque(true);
        placar.setBackground(Color.black);

        nomeArena = new JLabel("Nome do Arena :");
        nomeArena.setBounds(50, 76, 210, 25);
        nomeArena.setFont(new java.awt.Font("Noto Sans", 0, 18));
        nomeArena.setForeground(Color.white);
        nomeArena.setOpaque(true);
        nomeArena.setBackground(Color.black);

        nomeCampeonato = new JLabel("Campeonato :");
        nomeCampeonato.setBounds(50, 104, 210, 25);
        nomeCampeonato.setFont(new java.awt.Font("Noto Sans", 0, 18));
        nomeCampeonato.setForeground(Color.white);
        nomeCampeonato.setOpaque(true);
        nomeCampeonato.setBackground(Color.black);

        vencedor = new JLabel("Vencedor :");
        vencedor.setBounds(50, 132, 210, 25);
        vencedor.setFont(new java.awt.Font("Noto Sans", 0, 18));
        vencedor.setForeground(Color.white);
        vencedor.setOpaque(true);
        vencedor.setBackground(Color.black);

        perdedor = new JLabel("Perdedor :");
        perdedor.setBounds(50, 160, 210, 25);
        perdedor.setFont(new java.awt.Font("Noto Sans", 0, 18));
        perdedor.setForeground(Color.white);
        perdedor.setOpaque(true);
        perdedor.setBackground(Color.black);

        empate = new JLabel("Empate :");
        empate.setBounds(50, 188, 210, 25);
        empate.setFont(new java.awt.Font("Noto Sans", 0, 18));
        empate.setForeground(Color.white);
        empate.setOpaque(true);
        empate.setBackground(Color.black);

        
        btnVoltar = new JButton("Voltar");
        btnVoltar.setBounds(0, 540, 100, 25);

        btnVoltar.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                Menu frame = new Menu();
                dispose();
                frame.setVisible(true);
            }

        });
        
        background = new JLabel();
        ImageIcon iconWallMenu = new ImageIcon(getClass().getResource("/Images/WallTimes.jpg"));
        background.setIcon(iconWallMenu);
        background.setBounds(0, 0, 800, 600);

        this.setLayout(null);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        

        this.add(data);
        this.add(placar);
        this.add(nomeArena);
        this.add(vencedor);
        this.add(perdedor);
        this.add(nomeCampeonato);
        this.add(empate);
        this.add(dataGet);
        this.add(placarGet);
        this.add(nomeArenaGet);
        this.add(vencedorGet);
        this.add(perdedorGet);
        this.add(nomeCampeonatoGet);
        this.add(empateGet);
        
        
        this.add(btnVoltar);
        this.add(background);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
