/**
 * Einhornmalprogramm von Christian
 * 
 */
import javax.swing.JColorChooser;
import java.awt.Color;

import sum.kern.*;

public class Malen
{

    static Bildschirm b;
    static Buntstift s;
    Maus m;
    Tastatur t;
    static Hilfsbildschirm hb;
    
    boolean Kreis;
    static boolean ESC;
    int p;
    float r;
    static float NEck = 5;
    static int sl;
    static int sd;

    public Malen()
    {
        
        b = new Bildschirm(0, 0, 700, 400);
        s = new Buntstift();
        m = new Maus();
        t = new Tastatur();
        hb = new Hilfsbildschirm();
        
        Kreis = false;
        sl = 10;
        sd = 1;
       
    }

    public void fuehreAus()
    {
        
        do
        {   
            
            s.bewegeBis(m.hPosition(), m.vPosition());
            
            if(t.wurdeGedrueckt())
            {
                
                switch(t.zeichen())
                {
                    
                   case 'r':case 'R':
                        s.setzeFarbe(Farbe.ROT);
                        break;
                   case 's':case 'S':
                        s.setzeFarbe(Farbe.SCHWARZ);
                        break;
                   case 'b':case 'B':
                        s.setzeFarbe(Farbe.BLAU);
                        break;
                   case 'g':case 'G':
                        s.setzeFarbe(Farbe.GRUEN);
                        break;
                   case 'y':case 'Y':
                        s.setzeFarbe(Farbe.GELB);
                        break;
                   case 'o':case 'O':
                        s.setzeFarbe(Farbe.ORANGE);
                        break;
                   case 'w':case 'W':
                        s.setzeFarbe(Farbe.WEISS);
                        break;
                   case 'p':case 'P':
                        s.setzeFarbe(Farbe.PINK);
                        break;
                   case 'm':case 'M':
                        s.setzeFarbe(Farbe.MAGENTA);
                        break;
                   case 'd':case 'D':
                        s.setzeFarbe(Farbe.GRAU);
                        break;
                   case '+':
                        s.setzeLinienBreite(s.linienBreite()+1);
                        break;
                   case '-':
                        s.setzeLinienBreite(s.linienBreite()-1);
                        break;
                   case 'k': case 'K':
                        Kreis = !Kreis ;
                        break;
                   case 'e':case 'E':
                        zeichneEinhorn();
                        break;
                   case 'f':case 'F':
                        b.setzeFarbe(Farbe.WEISS);
                        break;
                   case '1':
                        s.setzeLinienBreite(1);
                        break;
                   case 'c': case 'C':
                        zeichneNEck(sl, NEck);
                        break;
                   case Zeichen.ESCAPE:
                        ESC = true;
                        break;
                   case 'a': case 'A':
                        bewegeEinhorn();
                        break;
                   case 'l': case 'L':
                        Color c = JColorChooser.showDialog(null, "Farbauswahl", null);
                        s.setzeFarbe(c);
                        
                        
                        
                        
                }
                
                t.weiter();
                
            }
            if(!Kreis)
            {
                
                if(m.istGedrueckt())
                {
                    
                     s.runter();
                     
                }
                else
                {
                    
                     s.hoch();
                     
                }
                
            }
            else
            {
                
                if(m.istGedrueckt())
                {
                    
                    p = s.linienBreite();
                    s.setzeLinienBreite(1);
                    s.zeichneKreis(p);
                    s.setzeLinienBreite(p);
                    
                }
                
            }    

        }
        while(!ESC);
        
        s.gibFrei();
        b.gibFrei();
        m.gibFrei();
        t.gibFrei();
        
    }
    
    public void zeichneEinhorn()
    {
        
        r = (float)(s.linienBreite())/10 +1;
        s.setzeLinienbreite(sd);
        
        s.runter();
        
        s.dreheBis(200);
        s.bewegeUm(5 *r);
        s.dreheBis(130);
        s.bewegeUm(13 *r);
        s.dreheBis(290);
        s.bewegeUm(13 *r);
        s.dreheBis(130);
        s.bewegeUm(13 *r);
        s.dreheBis(290);
        s.bewegeUm(13 *r);
        s.dreheBis(220);
        s.bewegeUm(13 *r);
        s.dreheBis(145);
        s.bewegeUm(40 *r);
        s.dreheBis(315);
        s.bewegeUm(40 *r);
        s.dreheBis(260);
        s.bewegeUm(8 *r);
        s.dreheBis(240);
        s.bewegeUm(28 *r);
        s.dreheBis(260);
        s.bewegeUm(14 *r);
        s.dreheBis(270);
        s.bewegeUm(8 *r);
        s.dreheBis(-20);
        s.bewegeUm(10 *r);
        s.dreheBis(40);
        s.bewegeUm(8 *r);
        s.dreheBis(27);
        s.bewegeUm(28 *r);
        s.dreheBis(16);
        s.bewegeUm(6 *r);
        s.dreheBis(37);
        s.bewegeUm(15 *r);
        
        s.hoch();
        s.dreheBis(160);
        s.bewegeUm(37 *r);
        s.zeichneKreis(4*r);
        s.dreheBis(340);
        s.bewegeUm(37 *r);
        s.runter();
        
        s.dreheBis(-40);
        s.bewegeUm(7 *r);
        s.dreheBis(270);
        s.bewegeUm(7 *r);
        s.dreheBis(260);
        s.bewegeUm(30 *r);
        s.dreheBis(270);
        s.bewegeUm(7 *r);
        s.dreheBis(282);
        s.bewegeUm(30 *r);
        s.dreheBis(260);
        s.bewegeUm(45 *r);
        s.dreheBis(265);
        s.bewegeUm(8 *r);
        s.dreheBis(0);
        s.bewegeUm(12 *r);
        s.dreheBis(85);
        s.bewegeUm(8 *r);
        s.dreheBis(180);
        s.bewegeUm(12 *r);
        s.dreheBis(0);
        s.bewegeUm(12 *r);
        s.dreheBis(77);
        s.bewegeUm(45 *r);
        s.dreheBis(50);
        s.bewegeUm(18 *r);
        s.dreheBis(230);
        s.bewegeUm(11*r);
        s.dreheBis(280);
        s.bewegeUm(19 *r);
        s.dreheBis(260);
        s.bewegeUm(32 *r);
        s.dreheBis(270);
        s.bewegeUm(7 *r);
        s.dreheBis(0);
        s.bewegeUm(12 *r);
        s.dreheBis(90);
        s.bewegeUm(7 *r);
        s.dreheBis(180);
        s.bewegeUm(12 *r);
        s.dreheBis(0);
        s.bewegeUm(12 *r);
        s.dreheBis(75);
        s.bewegeUm(32 *r);
        s.dreheBis(60);
        s.bewegeUm(26 *r);
        s.dreheBis(-6);
        s.bewegeUm(32 *r);
        s.dreheBis(174);
        s.bewegeUm(57 *r);
        s.dreheBis(-6);
        s.bewegeUm(57 *r);
        s.dreheBis(6);
        s.bewegeUm(32 *r);
        s.dreheBis(110);
        s.bewegeUm(14 *r);
        s.dreheBis(290);
        s.bewegeUm(32 *r);
        s.dreheBis(260);
        s.bewegeUm(20 *r);
        s.dreheBis(270);
        s.bewegeUm(23 *r);
        s.dreheBis(0);
        s.bewegeUm(12 *r);
        s.dreheBis(90);
        s.bewegeUm(7 *r);
        s.dreheBis(180);
        s.bewegeUm(12 *r);
        s.dreheBis(0);
        s.bewegeUm(12 *r);
        s.dreheBis(76);
        s.bewegeUm(32 *r);
        s.dreheBis(85);
        s.bewegeUm(32 *r);
        s.dreheBis(265);
        s.bewegeUm(20 *r);
        s.dreheBis(280);
        s.bewegeUm(35 *r);
        s.dreheBis(270);
        s.bewegeUm(15 *r);
        s.dreheBis(0);
        s.bewegeUm(12 *r);
        s.dreheBis(90);
        s.bewegeUm(7 *r);
        s.dreheBis(180);
        s.bewegeUm(12 *r);
        s.dreheBis(0);
        s.bewegeUm(12 *r);
        s.dreheBis(85);
        s.bewegeUm(32 *r);
        s.dreheBis(95);
        s.bewegeUm(32 *r);
        s.dreheBis(85);
        s.bewegeUm(32 *r);
        s.dreheBis(95);
        s.bewegeUm(12 *r);
        s.dreheBis(110);
        s.bewegeUm(4 *r);
        s.dreheBis(130);
        s.bewegeUm(5 *r);
        s.dreheBis(-40);
        s.bewegeUm(12 *r);
        s.dreheBis(280);
        s.bewegeUm(32 *r);
        s.dreheBis(270);
        s.bewegeUm(32 *r);
        s.dreheBis(300);
        s.bewegeUm(11 *r);
        s.dreheBis(6);
        s.bewegeUm(14 *r);
        s.dreheBis(120);
        s.bewegeUm(11 *r);
        s.dreheBis(90);
        s.bewegeUm(29 *r);
        s.dreheBis(100);
        s.bewegeUm(20 *r);
        s.dreheBis(110);
        s.bewegeUm(10 *r);
        s.dreheBis(120);
        s.bewegeUm(14*r);
        s.dreheBis(170);
        s.bewegeUm(12 *r);
        s.dreheBis(160);
        s.bewegeUm(32 *r);
        s.dreheBis(-30);
        s.bewegeUm(17 *r);
        s.dreheBis(-60);
        s.bewegeUm(14 *r);
        s.dreheBis(-90);
        s.bewegeUm(12 *r);
        s.dreheBis(-100);
        s.bewegeUm(30 *r);
        s.dreheBis(-115);
        s.bewegeUm(6 *r);
        s.hoch();
        
        s.dreheBis(100);
        s.bewegeUm(69*r);
        s.runter();
        s.dreheBis(180);
        s.bewegeUm(20*r);
        s.dreheBis(177);
        s.bewegeUm(32 *r);
        
        s.dreheBis(-40);
        s.bewegeUm(12 *r);
        s.dreheBis(165);
        s.bewegeUm(20 *r);
        s.dreheBis(-60);
        s.bewegeUm(12 *r);
        s.dreheBis(155);
        s.bewegeUm(26 *r);
        s.dreheBis(-60);
        s.bewegeUm(12 *r);
        s.dreheBis(155);
        s.bewegeUm(26 *r);
        s.dreheBis(140);
        s.bewegeUm(26 *r);
        s.dreheBis(155);
        s.bewegeUm(26 *r);
        s.dreheBis(120);
        s.bewegeUm(12 *r);
        s.dreheBis(80);
        s.bewegeUm(7*r);
        s.dreheBis(-20);
        s.bewegeUm(26 *r);
        s.dreheBis(-30);
        s.bewegeUm(26 *r);
        s.dreheBis(-20);
        s.bewegeUm(26 *r);
        s.dreheBis(-30);
        s.bewegeUm(26 *r);
        
        s.setzeLinienBreite((int)(10 *r -10));
        s.hoch();
        
    }
    
    public void zeichneNEck(int sl, double n)
    { 
        
        for(int i = 0; i < n; i++)
        {
            s.runter();
            s.bewegeUm(sl);
            s.dreheUm(360/n);
        }
        
    }
    
    public void bewegeEinhorn()
    {
        s.dreheBis(180);
        
       for(int i = b.breite() ; i> 20; i--)
       {
           
           s.bewegeBis(i,m.vPosition());
           zeichneEinhorn();
           
           try
           {
               Thread.sleep(30L);
           }
           catch(Exception e)
           {
               
           }
           b.setzeFarbe(Farbe.WEISS);
           
       }
        
    }
    
}