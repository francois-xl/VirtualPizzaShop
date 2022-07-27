package fr.fraxal.virtualpizzashop.ingredient;

import fr.fraxal.virtualpizzashop.behavior.ICookable;
import fr.fraxal.virtualpizzashop.cookingstate.AbstractCookingState;

public class Food implements ICookable {

	private AbstractCookingState cookingState;

	public Food() {
	}

	@Override
	public boolean isWellCooked() {
		return cookingState.isCooked();
	}

	public void changeCookingState(AbstractCookingState cookingState) {
		this.cookingState = cookingState;
	}

	public void cooking() {
		this.cookingState.cooking();
	}

	public String getCookingStateName() {
		return cookingState.getStateName();
	}

	public void setInitialCookingState(AbstractCookingState cookingState) {
		this.cookingState = cookingState;
	}

}
