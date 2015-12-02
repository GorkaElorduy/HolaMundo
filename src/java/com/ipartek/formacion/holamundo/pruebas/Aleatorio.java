package com.ipartek.formacion.holamundo.pruebas;
/**
 * Clase Java para simular un dado y sacar un alumno de modo aleatorio
 * 
 * @author Curso
 * 
 *
 */
public class Aleatorio {
	/**
	 * ES UNA VARIABLE PARA REPRESENTAR EL NUMERO DE ALUMNOS
	 * static: solo se reserva memoria una vez
	 * final: no es modificable
	 * tipo. entero
	 */
	public final static int NUMERO_ALUMNOS = 15;
	public static final String NOMBRES_ALUMNOS []={"David Ibarzabal",
			"Oscar",
			"Gorka",
			"Ariane",
			"Gontzal",
			"Aitor",
			"Santi",
			"Raul",
			"David Ortiz",
			"Sergio",
			"David Barbudo",
			"Edorta",
			"Asier",
			"Alberto",
			"Iñigo"
			};
	/**
	 * Muestra por consola todos los alumnos de nuestro array <code>NOMBRES_ALUMNOS</code>.<br>
	 * ejemplo:
	 * <ul>
	 * <li>[0 ] David Ibarzabal</li>
	 * <li>[1] Oscar</li>
	 * .....
	 * <li>[14] Iñigo</li>
	 * </ul>
	 */
	public static void mostrarAlumnos(){
	
		
		for(int i =0; i<NOMBRES_ALUMNOS.length;i++){
			System.out.println("["+i+"]"+NOMBRES_ALUMNOS[i]);
		}
		
		
		
		
	}
	/**
	 * Genera un numero aleatorio entre 0 y <code>NUMERO_ALUMNOS</code> <br>
	 * 
	 * @return entero, si falla, -1
	 */
	public static int generarNumero(){
		int resultado = -1;
		resultado = (int) (Math.random()*NUMERO_ALUMNOS);
		return resultado;
	}
	/**
	 * Te muestra el nombre de la persona que comienza a leer
	 * @param numero<code>int</code> numero Aleatorio que debe estar dentro del rango 0-<code>NUMERO_ALUMNOS</code>-1
	 * 
	 * @return String Nombre del afortunado
	 * static
	 */
	public static String mostrarAfortunado(int numero){
		if(numero<0 || numero>14){
			System.out.println("ESE NUMERO NO TIENE SENTIDO");
			return "ERROR";
		}
		return NOMBRES_ALUMNOS[numero];
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		mostrarAlumnos();
		System.out.println("El afortunado en leer es: ");
		//TODO obtener numero aleatorio
		System.out.println(generarNumero());
		
		//System.out.println(NOMBRES_ALUMNOS[generarNumero()]);
	
		System.out.println(mostrarAfortunado(generarNumero()));
		
	}

}
