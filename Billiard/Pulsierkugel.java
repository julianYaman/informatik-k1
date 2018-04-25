import sum.kern.*;
/**
 * @author 
 * @version 
 */
public class Pulsierkugel extends Kugel
{
    // Bezugsobjekte
    
    private int zMinGroesse;
    private int zMaxGroesse;
    private boolean zWaechst;
    
    // Attribute

    // Konstruktor
    public Pulsierkugel(
    int pH,
    int pV,
    int pGroesse,
    double pGeschwindigkeit,
    int pRichtung,
    Bildschirm pBildschirm,
    int pMinGroesse,
    int pMaxGroesse
    )
    {
        super(pH, pV, pGroesse, pGeschwindigkeit, pRichtung, pBildschirm);
        zMinGroesse = pMinGroesse;
        zMaxGroesse = pMaxGroesse;
    }

    // Dienste
    
    public void bewege(){
        this.loesche();
        this.pulsiere();
        super.bewege();
    }
    
    
    private void pulsiere(){
        
        if(zWaechst){
            this.setzeGroesse(this.groesse() + 1);
        }else{
            this.setzeGroesse(this.groesse() - 1);
        }
        
        if(this.groesse() < zMinGroesse || this.groesse() > zMaxGroesse){
            zWaechst = !zWaechst;
        }
        
    }

}
