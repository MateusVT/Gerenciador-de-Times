/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.Jogador;
import Controller.Partida;
import Controller.Time;
import Model.JogadorDAO;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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
public class InserirJogador extends JFrame implements ActionListener {
    Partida partidas;
    
    JList partidasList;
    Time time;
    JPanel p;
    JLabel background;
    JLabel nomeJogador;
    JLabel apelido;
    JLabel posicao;
    JLabel qtdGolsCarreira;
    JLabel qtdGolsPartida;
    JLabel qtdGolsCampeonato;
    JLabel qtdCartAmarelo;
    JLabel qtdCartVermelho;
    JLabel idade;
    
    JButton btnSubmit;
    JButton btnVoltar;
    
    JTextField nomeJogadorGet;
    JTextField apelidoGet;
    JTextField posicaoGet;
    JTextField qtdGolsCarreiraGet;
    JTextField qtdGolsCampeonatoGet;
    JTextField qtdGolsPartidaGet;
    JTextField qtdCartAmareloGet;
    JTextField qtdCartVermelhoGet;
    JTextField idadeGet;
    

    InserirJogador() {

        setTitle("Jogador");
        setSize(800, 600);

        p = new JPanel();

       

        btnSubmit = new JButton("Inserir");
        btnSubmit.setBounds(690, 540, 100, 25);
        
        btnVoltar = new JButton("Voltar");
        btnVoltar.setBounds(0, 540, 100, 25);

        

        nomeJogadorGet = new JTextField();
        nomeJogadorGet.setBounds(260, 20, 200, 25);
        apelidoGet = new JTextField();
        apelidoGet.setBounds(260, 48, 200, 25);
        posicaoGet = new JTextField();
        posicaoGet.setBounds(260, 76, 200, 25);
        qtdGolsCarreiraGet = new JTextField();
        qtdGolsCarreiraGet.setBounds(260, 104, 200, 25);
        qtdCartAmareloGet = new JTextField();
        qtdCartAmareloGet.setBounds(260, 132, 200, 25);
        qtdCartVermelhoGet = new JTextField();
        qtdCartVermelhoGet.setBounds(260, 160, 200, 25);
        idadeGet = new JTextField();
        idadeGet.setBounds(260, 188, 200, 25);
        
        
        
    
        nomeJogador = new JLabel("Nome do Jogador :");
        nomeJogador.setBounds(50, 20, 210, 25);
        nomeJogador.setFont(new java.awt.Font("Noto Sans", 0, 18));
        nomeJogador.setForeground(Color.white);
        nomeJogador.setOpaque(true);
        nomeJogador.setBackground(Color.black);

        apelido = new JLabel("Apelido :");
        apelido.setBounds(50, 48, 210, 25);
        apelido.setFont(new java.awt.Font("Noto Sans", 0, 18));
        apelido.setForeground(Color.white);
        apelido.setOpaque(true);
        apelido.setBackground(Color.black);

        posicao = new JLabel("Posição :");
        posicao.setBounds(50, 76, 210, 25);
        posicao.setFont(new java.awt.Font("Noto Sans", 0, 18));
        posicao.setForeground(Color.white);
        posicao.setOpaque(true);
        posicao.setBackground(Color.black);

        qtdGolsCarreira = new JLabel("Nº Gols na Carreira :");
        qtdGolsCarreira.setBounds(50, 104, 210, 25);
        qtdGolsCarreira.setFont(new java.awt.Font("Noto Sans", 0, 18));
        qtdGolsCarreira.setForeground(Color.white);
        qtdGolsCarreira.setOpaque(true);
        qtdGolsCarreira.setBackground(Color.black);

        qtdCartAmarelo = new JLabel("Nº Cartões amarelos :");
        qtdCartAmarelo.setBounds(50, 132, 210, 25);
        qtdCartAmarelo.setFont(new java.awt.Font("Noto Sans", 0, 18));
        qtdCartAmarelo.setForeground(Color.white);
        qtdCartAmarelo.setOpaque(true);
        qtdCartAmarelo.setBackground(Color.black);

        qtdCartVermelho = new JLabel("Nº Cartões vermelhos  :");
        qtdCartVermelho.setBounds(50, 160, 210, 25);
        qtdCartVermelho.setFont(new java.awt.Font("Noto Sans", 0, 18));
        qtdCartVermelho.setForeground(Color.white);
        qtdCartVermelho.setOpaque(true);
        qtdCartVermelho.setBackground(Color.black);

        idade = new JLabel("Idade :");
        idade.setBounds(50, 188, 210, 25);
        idade.setFont(new java.awt.Font("Noto Sans", 0, 18));
        idade.setForeground(Color.white);
        idade.setOpaque(true);
        idade.setBackground(Color.black);

//        jogadores = new JLabel();
//        jogadores.setBounds(50, 180, 210, 25);
//        jogadores.setFont(new java.awt.Font("Noto Sans", 0, 18));
//        jogadores.setForeground(Color.white);
//        jogadores.setOpaque(true);
//        jogadores.setBackground(Color.black);
        background = new JLabel();
        ImageIcon iconWallMenu = new ImageIcon(getClass().getResource("/Images/WallTimes.jpg"));
        background.setIcon(iconWallMenu);
        background.setBounds(0, 0, 800, 600);
        p.setLayout(null);

        this.setResizable(false);
        this.setLocationRelativeTo(null);

        p.add(btnSubmit);
        
         
    

        p.add(nomeJogador);
        p.add(apelido);
        p.add(idade);
        p.add(posicao);
        p.add(qtdGolsCarreira);
        p.add(qtdCartAmarelo);
        p.add(qtdCartVermelho);
        p.add(btnVoltar);
        p.add(nomeJogadorGet);
        p.add(apelidoGet);
        p.add(posicaoGet);
        p.add(qtdGolsCarreiraGet);
        p.add(qtdCartAmareloGet);
        p.add(qtdCartVermelhoGet);
        p.add(idadeGet);
        
        p.add(background);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.add(p);
        this.setVisible(true);

        btnSubmit.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                Jogador jogador = new Jogador();
                
                jogador.setNomeJogador(nomeJogadorGet.getText());
                jogador.setApelido(apelidoGet.getText());
                jogador.setPosicao(posicaoGet.getText());
                jogador.setIdade(Integer.parseInt(idadeGet.getText()));
                jogador.setQtdGolsCarreira(Integer.parseInt(qtdGolsCarreiraGet.getText()));
                jogador.setQtdCartAmarelo(Integer.parseInt(qtdCartAmareloGet.getText()));
                jogador.setQtdCartVermelho(Integer.parseInt(qtdCartVermelhoGet.getText()));
                
                JogadorDAO jogadorDAO = new JogadorDAO();
                jogadorDAO.insert(jogador);
                Menu frame = new Menu();                
                frame.setVisible(true);
                dispose();
                JOptionPane.showMessageDialog(null, "Inserido com Sucesso!");
                
            }
        });
        
       btnVoltar.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                Menu frame = new Menu();
                dispose();
                frame.setVisible(true);
            }

        });
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
