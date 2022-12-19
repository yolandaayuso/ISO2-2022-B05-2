package ISOII_B05_2.problema2;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Principal {
	static Scanner teclado = new Scanner(System.in);

	public static void main(String[] ar) {
		int lado1 = 0;
		int lado2 = 0;
		int lado3 = 0;

		Triangulo triangulo = new Triangulo("",lado1, lado2, lado3);
//        
		lado1 = 7;
		lado2 = 5;
		lado3 = 3;

		
		System.out.println(triangulo.evaluarTriangulo(lado1, lado2, lado3));

	}

	

}