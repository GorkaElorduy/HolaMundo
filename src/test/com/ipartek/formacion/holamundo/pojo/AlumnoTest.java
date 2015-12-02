package com.ipartek.formacion.holamundo.pojo;

import static org.junit.Assert.*;

import org.junit.Ignore;
import org.junit.Test;

public class AlumnoTest {

	@Test
	public void constructorVacio() {
		
		Alumno a = new Alumno();
		assertTrue("NO COINCIDE NOMBRE",Alumno.NOMBRE_ANONIMO.equals(a.getNombre()));
		assertTrue("NO ESTA VACIO", a.getApellidos()==null);
		assertTrue("NO ESTA A FALSE", a.isBecado()==false);
		assertTrue("NO ESTA A CERO", a.getEdad()==0);
		assertTrue("NO ESTA INDEFINIDO", a.getSexo()==a.SEXO_INDEFINIDO);
	}

	@Ignore
	public void testAlumnoString() {
		Alumno a = new Alumno();
	}

	@Ignore
	public void testSetNombre() {
		fail("Not yet implemented");
	}

	@Ignore
	public void testIsMayorEdad() {
		fail("Not yet implemented");
	}

}
