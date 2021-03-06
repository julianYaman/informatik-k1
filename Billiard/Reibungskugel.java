import sum.kern.*;
/**
 * @author 
 * @version 
 */
public class Reibungskugel extends Kugel
{

    // Konstruktor
    public Reibungskugel(
    int pH, 
    int pV, 
    int pGroesse, 
    double pGeschwindigkeit,
    double pRichtung,
    Bildschirm pBildschirm)
    {
       super(pH, pV, pGroesse, pGeschwindigkeit, pRichtung, pBildschirm);
    }

    // Dienste
    public void bewege(){
        this.bremse();
        super.bewege();
    }
    
    private void bremse(){
        this.setzeGeschwindigkeit(this.geschwindigkeit() * 0.99);
    }
    
}
