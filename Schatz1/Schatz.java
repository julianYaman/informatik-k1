
import sum.kern.*;
import sum.werkzeuge.*;
/**
 * @author 
 * @version 
 */
public class Schatz
{
    // Objekte
    Bildschirm derBildschirm;
    Buntstift schatzStift;
    Buntstift meinStift;
    Buntstift meinRadierer;
    Maus dieMaus;
    Rechner meinRechner;

    // Konstruktor
    public Schatz()
    {
        derBildschirm = new Bildschirm(500,500);
        schatzStift = new Buntstift();
        meinStift = new Buntstift();
        meinRadierer = new Buntstift();
        dieMaus = new Maus();
        meinRechner = new Rechner();
    }

    // Dienste
    public void fuehreAus()
    {
        // Verstecken
        schatzStift.setzeFuellmuster(1);
        schatzStift.bewegeBis(meinRechner.ganzeZufallszahl(50, derBildschirm.breite() - 50),
                            meinRechner.ganzeZufallszahl(50, derBildschirm.hoehe() - 50));
        schatzStift.setzeFarbe(Farbe.WEISS);
        schatzStift.zeichneKreis(5);
        //Radierer Einstellungen
        meinRadierer.setzeFuellmuster(1);
        meinRadierer.setzeFarbe(Farbe.WEISS);
      
        
     
      do{
            
            while(!dieMaus.istGedrueckt()); //<---Unterbrecher
            meinStift.bewegeBis(25,25);
            //Schreibe
            meinStift.normal();
            meinStift.schreibeZahl(meinRechner.wurzel(
            meinRechner.quadrat(dieMaus.hPosition() -
            schatzStift.hPosition())
            + meinRechner.quadrat(dieMaus.vPosition() -
            schatzStift.vPosition())));
            
            while(dieMaus.istGedrueckt()); //<---Unterbrecher
            
        
            //Radiere
            meinRadierer.zeichneRechteck(250,30);
            meinRadierer.bewegeBis(0,0);
            
        
      }while (!dieMaus.doppelKlick() && meinRechner.wurzel(
              meinRechner.quadrat(dieMaus.hPosition()
              - schatzStift.hPosition())
              + meinRechner.quadrat(dieMaus.vPosition()
              - schatzStift.vPosition())) >= 20);
        schatzStift.setzeFarbe(Farbe.GELB);
        schatzStift.zeichneKreis(5);
        
        
        
        // Aufraeumen
        schatzStift.gibFrei();
        meinStift.gibFrei();
        meinRadierer.gibFrei();
        derBildschirm.gibFrei();
        meinRechner.gibFrei();
        dieMaus.gibFrei();
    }
}