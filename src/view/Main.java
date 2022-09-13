package view;

import controller.CalcuOperation;
import model.Calculator;

public class Main {

	public static void main(String[] args) {
		int sum;
		int substrac;
		long multipy;
		double divide;
		Calculator calcu;

		System.out.println("Calculadora");
		calcu = new Calculator();
		// TODO : INGRESO POR TECLADO
		calcu.setA(7);
		calcu.setB(7);

		CalcuOperation calcuMashine = new CalcuOperation();
		sum = calcuMashine.add(calcu.getA(), calcu.getB());
		System.out.print("La suma de dos numeros es: ");
		System.out.println(sum);

		substrac = calcuMashine.subtract(calcu.getA(), calcu.getB());
		System.out.print("La resta de dos numeros es: ");
		System.out.println(substrac);

		multipy = calcuMashine.multiply(calcu.getA(), calcu.getB());
		System.out.print("La multiplicación de dos numeros es: ");
		System.out.println(multipy);

		divide = calcuMashine.divide(calcu.getA(), calcu.getB());
		System.out.print("La división de dos numeros es: ");
		System.out.println(divide);
	}

}
