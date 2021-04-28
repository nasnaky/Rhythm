package Rhythm;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Setbtn extends JFrame {
    private JFrame set = new JFrame();
    ImageIcon gmp = new ImageIcon(Setbtn.class.getResource("../img/gmplay.png"));
    private JButton gen = new JButton(gmp);
    ImageIcon ret = new ImageIcon(Setbtn.class.getResource("../img/return.png"));
    private JButton retn = new JButton(ret);
    ImageIcon Audio = new ImageIcon(Setbtn.class.getResource("../img/audio.png"));
    private JButton ado = new JButton(Audio);
    ImageIcon Video=new ImageIcon(Setbtn.class.getResource("../img/video.png"));
    private JButton vdo = new JButton(Video);


    public Setbtn(){
        set.setSize(300,300);
        set.setLayout(new BorderLayout());
        set.setBounds(560,120,800,1000);
        set.setContentPane(new JLabel(new ImageIcon(Setbtn.class.getResource("../img/Gray.png"))));
        set.setUndecorated(true);
        set.setTitle("설정");
        set.setFocusable(true);
        set.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent event) {
                int keyCode = (int)event.getKeyChar();
                if(keyCode==27) {
                    set.dispose();
                }
            }
        });
        set.add(vdo);
        set.add(ado);
        set.add(retn);
        set.add(gen);

        gen.setPressedIcon(gmp);
        gen.setOpaque(false);
        gen.setContentAreaFilled(false);
        gen.setFocusPainted(false);
        gen.setBackground(new Color(0,0,0,0));
        gen.setBorderPainted(false);
        gen.setBounds(230, 100, 300, 200);
        gen.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                ado.setEnabled(false);
                vdo.setEnabled(false);
                ado.setVisible(false);
                vdo.setVisible(false);
                gen.setBounds(230,30,300,200);
                gen.addKeyListener(new KeyAdapter() {
                    @Override
                    public void keyPressed(KeyEvent event) {
                        int keyCode = (int)event.getKeyChar();
                        if(keyCode==27) {
                            set.dispose();
                        }
                    }
                });
                JButton key= new JButton();




            }
        });

        ado.setPressedIcon(Audio);
        ado.setOpaque(false);
        ado.setContentAreaFilled(false);
        ado.setFocusPainted(false);
        ado.setBackground(new Color(0,0,0,0));
        ado.setBorderPainted(false);
        ado.setBounds(230, 300, 300, 200);
        ado.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                gen.setEnabled(false);
                vdo.setEnabled(false);
                gen.setVisible(false);
                vdo.setVisible(false);
                ado.setBounds(230,30,300,200);
                ado.addKeyListener(new KeyAdapter() {
                    @Override
                    public void keyPressed(KeyEvent event) {
                        int keyCode = (int)event.getKeyChar();
                        if(keyCode==27) {
                            set.dispose();
                        }
                    }
                });
                JButton volum=new JButton();




            }
        });

        vdo.setPressedIcon(Video);
        vdo.setOpaque(false);
        vdo.setContentAreaFilled(false);
        vdo.setFocusPainted(false);
        vdo.setBackground(new Color(0,0,0,0));
        vdo.setBorderPainted(false);
        vdo.setBounds(230, 500, 300, 200);
        vdo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ado.setEnabled(false);
                gen.setEnabled(false);
                ado.setVisible(false);
                gen.setVisible(false);
                vdo.setBounds(230,30,300,200);
                vdo.addKeyListener(new KeyAdapter() {
                    @Override
                    public void keyPressed(KeyEvent event) {
                        int keyCode = (int)event.getKeyChar();
                        if(keyCode==27) {
                            set.dispose();
                        }
                    }
                });
                JButton screen = new JButton();

            }
        });

        retn.setPressedIcon(ret);
        retn.setOpaque(false);
        retn.setContentAreaFilled(false);
        retn.setFocusPainted(false);
        retn.setBackground(new Color(0,0,0,0));
        retn.setBorderPainted(false);
        retn. setBounds(230, 700, 300, 200);
        retn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                set.dispose();
            }
        });










        set.setVisible(true);





    }
}
