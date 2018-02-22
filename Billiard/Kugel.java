import sum.kern.*;
/**
 * @author 
 * @version 
 */
public class Kugel
{
    // Bezugsobjekte
    private Buntstift stift;
    private int zGroesse;
    private int zRichtung;
    private double zGeschwindigkeit;
    private Bildschirm kenntBildschirm;
    
    // Attribute

    // Konstruktor
    public Kugel(
    int pH, 
    int pV, 
    int pGroesse, 
    double pGeschwindigkeit,
    double pRichtung,
    Bildschirm pBildschirm)
    {
        
        stift = new Buntstift();
        
        stift.bewegeBis(pH,pV);
        stift.dreheBis(pRichtung);
        
        zGroesse = pGroesse;
        
        zGeschwindigkeit = pGeschwindigkeit;
        
        kenntBildschirm = pBildschirm;
    }

    // Startkoordinate
    

    // Dienste
    
    // Zeichnung
    public void zeichne(){
        stift.zeichneKreis(zGroesse);
    }
    
    // gibFrei
    public void gibFrei(){
        stift.gibFrei();
    }
    
    // Movement
    public void bewege(){
        this.loesche();
        stift.bewegeUm(zGeschwindigkeit);
        this.zeichne();
  
        if(this.amLinkenRand() || this.amRechtenRand() ){
            this.setzeRichtung(180 - this.winkel());
        }else if(this.amOberenRand() || this.amUnterenRand() ){
            this.setzeRichtung(360 - this.winkel());
        }
        
        //System.out.println(zLinkerRand + " - " + zRechterRand);
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
    public void setzeRichtung(double richtung){
        stift.dreheBis(richtung);
    }
    
    /**
     * Liefert zurück ob die Kugel den linken Rand überschritten hat
     * @return true, wenn der Rand überschritten wurde
     */
    private boolean amLinkenRand(){
        // System.out.println("Linker Rand");
        return this.hPosition() < 0 + zGroesse + 1;
    }
    
    /**
     * Liefert zurück ob die Kugel den rechten Rand überschritten hat
     * @return true, wenn der Rand überschritten wurde
     */
    private boolean amRechtenRand(){
        // System.out.println("Rechter Rand");
        return this.hPosition() > kenntBildschirm.breite() - zGroesse - 1;
        
    }
    
    /**
     * Liefert zurück ob die Kugel den oberer Rand überschritten hat
     * @return true, wenn der Rand überschritten wurde
     */
    private boolean amOberenRand(){
        return this.vPosition() < 0 + zGroesse + 1; // oberer rand + radius
    }    
    
    /**
     * Liefert zurück ob die Kugel den rechten Rand überschritten hat
     * @return true, wenn der Rand überschritten wurde
     */
    private boolean amUnterenRand(){
        return this.vPosition() > kenntBildschirm.hoehe() - zGroesse -1; // unterer rand + radius
    }
    
    /**
     * Returned die Größe des Balles
     * @return zGroesse - Groesse des Balles
     */
    public int groesse(){
        return zGroesse;
    }
    
    /**
     * Funktion um die Größe des Balles zu setzen
     */
    public void setzeGroesse(int pGroesse){
        zGroesse = pGroesse;
    }
        
    /**
     * Returned die Geschwindigkeit des Balles
     * @return zGeschwindigkeit - Geschwindigkeit des Balles
     */
    public double geschwindigkeit(){
        return zGeschwindigkeit;
    }
    
    /**
     * Funktion um die Geschwindigkeit des Balles zu setzen
     */
    public void setzeGeschwindigkeit(double pGeschwindigkeit){
        zGeschwindigkeit = pGeschwindigkeit;
    }
    
    /**
     * Winkel return
     * @return Winkel
     */
    public double winkel(){
        return stift.winkel();
    }
    
}
