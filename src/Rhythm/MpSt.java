package Rhythm;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class MpSt extends JFrame implements ActionListener {
    int y=0;
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
            buffimagn = createImage(1920,1080);//배경이미지
            buffimage=createImage(236,196);//노트 버퍼링
            buffgn = buffimagn.getGraphics();
            buffg=buffimage.getGraphics();

        }
        update(g);
        /*g.drawImage(l_arr.getImage(),270,y,this);*/
    }

    public void update(Graphics g){
        run();
        buffg.drawImage(r_arr.getImage(), 140,y,this);
        buffg.drawImage(l_arr.getImage(), 140,y,this);
        buffg.drawImage(u_arr.getImage(), 140,y,this);
        buffg.drawImage(d_arr.getImage(), 140,y,this);
        /*buffgn.drawImage(back,0,0,this);
        g.drawImage(buffimagn, 0,0,this);*/
        g.drawImage(back,0,0,this);

        if(count<=467) {
            g.drawImage(l_arr.getImage(), 240, y + 4419, this);
            g.drawImage(l_arr.getImage(), 240, y + 5319, this);
            g.drawImage(l_arr.getImage(), 240, y + 6219, this);
            g.drawImage(l_arr.getImage(), 240, y + 7119, this);
            g.drawImage(l_arr.getImage(), 240, y + 8019, this);
            g.drawImage(l_arr.getImage(), 240, y + 8919, this);
            g.drawImage(l_arr.getImage(), 240, y + 9819, this);
            g.drawImage(r_arr.getImage(), 1400, y + 10719, this);
        }
        if(count>287 && count<=651) {
            g.drawImage(r_arr.getImage(), 1400, y + 10719, this);
            g.drawImage(r_arr.getImage(), 1400, y + 11619, this);
            g.drawImage(r_arr.getImage(), 1400, y + 12519, this);
            g.drawImage(r_arr.getImage(), 1400, y + 13419, this);
            g.drawImage(r_arr.getImage(), 1400, y + 14319, this);
            g.drawImage(r_arr.getImage(), 1400, y + 15219, this);
        }

        if(count>651&&count<=1020) {
            g.drawImage(r_arr.getImage(), 1400, y + 17297, this);
            g.drawImage(l_arr.getImage(), 240, y + 17697, this);
            g.drawImage(r_arr.getImage(), 1400, y + 18097, this);
            g.drawImage(l_arr.getImage(), 240, y + 18497, this);
            g.drawImage(r_arr.getImage(), 1400, y + 18897, this);
            g.drawImage(l_arr.getImage(), 240, y + 19297, this);
        }
        if(count>720&&count<=1020) {
            g.drawImage(r_arr.getImage(), 1400, y + 19697, this);
            g.drawImage(l_arr.getImage(), 240, y + 20097, this);
            g.drawImage(r_arr.getImage(), 1400, y + 20497, this);
            g.drawImage(l_arr.getImage(), 240, y + 20897, this);
        }
        if(count>810&&count<=1020){
            g.drawImage(r_arr.getImage(), 1400, y + 21297, this);
            g.drawImage(l_arr.getImage(), 240, y + 21697, this);
            g.drawImage(r_arr.getImage(), 1400, y + 22097, this);
            g.drawImage(l_arr.getImage(), 240, y + 22497, this);
        }

        if(count>720&&count<=1020) {
            g.drawImage(d_arr.getImage(), 1065, y + 23544, this);
            g.drawImage(u_arr.getImage(), 655, y + 23944, this);
            g.drawImage(d_arr.getImage(), 1065, y + 24344, this);
            g.drawImage(u_arr.getImage(), 655, y + 24744, this);
            g.drawImage(d_arr.getImage(), 1065, y + 25144, this);
            g.drawImage(u_arr.getImage(), 655, y + 25544, this);
        }
         if(count>800&&count<=1220){
            g.drawImage(d_arr.getImage(), 1065, y + 25944, this);
            g.drawImage(u_arr.getImage(), 655, y + 26344, this);
            g.drawImage(d_arr.getImage(), 1065, y + 26744, this);
            g.drawImage(u_arr.getImage(), 655, y + 27144, this);
            g.drawImage(d_arr.getImage(), 1065, y + 27544, this);
            g.drawImage(l_arr.getImage(), 240, y + 27936, this);
        }


        if(count>1100&&count<=1300) {
            g.drawImage(l_arr.getImage(), 240, y + 29636, this);
            g.drawImage(l_arr.getImage(), 240, y + 29836, this);
            g.drawImage(u_arr.getImage(), 655, y + 30036, this);
            g.drawImage(d_arr.getImage(), 1065, y + 30236, this);
            g.drawImage(r_arr.getImage(), 1400, y + 30436, this);
            g.drawImage(d_arr.getImage(), 1065, y + 30636, this);
        }
        if(count>1080&&count<=1680) {
            g.drawImage(r_arr.getImage(), 1400, y + 31236, this);
            g.drawImage(r_arr.getImage(), 1400, y + 31436, this);
            g.drawImage(d_arr.getImage(), 1065, y + 31636, this);
            g.drawImage(u_arr.getImage(), 655, y + 31836, this);
            g.drawImage(l_arr.getImage(), 240, y + 32036, this);
            g.drawImage(u_arr.getImage(), 655, y + 32236, this);


            g.drawImage(l_arr.getImage(), 240, y + 32436, this);
            g.drawImage(u_arr.getImage(), 655, y + 32636, this);
            g.drawImage(d_arr.getImage(), 1065, y + 32836, this);
            g.drawImage(u_arr.getImage(), 655, y + 33036, this);
            g.drawImage(d_arr.getImage(), 1065, y + 33236, this);
        }
        if(count>1280&&count<=1660) {
            g.drawImage(r_arr.getImage(), 1400, y + 33436, this);
            g.drawImage(r_arr.getImage(), 1400, y + 33636, this);
            g.drawImage(r_arr.getImage(), 1400, y + 33836, this);
            g.drawImage(d_arr.getImage(), 1065, y + 34036, this);
            g.drawImage(d_arr.getImage(), 1065, y + 34236, this);
            g.drawImage(d_arr.getImage(), 1065, y + 34436, this);
        }
         if(count>1260&&count<=1800) {
             g.drawImage(u_arr.getImage(), 655, y + 34636, this);
             g.drawImage(l_arr.getImage(), 240, y + 34836, this);
             g.drawImage(u_arr.getImage(), 655, y + 35036, this);
             g.drawImage(u_arr.getImage(), 655, y + 35236, this);
         }

            g.drawImage(r_arr.getImage(), 1400, y + 37836, this);
            g.drawImage(r_arr.getImage(), 1400, y + 38036, this);
            g.drawImage(d_arr.getImage(), 1065, y + 38236, this);
            g.drawImage(u_arr.getImage(), 655, y + 38436, this);
            g.drawImage(l_arr.getImage(), 240, y + 38636, this);
            g.drawImage(u_arr.getImage(), 655, y + 38836, this);

            /*g.drawImage(l_arr.getImage(), 240, y + 39636, this);
            g.drawImage(l_arr.getImage(), 240, y + 39836, this);
            g.drawImage(u_arr.getImage(), 655, y + 40036, this);
            g.drawImage(d_arr.getImage(), 1065, y + 40236, this);
            g.drawImage(r_arr.getImage(), 1400, y + 40436, this);
            g.drawImage(d_arr.getImage(), 1065, y + 40636, this);

            g.drawImage(r_arr.getImage(), 1400, y + 40836, this);
            g.drawImage(d_arr.getImage(), 1065, y + 41036, this);
            g.drawImage(u_arr.getImage(), 655, y + 41236, this);
            g.drawImage(d_arr.getImage(), 1065, y + 41436, this);
            g.drawImage(u_arr.getImage(), 655, y + 41636, this);
            g.drawImage(l_arr.getImage(), 240, y + 41836, this);
            g.drawImage(l_arr.getImage(), 240, y + 41936, this);
            g.drawImage(l_arr.getImage(), 240, y + 42036, this);
            g.drawImage(u_arr.getImage(), 655, y + 42436, this);
            g.drawImage(u_arr.getImage(), 655, y + 42536, this);
            g.drawImage(u_arr.getImage(), 655, y + 42636, this);
            g.drawImage(d_arr.getImage(), 1065, y + 42836, this);
            g.drawImage(r_arr.getImage(), 1400, y + 43036, this);
            g.drawImage(d_arr.getImage(), 1065, y + 43236, this);
            g.drawImage(d_arr.getImage(), 1065, y + 43436, this);

            g.drawImage(r_arr.getImage(), 1400, y + 45236, this);
            g.drawImage(r_arr.getImage(), 1400, y + 45436, this);
            g.drawImage(d_arr.getImage(), 1065, y + 45636, this);
            g.drawImage(u_arr.getImage(), 655, y + 45736, this);
            g.drawImage(l_arr.getImage(), 250, y + 45836, this);

            g.drawImage(l_arr.getImage(), 250, y + 47136, this);
            g.drawImage(l_arr.getImage(), 250, y + 47336, this);
            g.drawImage(u_arr.getImage(), 655, y + 47436, this);
            g.drawImage(d_arr.getImage(), 1065, y + 47536, this);
            g.drawImage(r_arr.getImage(), 1400, y + 47636, this);*/

            /*g.drawImage(l_arr.getImage(), 250, y + 48936, this);
            g.drawImage(l_arr.getImage(), 250, y + 49136, this);
            g.drawImage(u_arr.getImage(), 250, y + 49236, this);
            g.drawImage(d_arr.getImage(), 250, y + 49336, this);
            g.drawImage(r_arr.getImage(), 250, y + 49436, this);*/
           // g.drawImage(r_arr.getImage(), 250, y + 47836, this);

           /* g.drawImage(l_arr.getImage(), 250, y + 45836, this);


            g.drawImage(l_arr.getImage(), 250, y + 45836, this);
            g.drawImage(l_arr.getImage(), 250, y + 45836, this);
            g.drawImage(l_arr.getImage(), 250, y + 45836, this);
            g.drawImage(l_arr.getImage(), 250, y + 45836, this);
            g.drawImage(l_arr.getImage(), 250, y + 45836, this);
            g.drawImage(l_arr.getImage(), 250, y + 45836, this);
            g.drawImage(l_arr.getImage(), 250, y + 45836, this);
            g.drawImage(l_arr.getImage(), 250, y + 45836, this);*/






        // l_arr 왼쪽화살표240x   y25
        //u_arr 위쪽 화살표655x   y0
        //d_arr 아래쪽 화살표1065x y0
        //r_arr 오른쪽 화살표1400x y25


        repaint();



    }
    public void jm(int timing,String noteType){
        int [] Ntime = new int[500];
        Ntime[0]=135;
        Ntime[1]=147;




        if(noteType.equals("left")){

            if(Ntime[stack1]-8<timing && Ntime[stack1]+8 >timing){
                stack++;
                System.out.println(count+"Success");
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
    public void run(){
        try{
            Thread.sleep(1);
            y-=25;
            System.out.print(y+" ");

        }catch (Exception e){

        }
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        /*nt1.updata();*/
        /*repaint();*/

        //1ms에 -25
        //1000ms = 1seconds
        count++;

    }


}