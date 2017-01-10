/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.Partida;
import Controller.Time;
import Model.PartidaDAO;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
//import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author RAZIEL
 */
public class InserirPartida extends JFrame implements ActionListener {

    Partida partida;
    Time time;

    JLabel data;
    JLabel times;
    JLabel nomeArena;
    JLabel placar;
    JLabel nomeCampeonato;
    JLabel vs;
    JLabel vs2;

    JTextField dataGet;
    JTextField time1Get;
    JTextField time2Get;
    JTextField nomeArenaGet;
    JTextField nomeCampeonatoGet;
    JTextField placarGet1;
    JTextField placarGet2;

    JLabel background;
    JButton btnSubmit;
    JButton btnVoltar;
    DateFormat fmtr;
    

    InserirPartida() {

        setTitle("Inserir Partida");
        setSize(800, 600);

       DateFormat fmt = new SimpleDateFormat("dd/MM/yy");
        
        btnSubmit = new JButton("Inserir");
        btnSubmit.setBounds(690, 540, 100, 25);

        btnVoltar = new JButton("Voltar");
        btnVoltar.setBounds(0, 540, 100, 25);

        
        dataGet = new JTextField();
        dataGet.setBounds(260, 20, 200, 25);
        time1Get = new JTextField();
        time1Get.setBounds(260, 48, 100, 25);
        time2Get = new JTextField();
        time2Get.setBounds(400, 48, 100, 25);
        nomeArenaGet = new JTextField();
        nomeArenaGet.setBounds(260, 76, 200, 25);
        nomeCampeonatoGet = new JTextField();
        nomeCampeonatoGet.setBounds(260, 132, 200, 25);
        placarGet1 = new JTextField();
        placarGet1.setBounds(260, 104, 25, 25);
        placarGet2 = new JTextField();
        placarGet2.setBounds(310, 104, 25, 25);

        data = new JLabel("Data :");
        data.setBounds(50, 20, 210, 25);
        data.setFont(new java.awt.Font("Noto Sans", 0, 18));
        data.setForeground(Color.white);
        data.setOpaque(true);
        data.setBackground(Color.black);
        
        nomeCampeonato = new JLabel("Campeonato :");
        nomeCampeonato.setBounds(50, 132, 210, 25);
        nomeCampeonato.setFont(new java.awt.Font("Noto Sans", 0, 18));
        nomeCampeonato.setForeground(Color.white);
        nomeCampeonato.setOpaque(true);
        nomeCampeonato.setBackground(Color.black);

        vs = new JLabel("x");
        vs.setFont(new java.awt.Font("Noto Sans", 0, 18));
        vs.setBounds(375, 48, 25, 25);
        
        vs2 = new JLabel("x");
        vs2.setFont(new java.awt.Font("Noto Sans", 0, 18));
        vs2.setBounds(295, 104, 25, 25);
        
        times = new JLabel("Times :");
        times.setBounds(50, 48, 210, 25);
        times.setFont(new java.awt.Font("Noto Sans", 0, 18));
        times.setForeground(Color.white);
        times.setOpaque(true);
        times.setBackground(Color.black);


        nomeArena = new JLabel("Nome Arena :");
        nomeArena.setBounds(50, 76, 210, 25);
        nomeArena.setFont(new java.awt.Font("Noto Sans", 0, 18));
        nomeArena.setForeground(Color.white);
        nomeArena.setOpaque(true);
        nomeArena.setBackground(Color.black);

        placar = new JLabel("Placar :");
        placar.setBounds(50, 104, 210, 25);
        placar.setFont(new java.awt.Font("Noto Sans", 0, 18));
        placar.setForeground(Color.white);
        placar.setOpaque(true);
        placar.setBackground(Color.black);

        background = new JLabel();
        ImageIcon iconWallMenu = new ImageIcon(getClass().getResource("/Images/WallTimes.jpg"));
        background.setIcon(iconWallMenu);
        background.setBounds(0, 0, 800, 600);

        this.setResizable(false);
        this.setLocationRelativeTo(null);

        this.add(btnSubmit);

        this.add(data);
        this.add(times);
        this.add(nomeCampeonatoGet);
        this.add(nomeCampeonato);
        this.add(nomeArena);
        this.add(placar);
        this.add(vs);
        this.add(vs2);
        this.add(dataGet);
        this.add(time1Get);
        this.add(time2Get);
        this.add(placarGet1);
        this.add(placarGet2);
        this.add(nomeArenaGet);
        this.add(btnVoltar);

        this.add(background);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        
        btnSubmit.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                Partida partida = new Partida();


                partida.setIdPartida((int) (Math.random() * 1000000));
//               
                
             partida.setData(dataGet.getText());
                
                
                if(placarGet2.getText().equals(placarGet1.getText())){                
                partida.setEmpate(true);
                }
                else{
                partida.setEmpate(false);
                }
                partida.setPlacar(placarGet1.getText()+" x "+placarGet2.getText());
                
                if(Integer.valueOf(Integer.valueOf(placarGet1.getText()))<Integer.valueOf(placarGet2.getText())){
                partida.setVencedor(time2Get.getText());
                partida.setPerdedor(time1Get.getText());
                }
                if(Integer.valueOf(Integer.valueOf(placarGet1.getText()))>Integer.valueOf(placarGet2.getText())){
                partida.setVencedor(time1Get.getText());
                partida.setPerdedor(time2Get.getText());
                }
                
                if(Integer.valueOf(Integer.valueOf(placarGet1.getText()))==Integer.valueOf(placarGet2.getText())){
                partida.setVencedor(time1Get.getText()+" Empate");
                partida.setPerdedor(time2Get.getText()+" Empate");
                
            }
                partida.setNomeArena(nomeArenaGet.getText());
                partida.setNomeCampeonato(nomeCampeonatoGet.getText());

//                System.out.println(jogador.getNomeJogador());
//                System.out.println(jogador.getApelido());
//                System.out.println(jogador.getPosicao());
//                System.out.println(jogador.getIdade());
//                System.out.println(jogador.getQtdGolsCarreira());
//                System.out.println(jogador.getQtdGolsCampeonato());
//                System.out.println(jogador.getQtdGolsPartida());
//                System.out.println(jogador.getQtdCartAmarelo());
//                System.out.println(jogador.getQtdCartVermelho());
//                
                PartidaDAO partidaDAO = new PartidaDAO();
                partidaDAO.insert(partida);
                
                Menu frame = new Menu();                
                frame.setVisible(true);
                dispose();
//                
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
