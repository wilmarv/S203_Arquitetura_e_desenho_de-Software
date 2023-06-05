package builder;

public class PizzaBuilder {

	private Pizza pizza;

	public PizzaBuilder() {
		this.pizza = new Pizza();
	}

	private void validateSize() {
		if (pizza.getSize() < 1 || pizza.getSize() > 3)
			throw new IllegalStateException("Tamanho Errado");
	}

	private void validateIngredientes() {
		if (!pizza.getFlagCheese() && !pizza.getFlagPepperone())
			throw new IllegalStateException("Pelo menos 1 ingrediente deve ser soliciado");
	}

	public PizzaBuilder setSize(int size) {
		pizza.setSize(size);
		return this;
	}

	public PizzaBuilder addChesse() {
		pizza.addFlagCheese(true);
		return this;
	}

	public PizzaBuilder addPepperoni() {
		pizza.addFlagPepperone(true);
		return this;
	}

	public Pizza getPizza() {
		this.validateSize();
		this.validateIngredientes();
		return this.pizza;
	}

}
