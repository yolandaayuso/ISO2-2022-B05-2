package ISOII_B05_2.problema2;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Triangulo extends ExceptionNumeroNegativo {

	private int lado1;
	private int lado2;
	private int lado3;
	private double angulo1;
	private double angulo2;
	private double angulo3;

	static Scanner teclado = new Scanner(System.in);

	public Triangulo(String mensaje, int lado1, int lado2, int lado3) {
		super(mensaje);
		this.lado1 = lado1;
		this.lado2 = lado2;
		this.lado3 = lado3;
	}

	public void calcularAngulo1(int lado1, int lado2, int lado3) {
		double cos_lado1 = Math
				.acos(((Math.pow(lado2, 2) + Math.pow(lado3, 2) - (Math.pow(lado1, 2))) / (2 * lado2 * lado3)));
		setAngulo1(Math.toDegrees(cos_lado1));

	}

	public void calcularAngulo2(int lado1, int lado2, int lado3) {

		double cos_lado2 = Math
				.acos(((Math.pow(lado1, 2) + Math.pow(lado3, 2) - (Math.pow(lado2, 2))) / (2 * lado1 * lado3)));

		setAngulo2(Math.toDegrees(cos_lado2));

	}

	public void calcularAngulo3(double angulo1, double angulo2) {
		double cos_lado3 = Math
				.acos(((Math.pow(lado1, 2) + Math.pow(lado2, 2) - (Math.pow(lado3, 2))) / (2 * lado1 * lado2)));

		setAngulo3(Math.toDegrees(cos_lado3));

	
	}

	public double getAngulo1() {
		return angulo1;
	}

	public void setAngulo1(double angulo1) {

		this.angulo1 = angulo1;

	}

	public double getAngulo2() {
		return angulo2;
	}

	public void setAngulo2(double angulo2) {
		this.angulo2 = angulo2;
	}

	public double getAngulo3() {
		return angulo3;
	}

	public void setAngulo3(double angulo3) {
		this.angulo3 = angulo3;
	}

	public int getLado1() {
		return lado1;
	}

	public void setLado1(int lado1) {
		boolean seguir = true;
		do {
			try {
				lado1 = teclado.nextInt();
				if (lado1 >= 0) {
					this.lado1 = lado1;
				} else {
					throw new ExceptionNumeroNegativo("No puedes introducir un número negativo.");
				}
				seguir = false;
			} catch (InputMismatchException ex) {
				System.out.println("Se han introducido caracteres no numéricos. Repite el dato: ");
				teclado.nextLine();
			} catch (ExceptionNumeroNegativo ee) {
				System.out.println(ee.getMessage());
			}
		} while (seguir);

	}

	public int getLado2() {
		return lado2;
	}

	public void setLado2(int lado2) {
		boolean seguir = true;
		do {
			try {
				lado2 = teclado.nextInt();
				if (lado2 >= 0) {
					this.lado2 = lado2;
				} else {
					throw new ExceptionNumeroNegativo("No puedes introducir un número negativo.");
				}
				seguir = false;
			} catch (InputMismatchException ex) {
				System.out.println("Se han introducido caracteres no numéricos. Repite el dato: ");
				teclado.nextLine();
			} catch (ExceptionNumeroNegativo ee) {
				System.out.println(ee.getMessage());
			}
		} while (seguir);

	}

	public int getLado3() {
		return lado3;
	}

	public void setLado3(int lado3) {
		boolean seguir = true;
		do {
			try {
				lado3 = teclado.nextInt();
				if (lado3 >= 0) {
					this.lado3 = lado3;
				} else {
					throw new ExceptionNumeroNegativo("No puedes introducir un número negativo.");
				}
				seguir = false;
			} catch (InputMismatchException ex) {
				System.out.println("Se han introducido caracteres no numéricos. Repite el dato: ");
				teclado.nextLine();
			} catch (ExceptionNumeroNegativo ee) {
				System.out.println(ee.getMessage());
			}
		} while (seguir);

	}
	
	public String evaluarTriangulo(int lado1, int lado2, int lado3) {
		String cadena = "";
		if (lado1 == lado2 && lado2 == lado3 && lado1 == 0) {
			return "No es un triángulo válido";
		} else if (lado1 + lado2 <= lado3 || lado2 + lado3 <= lado1 || lado1 + lado3 <= lado2) {
			return "El valor de los lados introducido no es correcto, ya que el mayor lado debe ser menor a la suma de los otros lados";
		} else {
			if (lado1 == lado2 && lado1 == lado3) {
				cadena = "Es un triángulo equilatero";
			} else if (lado1 == lado2 && lado1 != lado3 || lado2 == lado3 && lado1 != lado2) {
				cadena = "Es un triángulo isosceles";
			} else if (lado1 != lado2 && lado2 != lado3 && lado1 != lado3){
				cadena = "Es un triángulo escaleno";	
			}
			
			calcularAngulo1(lado1, lado2, lado3);
			calcularAngulo2(lado1, lado2, lado3);
			calcularAngulo3(angulo1, angulo2);
			
			if (angulo1 == 90 || angulo2 == 90 || angulo3 == 90) {
				cadena += " y rectángulo";
			} else if(angulo1 < 90 && angulo2 < 90 && angulo3 < 90) {
				cadena += " y acutangulo";
			} else if(angulo1 > 90 || angulo2 > 90 || angulo3 > 90) {
				cadena += " y obtuso";
			}

		}
		return cadena; 	
	}

}