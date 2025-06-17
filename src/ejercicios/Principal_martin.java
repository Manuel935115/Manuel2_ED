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


     // Calcular los areas y el perimetro
        double areaC1 = extracted(c1);
        double areaR1 = extracted(r1);
        double areaC2 = area(c2);
        double areaR2 = area2(r1, r2);
        double perimetroCirculo = perimetros(c1);
        double perimetroRectangulo = perimetro(r1);
        
        
        
        //Imprimir los datos
       
        extracted(areaC1, areaR1, areaC2, areaR2, perimetroCirculo, perimetroRectangulo);
    }

	private static double perimetro(Martin_Rectangulo r1) {
		double perimetroRectangulo = calcularPerimetroRectangulo(r1.getLadoA(), r1.getLadoB());
		return perimetroRectangulo;
	}

	private static double perimetros(Martin_Circulo c1) {
		double perimetroCirculo = calcularPerimetroCirculo(c1.getRadio());
		return perimetroCirculo;
	}

	private static double area2(Martin_Rectangulo r1, Martin_Rectangulo r2) {
		double areaR2 = r1.getLadoA() * r2.getLadoB();
		return areaR2;
	}

	private static double area(Martin_Circulo c2) {
		double areaC2 = Math.PI * Math.pow(c2.getRadio(), 2);
		return areaC2;
	}

	private static double extracted(Martin_Rectangulo r1) {
		double areaR1 = r1.getLadoA() * r1.getLadoB();
		return areaR1;
	}

	private static double extracted(Martin_Circulo c1) {
		double areaC1 = Math.PI * Math.pow(c1.getRadio(), 2);
		return areaC1;
	}

	private static void extracted(double areaC1, double areaR1, double areaC2, double areaR2, double perimetroCirculo,
			double perimetroRectangulo) {
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
		
		
		
		
		
	


