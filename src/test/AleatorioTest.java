import static org.junit.Assert.*;

import org.junit.Test;

import com.ipartek.formacion.holamundo.pruebas.Aleatorio;

public class AleatorioTest {

	@Test
	public void testGenerarNumero() {
		int numAleatorio;
		for (int i = 0; i < 1000; i++) {

			numAleatorio = Aleatorio.generarNumero();
			assertTrue(numAleatorio >= 0 && numAleatorio < Aleatorio.NUMERO_ALUMNOS);

		}
		
	}

}
