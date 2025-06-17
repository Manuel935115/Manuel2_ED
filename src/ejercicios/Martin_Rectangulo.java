package ejercicios;

/**
 * @author manuel.martin3
 * @version 1.0
 *  Clase que representa a un rectangulo en el cual tenemos los atributos como id, ladoA, ladoB y color
 * Permite crear instancias con diferentes constructores y obtener sus propiedades.
 */
public class Martin_Rectangulo {

	
	
	private int id;
	private double ladoA;
	private double ladoB;
	private String color;
	// Constructor
	public Martin_Rectangulo() {
	}
	
	// Constructor con todos los argumentos
	public Martin_Rectangulo(int id, double ladoA, double ladoB, String color) {
		this.id = id;
		this.ladoA = ladoA;
		this.ladoB = ladoB;
		this.color = color;
	}
    // Constructor sin id
	public Martin_Rectangulo(double ladoA, double ladoB, String color) {
		this.ladoA = ladoA;
		this.ladoB = ladoB;
		this.color = color;
	}
	//Getters y Setters
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getLadoA() {
		return ladoA;
	}

	public void setLadoA(double ladoA) {
		this.ladoA = ladoA;
	}

	public double getLadoB() {
		return ladoB;
	}

	public void setLadoB(double ladoB) {
		this.ladoB = ladoB;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	
	//Metodo toString
	@Override
	public String toString() {
		return "Martin_Rectangulo [id=" + id + ", ladoA=" + ladoA + ", ladoB=" + ladoB + ", color=" + color + "]";
	}
	
	
	
}
