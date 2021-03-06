import sum.kern.*;
/**
 * @author 
 * @version 
 */
public class Zahlenkugel extends Kugel
{
    // Bezugsobjekte
    private Buntstift buntstift;
    
    private int zFarbe;

    // Attribute

    // Konstruktor
    public Zahlenkugel(
    int pH,
    int pV,
    int pGroesse,
    double pGeschwindigkeit,
    int pRichtung,
    Bildschirm pBildschirm,
    int pFarbe
    )
    {
       super(pH, pV, pGroesse, pGeschwindigkeit, pRichtung, pBildschirm);
       buntstift = new Buntstift();
       
       buntstift.bewegeBis(pH, pV);
       buntstift.setzeFuellmuster(Muster.GEFUELLT);
       buntstift.setzeFarbe(pFarbe);
    }

    // Dienste
    public void zeichne(){
        buntstift.bewegeBis(this.hPosition(), this.vPosition());
        buntstift.zeichneKreis(this.groesse());
        buntstift.schreibeText("8");
    }
    
    public void loesche(){
        buntstift.radiere();
        this.zeichne();
        buntstift.normal();
    }

}
