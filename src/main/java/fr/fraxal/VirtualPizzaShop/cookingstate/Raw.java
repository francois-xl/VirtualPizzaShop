package fr.fraxal.virtualpizzashop.cookingstate;

import fr.fraxal.virtualpizzashop.ingredient.Food;

public class Raw extends AbstractCookingState {

	public Raw(Food food) {
		super(food, null, null, null);
	}

	public Raw(Food food, String label) {
		super(food, null, null, label);
	}

	public Raw(Food food, AbstractCookingState nextState) {
		super(food, nextState, null, null);
	}

	public Raw(Food food, AbstractCookingState nextState, Integer cookingTime) {
		super(food, nextState, cookingTime, null);
	}

	public Raw(Food food, AbstractCookingState nextState, Integer cookingTime, String label) {
		super(food, nextState, cookingTime, label);
	}

}
