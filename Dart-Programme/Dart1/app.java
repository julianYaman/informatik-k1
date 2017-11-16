
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

    // Konstruktor
    public app()
    {
        derBildschirm = new Bildschirm(0,0,1024,768);
        meinStift = new Buntstift();
    }

    // Dienste
    public void fuehreAus()
    {
        // Aktionsteil
	    
        meinStift.bewegeBis(800,120);
        meinStift.zeichneKreis(10);
        meinStift.zeichneKreis(40);
        meinStift.zeichneKreis(70);
        meinStift.zeichneKreis(100);
        
        // Pfeil
        meinStift.bewegeBis(20,60);
        meinStift.runter();
        meinStift.dreheUm(35);
        meinStift.bewegeUm(55);
        meinStift.zeichneKreis(5);
        
    }
}