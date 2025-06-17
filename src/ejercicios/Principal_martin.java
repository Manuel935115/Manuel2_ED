package ejercicios;

/**
 * @author manuel.martin3
 * @version 1.0
 * Clase principal que ejecuta el programa de prueba con objetos Circulo y Rectángulo.
 * Permite calcular áreas, diferencias de áreas y perímetros de las figuras.
 */
public class Principal_martin {


	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		//Instancia de dos objetos diferentes de la clase Circulo
		Martin_Circulo c1 = new Martin_Circulo("C1", 4.5, "Rojo");
	    Martin_Circulo c2 = new Martin_Circulo("C2", 2.0, "Azul");

        
        // Instancia de dos objetos diferentes de la clase Rectángulo. 
        Martin_Rectangulo r1 = new Martin_Rectangulo(20, 4.0, 2.0, "Azul");
        Martin_Rectangulo r2 = new Martin_Rectangulo(10, 6.0, 3.0, "Amarillo");


     // Calcular los areas
        double areaC1 = Math.PI * Math.pow(c1.getRadio(), 2);
        double areaR1 = r1.getLadoA() * r1.getLadoB();
        double areaC2 = Math.PI * Math.pow(c2.getRadio(), 2);
        double areaR2 = r1.getLadoA() * r2.getLadoB();
        double perimetroCirculo = calcularPerimetroCirculo(c1.getRadio());
        double perimetroRectangulo = calcularPerimetroRectangulo(r1.getLadoA(), r1.getLadoB());
        
        
        
        //Imprimir los datos
       
        System.out.println("Área Círculo: " + areaC1);
        System.out.println("Área Rectángulo: " + areaR1);
        System.out.println("Diferencia: " + Math.abs(areaC1 - areaR1));
        System.out.println("Área Círculo 2: " + areaC2);
        System.out.println("Área Rectángulo 2: " + areaR2);
        System.out.println("Perímetro del círculo: " + perimetroCirculo);
        System.out.println("Perímetro del rectángulo: " + perimetroRectangulo);
    }
	
	private static double calcularPerimetroCirculo(double radio) {
        return 2 * Math.PI * radio;
    }

    private static double calcularPerimetroRectangulo(double ladoA, double ladoB) {
        return 2 * (ladoA + ladoB);
        
    }
	}
		
		
		
		
		
	


