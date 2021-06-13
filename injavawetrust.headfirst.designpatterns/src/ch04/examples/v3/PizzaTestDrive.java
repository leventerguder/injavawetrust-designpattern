package ch04.examples.v3;

public class PizzaTestDrive {

    public static void main(String[] args) {

        PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();
        Pizza pizza = new CheesePizza(ingredientFactory);

        System.out.println(pizza);
    }
}
