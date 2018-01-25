
import sum.kern.*;
/**
 * @author 
 * @version 
 */
public class app
{
    // Objekte
    Bildschirm derBildschirm;
    Planstift meinStift;
    Tastatur dieTastatur;    
    Maus dieMaus;
    
    // Konstruktor
    public app()
    {
        derBildschirm = new Bildschirm(800, 800);
        meinStift = new Planstift();
        dieTastatur = new Tastatur();
        dieMaus = new Maus();
    }

    // Dienste
    public void fuehreAus()
    {
        
        meinStift.bewegeBis(100,400);
        
        do{
            if(dieTastatur.wurdeGedrueckt()){
                switch(dieTastatur.zeichen()){
                    case 'w':
                        meinStift.zeichneWand();
                        break;
                    case 'f':
                        meinStift.zeichneFenster();
                        break;
                    case 't':
                        meinStift.zeichneTuer();
                        break;
                    case 'l':
                        meinStift.zeichneEckeLinks();
                        break;
                    case 'r':
                        meinStift.zeichneEckeRechts();
                        break;
                    }
                
                dieTastatur.weiter();
            }
        }while(!dieMaus.doppelKlick());

        // Aufraeumen
        meinStift.gibFrei();
        derBildschirm.gibFrei();
    }
}