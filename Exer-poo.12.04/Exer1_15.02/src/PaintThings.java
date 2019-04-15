import java.text.DecimalFormat;

import forms.Cylinder;
import forms.RectangularPrism;
import forms.Sphere;

/**
 * PaintThings
 */
public class PaintThings {
    public static void main(String[] args) {
        final double coverage = 350;
        Paint paint = new Paint(coverage);
        double deckAmt, ballAmt, tankAmt;
        
        Sphere s1 = new Sphere(15);
        RectangularPrism r1 = new RectangularPrism(20, 35, 10);
        Cylinder c1 = new Cylinder(10, 30);
        
        deckAmt = paint.amount(r1);
        ballAmt = paint.amount(s1);
        tankAmt = paint.amount(c1);
        
        DecimalFormat fmt = new DecimalFormat("0.#");
        System.out.println ("\nNum de latoes necessarios...");
        System.out.println ("Deck: " + fmt.format(deckAmt));
        System.out.println ("Big Ball: " +fmt.format(ballAmt));
        System.out.println ("Tank: " + fmt.format(tankAmt));

    }
}