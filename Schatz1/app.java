
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
    Buntstift schatzStift;
    Buntstift schreibStift;
    Maus dieMaus;
    Tastatur dieTastatur;
    Rechner meinRechner;

    // Konstruktor
    public app()
    {
        derBildschirm = new Bildschirm(700,700);
        schatzStift = new Buntstift();
        schreibStift = new Buntstift();
        dieMaus = new Maus();
        dieTastatur = new Tastatur();
        meinRechner = new Rechner();
    }

    // Dienste
    public void fuehreAus()
    {
        // Aktionsteil
        schatzStift.bewegeBis(meinRechner.ganzeZufallszahl(0, 700),meinRechner.ganzeZufallszahl(0, 700));
        schatzStift.setzeFuellmuster(Muster.GEFUELLT);
        schatzStift.zeichneKreis(15);
        
        schreibStift.bewegeBis(20,20);
        schreibStift.schreibeZahl(
            meinRechner.wurzel(
                meinRechner.quadrat(dieMaus.hPosition() - schatzStift.hPosition()) +
                meinRechner.quadrat(dieMaus.vPosition() - schatzStift.vPosition())
            )
        );
        
    }
}