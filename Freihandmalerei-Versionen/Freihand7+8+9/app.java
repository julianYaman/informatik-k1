import sum.kern.*;
/**
 * @author 
 * @version 
 */
public class app
{
    // Bezugsobjekte
    Buntstift derStift;
    Bildschirm derBildschirm;
    Maus dieMaus;
    Tastatur dieTastatur;

    // Konstruktor
    public app()
    {
        derBildschirm = new Bildschirm(500,500);
        dieMaus = new Maus();
        derStift = new Buntstift();
        dieTastatur = new Tastatur();
    }

    // Dienste
    public void draw(){
        do{

            
            if(dieTastatur.wurdeGedrueckt()){
                switch(dieTastatur.zeichen()){
                    case 'r':
                        derStift.setzeFarbe(Farbe.ROT);
                        break;
                    case 'g':
                        derStift.setzeFarbe(Farbe.GRUEN);
                        break;
                    case 'b':
                        derStift.setzeFarbe(Farbe.BLAU);
                        break;
                    case 'y':
                        derStift.setzeFarbe(Farbe.GELB);
                        break;
                    case 'm':
                        derStift.setzeFarbe(Farbe.MAGENTA);
                        break;
                    case 'p':
                        derStift.setzeFarbe(Farbe.PINK);
                        break;
                    case '+':
                        derStift.setzeLinienBreite(derStift.linienBreite() + 1);
                        break;
                    case '-':
                        derStift.setzeLinienBreite(derStift.linienBreite() - 1);
                        break;
                    default:
                        derStift.setzeFarbe(Farbe.SCHWARZ);
                }
                dieTastatur.weiter();
            }
            
            if(dieMaus.istGedrueckt()){
                derStift.bewegeBis(dieMaus.hPosition(), dieMaus.vPosition());
                derStift.runter();  
            }else{
                derStift.hoch();
            }
            
        }while(!dieMaus.doppelKlick());
        
        derStift.gibFrei();
        derBildschirm.gibFrei();
        dieMaus.gibFrei();
        dieTastatur.gibFrei();
        
    }
    
    public void zeichneEinhorn(Buntstift stift, Maus maus){
        stift.zeichne
    }
}
