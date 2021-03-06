
import sum.kern.*;
import sum.werkzeuge.*;

/**
 * @author 
 * @version 
 */
public class app
{
    // Objekte
    Bildschirm derBildschirm;
    Buntstift meinStift;
    Rechner meinRechner;
    

    // Konstruktor
    public app()
    {
        derBildschirm = new Bildschirm(700,700);
        meinStift = new Buntstift();
        meinRechner = new Rechner();
    }

    // Dienste
    public void fuehreAus()
    {
        do{
            meinStift.setzeFarbe(meinRechner.ganzeZufallszahl(0, 13));
            meinStift.hoch();
            meinStift.bewegeUm(meinRechner.ganzeZufallszahl(10, 50));
            meinStift.dreheUm(meinRechner.ganzeZufallszahl(10, 50));
            
            meinStift.setzeLinienbreite(meinRechner.ganzeZufallszahl(1, 10));
            
            if(meinStift.vPosition() > derBildschirm.hoehe() || meinStift.hPosition() > derBildschirm.breite()){
                meinStift.bewegeBis(350,350);
            }
            meinStift.runter();
            meinStift.bewegeUm(meinRechner.ganzeZufallszahl(10, 50));
            meinStift.dreheUm(meinRechner.ganzeZufallszahl(10, 50));
        }while(true);
    }
}