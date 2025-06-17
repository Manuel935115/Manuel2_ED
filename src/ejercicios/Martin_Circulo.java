package ejercicios;

/**
 * @author manuel.martin3
 * @version 1.0
 * Clase que representa un círculo con atributos como id, nombre, radio y color
 * Permite crear instancias con diferentes constructores y obtener sus propiedades
 */
public class Martin_Circulo {


	
	
	
	 private int id;
	private String nombre;
	private double radio;
	private String color;
	
	// Getters y Setters
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getRadio() {
		return radio;
	}
	public void setRadio(double radio) {
		this.radio = radio;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
 // Constructor por defecto
	public Martin_Circulo() {
		
	}

	// Constructor con todos los argumentos
	public Martin_Circulo(int id, String nombre, double radio, String color) {
		this.id = id;
		this.nombre = nombre;
		this.radio = radio;
		this.color = color;
	}
	
	
	// Constructor con todos los argumentos quitando el id
	public Martin_Circulo(String nombre, double radio, String color) {
		this.nombre = nombre;
		this.radio = radio;
		this.color = color;
	}
	// Metodo toString
	@Override
	public String toString() {
		return "Martin_Circulo [id=" + id + ", nombre=" + nombre + ", radio=" + radio + ", color=" + color + "]";
	}

	
	public double calcularPerimetro() {
        return 2 * Math.PI * this.radio;
    }
	
	
}
