import sum.kern.*;
import sum.werkzeuge.*;

/**
 * @author 
 * @version 
 */
public class app
{
    // Bezugsobjekte
    Bildschirm derBildschirm;
    Maus dieMaus;
    Buntstift derStift;
    Tastatur dieTastatur;
    Rechner meinRechner;
    // Attribute

    // Konstruktor
    public app()
    {
        derBildschirm = new Bildschirm(700,700);
        dieMaus = new Maus();
        derStift = new Buntstift();
        dieTastatur = new Tastatur();
        meinRechner = new Rechner();
    }

    // Dienste
    public void fuehreAus(){
        derStift.bewegeBis(
            meinRechner.ganzeZufallszahl(0, derBildschirm.breite()),
            meinRechner.ganzeZufallszahl(0, derBildschirm.hoehe())
        );
        derStift.setzeFuellmuster(Muster.GEFUELLT);
        derStift.setzeFarbe(meinRechner.ganzeZufallszahl(0, 13));
        derStift.zeichneKreis(5);
        
    }

}
