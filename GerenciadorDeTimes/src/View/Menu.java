package View;

import Model.InformacoesTimeDAO;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import org.mockito.internal.stubbing.answers.ThrowsException;

/**
 *
 * @author RAZIEL
 */
public class Menu extends JFrame {
    
    JPanel p;
    JLabel background;
    JButton btnInserirTime;
    JButton btnInfoTimes;
    JButton btnInserirJogador;
    JButton btnInserirPartida;
    JButton btnExibirPartida;
    String nomeTimeInfo;
    JButton btnSair;
    
    FlowLayout layout = new FlowLayout(FlowLayout.CENTER);
    
    public Menu(){
        
        setTitle("Menu");
        setSize(800, 600);
        
        
        p = new JPanel();        
        
        background = new JLabel();
        ImageIcon iconWallMenu = new ImageIcon(getClass().getResource("/Images/Menu.jpg"));
        background.setIcon(iconWallMenu);
        background.setBounds(0, 0, 800, 600);
        p.setLayout(null);

        this.setResizable(false);
        this.setLocationRelativeTo(null);

        btnInserirTime = new JButton("Registrar Time");
        btnInserirTime.setBounds(325, 130, 110, 23);
        btnInserirTime.setSize(150, 30);
        btnInserirPartida = new JButton("Registrar Partida");
        btnInserirPartida.setBounds(325, 170, 110, 23);
        btnInserirPartida.setSize(150, 30);
        btnInserirJogador = new JButton("Registrar Jogador");
        btnInserirJogador.setBounds(325, 210, 110, 23);
        btnInserirJogador.setSize(150, 30);
        btnInfoTimes = new JButton("Informações Times");
        btnInfoTimes.setBounds(325, 250, 110, 23);
        btnInfoTimes.setSize(150, 30);
        btnExibirPartida = new JButton("Exibir Partidas");
        btnExibirPartida.setBounds(325, 290, 110, 23);
        btnExibirPartida.setSize(150, 30);
        btnSair = new JButton("Sair");
        btnSair.setBounds(325, 330, 110, 23);
        btnSair.setSize(150, 30);        



        p.add(btnInserirPartida);
        p.add(btnExibirPartida);
        p.add(btnInserirTime);
        p.add(btnInfoTimes);
        p.add(btnInserirJogador);
        p.add(btnSair);
        p.add(background);
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.add(p);
        this.setVisible(true);
        
        btnInserirTime.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {   
                InserirTime frame = new InserirTime();                
                frame.setVisible(true);
                dispose();

            }
        });
        
        btnExibirPartida.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {   
                ExibirPartida frame = new ExibirPartida();                
                frame.setVisible(true);
                dispose();

            }
        });
        
        btnInserirJogador.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {                  
                InserirJogador frame = new InserirJogador();                
                frame.setVisible(true);
                dispose();
                
            }
        });
        
        btnInfoTimes.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {                  
                InformaçõesTimes frame = new InformaçõesTimes();                
                frame.setVisible(true);
                dispose();
                
            }
        });
        
        
        btnInserirPartida.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {   
                InserirPartida frame = new InserirPartida();
                frame.setVisible(true);
                dispose();
            }
        });
        
        btnSair.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);

            }
        });
    
    }
    
    
    
    public static void main(String[] args) throws IOException{
        Menu menu = new Menu();
    }
    
    
}

