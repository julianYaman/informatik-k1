
import sum.kern.*;
/**
 * @author 
 * @version 
 */
public class main
{
    // Objekte
    Bildschirm derBildschirm;
    
    // Kugeln
    // Kugel kugel1;
    Kugel kugel2;
    Kugel kugel3;
    Reibungskugel kugel4;
    
    Maus dieMaus;
    Tastatur dieTastatur;
    Buntstift derStift;
    
    
    // Konstruktor
    public main()
    {
        derBildschirm = new Bildschirm(800,800);
        kugel2 = new Kugel(50,120, 7, 0.3, 0, derBildschirm);
        kugel3 = new Kugel(100,160, 7, 0.3, 0, derBildschirm);
        kugel4 = new Reibungskugel(140, 140, 7, 0.1, 85, derBildschirm);
        dieMaus = new Maus();
        dieTastatur = new Tastatur();
        derStift = new Buntstift();
    }

    // Dienste
    public void fuehreAus()
    {
        
       
        // Aktionsteil
        do{
            kugel2.bewege();
            kugel3.bewege();
            kugel4.bewege();
        }while(!dieMaus.doppelKlick());  
        
        // Aufraeumen
        kugel2.gibFrei();
        kugel3.gibFrei();
        derBildschirm.gibFrei();
        dieMaus.gibFrei();
        dieTastatur.gibFrei();
    }
}