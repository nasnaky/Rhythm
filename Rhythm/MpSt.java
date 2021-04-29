package Rhythm;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class MpSt extends JFrame implements ActionListener {
    int y = 0;
    int count = 0;
    int count1 = 0;
    int stack = 0;
    int stack1 = 0;
    private Image buffimage;
    private Image buffimagn;
    private Graphics buffg;
    private Graphics buffgn;
    private ImageIcon l_arr = new ImageIcon(MpSt.class.getResource("../img/l_arrow.png"));
    private ImageIcon u_arr = new ImageIcon(MpSt.class.getResource("../img/u_arrow.png"));
    private ImageIcon d_arr = new ImageIcon(MpSt.class.getResource("../img/d_arrow.png"));
    private ImageIcon r_arr = new ImageIcon(MpSt.class.getResource("../img/r_arrow.png"));
    private Image back = new ImageIcon(MpSt.class.getResource("../img/mint_note.png")).getImage();
    int speed = 5;
    Timer timer = new Timer(speed, this);


    public MpSt() {


        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        timer.start();
        setTitle("Mint Parfait");
        Rectangle r = GraphicsEnvironment.getLocalGraphicsEnvironment().getMaximumWindowBounds();
        setSize(r.width, r.height + 100);
        //setContentPane(new JLabel(new ImageIcon("C:\\Users\\user\\Downloads\\mint_note.png")));
        setUndecorated(true);
        setVisible(true);
        setFocusable(true);
        addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent event) {

                char keyCode = event.getKeyChar();
                if (keyCode == 'a' || event.getKeyCode() == 37) {
                    jm(count, "left");
                } else if (keyCode == 'w' || event.getKeyCode() == 38) {

                    jm(count, "up");
                } else if (keyCode == 's' || event.getKeyCode() == 40) {

                    jm(count, "down");
                } else if (keyCode == 'd' || event.getKeyCode() == 39) {

                    jm(count, "right");
                }

                if (keyCode == 27) {
                    Setbtn stb = new Setbtn();
                }
            }
        });

    }

    @Override
    public void paintComponents(Graphics g) {
        super.paintComponents(g);
        g.drawImage(back, 0, 0, this);
    }

    @Override
    public void paint(Graphics g) {
        if (buffg == null || buffgn == null) {
            buffimagn = createImage(1920, 1080);//배경이미지
            buffimage = createImage(236, 196);//노트 버퍼링
            buffgn = buffimagn.getGraphics();
            buffg = buffimage.getGraphics();

        }
        update(g);
        run();
        /*g.drawImage(l_arr.getImage(),270,y,this);*/
    }

    public void update(Graphics g) {

        buffg.drawImage(r_arr.getImage(), 140, y, this);
        buffg.drawImage(l_arr.getImage(), 140, y, this);
        buffg.drawImage(u_arr.getImage(), 140, y, this);
        buffg.drawImage(d_arr.getImage(), 140, y, this);
        /*buffgn.drawImage(back,0,0,this);
        g.drawImage(buffimagn, 0,0,this);*/
        g.drawImage(back, 0, 0, this);

        //g.drawImage(l_arr.getImage(), 250, y + 45836, this);

       // if (count < 185){
            g.drawImage(l_arr.getImage(), 240, y + 3025, this); //121
            g.drawImage(l_arr.getImage(), 240, y + 3725, this); //149
            g.drawImage(l_arr.getImage(), 240, y + 4500, this); //180
   // }
     //   if(count >161&&count<=277) {
            g.drawImage(l_arr.getImage(), 240, y + 5275, this); //211
            g.drawImage(l_arr.getImage(), 240, y + 6050, this); //242
            g.drawImage(l_arr.getImage(), 240, y + 6800, this); //272
       // }
        //if(count >261&&count<=394) {
            g.drawImage(l_arr.getImage(), 240, y + 7525, this); //301
            g.drawImage(l_arr.getImage(), 240, y + 8975, this); //359
            g.drawImage(l_arr.getImage(), 240, y + 9725, this); //389
        //}
        //if(count >380&&count<=480) {
            g.drawImage(l_arr.getImage(), 240, y + 10500, this); //420
            g.drawImage(l_arr.getImage(), 240, y + 11275, this); //451
            g.drawImage(l_arr.getImage(), 240, y + 12000, this); //480
        //}
        //if(count >470&&count<=619) {
            g.drawImage(l_arr.getImage(), 240, y + 12750, this); //510
            g.drawImage(l_arr.getImage(), 240, y + 14975, this); //599
            g.drawImage(l_arr.getImage(), 240, y + 15350, this); //614
        //}
        //if(count >576&&count<=648) {
            g.drawImage(l_arr.getImage(), 240, y + 15400, this); //616
            g.drawImage(l_arr.getImage(), 240, y + 15725, this); //629
            g.drawImage(l_arr.getImage(), 240, y + 16075, this); //643
        //}
        //if(count >619&&count<=694) {
            g.drawImage(l_arr.getImage(), 240, y + 16475, this); //659
            g.drawImage(l_arr.getImage(), 240, y + 16850, this); //674
            g.drawImage(l_arr.getImage(), 240, y + 17225, this); //689
       // }
       // if (count > 663&& count <=739) {
            g.drawImage(l_arr.getImage(), 240, y + 17575, this); //703}
            g.drawImage(l_arr.getImage(), 240, y + 17975, this); //719
            g.drawImage(l_arr.getImage(), 240, y + 18350, this); //734
       // }
       // if(count >708&&count<=841) {
            g.drawImage(l_arr.getImage(), 240, y + 18700, this); //748
            g.drawImage(l_arr.getImage(), 240, y + 19050, this); //762
            g.drawImage(l_arr.getImage(), 240, y + 20900, this); //836
       // }
       // if(count >811&&count<=886) {
            g.drawImage(l_arr.getImage(), 240, y + 21275, this); //851
            g.drawImage(l_arr.getImage(), 240, y + 21675, this); //867
            g.drawImage(l_arr.getImage(), 240, y + 22025, this); //881
       // }
       // if (count > 857&& count <=931) {
            g.drawImage(l_arr.getImage(), 240, y + 22425, this); //897
            g.drawImage(l_arr.getImage(), 240, y + 22775, this); //911
            g.drawImage(l_arr.getImage(), 240, y + 23150, this); //926
       // }
       // if (count > 902&& count <=976) {
            g.drawImage(l_arr.getImage(), 240, y + 23550, this); //942
            g.drawImage(l_arr.getImage(), 240, y + 23900, this); //956
            g.drawImage(l_arr.getImage(), 240, y + 24275, this); //971
       // }
            if(count >944&&count<=1084) {
                g.drawImage(l_arr.getImage(), 240, y + 24600, this); //984
                g.drawImage(l_arr.getImage(), 240, y + 25000, this); //1000
                g.drawImage(l_arr.getImage(), 240, y + 26975, this); //1079
       //     }
        //    if(count >1046&&count<=1102) {
                g.drawImage(l_arr.getImage(), 240, y + 27150, this); //1086
                g.drawImage(l_arr.getImage(), 240, y + 27325, this); //1093
                g.drawImage(l_arr.getImage(), 240, y + 27425, this); //1097
        //    }
        //if(count >1065&&count<=1127) {
            g.drawImage(l_arr.getImage(), 240, y + 27625, this); //1105
            g.drawImage(l_arr.getImage(), 240, y + 27875, this); //1115
            g.drawImage(l_arr.getImage(), 240, y + 28050, this); //1122
        //}
        //if(count >1088&&count<=1151) {
            g.drawImage(l_arr.getImage(), 240, y + 28200, this); //1128
            g.drawImage(l_arr.getImage(), 240, y + 28475, this); //1139
            g.drawImage(l_arr.getImage(), 240, y + 28650, this); //1146
        //}
        //if(count >1113&&count<=1700) {
            g.drawImage(l_arr.getImage(), 240, y + 28825, this); //1153
            g.drawImage(l_arr.getImage(), 240, y + 28900, this); //1156
            g.drawImage(l_arr.getImage(), 240, y + 29125, this); //1165
        //}
        //if(count >1135&&count<=1190) {
            g.drawImage(l_arr.getImage(), 240, y + 29375, this); //1175
            g.drawImage(l_arr.getImage(), 240, y + 29475, this); //1179
            g.drawImage(l_arr.getImage(), 240, y + 29625, this); //1185
        //}
        //if(count >1153&&count<=1211) {
            g.drawImage(l_arr.getImage(), 240, y + 29825, this); //1193
            g.drawImage(l_arr.getImage(), 240, y + 30000, this); //1200
            g.drawImage(l_arr.getImage(), 240, y + 30150, this); //1206
        //}
        //if(count >1172&&count<=1228) {
            g.drawImage(l_arr.getImage(), 240, y + 30300, this); //1212
            g.drawImage(l_arr.getImage(), 240, y + 30450, this); //1218
            g.drawImage(l_arr.getImage(), 240, y + 30575, this); //1223
        //}
        //if(count >1189&&count<=1248) {
            g.drawImage(l_arr.getImage(), 240, y + 30725, this); //1229
            g.drawImage(l_arr.getImage(), 240, y + 30925, this); //1237
            g.drawImage(l_arr.getImage(), 240, y + 31075, this); //1243
        //}
        //if(count >1211&&count<=1268) {
            g.drawImage(l_arr.getImage(), 240, y + 31275, this); //1251
            g.drawImage(l_arr.getImage(), 240, y + 31400, this); //1256
            g.drawImage(l_arr.getImage(), 240, y + 31575, this); //1263
        //}
        //if(count >1229&&count<=1287) {
            g.drawImage(l_arr.getImage(), 240, y + 31725, this); //1269
            g.drawImage(l_arr.getImage(), 240, y + 31825, this); //1273
            g.drawImage(l_arr.getImage(), 240, y + 32050, this); //1282
        //}
        //if(count >1249&&count<=1307) {
            g.drawImage(l_arr.getImage(), 240, y + 32225, this); //1289
            g.drawImage(l_arr.getImage(), 240, y + 32375, this); //1295
            g.drawImage(l_arr.getImage(), 240, y + 32550, this); //1302
        //}
        //if(count >1266&&count<=1328) {
            g.drawImage(l_arr.getImage(), 240, y + 32650, this); //1306
            g.drawImage(l_arr.getImage(), 240, y + 32925, this); //1317
            g.drawImage(l_arr.getImage(), 240, y + 33075, this); //1323
        //}
        //if(count >1290&&count<=1344) {
            g.drawImage(l_arr.getImage(), 240, y + 33250, this); //1330
            g.drawImage(l_arr.getImage(), 240, y + 33350, this); //1334
            g.drawImage(l_arr.getImage(), 240, y + 33475, this); //1339
        ///}
        ///if(count >1305&&count<=1363) {
            g.drawImage(l_arr.getImage(), 240, y + 33625, this); //1345
            g.drawImage(l_arr.getImage(), 240, y + 33825, this); //1353
            g.drawImage(l_arr.getImage(), 240, y + 33950, this); //1358
        //}
        //if(count >1323&&count<=1383) {
            g.drawImage(l_arr.getImage(), 240, y + 34075, this); //1363
            g.drawImage(l_arr.getImage(), 240, y + 34225, this); //1369
            g.drawImage(l_arr.getImage(), 240, y + 34450, this); //1378
        //}
        //if(count >1345&&count<=1399) {
            g.drawImage(l_arr.getImage(), 240, y + 34625, this); //1385
            g.drawImage(l_arr.getImage(), 240, y + 34750, this); //1390
            g.drawImage(l_arr.getImage(), 240, y + 34850, this); //1394
        //}
        //if(count >1363&&count<=1422) {
            g.drawImage(l_arr.getImage(), 240, y + 35075, this); //1403
            g.drawImage(l_arr.getImage(), 240, y + 35275, this); //1411
            g.drawImage(l_arr.getImage(), 240, y + 35425, this); //1417
        //}
        //if(count >1383&&count<=1349) {
            g.drawImage(l_arr.getImage(), 240, y + 35575, this); //1423
            g.drawImage(l_arr.getImage(), 240, y + 35700, this); //1428
            g.drawImage(l_arr.getImage(), 240, y + 35850, this); //1434
        //}
        //if (count > 1403&& count <=1459) {
            g.drawImage(l_arr.getImage(), 240, y + 36075, this); //1443
            g.drawImage(l_arr.getImage(), 240, y + 36175, this); //1447
            g.drawImage(l_arr.getImage(), 240, y + 36350, this); //1454
        ///}
        ///if(count >1419&&count<=1472) {
            g.drawImage(l_arr.getImage(), 240, y + 36475, this); //1459
            g.drawImage(l_arr.getImage(), 240, y + 36550, this); //1462
            g.drawImage(l_arr.getImage(), 240, y + 36675, this); //1467
        //}
        //if(count >1434&&count<=1491) {
            g.drawImage(l_arr.getImage(), 240, y + 36850, this); //1474
            g.drawImage(l_arr.getImage(), 240, y + 37000, this); //1480
            g.drawImage(l_arr.getImage(), 240, y + 37150, this); //1486
        //}
        //if(count >1532&&count<=1512) {
            g.drawImage(l_arr.getImage(), 240, y + 37300, this); //1492
            g.drawImage(l_arr.getImage(), 240, y + 37475, this); //1499
            g.drawImage(l_arr.getImage(), 240, y + 37675, this); //1507
        //}
        //if(count >1470&&count<=1529) {
            g.drawImage(l_arr.getImage(), 240, y + 37750, this); //1510
            g.drawImage(l_arr.getImage(), 240, y + 37900, this); //1516
            g.drawImage(l_arr.getImage(), 240, y + 38100, this); //1524
        //}
        //if(count >1492&&count<=1549) {
            g.drawImage(l_arr.getImage(), 240, y + 38300, this); //1532
            g.drawImage(l_arr.getImage(), 240, y + 38450, this); //1538
            g.drawImage(l_arr.getImage(), 240, y + 38600, this); //1544
        //}
        //if(count >1514&&count<=1572) {
            g.drawImage(l_arr.getImage(), 240, y + 38850, this); //1554
            g.drawImage(l_arr.getImage(), 240, y + 39025, this); //1561
            g.drawImage(l_arr.getImage(), 240, y + 39175, this); //1567
        //}
        //if(count >1532&&count<=1713) {
            g.drawImage(l_arr.getImage(), 240, y + 39300, this); //1572
            g.drawImage(l_arr.getImage(), 240, y + 39450, this); //1578
            g.drawImage(l_arr.getImage(), 240, y + 40200, this); //1608
        //}
        //if(count >1574&&count<=1629) {
            g.drawImage(l_arr.getImage(), 240, y + 40350, this); //1614
            g.drawImage(l_arr.getImage(), 240, y + 40500, this); //1620
            g.drawImage(l_arr.getImage(), 240, y + 40600, this); //1624
        //}
        //if(count >1589&&count<=1643) {
            g.drawImage(l_arr.getImage(), 240, y + 40725, this); //1629
            g.drawImage(l_arr.getImage(), 240, y + 40825, this); //1633
            g.drawImage(l_arr.getImage(), 240, y + 40950, this); //1638
        //}
        //if(count >1625&&count<=1678) {
            g.drawImage(l_arr.getImage(), 240, y + 41625, this); //1665
            g.drawImage(l_arr.getImage(), 240, y + 41750, this); //1670
            g.drawImage(l_arr.getImage(), 240, y + 41825, this); //1673
        //}
        //if(count >1639&&count<=1695) {
            g.drawImage(l_arr.getImage(), 240, y + 41975, this); //1679
            g.drawImage(l_arr.getImage(), 240, y + 42050, this); //1682
            g.drawImage(l_arr.getImage(), 240, y + 42250, this); //1690
        //}
        //if(count >1658&&count<=1720) {
            g.drawImage(l_arr.getImage(), 240, y + 42450, this); //1698
            g.drawImage(l_arr.getImage(), 240, y + 42700, this); //1708
            g.drawImage(l_arr.getImage(), 240, y + 42875, this); //1715
        //}
        //if(count >1683&&count<=1744) {
            g.drawImage(l_arr.getImage(), 240, y + 43075, this); //1723
            g.drawImage(l_arr.getImage(), 240, y + 43325, this); //1733
            g.drawImage(l_arr.getImage(), 240, y + 43475, this); //1739
        ///}
        ///if(count >1705&&count<=1756) {
            g.drawImage(l_arr.getImage(), 240, y + 43625, this); //1745
            g.drawImage(l_arr.getImage(), 240, y + 43675, this); //1747
            g.drawImage(l_arr.getImage(), 240, y + 43775, this); //1751
        //}
        //if(count >1717&&count<=1794) {
            g.drawImage(l_arr.getImage(), 240, y + 43925, this); //1757
            g.drawImage(l_arr.getImage(), 240, y + 44025, this); //1761
            g.drawImage(l_arr.getImage(), 240, y + 44725, this); //1789
        //}
        //if(count >1754&&count<=1808) {
            g.drawImage(l_arr.getImage(), 240, y + 44850, this); //1794
            g.drawImage(l_arr.getImage(), 240, y + 44950, this); //1798
            g.drawImage(l_arr.getImage(), 240, y + 45075, this); //1803
        //}
        //if(count >1766&&count<=1825) {
            g.drawImage(l_arr.getImage(), 240, y + 45150, this); //1806
            g.drawImage(l_arr.getImage(), 240, y + 45350, this); //1814
            g.drawImage(l_arr.getImage(), 240, y + 45500, this); //1820
        //}
        //if(count >1805&&count<=1856) {
            g.drawImage(l_arr.getImage(), 240, y + 46125, this); //1845
            g.drawImage(l_arr.getImage(), 240, y + 46250, this); //1850
            g.drawImage(l_arr.getImage(), 240, y + 46275, this); //1851
        //}
        //if(count >1818&&count<=1876) {
            g.drawImage(l_arr.getImage(), 240, y + 46450, this); //1858
            g.drawImage(l_arr.getImage(), 240, y + 46575, this); //1863
            g.drawImage(l_arr.getImage(), 240, y + 46775, this); //1871
        //}
        //if(count >1838&&count<=1915) {
            g.drawImage(l_arr.getImage(), 240, y + 46950, this); //1878
            g.drawImage(l_arr.getImage(), 240, y + 47625, this); //1905
            g.drawImage(l_arr.getImage(), 240, y + 47750, this); //1910
        //}
        //if(count >1873&&count<=1932) {
            g.drawImage(l_arr.getImage(), 240, y + 47825, this); //1913
            g.drawImage(l_arr.getImage(), 240, y + 48050, this); //1922
            g.drawImage(l_arr.getImage(), 240, y + 48175, this); //1927
        //}
        //if(count >1895&&count<=1952) {
            g.drawImage(l_arr.getImage(), 240, y + 48375, this); //1935
            g.drawImage(l_arr.getImage(), 240, y + 48575, this); //1943
            g.drawImage(l_arr.getImage(), 240, y + 48675, this); //1947
      //  }
            g.drawImage(l_arr.getImage(), 240, y + 48825, this); //1953
            g.drawImage(l_arr.getImage(), 240, y + 48875, this); //1955
            g.drawImage(l_arr.getImage(), 240, y + 49025, this); //1961

            g.drawImage(l_arr.getImage(), 240, y + 49150, this); //1966
            g.drawImage(l_arr.getImage(), 240, y + 49375, this); //1975
            g.drawImage(l_arr.getImage(), 240, y + 49550, this); //1982

            g.drawImage(l_arr.getImage(), 240, y + 49600, this); //1984
            g.drawImage(l_arr.getImage(), 240, y + 49700, this); //1988
            g.drawImage(l_arr.getImage(), 240, y + 49850, this); //1994

            g.drawImage(l_arr.getImage(), 240, y + 50025, this); //2001
            g.drawImage(l_arr.getImage(), 240, y + 50100, this); //2004
            g.drawImage(l_arr.getImage(), 240, y + 50300, this); //2012

            g.drawImage(l_arr.getImage(), 240, y + 50425, this); //2017
            g.drawImage(l_arr.getImage(), 240, y + 50725, this); //2029
            g.drawImage(l_arr.getImage(), 240, y + 50875, this); //2035

            g.drawImage(l_arr.getImage(), 240, y + 51025, this); //2041
            g.drawImage(l_arr.getImage(), 240, y + 51050, this); //2042
            g.drawImage(l_arr.getImage(), 240, y + 51250, this); //2050

            g.drawImage(l_arr.getImage(), 240, y + 51425, this); //2057
            g.drawImage(l_arr.getImage(), 240, y + 51650, this); //2066
            g.drawImage(l_arr.getImage(), 240, y + 51800, this); //2072

            g.drawImage(l_arr.getImage(), 240, y + 51950, this); //2078
            g.drawImage(l_arr.getImage(), 240, y + 52100, this); //2084
            g.drawImage(l_arr.getImage(), 240, y + 52225, this); //2089

            g.drawImage(l_arr.getImage(), 240, y + 52450, this); //2098
            g.drawImage(l_arr.getImage(), 240, y + 52600, this); //2104
            g.drawImage(l_arr.getImage(), 240, y + 52725, this); //2109

            g.drawImage(l_arr.getImage(), 240, y + 52900, this); //2116
            g.drawImage(l_arr.getImage(), 240, y + 53100, this); //2124
            g.drawImage(l_arr.getImage(), 240, y + 53125, this); //2125

            g.drawImage(l_arr.getImage(), 240, y + 53250, this); //2130
            g.drawImage(l_arr.getImage(), 240, y + 53325, this); //2133
            g.drawImage(l_arr.getImage(), 240, y + 53450, this); //2138

            g.drawImage(l_arr.getImage(), 240, y + 53625, this); //2145
            g.drawImage(l_arr.getImage(), 240, y + 53725, this); //2149
            g.drawImage(l_arr.getImage(), 240, y + 53900, this); //2156

            g.drawImage(l_arr.getImage(), 240, y + 54025, this); //2161
            g.drawImage(l_arr.getImage(), 240, y + 54175, this); //2167
            g.drawImage(l_arr.getImage(), 240, y + 54325, this); //2173

            g.drawImage(l_arr.getImage(), 240, y + 54500, this); //2180
            g.drawImage(l_arr.getImage(), 240, y + 54675, this); //2187
            g.drawImage(l_arr.getImage(), 240, y + 54775, this); //2191

            g.drawImage(l_arr.getImage(), 240, y + 54875, this); //2195
            g.drawImage(l_arr.getImage(), 240, y + 54975, this); //2199
            g.drawImage(l_arr.getImage(), 240, y + 55100, this); //2204

            g.drawImage(l_arr.getImage(), 240, y + 55125, this); //2205
            g.drawImage(l_arr.getImage(), 240, y + 55300, this); //2212
            g.drawImage(l_arr.getImage(), 240, y + 55475, this); //2219

            g.drawImage(l_arr.getImage(), 240, y + 55575, this); //2223
            g.drawImage(l_arr.getImage(), 240, y + 55625, this); //2225
            g.drawImage(l_arr.getImage(), 240, y + 55750, this); //2230

            g.drawImage(l_arr.getImage(), 240, y + 55825, this); //2233
            g.drawImage(l_arr.getImage(), 240, y + 56000, this); //2240
            g.drawImage(l_arr.getImage(), 240, y + 56650, this); //2266

            g.drawImage(l_arr.getImage(), 240, y + 56825, this); //2273
            g.drawImage(l_arr.getImage(), 240, y + 57000, this); //2280
            g.drawImage(l_arr.getImage(), 240, y + 57125, this); //2285

            g.drawImage(l_arr.getImage(), 240, y + 57350, this); //2294
            g.drawImage(l_arr.getImage(), 240, y + 57575, this); //2303
            g.drawImage(l_arr.getImage(), 240, y + 57700, this); //2308

            g.drawImage(l_arr.getImage(), 240, y + 57775, this); //2311
            g.drawImage(l_arr.getImage(), 240, y + 57925, this); //2317
            g.drawImage(l_arr.getImage(), 240, y + 58050, this); //2322

            g.drawImage(l_arr.getImage(), 240, y + 58175, this); //2327
            g.drawImage(l_arr.getImage(), 240, y + 58400, this); //2336
            g.drawImage(l_arr.getImage(), 240, y + 58575, this); //2343

            g.drawImage(l_arr.getImage(), 240, y + 58600, this); //2344
            g.drawImage(l_arr.getImage(), 240, y + 58700, this); //2348
            g.drawImage(l_arr.getImage(), 240, y + 58875, this); //2355

            g.drawImage(l_arr.getImage(), 240, y + 58925, this); //2357
            g.drawImage(l_arr.getImage(), 240, y + 59100, this); //2364
            g.drawImage(l_arr.getImage(), 240, y + 59150, this); //2366

            g.drawImage(l_arr.getImage(), 240, y + 59250, this); //2370
            g.drawImage(l_arr.getImage(), 240, y + 59400, this); //2376
            g.drawImage(l_arr.getImage(), 240, y + 59550, this); //2382

            g.drawImage(l_arr.getImage(), 240, y + 59700, this); //2388
            g.drawImage(l_arr.getImage(), 240, y + 59850, this); //2394
            g.drawImage(l_arr.getImage(), 240, y + 59950, this); //2398

            g.drawImage(l_arr.getImage(), 240, y + 60100, this); //2404
            g.drawImage(l_arr.getImage(), 240, y + 60225, this); //2409
            g.drawImage(l_arr.getImage(), 240, y + 60425, this); //2417

            g.drawImage(l_arr.getImage(), 240, y + 60550, this); //2422
            g.drawImage(l_arr.getImage(), 240, y + 60675, this); //2427
            g.drawImage(l_arr.getImage(), 240, y + 60725, this); //2429

            g.drawImage(l_arr.getImage(), 240, y + 60850, this); //2434
            g.drawImage(l_arr.getImage(), 240, y + 61000, this); //2440
            g.drawImage(l_arr.getImage(), 240, y + 61225, this); //2449

            g.drawImage(l_arr.getImage(), 240, y + 61325, this); //2453
            g.drawImage(l_arr.getImage(), 240, y + 61425, this); //2457

            g.drawImage(l_arr.getImage(), 240, y + 61500, this); //2460
            g.drawImage(l_arr.getImage(), 240, y + 61625, this); //2465
            g.drawImage(l_arr.getImage(), 240, y + 61700, this); //2468

            g.drawImage(l_arr.getImage(), 240, y + 61800, this); //2472
            g.drawImage(l_arr.getImage(), 240, y + 62425, this); //2497
            g.drawImage(l_arr.getImage(), 240, y + 62550, this); //2502

            g.drawImage(l_arr.getImage(), 240, y + 62875, this); //2515
            g.drawImage(l_arr.getImage(), 240, y + 63000, this); //2520
            g.drawImage(l_arr.getImage(), 240, y + 63100, this); //2524

            g.drawImage(l_arr.getImage(), 240, y + 63200, this); //2528
            g.drawImage(l_arr.getImage(), 240, y + 63300, this); //2532
            g.drawImage(l_arr.getImage(), 240, y + 63650, this); //2546

            g.drawImage(l_arr.getImage(), 240, y + 63725, this); //2549
            g.drawImage(l_arr.getImage(), 240, y + 63875, this); //2555
            g.drawImage(l_arr.getImage(), 240, y + 64025, this); //2561

            g.drawImage(l_arr.getImage(), 240, y + 64400, this); //2576
            g.drawImage(l_arr.getImage(), 240, y + 64525, this); //2581
            g.drawImage(l_arr.getImage(), 240, y + 64650, this); //2586

            g.drawImage(l_arr.getImage(), 240, y + 64800, this); //2592
            g.drawImage(l_arr.getImage(), 240, y + 64925, this); //2597
            g.drawImage(l_arr.getImage(), 240, y + 65075, this); //2603

            g.drawImage(l_arr.getImage(), 240, y + 65175, this); //2607
            g.drawImage(l_arr.getImage(), 240, y + 65225, this); //2609
            g.drawImage(l_arr.getImage(), 240, y + 65350, this); //2614

            g.drawImage(l_arr.getImage(), 240, y + 65525, this); //2621
            g.drawImage(l_arr.getImage(), 240, y + 65650, this); //2626
            g.drawImage(l_arr.getImage(), 240, y + 65875, this); //2635

            g.drawImage(l_arr.getImage(), 240, y + 66050, this); //2642
            g.drawImage(l_arr.getImage(), 240, y + 66200, this); //2648
            g.drawImage(l_arr.getImage(), 240, y + 66200, this); //2648
            g.drawImage(l_arr.getImage(), 240, y + 66350, this); //2654
            g.drawImage(l_arr.getImage(), 240, y + 66550, this); //2662
            g.drawImage(l_arr.getImage(), 240, y + 66675, this); //2667
            g.drawImage(l_arr.getImage(), 240, y + 66875, this); //2675
            g.drawImage(l_arr.getImage(), 240, y + 67100, this); //2684
            g.drawImage(l_arr.getImage(), 240, y + 67275, this); //2691
            g.drawImage(l_arr.getImage(), 240, y + 67425, this); //2697
            g.drawImage(l_arr.getImage(), 240, y + 67575, this); //2703
            g.drawImage(l_arr.getImage(), 240, y + 67750, this); //2710
            g.drawImage(l_arr.getImage(), 240, y + 68375, this); //2735
            g.drawImage(l_arr.getImage(), 240, y + 68500, this); //2740
            g.drawImage(l_arr.getImage(), 240, y + 68825, this); //2753
            g.drawImage(l_arr.getImage(), 240, y + 68975, this); //2759
            g.drawImage(l_arr.getImage(), 240, y + 69025, this); //2761
            g.drawImage(l_arr.getImage(), 240, y + 69150, this); //2766
            g.drawImage(l_arr.getImage(), 240, y + 69275, this); //2771
            g.drawImage(l_arr.getImage(), 240, y + 69600, this); //2784
            g.drawImage(l_arr.getImage(), 240, y + 69650, this); //2786
            g.drawImage(l_arr.getImage(), 240, y + 69750, this); //2790
            g.drawImage(l_arr.getImage(), 240, y + 69850, this); //2794
            g.drawImage(l_arr.getImage(), 240, y + 69975, this); //2799
            g.drawImage(l_arr.getImage(), 240, y + 70275, this); //2811
            g.drawImage(l_arr.getImage(), 240, y + 70325, this); //2813
            g.drawImage(l_arr.getImage(), 240, y + 70500, this); //2820
            g.drawImage(l_arr.getImage(), 240, y + 70525, this); //2821
            g.drawImage(l_arr.getImage(), 240, y + 70700, this); //2828
            g.drawImage(l_arr.getImage(), 240, y + 70825, this); //2833
            g.drawImage(l_arr.getImage(), 240, y + 71000, this); //2840
            g.drawImage(l_arr.getImage(), 240, y + 71075, this); //2843
            g.drawImage(l_arr.getImage(), 240, y + 71200, this); //2848
            g.drawImage(l_arr.getImage(), 240, y + 71250, this); //2850
            g.drawImage(l_arr.getImage(), 240, y + 71400, this); //2856
            g.drawImage(l_arr.getImage(), 240, y + 71525, this); //2861
            g.drawImage(l_arr.getImage(), 240, y + 71775, this); //2871
            g.drawImage(l_arr.getImage(), 240, y + 71900, this); //2876
            g.drawImage(l_arr.getImage(), 240, y + 72025, this); //2881
            g.drawImage(l_arr.getImage(), 240, y + 72125, this); //2885
            g.drawImage(l_arr.getImage(), 240, y + 72325, this); //2893
            g.drawImage(l_arr.getImage(), 240, y + 72525, this); //2901
            g.drawImage(l_arr.getImage(), 240, y + 72700, this); //2908
            g.drawImage(l_arr.getImage(), 240, y + 72725, this); //2909
            g.drawImage(l_arr.getImage(), 240, y + 72900, this); //2916
            g.drawImage(l_arr.getImage(), 240, y + 74525, this); //2981
            g.drawImage(l_arr.getImage(), 240, y + 75225, this); //3009
            g.drawImage(l_arr.getImage(), 240, y + 75975, this); //3039
            g.drawImage(l_arr.getImage(), 240, y + 76700, this); //3068
            g.drawImage(l_arr.getImage(), 240, y + 77450, this); //3098
            g.drawImage(l_arr.getImage(), 240, y + 78175, this); //3127
            g.drawImage(l_arr.getImage(), 240, y + 78975, this); //3159
            g.drawImage(l_arr.getImage(), 240, y + 79750, this); //3190
            g.drawImage(l_arr.getImage(), 240, y + 80550, this); //3222
            g.drawImage(l_arr.getImage(), 240, y + 80925, this); //3237
            g.drawImage(l_arr.getImage(), 240, y + 81225, this); //3249
            g.drawImage(l_arr.getImage(), 240, y + 81625, this); //3265
            g.drawImage(l_arr.getImage(), 240, y + 82000, this); //3280
            g.drawImage(l_arr.getImage(), 240, y + 82350, this); //3294
            g.drawImage(l_arr.getImage(), 240, y + 82725, this); //3309
            g.drawImage(l_arr.getImage(), 240, y + 83075, this); //3323
            g.drawImage(l_arr.getImage(), 240, y + 83500, this); //3340
            g.drawImage(l_arr.getImage(), 240, y + 83800, this); //3352
            g.drawImage(l_arr.getImage(), 240, y + 84225, this); //3369
            g.drawImage(l_arr.getImage(), 240, y + 84625, this); //3385
            g.drawImage(l_arr.getImage(), 240, y + 84975, this); //3399
            g.drawImage(l_arr.getImage(), 240, y + 85425, this); //3417
            g.drawImage(l_arr.getImage(), 240, y + 86575, this); //3463
            g.drawImage(l_arr.getImage(), 240, y + 86725, this); //3469
            g.drawImage(l_arr.getImage(), 240, y + 86875, this); //3475
            g.drawImage(l_arr.getImage(), 240, y + 86975, this); //3479
            g.drawImage(l_arr.getImage(), 240, y + 87200, this); //3488
            g.drawImage(l_arr.getImage(), 240, y + 87925, this); //3517
            g.drawImage(l_arr.getImage(), 240, y + 88050, this); //3522
            g.drawImage(l_arr.getImage(), 240, y + 88175, this); //3527
            g.drawImage(l_arr.getImage(), 240, y + 88300, this); //3532
            g.drawImage(l_arr.getImage(), 240, y + 88475, this); //3539
            g.drawImage(l_arr.getImage(), 240, y + 88550, this); //3542
            g.drawImage(l_arr.getImage(), 240, y + 88625, this); //3545
            g.drawImage(l_arr.getImage(), 240, y + 89350, this); //3574
            g.drawImage(l_arr.getImage(), 240, y + 89450, this); //3578
            g.drawImage(l_arr.getImage(), 240, y + 89550, this); //3582
            g.drawImage(l_arr.getImage(), 240, y + 89725, this); //3589
            g.drawImage(l_arr.getImage(), 240, y + 89775, this); //3591
            g.drawImage(l_arr.getImage(), 240, y + 89925, this); //3597
            g.drawImage(l_arr.getImage(), 240, y + 90050, this); //3602
            g.drawImage(l_arr.getImage(), 240, y + 90200, this); //3608
            g.drawImage(l_arr.getImage(), 240, y + 90400, this); //3616
            g.drawImage(l_arr.getImage(), 240, y + 90575, this); //3623
            g.drawImage(l_arr.getImage(), 240, y + 90750, this); //3630
            g.drawImage(l_arr.getImage(), 240, y + 90950, this); //3638
            g.drawImage(l_arr.getImage(), 240, y + 91150, this); //3646
            g.drawImage(l_arr.getImage(), 240, y + 91325, this); //3653
            g.drawImage(l_arr.getImage(), 240, y + 91425, this); //3657
            g.drawImage(l_arr.getImage(), 240, y + 91550, this); //3662
            g.drawImage(l_arr.getImage(), 240, y + 91675, this); //3667
            g.drawImage(l_arr.getImage(), 240, y + 92425, this); //3697
            g.drawImage(l_arr.getImage(), 240, y + 92500, this); //3700
            g.drawImage(l_arr.getImage(), 240, y + 92600, this); //3704
            g.drawImage(l_arr.getImage(), 240, y + 92775, this); //3711
            g.drawImage(l_arr.getImage(), 240, y + 92900, this); //3716
            g.drawImage(l_arr.getImage(), 240, y + 93025, this); //3721
            g.drawImage(l_arr.getImage(), 240, y + 93175, this); //3727
            g.drawImage(l_arr.getImage(), 240, y + 93350, this); //3734
            g.drawImage(l_arr.getImage(), 240, y + 93450, this); //3738
            g.drawImage(l_arr.getImage(), 240, y + 93600, this); //3744
            g.drawImage(l_arr.getImage(), 240, y + 93725, this); //3749
            g.drawImage(l_arr.getImage(), 240, y + 93850, this); //3754
            g.drawImage(l_arr.getImage(), 240, y + 93975, this); //3759
            g.drawImage(l_arr.getImage(), 240, y + 94150, this); //3766
            g.drawImage(l_arr.getImage(), 240, y + 94275, this); //3771
            g.drawImage(l_arr.getImage(), 240, y + 94425, this); //3777
            g.drawImage(l_arr.getImage(), 240, y + 94500, this); //3780
            g.drawImage(l_arr.getImage(), 240, y + 94750, this); //3790
            g.drawImage(l_arr.getImage(), 240, y + 94925, this); //3797
            g.drawImage(l_arr.getImage(), 240, y + 95050, this); //3802
            g.drawImage(l_arr.getImage(), 240, y + 95100, this); //3804
            g.drawImage(l_arr.getImage(), 240, y + 95350, this); //3814
            g.drawImage(l_arr.getImage(), 240, y + 95500, this); //3820
            g.drawImage(l_arr.getImage(), 240, y + 95625, this); //3825
            g.drawImage(l_arr.getImage(), 240, y + 95750, this); //3830
            g.drawImage(l_arr.getImage(), 240, y + 95900, this); //3836
            g.drawImage(l_arr.getImage(), 240, y + 96000, this); //3840
            g.drawImage(l_arr.getImage(), 240, y + 96100, this); //3844
            g.drawImage(l_arr.getImage(), 240, y + 96175, this); //3847
            g.drawImage(l_arr.getImage(), 240, y + 96375, this); //3855
            g.drawImage(l_arr.getImage(), 240, y + 96500, this); //3860
            g.drawImage(l_arr.getImage(), 240, y + 96625, this); //3865
            g.drawImage(l_arr.getImage(), 240, y + 96800, this); //3872
            g.drawImage(l_arr.getImage(), 240, y + 96925, this); //3877
            g.drawImage(l_arr.getImage(), 240, y + 97150, this); //3886
            g.drawImage(l_arr.getImage(), 240, y + 97250, this); //3890
            g.drawImage(l_arr.getImage(), 240, y + 97375, this); //3895
            g.drawImage(l_arr.getImage(), 240, y + 97475, this); //3899
            g.drawImage(l_arr.getImage(), 240, y + 97625, this); //3905
            g.drawImage(l_arr.getImage(), 240, y + 97825, this); //3913
            g.drawImage(l_arr.getImage(), 240, y + 97950, this); //3918
            g.drawImage(l_arr.getImage(), 240, y + 98025, this); //3921
            g.drawImage(l_arr.getImage(), 240, y + 98100, this); //3924
            g.drawImage(l_arr.getImage(), 240, y + 98300, this); //3932
            g.drawImage(l_arr.getImage(), 240, y + 98325, this); //3933
            g.drawImage(l_arr.getImage(), 240, y + 98550, this); //3942
            g.drawImage(l_arr.getImage(), 240, y + 98725, this); //3949
            g.drawImage(l_arr.getImage(), 240, y + 98900, this); //3956
            g.drawImage(l_arr.getImage(), 240, y + 98975, this); //3959
            g.drawImage(l_arr.getImage(), 240, y + 99175, this); //3967
            g.drawImage(l_arr.getImage(), 240, y + 99375, this); //3975
            g.drawImage(l_arr.getImage(), 240, y + 99475, this); //3979
            g.drawImage(l_arr.getImage(), 240, y + 99550, this); //3982
            g.drawImage(l_arr.getImage(), 240, y + 99700, this); //3988
            g.drawImage(l_arr.getImage(), 240, y + 99850, this); //3994
            g.drawImage(l_arr.getImage(), 240, y + 99975, this); //3999
            g.drawImage(l_arr.getImage(), 240, y + 100075, this);//4003
            g.drawImage(l_arr.getImage(), 240, y + 100275, this);//4011
            g.drawImage(l_arr.getImage(), 240, y + 100425, this);//4017
            g.drawImage(l_arr.getImage(), 240, y + 100675, this);//4027
            g.drawImage(l_arr.getImage(), 240, y + 100850, this);//4034
            g.drawImage(l_arr.getImage(), 240, y + 100975, this);//4039
            g.drawImage(l_arr.getImage(), 240, y + 101100, this);//4044
            g.drawImage(l_arr.getImage(), 240, y + 101250, this);//4050
            g.drawImage(l_arr.getImage(), 240, y + 101525, this);//4061
            g.drawImage(l_arr.getImage(), 240, y + 101725, this);//4069
            g.drawImage(l_arr.getImage(), 240, y + 101875, this);//4075
            g.drawImage(l_arr.getImage(), 240, y + 102000, this);//4080
            g.drawImage(l_arr.getImage(), 240, y + 102150, this);//4086
            g.drawImage(l_arr.getImage(), 240, y + 102400, this);//4096
            g.drawImage(l_arr.getImage(), 240, y + 102550, this);//4102
            g.drawImage(l_arr.getImage(), 240, y + 102650, this);//4106
            g.drawImage(l_arr.getImage(), 240, y + 102775, this);//4111
            g.drawImage(l_arr.getImage(), 240, y + 102950, this);//4118
            g.drawImage(l_arr.getImage(), 240, y + 103100, this);//4124
            g.drawImage(l_arr.getImage(), 240, y + 103250, this);//4130
            g.drawImage(l_arr.getImage(), 240, y + 103350, this);//4134
            g.drawImage(l_arr.getImage(), 240, y + 103500, this);//4140
            g.drawImage(l_arr.getImage(), 240, y + 103700, this);//4148
            g.drawImage(l_arr.getImage(), 240, y + 103975, this);//4159
            g.drawImage(l_arr.getImage(), 240, y + 104525, this);//4181
            g.drawImage(l_arr.getImage(), 240, y + 104700, this);//4188
            g.drawImage(l_arr.getImage(), 240, y + 104825, this);//4193
            g.drawImage(l_arr.getImage(), 240, y + 104975, this);//4199
            g.drawImage(l_arr.getImage(), 240, y + 105125, this);//4205
            g.drawImage(l_arr.getImage(), 240, y + 105475, this);//4219
            g.drawImage(l_arr.getImage(), 240, y + 105600, this);//4224
            g.drawImage(l_arr.getImage(), 240, y + 105725, this);//4229
            g.drawImage(l_arr.getImage(), 240, y + 105850, this);//4234
            g.drawImage(l_arr.getImage(), 240, y + 106200, this);//4248
            g.drawImage(l_arr.getImage(), 240, y + 106350, this);//4254
            g.drawImage(l_arr.getImage(), 240, y + 106500, this);//4260
            g.drawImage(l_arr.getImage(), 240, y + 106675, this);//4267
            g.drawImage(l_arr.getImage(), 240, y + 106875, this);//4275
            g.drawImage(l_arr.getImage(), 240, y + 107025, this);//4281
            g.drawImage(l_arr.getImage(), 240, y + 107225, this);//4289
            g.drawImage(l_arr.getImage(), 240, y + 107375, this);//4295
            g.drawImage(l_arr.getImage(), 240, y + 107525, this);//4301
            g.drawImage(l_arr.getImage(), 240, y + 107725, this);//4309
            g.drawImage(l_arr.getImage(), 240, y + 107850, this);//4314
            g.drawImage(l_arr.getImage(), 240, y + 108025, this);//4321
            g.drawImage(l_arr.getImage(), 240, y + 108150, this); //4326
            g.drawImage(l_arr.getImage(), 240, y + 108375, this); //4335
            g.drawImage(l_arr.getImage(), 240, y + 108500, this);//4340
            g.drawImage(l_arr.getImage(), 240, y + 108725, this); //4349
            g.drawImage(l_arr.getImage(), 240, y + 108875, this); //4355
            g.drawImage(l_arr.getImage(), 240, y + 109100, this); //4364
            g.drawImage(l_arr.getImage(), 240, y + 109200, this); //4368
            g.drawImage(l_arr.getImage(), 240, y + 109325, this); //4373
            g.drawImage(l_arr.getImage(), 240, y + 109425, this); //4377
            g.drawImage(l_arr.getImage(), 240, y + 109575, this); //4383
            g.drawImage(l_arr.getImage(), 240, y + 109700, this); //4388
            g.drawImage(l_arr.getImage(), 240, y + 109800, this); //4392
            g.drawImage(l_arr.getImage(), 240, y + 110300, this); //4412
            g.drawImage(l_arr.getImage(), 240, y + 110400, this); //4416
            g.drawImage(l_arr.getImage(), 240, y + 110750, this); //4430
            g.drawImage(l_arr.getImage(), 240, y + 110925, this); //4437
            g.drawImage(l_arr.getImage(), 240, y + 111025, this); //4441
            g.drawImage(l_arr.getImage(), 240, y + 111150, this); //4446
            g.drawImage(l_arr.getImage(), 240, y + 111450, this); //4458
            g.drawImage(l_arr.getImage(), 240, y + 111600, this); //4464
            g.drawImage(l_arr.getImage(), 240, y + 111725, this); //4469
            g.drawImage(l_arr.getImage(), 240, y + 111875, this); //4475
            g.drawImage(l_arr.getImage(), 240, y + 112225, this); //4489
            g.drawImage(l_arr.getImage(), 240, y + 112375, this); //4495
            g.drawImage(l_arr.getImage(), 240, y + 112550, this); //4502
            g.drawImage(l_arr.getImage(), 240, y + 112675, this); //4507
            g.drawImage(l_arr.getImage(), 240, y + 112775, this); //4511
            g.drawImage(l_arr.getImage(), 240, y + 112925, this); //4517
            g.drawImage(l_arr.getImage(), 240, y + 113100, this); //4524
            g.drawImage(l_arr.getImage(), 240, y + 113275, this); //4531
            g.drawImage(l_arr.getImage(), 240, y + 113400, this); //4536
            g.drawImage(l_arr.getImage(), 240, y + 113525, this); //4541
            g.drawImage(l_arr.getImage(), 240, y + 113750, this); //4550
            g.drawImage(l_arr.getImage(), 240, y + 113925, this); //4557
            g.drawImage(l_arr.getImage(), 240, y + 114050, this); //4562
            g.drawImage(l_arr.getImage(), 240, y + 114225, this); //4569
            g.drawImage(l_arr.getImage(), 240, y + 114425, this); //4577
            g.drawImage(l_arr.getImage(), 240, y + 114550, this); //4582
            g.drawImage(l_arr.getImage(), 240, y + 114725, this); //4589
            g.drawImage(l_arr.getImage(), 240, y + 114950, this); //4598
            g.drawImage(l_arr.getImage(), 240, y + 115100, this); //4604
            g.drawImage(l_arr.getImage(), 240, y + 115325, this); //4613
            g.drawImage(l_arr.getImage(), 240, y + 115475, this); //4619
            g.drawImage(l_arr.getImage(), 240, y + 115650, this); //4626
            g.drawImage(l_arr.getImage(), 240, y + 116225, this); //4649
            g.drawImage(l_arr.getImage(), 240, y + 116325, this); //4653
            g.drawImage(l_arr.getImage(), 240, y + 116675, this); //4667
            g.drawImage(l_arr.getImage(), 240, y + 116825, this); //4673
            g.drawImage(l_arr.getImage(), 240, y + 116950, this); //4678
            g.drawImage(l_arr.getImage(), 240, y + 117125, this); //4685
            g.drawImage(l_arr.getImage(), 240, y + 117450, this); //4698
            g.drawImage(l_arr.getImage(), 240, y + 117550, this); //4702
            g.drawImage(l_arr.getImage(), 240, y + 117675, this); //4707
            g.drawImage(l_arr.getImage(), 240, y + 117725, this); //4709
            g.drawImage(l_arr.getImage(), 240, y + 117875, this); //4715
            g.drawImage(l_arr.getImage(), 240, y + 118200, this); //4728
            g.drawImage(l_arr.getImage(), 240, y + 118300, this); //4732
            g.drawImage(l_arr.getImage(), 240, y + 118500, this); //4740
            g.drawImage(l_arr.getImage(), 240, y + 118550, this); //4742
            g.drawImage(l_arr.getImage(), 240, y + 118675, this); //4747
            g.drawImage(l_arr.getImage(), 240, y + 118775, this); //4751
            g.drawImage(l_arr.getImage(), 240, y + 118925, this); //4757
            g.drawImage(l_arr.getImage(), 240, y + 119075, this); //4763
            g.drawImage(l_arr.getImage(), 240, y + 119225, this); //4769
            g.drawImage(l_arr.getImage(), 240, y + 119400, this); //4776
            g.drawImage(l_arr.getImage(), 240, y + 119675, this); //4787
            g.drawImage(l_arr.getImage(), 240, y + 119800, this); //4792
            g.drawImage(l_arr.getImage(), 240, y + 119875, this); //4795
            g.drawImage(l_arr.getImage(), 240, y + 120050, this); //4802
            g.drawImage(l_arr.getImage(), 240, y + 120175, this); //4807
            g.drawImage(l_arr.getImage(), 240, y + 120350, this); //4814
            g.drawImage(l_arr.getImage(), 240, y + 120450, this); //4818
            g.drawImage(l_arr.getImage(), 240, y + 120600, this); //4824
            g.drawImage(l_arr.getImage(), 240, y + 120725, this); //4829
            g.drawImage(l_arr.getImage(), 240, y + 120825, this); //4833
            g.drawImage(l_arr.getImage(), 240, y + 120950, this); //4838
            g.drawImage(l_arr.getImage(), 240, y + 120975, this); //4839
            g.drawImage(l_arr.getImage(), 240, y + 122550, this); //4902
            g.drawImage(l_arr.getImage(), 240, y + 123150, this); //4926
            g.drawImage(l_arr.getImage(), 240, y + 123850, this); //4954
            g.drawImage(l_arr.getImage(), 240, y + 124575, this); //4983
            g.drawImage(l_arr.getImage(), 240, y + 125375, this); //5015
            g.drawImage(l_arr.getImage(), 240, y + 126100, this); //5044
            g.drawImage(l_arr.getImage(), 240, y + 126825, this); //5073
            g.drawImage(l_arr.getImage(), 240, y + 127525, this); //5101
            g.drawImage(l_arr.getImage(), 240, y + 128325, this); //5133
            g.drawImage(l_arr.getImage(), 240, y + 128650, this); //5146
            g.drawImage(l_arr.getImage(), 240, y + 129050, this); //5162
            g.drawImage(l_arr.getImage(), 240, y + 129400, this); //5176
            g.drawImage(l_arr.getImage(), 240, y + 129825, this); //5193
            g.drawImage(l_arr.getImage(), 240, y + 130175, this); //5207
            g.drawImage(l_arr.getImage(), 240, y + 130600, this); //5224
            g.drawImage(l_arr.getImage(), 240, y + 130950, this); //5238
            g.drawImage(l_arr.getImage(), 240, y + 131325, this); //5253
            g.drawImage(l_arr.getImage(), 240, y + 131700, this); //5268
            g.drawImage(l_arr.getImage(), 240, y + 132050, this); //5282
            g.drawImage(l_arr.getImage(), 240, y + 132425, this); //5297
            g.drawImage(l_arr.getImage(), 240, y + 132850, this); //5314
            g.drawImage(l_arr.getImage(), 240, y + 133025, this); //5321
            g.drawImage(l_arr.getImage(), 240, y + 133175, this); //5327
            g.drawImage(l_arr.getImage(), 240, y + 133325, this); //5333
            g.drawImage(l_arr.getImage(), 240, y + 133525, this); //5341
            g.drawImage(l_arr.getImage(), 240, y + 133625, this); //5345
            g.drawImage(l_arr.getImage(), 240, y + 133625, this); //5345
            g.drawImage(l_arr.getImage(), 240, y + 133700, this); //5348
            g.drawImage(l_arr.getImage(), 240, y + 133775, this); //5351
            g.drawImage(l_arr.getImage(), 240, y + 133800, this); //5352
            g.drawImage(l_arr.getImage(), 240, y + 133850, this); //5354
            g.drawImage(l_arr.getImage(), 240, y + 133925, this); //5357
            g.drawImage(l_arr.getImage(), 240, y + 134000, this); //5360
            g.drawImage(l_arr.getImage(), 240, y + 134075, this); //5363
            g.drawImage(l_arr.getImage(), 240, y + 134300, this); //5372
            g.drawImage(l_arr.getImage(), 240, y + 134400, this); //5376
            g.drawImage(l_arr.getImage(), 240, y + 134675, this); //5387
            g.drawImage(l_arr.getImage(), 240, y + 134750, this); //5390
            g.drawImage(l_arr.getImage(), 240, y + 134850, this); //5394
            g.drawImage(l_arr.getImage(), 240, y + 134925, this); //5397
            g.drawImage(l_arr.getImage(), 240, y + 135050, this); //5402
            g.drawImage(l_arr.getImage(), 240, y + 135375, this); //5415
            g.drawImage(l_arr.getImage(), 240, y + 135525, this); //5421
            g.drawImage(l_arr.getImage(), 240, y + 135700, this); //5428
            g.drawImage(l_arr.getImage(), 240, y + 135700, this); //5428
            g.drawImage(l_arr.getImage(), 240, y + 135825, this); //5433
            g.drawImage(l_arr.getImage(), 240, y + 136075, this); //5443
            g.drawImage(l_arr.getImage(), 240, y + 136150, this); //5446
            g.drawImage(l_arr.getImage(), 240, y + 136225, this); //5449
            g.drawImage(l_arr.getImage(), 240, y + 136375, this); //5455
            g.drawImage(l_arr.getImage(), 240, y + 136550, this); //5462
            g.drawImage(l_arr.getImage(), 240, y + 136600, this); //5464
            g.drawImage(l_arr.getImage(), 240, y + 136725, this); //5469
            g.drawImage(l_arr.getImage(), 240, y + 136750, this); //5470
            g.drawImage(l_arr.getImage(), 240, y + 136925, this); //5477
            g.drawImage(l_arr.getImage(), 240, y + 137075, this); //5483
            g.drawImage(l_arr.getImage(), 240, y + 137100, this); //5484
            g.drawImage(l_arr.getImage(), 240, y + 137250, this); //5490
            g.drawImage(l_arr.getImage(), 240, y + 137425, this); //5497
            g.drawImage(l_arr.getImage(), 240, y + 137525, this); //5501
            g.drawImage(l_arr.getImage(), 240, y + 137725, this); //5509
            g.drawImage(l_arr.getImage(), 240, y + 137900, this); //5516
            g.drawImage(l_arr.getImage(), 240, y + 138025, this); //5521
            g.drawImage(l_arr.getImage(), 240, y + 138125, this); //5525
            g.drawImage(l_arr.getImage(), 240, y + 138275, this); //5531
            g.drawImage(l_arr.getImage(), 240, y + 138450, this); //5538
            g.drawImage(l_arr.getImage(), 240, y + 138625, this); //5545
            g.drawImage(l_arr.getImage(), 240, y + 138875, this); //5555
            g.drawImage(l_arr.getImage(), 240, y + 139025, this); //5561
            g.drawImage(l_arr.getImage(), 240, y + 139200, this); //5568
            g.drawImage(l_arr.getImage(), 240, y + 139375, this); //5575
            g.drawImage(l_arr.getImage(), 240, y + 139525, this); //5581
            g.drawImage(l_arr.getImage(), 240, y + 140075, this); //5603
            g.drawImage(l_arr.getImage(), 240, y + 140200, this); //5608
            g.drawImage(l_arr.getImage(), 240, y + 140300, this); //5612
            g.drawImage(l_arr.getImage(), 240, y + 140525, this); //5621
            g.drawImage(l_arr.getImage(), 240, y + 140700, this); //5628
            g.drawImage(l_arr.getImage(), 240, y + 140875, this); //5635
            g.drawImage(l_arr.getImage(), 240, y + 141025, this); //5641
            g.drawImage(l_arr.getImage(), 240, y + 141250, this); //5650
            g.drawImage(l_arr.getImage(), 240, y + 141425, this); //5657
            g.drawImage(l_arr.getImage(), 240, y + 141450, this); //5658
            g.drawImage(l_arr.getImage(), 240, y + 141550, this); //5662
            g.drawImage(l_arr.getImage(), 240, y + 141725, this); //5669
            g.drawImage(l_arr.getImage(), 240, y + 142050, this); //5682
            g.drawImage(l_arr.getImage(), 240, y + 142175, this); //5687
            g.drawImage(l_arr.getImage(), 240, y + 142250, this); //5690
            g.drawImage(l_arr.getImage(), 240, y + 142400, this); //5696
            g.drawImage(l_arr.getImage(), 240, y + 142575, this); //5703
            g.drawImage(l_arr.getImage(), 240, y + 142725, this); //5709
            g.drawImage(l_arr.getImage(), 240, y + 142875, this); //5715
            g.drawImage(l_arr.getImage(), 240, y + 143050, this); //5722
            g.drawImage(l_arr.getImage(), 240, y + 143175, this); //5727
            g.drawImage(l_arr.getImage(), 240, y + 143325, this); //5733
            g.drawImage(l_arr.getImage(), 240, y + 143550, this); //5742
            g.drawImage(l_arr.getImage(), 240, y + 143700, this); //5748
            g.drawImage(l_arr.getImage(), 240, y + 143900, this); //5756
            g.drawImage(l_arr.getImage(), 240, y + 144025, this); //5761
            g.drawImage(l_arr.getImage(), 240, y + 144275, this); //5771
            g.drawImage(l_arr.getImage(), 240, y + 144375, this); //5775
            g.drawImage(l_arr.getImage(), 240, y + 144550, this); //5782
            g.drawImage(l_arr.getImage(), 240, y + 144650, this); //5786
            g.drawImage(l_arr.getImage(), 240, y + 144775, this); //5791
            g.drawImage(l_arr.getImage(), 240, y + 145875, this); //5835
            g.drawImage(l_arr.getImage(), 240, y + 146025, this); //5841
            g.drawImage(l_arr.getImage(), 240, y + 146150, this); //5846
            g.drawImage(l_arr.getImage(), 240, y + 146300, this); //5852
            g.drawImage(l_arr.getImage(), 240, y + 146525, this); //5861
            g.drawImage(l_arr.getImage(), 240, y + 146625, this); //5865
            g.drawImage(l_arr.getImage(), 240, y + 146700, this); //5868
            g.drawImage(l_arr.getImage(), 240, y + 146750, this); //5870
            g.drawImage(l_arr.getImage(), 240, y + 146875, this); //5875
            g.drawImage(l_arr.getImage(), 240, y + 147000, this); //5880
            g.drawImage(l_arr.getImage(), 240, y + 147125, this); //5885
            g.drawImage(l_arr.getImage(), 240, y + 147300, this); //5892
            g.drawImage(l_arr.getImage(), 240, y + 147450, this); //5898
            g.drawImage(l_arr.getImage(), 240, y + 147450, this); //5898
            g.drawImage(l_arr.getImage(), 240, y + 147575, this); //5903
            g.drawImage(l_arr.getImage(), 240, y + 147600, this); //5904
            g.drawImage(l_arr.getImage(), 240, y + 147775, this); //5911

            // l_arr 왼쪽화살표240x   y25
            //u_arr 위쪽 화살표655x   y0
            //d_arr 아래쪽 화살표1065x y0
            //r_arr 오른쪽 화살표1400x y25


            repaint();


        }


            public void jm ( int timing, String noteType){
                int[] Ntime = new int[50000];
                Ntime[0] = 135;
                Ntime[1] = 147;


                if (noteType.equals("left")) {

                    if (Ntime[stack1] - 8 < timing && Ntime[stack1] + 8 > timing) {
                        stack++;
                        System.out.println(count + "Success");
                        System.out.print(y + " " + count + "|");
                    } else {
                        stack = 0;
                        System.out.println("Failed");
                        System.out.print(y + " " + count + "|");
                    }
                    stack1++;
                } else if (noteType.equals("up")) {

                    if (Ntime[stack1] - 8 < timing && Ntime[stack1] + 8 > timing) {
                        stack++;
                        System.out.println("Success");
                        System.out.print(y + " " + count + "|");
                    } else {
                        stack = 0;
                        System.out.println("Failed");
                        System.out.print(y + " " + count + "|");
                    }

                    stack1++;
                } else if (noteType.equals("down")) {

                    if (Ntime[stack1] - 8 < timing && Ntime[stack1] + 8 > timing) {
                        stack++;
                        System.out.println("Success");
                        System.out.print(y + " " + count + "|");
                    } else {
                        stack = 0;
                        System.out.println("Failed");
                        System.out.print(y + " " + count + "|");
                    }
                    stack1++;
                } else if (noteType.equals("right")) {

                    if (Ntime[stack1] - 8 < timing && Ntime[stack1] + 8 > timing) {
                        stack++;
                        System.out.println("Success");
                        System.out.print(y + " " + count + "|");
                    } else {
                        stack = 0;
                        System.out.println("Failed");
                        System.out.print(y + " " + count + "|");
                    }
                    stack1++;
                }
            }


            public void run () {
                try {
                    Thread.sleep(4);
                    y -= 25;
                    // System.out.print(y+" ");
                    count++;
                    //System.out.print(count+" ");
                } catch (Exception e) {

                }
            }


            @Override
            public void actionPerformed (ActionEvent e){
                /*nt1.updata();*/
                /*repaint();*/

                //1ms에 -25
                //1000ms = 1seconds

            }


        }