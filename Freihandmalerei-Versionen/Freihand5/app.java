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
    Tastatur dieTastatur;

    // Konstruktor
    public app()
    {
        derBildschirm = new Bildschirm(500,500);
        derMaus = new Maus();
        derStift = new Stift();
        dieTastatur = new Tastatur();
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
            
            if(dieTastatur.wurdeGedrueckt()){
                derStift.radiere();
            }
            
        }while(!derMaus.doppelKlick());
        
        derStift.gibFrei();
        derBildschirm.gibFrei();
        derMaus.gibFrei();
        
    }
}
