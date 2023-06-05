package builder;

import static org.junit.Assert.assertNull;
import static org.junit.Assert.fail;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class PizzaTest {
	@Test
	void deveContruirPizzaValida() {

		Pizza pizza = new PizzaBuilder().setSize(1).addChesse().addPepperoni().getPizza();

		assertNotNull(pizza);
		assertNotNull(pizza.getSize());
		assertTrue(pizza.getFlagCheese());
		assertTrue(pizza.getFlagPepperone());
	}

	@Test
	void deveInvalidarPizzaComTamanhoErrado() {

		try {
			Pizza pizza = new PizzaBuilder().setSize(4).addChesse().addPepperoni().getPizza();
			fail();
		} catch (Exception e) {
			// Esperado cair aqui.
		}

	}

}
