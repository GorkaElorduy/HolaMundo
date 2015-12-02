package com.ipartek.formacion.holamundo.pruebas;

import com.ipartek.formacion.holamundo.pojo.Alumno;

public class ParImpar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Primer ejercicio: ");

		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 0) {
				System.out.println("El numero " + i + " es par");
			} else {
				System.out.println("El numero " + i + " es impar");
			}

		}
		System.out.println("Fin ejercicio");
		
		
	
		Alumno a2 = new Alumno("Heufrasio");
		Alumno a3 = new Alumno("Manolita");
		a2.setNombre("Manolo");
		a3.setApellidos("Gafotas");
		
		
	}

}
