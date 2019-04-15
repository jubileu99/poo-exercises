package system;
import util.Shape;


public class Rectangle extends Shape{
	private double width;
	private double height;
	
	public Rectangle(double w, double h) {
		setHeight(h);
		setWidth(w);
	}
	
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public double getArea() {
		double calc = this.width*this.height;
		return calc;
	}
	public double getPerimeter() {
		double calc = this.width*2 + this.height*2;
		return calc;
	}
	public String toString() {
		String frase = super.toString();
		frase += "\nWidth: "+getWidth();
		frase += "\nHeight: "+getHeight();
		frase += "\nArea: "+getArea();
		frase += "\nPerimetro: "+getPerimeter();
		return frase;
	}
}
