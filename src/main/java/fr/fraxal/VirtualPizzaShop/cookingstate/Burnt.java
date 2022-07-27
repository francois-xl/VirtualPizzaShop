package fr.fraxal.virtualpizzashop.cookingstate;

import fr.fraxal.virtualpizzashop.ingredient.Food;

public class Burnt extends AbstractCookingState {

	public Burnt(Food food) {
		super(food, null, null, null);
	}

	public Burnt(Food food, String label) {
		super(food, null, null, label);
	}

	public Burnt(Food food, AbstractCookingState nextState) {
		super(food, nextState, null, null);
	}

	public Burnt(Food food, AbstractCookingState nextState, Integer cookingTime) {
		super(food, nextState, cookingTime, null);
	}

	public Burnt(Food food, AbstractCookingState nextState, Integer cookingTime, String label) {
		super(food, nextState, cookingTime, label);
	}

}
