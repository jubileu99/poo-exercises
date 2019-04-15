package forms;
/**
 * Cylinder
 */
public class Cylinder extends Shape{
    private double raio,altura;

    public Cylinder(double raio, double altura){
        super("Cylinder");
        setAltura(altura);
        setRaio(raio);
    }

    public double area(){
        double calc = 2*Math.PI*Math.pow(raio,2) + 2*Math.PI*raio;
        return calc;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getAltura() {
        return altura;
    }

    public double getRaio() {
        return raio;
    }

    public String toString(){
        String frase = super.toString();
        frase += "\nRaio: "+getRaio();
        frase += "\nAltura: " +getAltura();
        frase += "\nArea: " +area();
        return frase;
    }
}