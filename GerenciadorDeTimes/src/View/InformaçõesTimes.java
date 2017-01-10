/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.Time;
import Model.ConexaoBanco;
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
public class InformaçõesTimes extends JFrame implements ActionListener {

    JPanel p;
    JLabel background;
    JLabel Titulo;
    JLabel nomeTime;
    JLabel nomeArena;
    JLabel qtdTitulos;
    JLabel qtdVitorias;
    JLabel qtdDerrotas;
    JLabel qtdEmpates;
    JLabel qtdPontos;
    JLabel titulos;
    JLabel jogadores;
    JLabel treinador;
    JLabel mascote;
    String nomeTimeInfo;
    Time time;
    JList ListJogadores;
    JButton btnSubmit;
    JTextField nomeTimeGet;
    JTextField nomeArenaGet;
    JTextField treinadorGet;
    JTextField qtdTitulosGet;
    JTextField qtdVitoriasGet;
    JTextField qtdDerrotasGet;
    JTextField qtdEmpatesGet;
    JTextField qtdPontosGet;
    JTextField titulosGet;
    JTextField jogadoresGet;
    JTextField mascoteGet;
    JButton btnInserirTime;
    JButton btnInfoTimes;
    JButton btnInserirJogador;
    JButton btnSair;
    JButton btnVoltar;
    JList listaJogadores;
    String[] lista = null;

    public InformaçõesTimes() {
        nomeTimeInfo = JOptionPane.showInputDialog("Digite o nome do time desejado");        

        InformacoesTimeDAO infoTime = new InformacoesTimeDAO();
        time = infoTime.selectTime(nomeTimeInfo);

        setTitle("Informações Time");
        this.setSize(800, 600);
        listaJogadores = new JList();
        listaJogadores.setBounds(560, 5, 200, 565);
        ArrayList list = infoTime.selectJogadores(nomeTimeInfo);

        listaJogadores.setModel(new javax.swing.AbstractListModel() {

            // metodo invocado pelo JList para obter o numero de elementos  
            public int getSize() {
                return list.size();
            }

            // metodo chamado pelo JList para apresentar o elemento da linha informada  
            public Object getElementAt(int linha) {
                Object elemento = list.get(linha);
                return elemento;
            }
        });

        btnSubmit = new JButton("Inserir");
        btnSubmit.setBounds(690, 540, 100, 25);

        nomeTimeGet = new JTextField();
        nomeTimeGet.setEditable(false);
        nomeTimeGet.setBounds(260, 20, 200, 25);
        nomeTimeGet.setText(time.getNomeTime());

        nomeArenaGet = new JTextField();
        nomeArenaGet.setEditable(false);
        nomeArenaGet.setBounds(260, 48, 200, 25);
        nomeArenaGet.setText(time.getNomeArena());

        treinadorGet = new JTextField();
        treinadorGet.setEditable(false);
        treinadorGet.setBounds(260, 76, 200, 25);
        treinadorGet.setText(time.getNomeTreinador());

        mascoteGet = new JTextField();
        mascoteGet.setEditable(false);
        mascoteGet.setBounds(260, 104, 200, 25);
        mascoteGet.setText(time.getMascote());

        qtdTitulosGet = new JTextField();
        qtdTitulosGet.setEditable(false);
        qtdTitulosGet.setBounds(260, 132, 200, 25);
        qtdTitulosGet.setText(String.valueOf(time.getQtdTitulos()));

        qtdVitoriasGet = new JTextField();
        qtdVitoriasGet.setEditable(false);
        qtdVitoriasGet.setBounds(260, 160, 200, 25);
        qtdVitoriasGet.setText(String.valueOf(time.getQtdVitorias()));

        qtdDerrotasGet = new JTextField();
        qtdDerrotasGet.setEditable(false);
        qtdDerrotasGet.setBounds(260, 188, 200, 25);
        qtdDerrotasGet.setText(String.valueOf(time.getQtdDerrotas()));

        qtdEmpatesGet = new JTextField();
        qtdEmpatesGet.setEditable(false);
        qtdEmpatesGet.setBounds(260, 216, 200, 25);
        qtdEmpatesGet.setText(String.valueOf(time.getQtdEmpates()));

        qtdPontosGet = new JTextField();
        qtdPontosGet.setEditable(false);
        qtdPontosGet.setBounds(260, 244, 200, 25);
        qtdPontosGet.setText(String.valueOf(time.getQtdPontos()));

        nomeTime = new JLabel("Nome do Time :");
        nomeTime.setBounds(50, 20, 210, 25);
        nomeTime.setFont(new java.awt.Font("Noto Sans", 0, 18));
        nomeTime.setForeground(Color.white);
        nomeTime.setOpaque(true);
        nomeTime.setBackground(Color.black);

        nomeArena = new JLabel("Nome da Arena :");
        nomeArena.setBounds(50, 48, 210, 25);
        nomeArena.setFont(new java.awt.Font("Noto Sans", 0, 18));
        nomeArena.setForeground(Color.white);
        nomeArena.setOpaque(true);
        nomeArena.setBackground(Color.black);

        treinador = new JLabel("Nome do Treinador :");
        treinador.setBounds(50, 76, 210, 25);
        treinador.setFont(new java.awt.Font("Noto Sans", 0, 18));
        treinador.setForeground(Color.white);
        treinador.setOpaque(true);
        treinador.setBackground(Color.black);

        mascote = new JLabel("Nome do Mascote :");
        mascote.setBounds(50, 104, 210, 25);
        mascote.setFont(new java.awt.Font("Noto Sans", 0, 18));
        mascote.setForeground(Color.white);
        mascote.setOpaque(true);
        mascote.setBackground(Color.black);

        qtdTitulos = new JLabel("Quantidade de Títulos :");
        qtdTitulos.setBounds(50, 132, 210, 25);
        qtdTitulos.setFont(new java.awt.Font("Noto Sans", 0, 18));
        qtdTitulos.setForeground(Color.white);
        qtdTitulos.setOpaque(true);
        qtdTitulos.setBackground(Color.black);

        qtdVitorias = new JLabel("Quantidade de Vitórias :");
        qtdVitorias.setBounds(50, 160, 210, 25);
        qtdVitorias.setFont(new java.awt.Font("Noto Sans", 0, 18));
        qtdVitorias.setForeground(Color.white);
        qtdVitorias.setOpaque(true);
        qtdVitorias.setBackground(Color.black);

        qtdDerrotas = new JLabel("Quantidade de Derrotas :");
        qtdDerrotas.setBounds(50, 188, 210, 25);
        qtdDerrotas.setFont(new java.awt.Font("Noto Sans", 0, 18));
        qtdDerrotas.setForeground(Color.white);
        qtdDerrotas.setOpaque(true);
        qtdDerrotas.setBackground(Color.black);

        qtdEmpates = new JLabel("Quantidade de Empates :");
        qtdEmpates.setBounds(50, 216, 210, 25);
        qtdEmpates.setFont(new java.awt.Font("Noto Sans", 0, 18));
        qtdEmpates.setForeground(Color.white);
        qtdEmpates.setOpaque(true);
        qtdEmpates.setBackground(Color.black);

        qtdPontos = new JLabel("Quantidade de Pontos :");
        qtdPontos.setBounds(50, 244, 210, 25);
        qtdPontos.setFont(new java.awt.Font("Noto Sans", 0, 18));
        qtdPontos.setForeground(Color.white);
        qtdPontos.setOpaque(true);
        qtdPontos.setBackground(Color.black);
        
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

        this.add(listaJogadores);
        this.add(nomeTimeGet);
        this.add(nomeArenaGet);
        this.add(treinadorGet);
        this.add(mascoteGet);
        this.add(qtdTitulosGet);
        this.add(qtdVitoriasGet);
        this.add(qtdDerrotasGet);
        this.add(qtdEmpatesGet);
        this.add(qtdPontosGet);
        this.add(btnVoltar);
        this.add(nomeTime);
        this.add(nomeArena);
        this.add(treinador);
        this.add(mascote);
        this.add(qtdTitulos);
        this.add(qtdVitorias);
        this.add(qtdDerrotas);
        this.add(qtdEmpates);
        this.add(qtdPontos);
        this.add(background);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
