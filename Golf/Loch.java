import sum.kern.*;
import sum.werkzeuge.*;
/**
 * @author 
 * @version 
 */
public class Loch
{
    // Bezugsobjekte
    private Rechner rechner;
    
    private Buntstift stift;
    
    private Bildschirm bildschirm;
    

    // Attribute

    // Konstruktor
    public Loch(Bildschirm pBildschirm)
    {
        rechner = new Rechner();
        stift = new Buntstift();
        
        bildschirm = pBildschirm;
    }

    // Dienste
    public void init(){
        stift.bewegeBis(rechner.ganzeZufallszahl(10, bildschirm.breite() - 10), rechner.ganzeZufallszahl(10, bildschirm.hoehe() - 10));
        stift.zeichneKreis(7);
    }
    
    public void gibFrei(){
        stift.gibFrei();
        rechner.gibFrei();
    }
    
    public double hPosition(){
        return stift.hPosition();
    }
    
    public double vPosition(){
        return stift.vPosition();
    }
    

}
