
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
        meinStift.zeichneKreis(10);
        meinStift.zeichneKreis(40);
        meinStift.zeichneKreis(70);
        meinStift.zeichneKreis(100);
        
        // Drawing arrow
        meinStift.bewegeBis(20,300);
        meinStift.dreheBis(35);
        meinStift.runter();
        meinStift.bewegeUm(55);
        meinStift.zeichneKreis(5);
        
        do{
            // Deleting arrow
            meinStift.radiere();
            meinStift.zeichneKreis(5);
            meinStift.bewegeUm(-55);
            meinStift.normal();
            // Movement
            meinStift.hoch();
            meinStift.bewegeUm(0.009);
            // Drawing again
            meinStift.runter();
            meinStift.bewegeUm(55);
            meinStift.zeichneKreis(5);
        }while((meinStift.hPosition()) < 800);
        
        meinStift.gibFrei();
        derBildschirm.gibFrei();
        
    }

}