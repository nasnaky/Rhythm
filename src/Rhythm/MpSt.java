package Rhythm;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class MpSt extends JFrame implements ActionListener {
    Music parfait = new Music("MintParfait.mp3",false);
    int y=1000;
    int count=0;
    int count1=0;
    int stack=0;
    int stack1=0;
    private Image buffimage;
    private Image buffimagn;
    private Graphics buffg;
    private Graphics buffgn;
    private ImageIcon l_arr = new ImageIcon(MpSt.class.getResource("../img/l_arrow.png"));
    private ImageIcon u_arr = new ImageIcon(MpSt.class.getResource("../img/u_arrow.png"));
    private ImageIcon d_arr = new ImageIcon(MpSt.class.getResource("../img/d_arrow.png"));
    private ImageIcon r_arr = new ImageIcon(MpSt.class.getResource("../img/r_arrow.png"));
    private Image back = new ImageIcon(MpSt.class.getResource("../img/mint_note.png")).getImage();
    int speed =1;
    Timer timer = new Timer(speed,this);





    public MpSt(){

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        timer.start();
        setTitle("Mint Parfait");
        Rectangle r = GraphicsEnvironment.getLocalGraphicsEnvironment().getMaximumWindowBounds();
        setSize(r.width,r.height+100);
        //setContentPane(new JLabel(new ImageIcon("C:\\Users\\user\\Downloads\\mint_note.png")));
        setUndecorated(true);
        setVisible(true);
        setFocusable(true);
        addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent event) {

                char keyCode = event.getKeyChar();
                if(keyCode=='a'||event.getKeyCode()==37){
                    jm(count,"left");
                }
                else if(keyCode=='w'||event.getKeyCode()==38){

                    jm(count,"up");
                }
                else if(keyCode=='s'||event.getKeyCode()==40){

                    jm(count,"down");
                }
                else if(keyCode=='d'||event.getKeyCode()==39){

                    jm(count,"right");
                }

                if(keyCode==27){
                    Setbtn stb = new Setbtn();
                }
            }
        });

    }
    @Override
    public void paintComponents(Graphics g){
        super.paintComponents(g);
        g.drawImage(back,0,0,this);
    }
    @Override
    public void paint(Graphics g){
        if(buffg==null||buffgn==null) {
            buffimagn = createImage(1920,1080);
            buffimage=createImage(236,196);
            buffgn = buffimagn.getGraphics();
            buffg=buffimage.getGraphics();

        }
        update(g);
        /*g.drawImage(l_arr.getImage(),270,y,this);*/
    }

    public void update(Graphics g){
        buffg.drawImage(l_arr.getImage(), 240,y,this);
        /*buffgn.drawImage(back,0,0,this);
        g.drawImage(buffimagn, 0,0,this);*/
        g.drawImage(back,0,0,this);
        g.drawImage(l_arr.getImage(), 240,y+800,this);
        g.drawImage(l_arr.getImage(), 240,y+800,this);
        g.drawImage(l_arr.getImage(), 240,y+800,this);


        g.drawImage(r_arr.getImage(), 1380,y+970,this);
        g.drawImage(r_arr.getImage(), 1380,y+970,this);
        g.drawImage(r_arr.getImage(), 1380,y+970,this);












        repaint();



    }
    public void jm(int timing,String noteType){
        int [] Ntime = new int[500];
        Ntime[0]=135;
        Ntime[1]=147;



        if(noteType.equals("left")){

            if(Ntime[stack1]-8<timing && Ntime[stack1]+8 >timing){
                stack++;
                System.out.println("Success");
            }
            else {
                stack=0;
                System.out.println("Failed");
            }
            stack1++;
        }

        else if (noteType.equals("up")){

            if(Ntime[stack1]-8<timing && Ntime[stack1]+8 >timing){
                stack++;
                System.out.println("Success");
            }
            else {
                stack=0;
                System.out.println("Failed");
            }

            stack1++;
        }

        else if(noteType.equals("down")){

            if(Ntime[stack1]-8<timing && Ntime[stack1]+8 >timing){
                stack++;
                System.out.println("Success");
            }
            else {
                stack=0;
                System.out.println("Failed");
            }
            stack1++;
        }

        else if(noteType.equals("right")){

            if(Ntime[stack1]-8<timing && Ntime[stack1]+8 >timing){
                stack++;
                System.out.println("Success");
            }
            else {
                stack=0;
                System.out.println("Failed");
            }
            stack1++;
        }



    }


    @Override
    public void actionPerformed(ActionEvent e) {

        /*nt1.updata();*/
        /*repaint();*/
        y-=24;
        count++;
        System.out.print(count+" ");
    }


}