import sum.kern.*;
/**
 * @author @julianYaman <julianyaman@gmx.de>
 * @version 1.0.0
 */
public class programm   
{
    // Objects
    Bildschirm bildschirm;
    Stift stift;

    // Attribute

    // Konstruktor
    public programm()
    {
        bildschirm = new Bildschirm(500,500);
        stift = new Stift();
        
        System.out.println("Creating programm...");
    }

    // Methods
    public void draw()
    {
        
        System.out.println("Drawing...");
        
        stift.bewegeBis(80,80);
        
        // TODO: Finish project lol
        
        // drawing triangle
        stift.runter();
        stift.dreheBis(-60);
        stift.bewegeUm(100);
        stift.dreheBis(-180);
        stift.bewegeUm(100);
        stift.dreheBis(60);
        stift.bewegeUm(100);
        
        stift.hoch();
        
        // drawing rectangle
        stift.bewegeBis(190,80);
        stift.runter();
        stift.zeichneRechteck(90,90);
        
        stift.hoch();
        
        // drawing fünfeck (englisch gut)
        stift.dreheBis(0);
        stift.bewegeBis(400,170);
        stift.runter();
        stift.dreheUm(72);
        stift.bewegeUm(60);
        stift.dreheUm(72);
        stift.bewegeUm(60);
        stift.dreheUm(72);
        stift.bewegeUm(60);
        stift.dreheUm(72);
        stift.bewegeUm(60);
        stift.dreheUm(72);
        stift.bewegeUm(60);
        
        stift.hoch();
        
        // drawing pentagramm
        
        stift.bewegeBis(80,300);
        stift.runter();
        stift.dreheBis(72);
        stift.bewegeUm(100);
        stift.dreheBis(216);
        stift.bewegeUm(100);
        stift.dreheBis(0);
        stift.bewegeUm(100);
        stift.dreheBis(144);
        stift.bewegeUm(100);
        stift.dreheBis(-72);
        stift.bewegeUm(100);
        
        
        stift.hoch();

        stift.dreheBis(0);
                
        // drawing another thing
        stift.bewegeBis(235,200);
        stift.runter();
        stift.bewegeBis(235,310);
        stift.hoch();
        stift.bewegeBis(290,255);
        stift.runter();
        stift.bewegeBis(180,255);
        stift.hoch();
        stift.bewegeBis(290,200);
        stift.runter();
        stift.bewegeBis(180,310);
        stift.hoch();
        stift.bewegeBis(180,200);
        stift.runter();
        stift.bewegeBis(290,310);
        
        stift.hoch();
        
        // drawing circle
        
        stift.bewegeBis(370,255);
        stift.zeichneKreis(55);
    }

}
