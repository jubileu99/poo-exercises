import forms.Shape;

/**
 * Paint
 */
public class Paint {
    private double coverage;

    public Paint(double c){
        coverage = c;
    }

    public double amount(Shape s){
        System.out.println("Computing amount for "+s);
        double calc = s.area()/coverage;
        return calc;
    }

    
}