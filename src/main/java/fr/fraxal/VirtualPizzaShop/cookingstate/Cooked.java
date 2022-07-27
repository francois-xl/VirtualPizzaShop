package fr.fraxal.virtualpizzashop.cookingstate;

import fr.fraxal.virtualpizzashop.ingredient.Food;

public class Cooked extends AbstractCookingState {

	public Cooked(Food food) {
		super(food, null, null, null);
	}

	public Cooked(Food food, String label) {
		super(food, null, null, label);
	}

	public Cooked(Food food, AbstractCookingState nextState) {
		super(food, nextState, null, null);
	}

	public Cooked(Food food, AbstractCookingState nextState, Integer cookingTime) {
		super(food, nextState, cookingTime, null);
	}

	public Cooked(Food food, AbstractCookingState nextState, Integer cookingTime, String label) {
		super(food, nextState, cookingTime, label);
	}

}
