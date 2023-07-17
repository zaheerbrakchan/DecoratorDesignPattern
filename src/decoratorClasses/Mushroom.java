package decoratorClasses;

import baseClasses.BasePizza;

public class Mushroom extends ToppingDecorator {

	BasePizza basepizza;
	
	public Mushroom(BasePizza basepizza) {
		this.basepizza=basepizza;
	}
	
	@Override
	public int cost() {
		return basepizza.cost() + 40;
	}

}
