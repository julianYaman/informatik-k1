
import sum.kern.*;
/**
 * @author 
 * @version 
 */
public class app 
{
    // Objekte
    Bildschirm derBildschirm;
    Buntstift meinStift;
    Tastatur dieTastatur;
    Maus dieMaus;
   
    int fps;
   

    // Konstruktor
    public app()
    {
        derBildschirm = new Bildschirm(0,0,1024,768);
        meinStift = new Buntstift();
        dieTastatur = new Tastatur();
        dieMaus = new Maus();
    }

    // Dienste
    public void fuehreAus()
    {
       
        
        // Aktionsteil
        
        meinStift.bewegeBis(800,120);
        meinStift.setzeFuellMuster(1);
        meinStift.setzeFarbe(Farbe.PINK);
        meinStift.zeichneKreis(100);
        meinStift.setzeFarbe(Farbe.MAGENTA);
        meinStift.zeichneKreis(70);
        meinStift.setzeFarbe(Farbe.BLAU);
        meinStift.zeichneKreis(40);
        meinStift.setzeFarbe(Farbe.GRUEN);
        meinStift.zeichneKreis(10);
        
        meinStift.setzeFarbe(Farbe.SCHWARZ);
        
        
        // Drawing arrow
        meinStift.bewegeBis(20,200);
        meinStift.dreheBis(35);
        meinStift.runter();
        meinStift.bewegeUm(55);
        meinStift.zeichneKreis(3);
        
        while(!dieMaus.istGedrueckt()){
            
            long fpsBefore = System.nanoTime();
            
            // Deleting arrow
            meinStift.radiere();
            meinStift.zeichneKreis(3);
            meinStift.bewegeUm(-55);
            meinStift.normal();
            
            // Vertical movement
            meinStift.hoch();
            meinStift.bewegeBis(meinStift.hPosition(), meinStift.vPosition() + 0.2 );
            
            // Draw arrow
            meinStift.runter();
            meinStift.bewegeUm(55);
            meinStift.zeichneKreis(3);
            
            fps = (int)(1000000000 / (System.nanoTime() - fpsBefore)); 
            
            System.out.println(fps);
            
            if(meinStift.vPosition() >= derBildschirm.hoehe()){
                meinStift.radiere();
                meinStift.zeichneKreis(3);
                meinStift.bewegeUm(-55);
                meinStift.normal();
                
                meinStift.hoch();
                
                meinStift.bewegeBis(20,200);
                meinStift.dreheBis(35);
                meinStift.runter();
                meinStift.bewegeUm(55);
                meinStift.zeichneKreis(3);
            }
            
        }
        // Rotating arrow
        do{
            long fpsBefore = System.nanoTime();
            
            // Deleting arrow
            meinStift.radiere();
            meinStift.zeichneKreis(3);
            meinStift.bewegeUm(-55);
            
            meinStift.normal();
            // rotate arrow
            meinStift.dreheUm(2);
           
            fps = (int)(1000000000 / (System.nanoTime() - fpsBefore)); 
            
            System.out.println(fps);
            
            // Draw new arrow
            meinStift.bewegeUm(55);
            meinStift.zeichneKreis(3);
            
            try{
                Thread.sleep(20);
            }catch(Exception e){
                System.out.println(e);
            }
            
        }while(dieMaus.istGedrueckt());
        do{
            long fpsBefore = System.nanoTime();
            
            // Deleting arrow
            meinStift.radiere();
            meinStift.zeichneKreis(3);
            meinStift.bewegeUm(-55);
            meinStift.normal();
            
            // Movement
            meinStift.hoch();
            meinStift.bewegeUm(3);
            
            if(dieTastatur.wurdeGedrueckt()){
            
                if(dieTastatur.zeichen() == 'a'){
                    meinStift.dreheUm(-4);            
                }else if(dieTastatur.zeichen() == 'd'){
                    meinStift.dreheUm(4);
                }
                
                dieTastatur.weiter();
                
            }
           
            fps = (int)(1000000000 / (System.nanoTime() - fpsBefore)); 
            
            System.out.println(fps);
            
            // Drawing again
            meinStift.runter();
            meinStift.bewegeUm(55);
            meinStift.zeichneKreis(3);
            
            try{
                Thread.sleep(20);
            }catch(Exception e){
                System.out.println(e);
            }
            
        }while(meinStift.hPosition() < 800);
        
        // Trefferabfrage
        if(meinStift.vPosition() >= 20 && meinStift.vPosition() <= 240){
            meinStift.hoch();
            meinStift.bewegeBis(400,400);
            meinStift.schreibeText("Getroffen");
        }else{
            meinStift.hoch();
            meinStift.bewegeBis(400,400);
            meinStift.schreibeText("no hit");  
        }
        
        meinStift.gibFrei();
        derBildschirm.gibFrei();
        
    }
    
}