package baseClasses;

import decoratorClasses.ExtraCheese;
import decoratorClasses.Mushroom;

public class Main {

	public static void main(String[] args) {
		System.out.println("hello ");
		
		//cost of only veg delight without topping
		VegDelight vegDelight = new VegDelight();
		System.out.println("vegdelight only prize : "+vegDelight.cost());

		// cost of extra cheese on veg delight
		ExtraCheese extraCheese = new ExtraCheese(vegDelight);
		System.out.println("vegdelight with extra cheeze topping prize : "+extraCheese.cost());
	
		// cost of mushroom and extra cheese on veg delight
		Mushroom musroomAndExtraCheese = new Mushroom(extraCheese);
		System.out.println("vegdelight with musroom and extra cheeze topping prize : "+musroomAndExtraCheese.cost());
		
	}

}
