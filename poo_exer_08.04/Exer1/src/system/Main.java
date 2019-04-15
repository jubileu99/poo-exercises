package system;
import util.*;

public class Main{
	
	public void ShowInfo(Shape s1) {
		System.out.printf("%s\n",s1.toString());
	}
	
    public static void main(String[] args) {
    	
    	Main m1 = new Main();
    	
    	Color azul = new Color("Azul");
        Circle c1 = new Circle(5);
        c1.setColor(azul);
        c1.setFilled(true);
        m1.ShowInfo(c1);
       
        System.out.printf("=====\n");
        
        Square q1 = new Square(5);
        m1.ShowInfo(q1);
        
        System.out.printf("=====\n");
        
        Rectangle r1 = new Rectangle(3, 6);
        Color preto = new Color("Preto");
        r1.setColor(preto);
        r1.setFilled(true);
        m1.ShowInfo(r1);
        
        System.out.printf("=====\n");

        Color verde = new Color("Verde");
        Shape s1 = new Shape(verde, true);
        
        m1.ShowInfo(s1);
        s1.setFilled(false);
        m1.ShowInfo(s1);
   
    }
}