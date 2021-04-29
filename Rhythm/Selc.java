package Rhythm;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Selc extends JFrame{
    Music parfait = new Music("MintParfait.mp3",true);
    Music stms=new Music("MintParfait.mp3",false);


    JFrame frm = new JFrame();
    int dif = 0;
    int chn = 0;
    ImageIcon r1 = new ImageIcon(Selc.class.getResource("../img/right.png"));
    ImageIcon l1 = new ImageIcon(Selc.class.getResource("../img/left.png"));
    ImageIcon st = new ImageIcon(Selc.class.getResource("../img/start.png"));
    ImageIcon set = new ImageIcon(Selc.class.getResource("../img/setting.png"));
    ImageIcon prv = new ImageIcon(Selc.class.getResource("../img/prev.png"));
    JButton right= new JButton(r1);
    JButton left=new JButton(l1);
    JButton setting = new JButton(set);
    JButton start = new JButton(st);
    JButton pvlisn = new JButton(prv);

    public Selc() {

        setTitle("Rhythm");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Rectangle r = GraphicsEnvironment.getLocalGraphicsEnvironment().getMaximumWindowBounds();
        setLayout(new BorderLayout());
        setContentPane(new JLabel(new ImageIcon(Selc.class.getResource("../img/maxresdefault.jpg"))));
        setUndecorated(true);
        setVisible(true);

        setSize(r.width,r.height+100);


        right.setPressedIcon(r1);
        right.setOpaque(false);
        right.setContentAreaFilled(false);
        right.setFocusPainted(false);
        right.setBackground(new Color(0,0,0,0));
        right.setBorderPainted(false);
        right.setBounds(1830, 400, 100, 200);




        left.setPressedIcon(l1);
        left.setOpaque(false);
        left.setContentAreaFilled(false);
        left.setFocusPainted(false);
        left.setBackground(new Color(0,0,0,0));
        left.setBorderPainted(false);
        left.setBounds(-15, 400, 100, 200);
        start.setPressedIcon(st);
        start.setFocusPainted(false);
        start.setContentAreaFilled(false);
        start.setOpaque(false);
        start.setBackground(new Color(0,0,0,0));
        start.setBorderPainted(false);
        start.setBounds(730,890, 450, 200);
        setting.setPressedIcon(set);
        setting.setOpaque(false);
        setting.setContentAreaFilled(false);
        setting.setBackground(new Color(0,0,0,0));
        setting.setFocusPainted(false);
        setting.setBorderPainted(false);
        setting.setBounds(1715, -20, 250, 150);
        pvlisn.setPressedIcon(prv);
        pvlisn.setFocusable(false);
        pvlisn.setContentAreaFilled(false);
        pvlisn.setOpaque(false);
        pvlisn.setBackground(new Color(0,0,0,0));
        pvlisn.setFocusPainted(false);
        pvlisn.setBorderPainted(false);
        pvlisn.setBounds(-55, -50, 150, 100);

        add(right);
        add(left);
        add(start);


        left.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(chn==0) chn=3;
                else chn-=1;

            }
        });

        right.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(chn==3) chn=0;
                else chn+=1;

            }
        });

        

        start.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                stms.start();
                if(chn==0) {
                    MpSt mpst = new MpSt();
                    Music parfait=new Music("MintParfait.mp3",true);

                }



                dispose();

            }
        });

        pvlisn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if(chn==0) parfait.start();
            }
        });





        setting.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });











    }





}