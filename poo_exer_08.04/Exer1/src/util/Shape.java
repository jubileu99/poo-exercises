package util;

public class Shape{
    protected Color color;
    protected boolean filled;


    public Shape(){}
    
    public Shape(Color color, boolean filled){
    	setColor(color);
    	setFilled(filled);
    }

    public void setFilled(boolean filled){
        this.filled = filled;
    }
    public boolean isFilled(){
        return (filled) ? true : false;
    }
    public void setColor(Color color){
        this.color = color;
    }
    public Color getColor(){
        return this.color;
    }
    public double getArea(){
        return 0;
    }
    public double getPerimeter(){
        return 0;
    }
    public String toString (){
        if(isFilled() & color != null){
            String toString = "Forma preenchida pela cor "+this.getColor().getColor();
            return toString;
        }else {
        	String toString = "Forma não preenchida ";
            return toString;
        }
    }
}
