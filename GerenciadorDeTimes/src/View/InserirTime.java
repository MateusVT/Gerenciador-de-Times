/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.Time;
import Model.TimeDAO;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JTextField;
import java.awt.Choice;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
//import static jdk.nashorn.internal.runtime.regexp.joni.ast.ConsAltNode.listAdd;

/**
 *
 * @author RAZIEL
 */
public class InserirTime extends JFrame implements ActionListener {

    JList ListJogadores;
    Time time;
    Choice c;
    JLabel background;
    JTextField contField;
    JRadioButton op;
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
    JButton btnSubmit;
    JButton btnAdd;
    JButton btnVoltar;
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
    TimeDAO select;
    int opp = 0;
    int cont = 1;
//    String[] listAdd;
    ArrayList listAdd;
    

    InserirTime() {

        setTitle("Times");

        this.setSize(800, 600);
        
        
        Choice listagem = new Choice();
        listagem.setBounds(260, 272, 200, 25);
        select = new TimeDAO();
        String[] strings = (String[]) select.selectJogadores(opp).toArray(new String[select.selectJogadores(opp).size()]);      
//        String[] listAdd = null;
        for (int i = 0; i < strings.length; i++) {
            listagem.add(strings[i]);
        }      
        listAdd = new ArrayList();
        
        contField = new JTextField();
        contField.setEditable(false);
        contField.setBounds(0, 272, 50, 25);
        contField.setText(String.valueOf(cont));

        btnSubmit = new JButton("Inserir");
        btnSubmit.setBounds(690, 540, 100, 25);
        btnAdd = new JButton("Adicionar");
        btnAdd.setBounds(460, 272, 100, 25);
        btnVoltar = new JButton("Voltar");
        btnVoltar.setBounds(0, 540, 100, 25);

        op = new JRadioButton("Apelido");
        op.setBounds(155, 272, 100, 25);

        nomeTimeGet = new JTextField();
        nomeTimeGet.setBounds(260, 20, 200, 25);
        nomeArenaGet = new JTextField();
        nomeArenaGet.setBounds(260, 48, 200, 25);
        treinadorGet = new JTextField();
        treinadorGet.setBounds(260, 76, 200, 25);
        mascoteGet = new JTextField();
        mascoteGet.setBounds(260, 104, 200, 25);
        qtdTitulosGet = new JTextField();
        qtdTitulosGet.setBounds(260, 132, 200, 25);
        qtdVitoriasGet = new JTextField();
        qtdVitoriasGet.setBounds(260, 160, 200, 25);
        qtdDerrotasGet = new JTextField();
        qtdDerrotasGet.setBounds(260, 188, 200, 25);
        qtdEmpatesGet = new JTextField();
        qtdEmpatesGet.setBounds(260, 216, 200, 25);
        qtdPontosGet = new JTextField();
        qtdPontosGet.setBounds(260, 244, 200, 25);

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

        jogadores = new JLabel("Jogadores : ");
        jogadores.setBounds(50, 272, 100, 25);
        jogadores.setFont(new java.awt.Font("Noto Sans", 0, 18));
        jogadores.setForeground(Color.white);
        jogadores.setOpaque(true);
        jogadores.setBackground(Color.black);

        background = new JLabel();
        ImageIcon iconWallMenu = new ImageIcon(getClass().getResource("/Images/WallTimes.jpg"));
        background.setIcon(iconWallMenu);
        background.setBounds(0, 0, 800, 600);

        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.add(op);
        this.add(btnSubmit);
        this.add(listagem);
        this.add(btnAdd);
        this.add(contField);
        this.add(btnVoltar);
        this.add(nomeTimeGet);
        this.add(nomeArenaGet);
        this.add(treinadorGet);
        this.add(mascoteGet);
        this.add(qtdTitulosGet);
        this.add(qtdVitoriasGet);
        this.add(qtdDerrotasGet);
        this.add(qtdEmpatesGet);
        this.add(qtdPontosGet);
//        this.add(jogadoresGet);
        this.add(jogadores);
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
        this.setVisible(true);

        op.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {                
                if (opp == 0) {
                    listagem.removeAll();
                    opp = 1;
                    String[] strings = (String[]) select.selectJogadores(opp).toArray(new String[select.selectJogadores(opp).size()]);
                    for (int i = 0; i < strings.length; i++) {
                        listagem.add(strings[i]);
                    }
                } else {
                    opp = 0;
                    listagem.removeAll();
                    String[] strings = (String[]) select.selectJogadores(opp).toArray(new String[select.selectJogadores(opp).size()]);
                    for (int i = 0; i < strings.length; i++) {
                        listagem.add(strings[i]);

                    }
                }
            }

        });

        btnAdd.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                InserirTime.this.remove(op);                
                listAdd.add(listagem.getSelectedItem());
                System.out.println(listagem.getSelectedItem());
                listagem.remove(listagem.getSelectedItem());
                contField.setText(String.valueOf(cont));
                cont++;
                

            }

        });

        btnSubmit.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                Time time = new Time();
//                Time time = new Time(nomeTimeGet.getText(), nomeArenaGet.getText(), treinadorGet.getText(), mascoteGet.getText(), qtdTitulosGet.getText(), qtdVitoriasGet.getText(), qtdDerrotasGet.getText(), qtdEmpatesGet.getText(), qtdPontosGet.getText());
                time.setNomeTime(nomeTimeGet.getText());
                time.setNomeArena(nomeArenaGet.getText());
                time.setNomeTreinador(treinadorGet.getText());
                time.setMascote(mascoteGet.getText());
                time.setJogadores(jogadores.getText());
                time.setQtdTitulos(Integer.parseInt(qtdTitulosGet.getText()));
                time.setQtdVitorias(Integer.parseInt(qtdVitoriasGet.getText()));
                time.setQtdDerrotas(Integer.parseInt(qtdDerrotasGet.getText()));
                time.setQtdEmpates(Integer.parseInt(qtdEmpatesGet.getText()));
                time.setQtdPontos(Integer.parseInt(qtdPontosGet.getText()));
                time.setListAdd(listAdd);             
                
                System.out.println(time.getNomeTime());
                System.out.println(time.getNomeArena());
                System.out.println(time.getNomeTreinador());
                System.out.println(time.getMascote());
                System.out.println(time.getQtdTitulos());
                System.out.println(time.getQtdVitorias());
                System.out.println(time.getQtdDerrotas());
                System.out.println(time.getQtdEmpates());
                System.out.println(time.getQtdPontos());
                System.out.println(listAdd);
                TimeDAO timeDAO = new TimeDAO();
                timeDAO.insert(time);

                setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                
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
