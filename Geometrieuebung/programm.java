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
        stift.bewegeBis(140,170);
        stift.bewegeBis(20,170);
        stift.bewegeBis(80,80);
        
        stift.hoch();
        
        // drawing rectangle
        stift.bewegeBis(190,80);
        stift.runter();
        stift.zeichneRechteck(90,90);
        
        stift.hoch();
        
        // drawing fünfeck (englisch gut)
        // TODO: finishing fünfeck 
        stift.bewegeBis(370,80);
        stift.runter();
        stift.bewegeBis(415,110);
        stift.bewegeBis(400,170);
        stift.bewegeBis(340,170);
        stift.bewegeBis(325,110);
        stift.bewegeBis(370,80);
        
        stift.hoch();
        
        // drawing pentagram
        stift.bewegeBis(40,200);
        stift.runter();
        stift.bewegeBis(140,275);
        stift.bewegeBis(20,275);
        stift.bewegeBis(120,200);
        stift.bewegeBis(80,310);
        stift.bewegeBis(40,200);
        
        stift.hoch();
        
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
