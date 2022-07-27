package fr.fraxal.virtualpizzashop.cookingstate;

import fr.fraxal.virtualpizzashop.ingredient.Food;

public abstract class AbstractCookingState {

	private String label;
	private AbstractCookingState nextState;
	private int cookingTime = 1;
	private int currentTime = 0;

	protected Food food;

	protected AbstractCookingState(Food food) {
		this(food, null, null, null);
	}

	protected AbstractCookingState(Food food, String label) {
		this(food, null, null, label);
	}

	protected AbstractCookingState(Food food, AbstractCookingState nextState) {
		this(food, nextState, null, null);
	}

	protected AbstractCookingState(Food food, AbstractCookingState nextState, Integer cookingTime) {
		this(food, nextState, cookingTime, null);
	}

	protected AbstractCookingState(Food food, AbstractCookingState nextState, Integer cookingTime, String label) {
		if (nextState != null) {
			this.nextState = nextState;
		}

		if (cookingTime != null) {
			this.cookingTime = cookingTime.intValue();
		}

		if (label != null) {
			this.label = label;
		} else {
			this.label = "";
		}

		this.food = food;
	}

	public boolean isCooked() {
		return false;
	}

	public boolean isReady() {
		return false;
	}

	public void cooking() {
		if (hasNextState()) {
			if (canChangeState(++this.currentTime)) {
				food.changeCookingState(this.nextState);
			}
			;
		}
	}

	private boolean canChangeState(int currentTime) {
		return currentTime >= this.cookingTime;
	};

	protected boolean hasNextState() {
		return this.nextState != null;
	}

	public String getStateName() {
		return this.label;
	}

}
