package system;
import util.Shape;

public class Circle extends Shape{
    private double radius;

    public Circle(double rad){
    	super();
    	setRadius(rad);
    }
    public double getRadius(){
        return this.radius;
    }
    public void setRadius(double rad){
        this.radius = rad;
    }
    public double getArea(){
        double calc = Math.PI*Math.pow(this.radius,2);
        return calc;
    }
    public double getPerimeter(){
        double calc = 2*this.radius*Math.PI;
        return calc;
    }
    public String toString(){
        String frase = super.toString()+ "\nRaio: "+this.getRadius();
        frase += "\nArea: "+getArea();
        frase += "\nPerimetro: "+getPerimeter();

        return frase;

    }

}