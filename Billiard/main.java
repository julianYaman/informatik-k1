
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
    Kugel kugel1;
    Kugel kugel2;
    Kugel kugel3;
    
    Maus dieMaus;
    Tastatur dieTastatur;
    Buntstift derStift;
    
    private int startPositionStiftX = 40;
    private int startPositionStiftY = 40;
    private int xRechteck = 500;
    private int yRechteck = 300;
    
    private int linkerRand = startPositionStiftX;
    private int rechterRand = startPositionStiftX + xRechteck;
    private int obererRand = startPositionStiftY;
    private int untererRand = startPositionStiftY + yRechteck;
    
    // Konstruktor
    public main()
    {
        derBildschirm = new Bildschirm(800,800);
        kugel1 = new Kugel(80,80,5,0.5,100, 
        linkerRand, rechterRand, obererRand, untererRand);
        kugel2 = new Kugel(50,120, 7, 0.3, 0, 
        linkerRand, rechterRand, obererRand, untererRand);
        kugel3 = new Kugel(100,160, 7, 0.3, 0,
        linkerRand, rechterRand, obererRand, untererRand);
        dieMaus = new Maus();
        dieTastatur = new Tastatur();
        derStift = new Buntstift();
    }

    // Dienste
    public void fuehreAus()
    {
        
        derStift.bewegeBis(startPositionStiftX,startPositionStiftY);
        
        derStift.zeichneRechteck(xRechteck,yRechteck);
        
       
        // Aktionsteil
        do{
            kugel1.bewege();
            kugel2.bewege();
            kugel3.bewege();
        }while(!dieMaus.doppelKlick());  
        
        // Aufraeumen
        kugel1.gibFrei();
        kugel2.gibFrei();
        kugel3.gibFrei();
        derBildschirm.gibFrei();
        dieMaus.gibFrei();
        dieTastatur.gibFrei();
    }
}