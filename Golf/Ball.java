import sum.kern.*;
import sum.werkzeuge.*;
/**
 * @author 
 * @version 
 */
public class Ball
{
    
    
    private double zGeschwindigkeit;
    
    private Bildschirm zBildschirm;
    
    private Buntstift stift;
    
    private Loch zLoch;
    
    private Maus zMaus;
    private Rechner rechner;
    
    // Konstruktor
    public Ball(Maus maus, Bildschirm bildschirm, Loch loch)
    {
        zMaus = maus;
        rechner = new Rechner();
        
        stift = new Buntstift();
        
        zLoch = loch;
        
        zGeschwindigkeit = 0;
        
        zBildschirm = bildschirm;
    }

    // Dienste
    public void init(){
        stift.setzeFuellmuster(Muster.GEFUELLT);
        stift.setzeFarbe(Farbe.SCHWARZ);
        
        stift.bewegeBis(rechner.ganzeZufallszahl(10, zBildschirm.breite() - 10), rechner.ganzeZufallszahl(10, zBildschirm.hoehe() - 10));
        stift.zeichneKreis(5);
    }
    
    public void abschlag(){
        zGeschwindigkeit = this.abstandZurMaus() * 0.002;
        stift.dreheZu(zMaus.hPosition(), zMaus.vPosition());
        stift.dreheUm(180);
    }           
    
    public void gibFrei(){
    
    }
    
    public double geschwindigkeit(){
        return zGeschwindigkeit;
    }
    
    private void bewege(){
        this.loesche();
        hatStift.bewegeUm(zGeschwindigkeit);
        this.zeichne();
        this.bremse();
        if (this.abstandLoch() < 2 && zGeschwindigkeit < 0.05){
            zGeschwindigkeit = 0;
        }
    }
    
    private void zeichne(){
        
    }
    
    private void loesche(){
    
    }
    
    private boolean getroffen(){
        return this.abstandLoch() > 2;
    }
    
    private double abstandLoch(){
        return rechner.wurzel(rechner.quadrat(zLoch.hPosition() 
        - stift.hPosition()) + rechner.quadrat(zLoch.vPosition() 
        - stift.vPosition()));
    }
    
    private double abstandZurMaus(){
            return rechner.wurzel(rechner.quadrat(zMaus.hPosition() 
        - stift.hPosition()) + rechner.quadrat(zMaus.vPosition() 
        - stift.vPosition()));
    }
    

}
