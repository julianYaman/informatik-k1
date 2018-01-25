
import sum.kern.*;
/**
 * @author 
 * @version 
 */
public class main
{
    // Objekte
    Bildschirm derBildschirm;
    Kugel kugel;
    Maus dieMaus;
    Tastatur dieTastatur;
    
    // Konstruktor
    public main()
    {
        derBildschirm = new Bildschirm(800,800);
        kugel = new Kugel();
        dieMaus = new Maus();
        dieTastatur = new Tastatur();
    }

    // Dienste
    public void fuehreAus()
    {
        // Aktionsteil
        do{
            kugel.bewege();
        }while(!dieMaus.doppelKlick());  
        
        // Aufraeumen
        kugel.gibFrei();
        derBildschirm.gibFrei();
        dieMaus.gibFrei();
        dieTastatur.gibFrei();
    }
}