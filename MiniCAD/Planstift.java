import sum.kern.*;
/**
 * @author 
 * @version 
 */
public class Planstift extends Stift
{
    // Bezugsobjekte
    
    // Attribute

    // Konstruktor
    public Planstift()
    {
        super();
    }

    // Dienste
    
    public void zeichneWand(){
        this.runter();
        this.bewegeUm(25);
        this.bewegeUm(-25);
        
        this.hoch();
        this.dreheUm(-90);
        this.bewegeUm(6);
        
        this.runter();
        this.dreheUm(90);
        this.bewegeUm(25);
        
        this.hoch();
        this.dreheUm(90);
        this.bewegeUm(6);
        
        this.dreheUm(-90);
    }
    
    public void zeichneFenster(){
        this.runter();
        this.dreheUm(-90);
        this.bewegeUm(6);
        
        this.bewegeUm(-3);
        
        this.dreheUm(90);
        this.bewegeUm(25);
        
        this.dreheUm(-90);
        this.bewegeUm(3);
        this.bewegeUm(-6);
        
        this.hoch();
        this.dreheUm(90);
        
    }
    
    public void zeichneTuer(){
        this.runter();
        this.dreheUm(-90);
        this.bewegeUm(6);
        
        this.bewegeUm(-3);
        this.dreheUm(65);
        this.bewegeUm(25);
        
        this.hoch();
        this.bewegeUm(-25);
        this.dreheUm(25);
        
        this.bewegeUm(25);
        
        this.dreheUm(-90);
        this.bewegeUm(-3);
        this.runter();
        this.bewegeUm(6);
        this.bewegeUm(-6);
        
        this.hoch();
        this.dreheUm(90);
    }
    
    public void zeichneEckeLinks(){
        this.hoch();
        this.dreheUm(-90);
        this.bewegeUm(6);
        
        this.dreheUm(90);
        
        this.runter();
        this.bewegeUm(6);
        
        this.dreheUm(90);
        this.bewegeUm(6);
        
        this.hoch();
        this.dreheUm(90);
        this.bewegeUm(6);
        
        this.dreheUm(-90);
    }
  
    public void zeichneEckeRechts(){
        this.hoch();
        
        this.runter();
        this.bewegeUm(6);
        
        this.dreheUm(-90);
        
        this.bewegeUm(6);
        
        this.hoch();
    }

}
