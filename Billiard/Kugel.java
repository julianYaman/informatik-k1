import sum.kern.*;
/**
 * @author 
 * @version 
 */
public class Kugel
{
    // Bezugsobjekte
    Buntstift stift;

    // Attribute

    // Konstruktor
    public Kugel()
    {
        
        stift = new Buntstift();
        
        stift.hoch();
        stift.bewegeBis(40,40);
    }

    // Startkoordinate
    

    // Dienste
    
    // Zeichnung
    public void zeichne(){
        stift.zeichneKreis(5);
    }
    
    // gibFrei
    public void gibFrei(){
        stift.gibFrei();
    }
    
    // Movement
    public void bewege(){
        this.loesche();
        stift.bewegeUm(0.1);
        this.zeichne();
  
    }
    
    // Deleting kugel
    public void loesche(){
        stift.radiere();
        this.zeichne();
        stift.normal();
    }
    
    /**
     * @return horizontale position
     */
    public double hPosition(){
        return stift.hPosition();
    }
    
    /**
     * @return vertikale position
     */
    public double vPosition(){
        return stift.vPosition();
    }
    
    /**
     * die richtung der Kugel wird geändert
     * @param double pRichtung - Richtung 
     */
    public void setzeRichtung(double pRichtung){
        stift.dreheBis(pRichtung);
    }
    
    /**
     * Liefert zurück ob die Kugel den linken Rand überschritten hat
     * @return true, wenn der Rand überschritten wurde
     */
    private boolean amLinkenRand(){
        if(this.hPosition() < 800 + 5){ // linker rand + radius
            System.out.println(this.hPosition() + " - linker rand -> true");
            return true;
        }else{
            return false;
        }
    }
    
    /**
     * Liefert zurück ob die Kugel den rechten Rand überschritten hat
     * @return true, wenn der Rand überschritten wurde
     */
    private boolean amRechtenRand(){
        if(this.hPosition() < 0 - 5){ // linker rand + radius
            System.out.println(this.hPosition() + " - linker rand -> true");
            return true;
        }else{
            return false;
        }
    }
    
    
    
}
