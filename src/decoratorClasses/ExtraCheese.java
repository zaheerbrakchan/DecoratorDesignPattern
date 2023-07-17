package decoratorClasses;

import baseClasses.BasePizza;

public class ExtraCheese extends ToppingDecorator {

	BasePizza basepizza;
	
	public ExtraCheese(BasePizza basepizza) {
		this.basepizza=basepizza;
	}
	
	@Override
	public int cost() {
		return basepizza.cost() + 20;
	}

}
