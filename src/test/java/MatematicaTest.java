import org.junit.Assert;
import org.junit.Test;



public class MatematicaTest {
	@Test
	public void sumaTest() {
		Matematica matematica = new Matematica();
		Assert.assertEquals("Verifico el resultado de la suma",10,matematica.suma(4,6));
		return;
	}
	
	@Test
	public void restaTest() {
		Matematica matematica = new Matematica();
		Assert.assertEquals("Verifico el resultado de la resta",2,matematica.resta(6,4));
		return;
	}
	
	@Test
	public void divideTest() {
		Matematica matematica = new Matematica();
		Assert.assertEquals("Verifico el resultado de la division",5,matematica.divide(10,2));
		return;
	}

}
