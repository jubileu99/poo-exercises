package forms;
public abstract class Shape {
	private String shapeName;
	
	public Shape(String name) {
		setShapeName(name);
	}
	
	public void setShapeName(String name) {
		this.shapeName = name;
	}
	
	public String getShapeName() {
		return this.shapeName;
	}
	
	public abstract double area();
		
	public String toString() {
		String frase = "Nome: "+getShapeName();
		return frase;
	}

}
