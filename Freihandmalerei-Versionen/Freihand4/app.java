import sum.kern.*;
/**
 * @author 
 * @version 
 */
public class app
{
    // Bezugsobjekte
    Stift derStift;
    Bildschirm derBildschirm;
    Maus derMaus;

    // Konstruktor
    public app()
    {
        derBildschirm = new Bildschirm(500,500);
        derMaus = new Maus();
        derStift = new Stift();
    }

    // Dienste
    public void draw(){
        do{
            
            if(derMaus.istGedrueckt()){
                derStift.bewegeBis(derMaus.hPosition(), derMaus.vPosition());
                derStift.runter();
            }else{
                derStift.hoch();
            }
            
        }while(!derMaus.doppelKlick());
        
        derStift.gibFrei();
        derBildschirm.gibFrei();
        derMaus.gibFrei();
        
    }
}
