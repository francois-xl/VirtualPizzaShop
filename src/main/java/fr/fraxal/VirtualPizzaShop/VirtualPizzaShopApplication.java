package fr.fraxal.virtualpizzashop;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import fr.fraxal.virtualpizzashop.cookingstate.Burnt;
import fr.fraxal.virtualpizzashop.cookingstate.Cooked;
import fr.fraxal.virtualpizzashop.cookingstate.Raw;
import fr.fraxal.virtualpizzashop.ingredient.Food;

@SpringBootApplication
public class VirtualPizzaShopApplication implements CommandLineRunner {

	private static Logger LOG = LoggerFactory.getLogger(VirtualPizzaShopApplication.class);

	public static void main(String[] args) {
		LOG.info("Bienvenu à la Pizzeria Virtuelle !");
		SpringApplication.run(VirtualPizzaShopApplication.class, args);
		LOG.info("Bye bye !");
	}

	@Override
	public void run(String... args) {
		LOG.info("Making a food and cooking it with CookingStates");

		// Kitchen prototype code
		Food ingredient = new Food();
		ingredient.setInitialCookingState(
				new Raw(ingredient, new Cooked(ingredient, new Burnt(ingredient, "Burnt"), 5, "Cooked"), 3, "Raw"));
		//

		// Oven prototype code
		for (int i = 0; i < 10; i++) {
			LOG.info("Tick {} | Current cooking state : {}", i, ingredient.getCookingStateName());
			ingredient.cooking();
		}
		//

		LOG.info("Cooking finished");

	}
}
