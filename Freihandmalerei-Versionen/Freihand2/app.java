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
        do{
            if(maus.istGedrueckt()){
   
                stift.bewegeBis(maus.hPosition(), maus.vPosition());
                stift.zeichneKreis(3);
            }
        }while(!maus.doppelKlick());
        
        stift.gibFrei();
        bildschirm.gibFrei();
        maus.gibFrei();
        
    }
}
