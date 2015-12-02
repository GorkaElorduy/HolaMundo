package com.ipartek.formacion.holamundo.pojo;

/**
 * CLASE INSTANCIABLE DE TIPO BEAN PARA REPRESENTAR A UN <code>ALUMNO</code>
 * 
 * @author Curso
 *
 */
public class Alumno {

	public static final String NOMBRE_ANONIMO = "Anonimo";
	public static final String NOMBRE_SIN_DEFINIR = "Sin definir";
	public static final char HOMBRE = 'h';
	public static final char SEXO_INDEFINIDO = 'I';
	public static final char SEXO_MUJER = 'M';
	// atributos
	private String nombre;
	private String apellidos;
	private boolean becado;
	private int edad;
	char sexo; // H HOMBRE M MUJER I INDEFINIDO

	// CONSTRUCTORES
	/******************************
	 * 
	 */

	/**
	 * UN ALUMNO RECIEN INSTANCIADO TENDRA LOS SIGUIENTES VALORES:
	 * <ul>
	 * <li><code>nombre</code>: NOMBRE_ANONIMO</li>
	 * <li><code>apellidos</code>: " "</li>
	 * <li><code>sexo</code>:indefinido</li>
	 * 
	 * </ul>
	 */
	public Alumno() {
		super();
		this.nombre = NOMBRE_ANONIMO;
		this.apellidos = null;
		this.becado=false;
		this.edad=0;
		this.sexo='I';
	}

	public Alumno(String nombre) {
		super();
		this.nombre = nombre;
	}

	// GETTERS Y SETTERS
	/**
	 * 
	 * 
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Guardamos el nombre con la primera inicial en MAYUS <br>
	 * Si el nombre es null, guardar sin definir
	 * 
	 * @param nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public boolean isBecado() {
		return becado;
	}

	public void setBecado(boolean becado) {
		this.becado = becado;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	@Override
	public String toString() {
		return "Alumno [nombre=" + nombre + ", apellidos=" + apellidos + ", becado=" + becado + ", edad=" + edad
				+ ", sexo=" + sexo + "]";
	}

	/**
	 * Comprueba si es mayor de edad (true)>18, false en caso contrario
	 * 
	 * 
	 * @return false
	 */
	public boolean isMayorEdad() {
		boolean resultado = false;

		if (this.edad >= 18)
			resultado = true;
		return resultado;

	}

}
