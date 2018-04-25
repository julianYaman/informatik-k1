import sum.kern.*;
/**
 * @author 
 * @version 
 */
public class main
{
    // Bezugsobjekte
    
    Maus maus;
    Bildschirm bildschirm;
    Ball ball;
    Loch loch;
    
    // Attribute

    // Konstruktor
    public main()
    {
        maus = new Maus();
        bildschirm = new Bildschirm(500, 500);
        
        loch = new Loch(bildschirm);
        ball = new Ball(maus, bildschirm, loch);
    }

    // Dienste
    public void fuehreAus(){
        
        ball.init();
        loch.init();
        
    
        do{
        
        }while(!maus.istGedrueckt());
        
        do{
            ball.abschlag();
        }while(true);
        
        // maus.gibFrei();
        
    }
   

}
