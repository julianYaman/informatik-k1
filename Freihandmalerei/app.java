import sum.kern.*;
/**
 * @author 
 * @version 
 */
public class app
{
    // Bezugsobjekte
    Stift stift;
    Bildschirm bildschirm;
    Maus maus;

    // Konstruktor
    public app()
    {
        bildschirm = new Bildschirm(500,500);
        maus = new Maus();
        stift = new Stift();
    }

    // Dienste
    public void draw(){
        stift.bewegeBis(maus.hPosition(), maus.vPosition());
        stift.runter();
        do{
            if(maus.istGedrueckt()){
                stift.bewegeBis(maus.hPosition(), maus.vPosition());
            }
        }while(!maus.doppelKlick());
    }
}
