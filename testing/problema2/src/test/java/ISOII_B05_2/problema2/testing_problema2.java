/**
 * 
 */
package ISOII_B05_2.problema2;
import junit.framework.TestCase;

/**
 * @author Yolanda y Raul
 *
 */

public class testing_problema2 extends TestCase {
	static int lado1=0;
	static int lado2=0;
	static int lado3=0;
	static String mensaje="";
	Triangulo trinagulo= new Triangulo(mensaje,lado1,lado2,lado3);

	
    public void testEvaluarNoEsTriangulo() {
        System.out.println("evaluar \"No es un triángulo por introducir valores incorrectos para los lados\"");
        Triangulo instance = new Triangulo(mensaje,7, 5, 3);
        String expResult = "El valor de los lados introducido no es correcto, ya que el mayor lado debe ser menor a la suma de los otros lados";
        String result = instance.evaluarTriangulo(3,4,10);
        assertEquals(expResult, result);
    }
    public void testEvaluarNoEsTrianguloNegativos() {
        System.out.println("evaluar \"No es un triángulo por introducir valores negativos\"");
        Triangulo instance = new Triangulo(mensaje,-7, -5, -3);
        String expResult = "El valor de los lados introducido no es correcto, ya que el mayor lado debe ser menor a la suma de los otros lados";
        String result = instance.evaluarTriangulo(3,4,10);
        assertEquals(expResult, result);
    }
    public void testEvaluarNoEsTrianguloCeros() {
        System.out.println("evaluar \"No es un triángulo por introducir lados con 0\"");
        Triangulo instance = new Triangulo(mensaje,0, 0, 0);
        String expResult = "No es un triángulo válido";
        String result = instance.evaluarTriangulo(0,0,0);
        assertEquals(expResult, result);
    }
    
    public void testEquilatero() {
        System.out.println("evaluar \"Trinagulo equilatero\"");
        Triangulo instance = new Triangulo(mensaje,3,3, 3);
        String expResult = "Es un triángulo equilatero y acutangulo";
        String result = instance.evaluarTriangulo(3,3,3);
        assertEquals(expResult, result);
       
    }
    public void testEscaleno() {
        System.out.println("evaluar \"Trinagulo Escaleno\"");
        Triangulo instance = new Triangulo(mensaje,2,3, 4);
        String expResult = "Es un triángulo escaleno y obtuso";
        String result = instance.evaluarTriangulo(2,3,4);

        assertEquals(expResult, result);
       
    }
    public void testIsosceles() {
        System.out.println("evaluar \"Trinagulo Isósceles\"");
        Triangulo instance = new Triangulo(mensaje,4,4, 6);
        String expResult = "Es un triángulo isosceles y obtuso";
        String result = instance.evaluarTriangulo(4,4,6);
        assertEquals(expResult, result);
       
    }
    public void testRectangulo() {
        System.out.println("evaluar \"Trinagulo Escaleno y Rectangulo\"");
        
        Triangulo instance = new Triangulo(mensaje,4,3, 5);
        String expResult = "Es un triángulo escaleno y rectángulo";
        String result = instance.evaluarTriangulo(4,3,5);
        assertEquals(expResult, result);
       
    }
    public void testObtuso() {
        System.out.println("evaluar \"Trinagulo Obtuso\"");
        Triangulo instance = new Triangulo(mensaje,4,2, 5);
        String expResult = "Es un triángulo escaleno y obtuso";
        String result = instance.evaluarTriangulo(4,2,5);
        assertEquals(expResult, result);
       
    }
    
    public void testAcutangulo() {
        System.out.println("evaluar \"Trinagulo equilatero\"");
        Triangulo instance = new Triangulo(mensaje,4,4,4);
        String expResult = "Es un triángulo equilatero y acutangulo";
        String result = instance.evaluarTriangulo(4,4,4);
        assertEquals(expResult, result);
       
    }    
}
